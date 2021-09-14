package ru.andreikud.retrofitpracticing.ui.viewmodel

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import ru.andreikud.retrofitpracticing.data.network.SandboxApi

class MainViewModel : ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    fun getUsers(sandboxApi: SandboxApi) {
        sandboxApi.getUsers()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
            }, {

            })
    }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

}