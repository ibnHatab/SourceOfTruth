package com.modernapp.sourceoftruth.ui

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel


class OrderViewModel : ViewModel() {

    var formUiState by mutableStateOf(FormUiState())
        private set

    fun onFormEvent(event: FormUiEvent) {
        when (event) {
            is FormUiEvent.OnNameChanged -> {
                formUiState = formUiState.copy(name = event.name)
            }

            is FormUiEvent.OnPhoneChanged -> {
                formUiState = formUiState.copy(phone = event.phone)
            }

            is FormUiEvent.PayOrderClicked -> {
                println("Order placed for ${formUiState.name} at ${formUiState.phone}")
            }
        }
    }

    companion object {
        fun applyLogicToValidateInput(name: String, phone: String): Boolean {
            return name.isNotEmpty() && phone.isNotEmpty()
        }
    }
}