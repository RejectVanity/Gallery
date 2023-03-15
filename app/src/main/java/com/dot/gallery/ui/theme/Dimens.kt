package com.dot.gallery.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

sealed class Dimens(val size: Dp) {
    object Photo: Dimens(size = 102.dp)
    object Album: Dimens(size = 182.dp)

    operator fun invoke(): Dp = size
}