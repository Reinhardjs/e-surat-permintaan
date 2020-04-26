package com.example.e_suratpermintaan.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.e_suratpermintaan.core.domain.entities.responses.DataMasterCC
import com.e_suratpermintaan.core.domain.entities.responses.DataMasterUOM

class SharedViewModel : ViewModel() {

    private val costCodeList: MutableLiveData<List<DataMasterCC?>?> = MutableLiveData()
    private val uomList: MutableLiveData<List<DataMasterUOM?>?> = MutableLiveData()

    fun getCostCodeList(): MutableLiveData<List<DataMasterCC?>?> = costCodeList

    fun setCostCodeList(list: List<DataMasterCC?>?) {
        costCodeList.value = list
    }

    fun getUomList(): MutableLiveData<List<DataMasterUOM?>?> = uomList

    fun setUomList(list: List<DataMasterUOM?>?) {
        uomList.value = list
    }

}