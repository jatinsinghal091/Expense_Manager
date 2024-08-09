package com.upsideDownDev.expensemanager.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupNavigation(
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = Routes.CountrySelectionScreen) {
        countrySelectionRoute()

    }
}