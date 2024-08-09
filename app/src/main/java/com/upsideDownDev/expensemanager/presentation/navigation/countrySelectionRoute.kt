package com.upsideDownDev.expensemanager.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.upsideDownDev.expensemanager.presentation.screen.countryPickerScreen.CountryPickerScreen

fun NavGraphBuilder.countrySelectionRoute() {
    composable<Routes.CountrySelectionScreen> {
        CountryPickerScreen()
    }
}