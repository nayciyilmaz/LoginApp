package com.example.loginapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapplication.R
import com.example.loginapplication.viewmodel.LoginViewModel

@Composable
fun SignUpScreen(
    navController: NavController,
    viewModel: LoginViewModel,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = R.string.sign_up),
        modifier = Modifier.padding(start = 32.dp, top = 32.dp),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
    )

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}