package com.example.appcajero.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appcajero.model.ElementoModel

class ElementoViewModel : ViewModel() {

    val nro = MutableLiveData<ElementoModel>()

}