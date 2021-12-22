package com.example.fifausersearchservice.feature.main.viewmodel

import ACCESS_TOKEN
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fifausersearchservice.data.main.MainRepository
import com.example.fifausersearchservice.feature.main.ui.MainActivity
import kotlin.properties.Delegates

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {
    lateinit var name : String
    var level by Delegates.notNull<Int>()
    val success : MutableLiveData<Boolean> = MutableLiveData()
    val failed : MutableLiveData<Boolean> = MutableLiveData()

    fun userPost(){
        val nickname = MainActivity.nickName
        repository.userPost(nickname).subscribe { response ->
            if(response.isSuccessful){
                ACCESS_TOKEN = "Bearer " + response.body()?.accessId.toString()
                name = response.body()?.nickname.toString()
                level = response.body()?.level!!
                success.value = true
            }
            else {
                failed.value = true
            }
        }
    }
}