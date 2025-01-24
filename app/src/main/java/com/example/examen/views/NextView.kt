package com.example.examen.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.examen.components.PrimaryButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NextView(navController: NavController, userName: String) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Perfil de $userName") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize().padding(paddingValues).padding(16.dp),
        ) {
            Text(text = "Bienvenido, $userName")
            Spacer(modifier = Modifier.height(8.dp))
            PrimaryButton(text = "Volver") {
                navController.navigate("home") {
                    popUpTo("home") { inclusive = true }
                }
            }
        }
    }
}


