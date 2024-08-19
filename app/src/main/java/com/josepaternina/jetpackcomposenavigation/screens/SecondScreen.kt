package com.josepaternina.jetpackcomposenavigation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen(navController: NavController) {
    Scaffold {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController) {
    Column(
        Modifier.fillMaxSize(), // ocupa_todo el espacio
        verticalArrangement = Arrangement.Center, // alineación vertical
        horizontalAlignment = Alignment.CenterHorizontally // alineación horizontal
    ) {
        Text("Segunda pantalla")
        Button(onClick = {
            navController.popBackStack() // Volver atrás
        }) {
            Text(text = "Volver")
        }
    }
}

