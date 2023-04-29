package com.example.tiptime.ui.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tiptime.R

@Composable
fun TipAmountText(tip: String) {
    Text(
        text = stringResource(R.string.tip_amount, tip),
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}