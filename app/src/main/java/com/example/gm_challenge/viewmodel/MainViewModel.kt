package com.example.gm_challenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gm_challenge.model.Result
import com.example.gm_challenge.repo.GMRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val gmRepo: GMRepo): ViewModel() {


    private val gmResultListMLD = MutableLiveData<List<Result>>()
    private val gmResultMLD = MutableLiveData<Result>()

    //used for the recyclerview adaptor
    val gmResultListLiveData : LiveData<List<Result>>
        get() = gmResultListMLD

    //for details fragment
    val gmResultLiveData : LiveData<Result>
        get() = gmResultMLD


    fun createGMResponse(artistName: String){
        viewModelScope.launch(Dispatchers.IO) {
            gmResultListMLD.postValue(gmRepo.createGMResponse(artistName).results!!)
        }
    }


}