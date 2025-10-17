package com.example.helloandroid.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.helloandroid.R


val Typography = Typography(

    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.gilroy_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
    ),

    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.gilroy_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    ),

    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.gilroy_regular)),
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
    ),

    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.gilroy_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
    ),


    titleMedium = TextStyle(

        fontFamily = FontFamily(Font(R.font.gilroy_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,

        ),


    titleSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.gilroy_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
    )


)