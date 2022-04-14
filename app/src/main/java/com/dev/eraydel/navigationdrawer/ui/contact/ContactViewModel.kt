package com.dev.eraydel.navigationdrawer.ui.contact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Erick Ayala Delgadillo"
    }

    private val _correo = MutableLiveData<String>().apply {
        value = "dev.eraydel@gmail.com"
    }

    private val _address = MutableLiveData<String>().apply {
        value = "Avenida Hidalgo N. 77, Col. Guerrero"
    }

    val text: LiveData<String> = _text
    val correo: LiveData<String> = _correo
    val direccion: LiveData<String> = _address

}