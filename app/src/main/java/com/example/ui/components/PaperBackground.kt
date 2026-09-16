package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.unit.dp
import com.example.ui.theme.NotebookMarginRed
import com.example.ui.theme.NotebookRuleLine
import com.example.ui.theme.WatermarkColor
import com.example.ui.theme.WatermarkColorDark

@Composable
fun PaperBackground(
    modifier: Modifier = Modifier,
    showWatermark: Boolean = true,
    showRuledLines: Boolean = true,
    content: @Composable BoxScope.() -> Unit
) {
    val isDark = isSystemInDarkTheme()
    val ruleColor = if (isDark) Color(0x15FFFFFF) else NotebookRuleLine
    val marginColor = if (isDark) Color(0x25EF4444) else NotebookMarginRed.copy(alpha = 0.5f)
    val watermarkPaintColor = if (isDark) WatermarkColorDark else WatermarkColor

    Box(modifier = modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // 1. Draw notebook ruled lines
            if (showRuledLines) {
                val lineSpacing = 32.dp.toPx()
                var y = 48.dp.toPx()
                while (y < height) {
                    drawLine(
                        color = ruleColor,
                        start = Offset(0f, y),
                        end = Offset(width, y),
                        strokeWidth = 1.dp.toPx()
                    )
                    y += lineSpacing
                }

                // Draw vertical left notebook margin line
                val marginX = 24.dp.toPx()
                drawLine(
                    color = marginColor,
                    start = Offset(marginX, 0f),
                    end = Offset(marginX, height),
                    strokeWidth = 1.5.dp.toPx()
                )
            }

            // 2. Draw repetitive diagonal watermark: [ ░▒▓ ABHINAV SIR (PGT COMMERCE) ▓▒░ ]
            if (showWatermark) {
                rotate(degrees = -30f, pivot = Offset(width / 2, height / 2)) {
                    val paint = android.graphics.Paint().apply {
                        color = if (isDark) 0x22FFFFFF else 0x180F172A
                        textSize = 22.dp.toPx()
                        isAntiAlias = true
                        typeface = android.graphics.Typeface.create(android.graphics.Typeface.MONOSPACE, android.graphics.Typeface.BOLD)
                    }

                    val watermarkText = "[ ░▒▓ ABHINAV SIR (PGT COMMERCE) ▓▒░ ]"
                    val stepY = 220.dp.toPx()
                    val startY = -height * 0.5f
                    val endY = height * 1.5f

                    var currY = startY
                    while (currY <= endY) {
                        drawContext.canvas.nativeCanvas.drawText(
                            watermarkText,
                            -width * 0.2f,
                            currY,
                            paint
                        )
                        currY += stepY
                    }
                }
            }
        }

        content()
    }
}
