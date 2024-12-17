package com.example.loginapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapplication.R
import com.example.loginapplication.navigation.LoginAppScreens

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(3000)
        navController.navigate(LoginAppScreens.MainScreen.route)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(
            Brush.linearGradient(
                colors = listOf(
                    Color(0xFF1E88E5),
                    Color(0xFFBBDEFB)
                )
            )
        )
    ) {
        Text(
            text = stringResource(R.string.start_title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Black
        )
        Image(
            painter = painterResource(R.drawable.login),
            contentDescription = null,
            modifier = modifier.padding(top = 16.dp, bottom = 16.dp)
        )
        Text(
            text = stringResource(R.string.start_description),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
    }
}