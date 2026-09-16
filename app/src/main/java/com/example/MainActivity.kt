package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.ui.screens.GamifiedVaultScreen
import com.example.ui.screens.StudyModuleScreen
import com.example.ui.theme.MyApplicationTheme

enum class AppScreen {
    NOTES,
    VAULT
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                var currentScreen by remember { mutableStateOf(AppScreen.NOTES) }

                when (currentScreen) {
                    AppScreen.NOTES -> {
                        StudyModuleScreen(
                            onNavigateToVault = { currentScreen = AppScreen.VAULT },
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    AppScreen.VAULT -> {
                        GamifiedVaultScreen(
                            onNavigateBackToNotes = { currentScreen = AppScreen.NOTES },
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}
