package com.example.loginapplication.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun EditTextField(
    text: String,
    onValue: (String) -> Unit,
    label: String,
    keyboardOptions: KeyboardOptions,
    singleLine: Boolean = true,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    modifier: Modifier = Modifier,
    @StringRes supportingText: Int? = null
) {
    TextField(
        value = text,
        onValueChange = onValue,
        label = { Text(label) },
        keyboardOptions = keyboardOptions,
        visualTransformation = visualTransformation,
        singleLine = singleLine,
        modifier = modifier,
        supportingText = supportingText?.let {
            {
                Text(
                    stringResource(supportingText),
                    color = Color.Red
                )
            }
        }
    )
}