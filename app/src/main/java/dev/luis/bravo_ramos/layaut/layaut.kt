package dev.luis.bravo_ramos.layaut

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Clase(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical=36.dp, horizontal = 8.dp)
            .background(color= androidx.compose.ui.graphics.Color.Red)
            .fillMaxSize()
    ){
        Text (
            text= "Computación Movil"
        )
        Text (
            text= " PAO 6"
        )
        Text (
            text= "Luis Bravo"
        )
        Text (
            text= "Gary Ramos"
        )
        Text (
            text= "Victor Sisa"
        )
    }
}