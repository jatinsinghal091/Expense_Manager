package com.upsideDownDev.expensemanager.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    data object CountrySelectionScreen : Routes()

    @Serializable
    data object Home : Routes()
}