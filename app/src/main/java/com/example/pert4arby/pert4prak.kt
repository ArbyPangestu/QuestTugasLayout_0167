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

        ProfileCard(
            nameRes = R.string.name_1,
            phoneRes = null,
            locRes = R.string.loc_1,
            bgColorRes = R.color.card_grey
        )

        ProfileCard(
            nameRes = R.string.name_2,
            phoneRes = R.string.phone_2,
            locRes = R.string.loc_2,
            bgColorRes = R.color.card_purple
        )

        ProfileCard(
            nameRes = R.string.name_3,
            phoneRes = R.string.phone_3,
            locRes = R.string.loc_3,
            bgColorRes = R.color.card_blue
        )

        ProfileCard(
            nameRes = R.string.name_4,
            phoneRes = R.string.phone_4,
            locRes = R.string.loc_4,
            bgColorRes = R.color.card_green
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 12.sp,
            color = colorResource(id = R.color.text_black),
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}