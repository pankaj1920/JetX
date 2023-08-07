package com.example.jetx.utils

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.jetx.R

enum class FontType {
    REGULAR,
    MEDIUM,
    SEMI_BOLD,
    BOLD

}

fun getPoppinFontType(fontType: FontType): FontFamily {
    return when (fontType) {
        FontType.REGULAR -> FontFamily(Font(R.font.poppins_regular))
        FontType.MEDIUM -> FontFamily(Font(R.font.poppins_medium))
        FontType.SEMI_BOLD -> FontFamily(Font(R.font.poppins_semi_bold))
        FontType.BOLD -> FontFamily(Font(R.font.poppins_bold))
    }
}