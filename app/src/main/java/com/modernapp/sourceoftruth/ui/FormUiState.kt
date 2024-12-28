package com.modernapp.sourceoftruth.ui

data class FormUiState(
    val name: String = "",
    val phone: String = "",
)

val FormUiState.successValidated: Boolean get() = OrderViewModel.applyLogicToValidateInput(name, phone)