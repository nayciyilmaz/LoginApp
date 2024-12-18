package com.example.loginapplication.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapplication.R
import com.example.loginapplication.components.EditButton
import com.example.loginapplication.components.EditTextField
import com.example.loginapplication.navigation.LoginAppScreens
import com.example.loginapplication.viewmodel.LoginViewModel

@Composable
fun SignInScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel
) {
    Text(
        text = stringResource(id = R.string.sign_in),
        modifier = Modifier.padding(start = 32.dp, top = 32.dp),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
    )
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EditTextField(
            text = viewModel.email,
            onValue = { viewModel.updateEmail(it) },
            label = "E Mail",
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Email
            ),
            supportingText = if (!viewModel.isEmailValid() && !viewModel.isEmailBlank()) {
                R.string.email_error
            } else {
                null
            }
        )
        EditTextField(
            text = viewModel.password,
            onValue = { viewModel.updatePassword(it) },
            label = "Password",
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Number
            ),
            modifier = modifier.padding(top = 12.dp, bottom = 12.dp),
            supportingText = if (!viewModel.isPasswordValid() && !viewModel.isPasswordBlank()) {
                R.string.password_error
            } else {
                null
            }
        )
        EditButton(
            text = "Contunie",
            onClick = {
                navController.navigate(LoginAppScreens.HomePageScreen.route)
                viewModel.isSignInReset()
            },
            enabled = viewModel.isEmailAndPasswordValid()
        )
    }
}