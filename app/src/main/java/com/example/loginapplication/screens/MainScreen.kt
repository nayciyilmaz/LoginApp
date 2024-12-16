package com.example.loginapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.loginapplication.R
import com.example.loginapplication.components.EditButton
import com.example.loginapplication.navigation.LoginAppScreens

@Composable
fun MainScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .background(Color(0xFFE5E5E5))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.homepage),
            contentDescription = null
        )

        EditButton(
            onClick = { navController.navigate(LoginAppScreens.SignInScreen.route) },
            text = stringResource(R.string.sign_in),
            enabled = true,
            modifier = modifier.padding(top = 20.dp, bottom = 12.dp)
        )

        EditButton(
            onClick = { navController.navigate(LoginAppScreens.SignUpScreen.route) } ,
            text = stringResource(R.string.sign_up),
            enabled = true
        )
    }
}