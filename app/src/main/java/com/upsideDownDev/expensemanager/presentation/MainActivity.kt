package com.upsideDownDev.expensemanager.presentation

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.upsideDownDev.expensemanager.presentation.navigation.SetupNavigation
import com.upsideDownDev.expensemanager.presentation.ui.theme.ExpenseManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            window.isNavigationBarContrastEnforced = false
        }

        setContent {
            ExpenseManagerTheme {
                val navController = rememberNavController()
                SetupNavigation(navController)
            }
        }
    }
}