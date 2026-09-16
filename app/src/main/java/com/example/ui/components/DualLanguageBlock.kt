package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.LanguageMode
import com.example.ui.theme.PaletteGold
import com.example.ui.theme.PaletteGoldBg
import com.example.ui.theme.PaletteGoldBorder
import com.example.ui.theme.PaletteMint
import com.example.ui.theme.PaletteMintBg
import com.example.ui.theme.PaletteMintBorder

@Composable
fun DualLanguageBlock(
    englishText: String,
    hinglishText: String,
    languageMode: LanguageMode,
    modifier: Modifier = Modifier,
    englishLabel: String = "ACADEMIC CBSE ENGLISH",
    hinglishLabel: String = "HINGLISH RELATABLE EXPLANATION"
) {
    when (languageMode) {
        LanguageMode.ENGLISH_ONLY -> {
            EnglishSection(
                label = englishLabel,
                text = englishText,
                modifier = modifier
            )
        }
        LanguageMode.HINGLISH_ONLY -> {
            HinglishSection(
                label = hinglishLabel,
                text = hinglishText,
                modifier = modifier
            )
        }
        LanguageMode.DUAL_PARALLEL -> {
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                EnglishSection(
                    label = englishLabel,
                    text = englishText
                )
                HinglishSection(
                    label = hinglishLabel,
                    text = hinglishText
                )
            }
        }
    }
}

@Composable
private fun EnglishSection(
    label: String,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(PaletteGoldBg.copy(alpha = 0.5f))
            .border(1.2.dp, PaletteGoldBorder, RoundedCornerShape(10.dp))
            .padding(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.School,
                contentDescription = "Academic English",
                tint = PaletteGold,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = PaletteGold,
                    letterSpacing = 0.5.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium.copy(
                lineHeight = 21.sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.onSurface
            )
        )
    }
}

@Composable
private fun HinglishSection(
    label: String,
    text: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(PaletteMintBg.copy(alpha = 0.5f))
            .border(1.2.dp, PaletteMintBorder, RoundedCornerShape(10.dp))
            .padding(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.Chat,
                contentDescription = "Hinglish Guide",
                tint = PaletteMint,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = PaletteMint,
                    letterSpacing = 0.5.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium.copy(
                lineHeight = 21.sp,
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colorScheme.onSurface
            )
        )
    }
}
