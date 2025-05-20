package com.example.wether.ui.Serch


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SearchScreen() {
    var text by remember{ mutableStateOf("") }
    Row(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ) {


        TextField(
            value = text,
 onValueChange = {text = it}
        )
    }
}


