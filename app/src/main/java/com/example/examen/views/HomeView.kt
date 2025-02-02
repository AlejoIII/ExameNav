package com.example.examen.views
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.examen.components.PrimaryButton

@Composable
fun HomeView(navController: NavController) {
    Scaffold(
        content = { paddingValues ->
            Column(
                modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp),
            ) {
                PrimaryButton(text = "Crear lista") {
                    navController.navigate("profile/Alejandro")
                }
            }
        }
    )
}




