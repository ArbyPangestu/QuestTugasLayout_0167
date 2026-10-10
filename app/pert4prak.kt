package com.example.pert4arby

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

@Composable
fun ProfileCard(
    nameRes: Int,
    phoneRes: Int?,
    locRes: Int,
    bgColorRes: Int
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = bgColorRes)),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .height(90.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )


            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = nameRes),
                    color = colorResource(id = R.color.text_white),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                if (phoneRes != null) {
                    Text(
                        text = stringResource(id = phoneRes),
                        color = colorResource(id = R.color.text_cyan),
                        fontSize = 12.sp
                    )
                }
                Text(
                    text = stringResource(id = locRes),
                    color = colorResource(id = R.color.text_yellow),
                    fontSize = 12.sp
                )
            }


            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
        }
    }
}


