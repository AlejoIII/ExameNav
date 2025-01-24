package com.example.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.examen.controllers.MainController
import com.example.examen.ui.theme.ExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenTheme {
                MainController()
            }
        }
    }

}


