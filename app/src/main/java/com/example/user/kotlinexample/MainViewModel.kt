package com.example.user.kotlinexample

import android.databinding.ObservableField


class MainViewModel {
    var repoModel: RepoModel = RepoModel()

    val text = ObservableField<String>()

    val isLoading = ObservableField<Boolean>()

    fun refresh(){
        isLoading.set(true)
        repoModel.refreshData(object : OnDataReadyCallback {
            override fun onDataReady(data: String) {
                isLoading.set(false)
                text.set(data)
            }
        })
    }
}