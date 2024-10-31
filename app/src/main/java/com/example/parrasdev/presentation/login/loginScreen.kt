package com.example.parrasdev.presentation.login



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.parrasdev.R
import com.example.parrasdev.ui.theme.Black
import com.google.firebase.auth.FirebaseAuth


@Composable
fun LoginScren(auth: FirebaseAuth) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().background(Black)) {
        Icon(painter = painterResource(id = R.drawable.back), contentDescription = "")
        Text("Email", color = White, fontWeight = FontWeight.Bold, fontSize = 40.sp)
        TextField(value = email, onValueChange = {email = it })

        Text("Password", color = White, fontWeight = FontWeight.Bold, fontSize = 40.sp)
        TextField(value = password, onValueChange = {password = it })

    }
}