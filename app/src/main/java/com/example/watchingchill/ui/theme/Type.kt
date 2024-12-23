package com.example.watchingchill.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.watchingchill.R

private val RobotofontFamily = FontFamily(
    Font(R.font.roboto_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.roboto_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.roboto_regular, FontWeight.Normal, FontStyle.Normal)
)
val Typography = Typography(
  headlineLarge = TextStyle(
    fontFamily =  RobotofontFamily,
      fontSize = 32.sp,
      fontWeight = FontWeight.Black
 ),
    titleMedium = TextStyle(
        fontFamily =  RobotofontFamily,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    ),
    bodySmall = TextStyle(
        fontFamily =  RobotofontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    ),

)