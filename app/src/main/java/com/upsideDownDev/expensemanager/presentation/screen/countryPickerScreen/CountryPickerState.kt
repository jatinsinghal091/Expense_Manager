package com.upsideDownDev.expensemanager.presentation.screen.countryPickerScreen

import androidx.compose.foundation.text.input.TextFieldState
import com.upsideDownDev.expensemanager.domain.model.CountryDetail

data class CountryPickerState(
    val search: TextFieldState = TextFieldState(),
    val selectedCountryDetail: CountryDetail? = null,
    val canContinue:Boolean = false,
    val isContinueClicked: Boolean = false
)
