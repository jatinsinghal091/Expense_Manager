package com.upsideDownDev.expensemanager.presentation.screen.countryPickerScreen

import com.upsideDownDev.expensemanager.domain.model.CountryDetail

sealed interface CountryPickerAction {
    data class OnClickCountry(val countryDetail: CountryDetail) : CountryPickerAction
}