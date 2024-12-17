package com.example.loginapplication.components


import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun EditButton(
    onClick: () -> Unit,
    text: String,
    enabled: Boolean,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier.size(width = 148.dp, height = 48.dp),
        shape = RectangleShape
    ) {
        Text(text = text)
    }
}

