package com.modernapp.sourceoftruth.ui

sealed class FormUiEvent {
    data class OnNameChanged(val name: String) : FormUiEvent()
    data class OnPhoneChanged(val phone: String) : FormUiEvent()
    data object PayOrderClicked : FormUiEvent()
}