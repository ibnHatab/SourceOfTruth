package com.modernapp.sourceoftruth.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.modernapp.sourceoftruth.ui.theme.SourceOfTruthTheme
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun OrderScreen(viewModel: OrderViewModel = viewModel()) {

    ContactInformation(name = viewModel.formUiState.name,
        onNameChanged = { viewModel.onFormEvent(FormUiEvent.OnNameChanged(it)) },
        phone = viewModel.formUiState.phone,
        onPhoneChanged = { viewModel.onFormEvent(FormUiEvent.OnPhoneChanged(it)) },
        payOrder = { viewModel.onFormEvent(FormUiEvent.PayOrderClicked) },
        isValidForm = viewModel.formUiState.successValidated)
}

@Composable
fun ContactInformation(
    name: String,
    onNameChanged: (String) -> Unit,
    phone: String,
    onPhoneChanged: (String) -> Unit,
    payOrder: () -> Unit,
    isValidForm: Boolean
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextField(
            label = { Text("Name") },
            value = name,
            onValueChange = onNameChanged,
        )
        Spacer(modifier = Modifier.padding(5.dp))
        TextField(
            label = { Text("Phone") },
            value = phone,
            onValueChange = onPhoneChanged,
        )
        Spacer(modifier = Modifier.padding(5.dp))
        Button(
            onClick = payOrder,
            enabled = isValidForm
        ) {
            Text(text = "Place Order")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SourceOfTruthTheme {
        OrderScreen()
    }
}
