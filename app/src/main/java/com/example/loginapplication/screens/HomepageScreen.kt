package com.example.loginapplication.screens

import android.app.AlertDialog
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapplication.R
import com.example.loginapplication.components.EditButton
import com.example.loginapplication.navigation.LoginAppScreens

@Composable
fun HomepageScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val alertDialog = AlertDialog.Builder(context)
    BackHandler {

    }
    Text(
        text = stringResource(id = R.string.log_out),
        modifier = modifier.padding(start = 32.dp, top = 32.dp),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
    )
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = null,
            modifier = modifier.padding(32.dp)
        )
        EditButton(
            text = stringResource(id = R.string.log_out),
            onClick = {
                alertDialog.setTitle(R.string.logOut_message)
                alertDialog.setMessage(R.string.alert_setMessage)

                alertDialog.setPositiveButton("Yes") { _, _ ->
                    navController.navigate(LoginAppScreens.MainScreen.route)
                }
                alertDialog.setNegativeButton("No", null)
                alertDialog.show()
            },
            enabled = true
        )
    }
}
