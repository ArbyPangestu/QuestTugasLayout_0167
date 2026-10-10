package com.example.pert4arby

import androidx.compose.runtime.Composable

@Composable
fun TugasLayoutApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = stringResource(id = R.string.title_ti),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )

        Text(
            text = stringResource(id = R.string.subtitle_umy),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = colorResource(id = R.color.text_black)
        )

        Spacer(modifier = Modifier.height(24.dp))