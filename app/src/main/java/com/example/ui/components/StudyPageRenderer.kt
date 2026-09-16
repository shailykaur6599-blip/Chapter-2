package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.LanguageMode
import com.example.model.StudyPage
import com.example.model.SubPointItem
import com.example.model.TopicCaseStudy
import com.example.ui.theme.*

@Composable
fun StudyPageRenderer(
    page: StudyPage,
    languageMode: LanguageMode,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 1. Page Header Badge
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = PalettePurple.copy(alpha = 0.15f),
                border = androidx.compose.foundation.BorderStroke(1.dp, PalettePurple)
            ) {
                Text(
                    text = page.module.title.uppercase(),
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = PalettePurple,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp
                    )
                )
            }

            Surface(
                shape = CircleShape,
                color = PaletteGoldBg,
                border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteGoldBorder)
            ) {
                Text(
                    text = "PAGE ${page.pageNumber}/70",
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp),
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Black,
                        color = PaletteGold
                    )
                )
            }
        }

        // 2. Handwritten Style Title & Subtitle
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = page.title,
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 22.sp,
                    lineHeight = 28.sp
                ),
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = page.subtitle,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = PaletteCyan,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }

        // 3. Dual Parallel Language Overview Box
        DualLanguageBlock(
            englishText = page.topicDescriptionEnglish,
            hinglishText = page.topicDescriptionHinglish,
            languageMode = languageMode,
            englishLabel = "ACADEMIC CBSE CORE CONCEPT",
            hinglishLabel = "ABHINAV SIR'S HINGLISH DECODED"
        )

        // 4. Macro Memory Trick Callout
        MacroMemoryCallout(macroTrick = page.macroMemoryTrick)

        // 5. Ramayana Master Visual Scene
        Text(
            text = "RAMAYANA MASTER VISUAL SCENE",
            style = MaterialTheme.typography.labelSmall.copy(
                fontWeight = FontWeight.Black,
                letterSpacing = 1.2.sp,
                color = PaletteCrimson
            )
        )
        VisualExampleCard(
            example = page.ramayanaMasterVisualScene,
            isRamayanaLore = true
        )

        // 6. Sub-Points Section
        if (page.subPoints.isNotEmpty()) {
            Text(
                text = "IN-DEPTH TOPIC SUB-POINTS & ANALYSIS",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Black,
                    letterSpacing = 1.2.sp,
                    color = PaletteCyan
                )
            )

            page.subPoints.forEach { subPoint ->
                SubPointCard(
                    subPoint = subPoint,
                    languageMode = languageMode
                )
            }
        }

        // 7. Topic Case Studies
        if (page.topicCaseStudies.isNotEmpty()) {
            Text(
                text = "CBSE REAL-WORLD APPLICATION CASES",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Black,
                    letterSpacing = 1.2.sp,
                    color = PaletteGold
                )
            )

            page.topicCaseStudies.forEach { caseStudy ->
                CaseStudyCard(caseStudy = caseStudy)
            }
        }

        // 8. Key Revision Takeaways
        if (page.revisionTakeaways.isNotEmpty()) {
            RevisionTakeawaysBox(takeaways = page.revisionTakeaways)
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun MacroMemoryCallout(
    macroTrick: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PaletteGoldBg.copy(alpha = 0.7f)
        ),
        border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteGoldBorder)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Lightbulb,
                contentDescription = "Memory Key",
                tint = PaletteGold,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(
                    text = "MASTER MNEMONIC MEMORY TRICK",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Black,
                        color = PaletteGold,
                        letterSpacing = 1.sp
                    )
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = macroTrick,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = InkBlack
                    )
                )
            }
        }
    }
}

@Composable
fun SubPointCard(
    subPoint: SubPointItem,
    languageMode: LanguageMode,
    modifier: Modifier = Modifier
) {
    var isExpanded by remember { mutableStateOf(true) }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.9f)
        ),
        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Header Row with category tag and expand toggle
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { isExpanded = !isExpanded },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = subPoint.category.uppercase(),
                        style = MaterialTheme.typography.labelSmall.copy(
                            color = PaletteCyan,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = subPoint.pointTitle,
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = PaletteMintBg,
                    border = androidx.compose.foundation.BorderStroke(1.dp, PaletteMintBorder)
                ) {
                    Text(
                        text = subPoint.microMnemonic,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = PaletteMint
                        )
                    )
                }

                IconButton(
                    onClick = { isExpanded = !isExpanded },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = "Toggle Subpoint"
                    )
                }
            }

            AnimatedVisibility(visible = isExpanded) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    // Dual Language content
                    DualLanguageBlock(
                        englishText = subPoint.englishText,
                        hinglishText = subPoint.hinglishText,
                        languageMode = languageMode
                    )

                    // ASCII Flowchart
                    if (subPoint.asciiFlowchart.isNotBlank()) {
                        AsciiDiagramBox(
                            title = "CONCEPT FLOWCHART",
                            diagramContent = subPoint.asciiFlowchart
                        )
                    }

                    // Ramayana Lore Example
                    VisualExampleCard(
                        example = subPoint.ramayanaLoreExample,
                        isRamayanaLore = true
                    )

                    // GenZ Example
                    VisualExampleCard(
                        example = subPoint.genZExample,
                        isRamayanaLore = false
                    )

                    // Case Question & Quick Reveal Answer
                    QuickCaseQuestionBox(
                        question = subPoint.caseQuestion,
                        answer = subPoint.caseAnswer
                    )
                }
            }
        }
    }
}

@Composable
fun QuickCaseQuestionBox(
    question: String,
    answer: String,
    modifier: Modifier = Modifier
) {
    var showAnswer by remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(PaletteGoldBg.copy(alpha = 0.4f))
            .border(1.dp, PaletteGoldBorder.copy(alpha = 0.6f), RoundedCornerShape(10.dp))
            .padding(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Default.Psychology,
                contentDescription = "Test Question",
                tint = PaletteGold,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "EXAM TESTING GROUND",
                style = MaterialTheme.typography.labelSmall.copy(
                    fontWeight = FontWeight.Bold,
                    color = PaletteGold
                )
            )
        }

        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = question,
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.Medium
            )
        )

        Spacer(modifier = Modifier.height(6.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(
                onClick = { showAnswer = !showAnswer },
                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp)
            ) {
                Text(
                    text = if (showAnswer) "Hide Statutory Solution" else "Reveal Statutory Solution",
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.Bold,
                        color = PaletteGold
                    )
                )
            }
        }

        AnimatedVisibility(visible = showAnswer) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White.copy(alpha = 0.7f))
                    .padding(8.dp)
            ) {
                Text(
                    text = "CORRECT CBSE STATUTORY ANSWER:",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Black,
                        color = PaletteMint
                    )
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = answer,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = InkBlack,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }
    }
}

@Composable
fun CaseStudyCard(
    caseStudy: TopicCaseStudy,
    modifier: Modifier = Modifier
) {
    var showMarkingScheme by remember { mutableStateOf(false) }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PaletteCyanBg.copy(alpha = 0.45f)
        ),
        border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteCyanBorder)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = caseStudy.caseTitle,
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = PaletteCyan
                    )
                )
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = PaletteCyan,
                    contentColor = Color.White
                ) {
                    Text(
                        text = "${caseStudy.marks} MARKS",
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            }

            Text(
                text = caseStudy.scenario,
                style = MaterialTheme.typography.bodyMedium.copy(
                    lineHeight = 20.sp
                )
            )

            HorizontalDivider(color = PaletteCyanBorder.copy(alpha = 0.3f))

            Text(
                text = "Question: ${caseStudy.question}",
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = InkBlack
                )
            )

            Button(
                onClick = { showMarkingScheme = !showMarkingScheme },
                colors = ButtonDefaults.buttonColors(
                    containerColor = PaletteCyan
                ),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(
                    imageVector = if (showMarkingScheme) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = if (showMarkingScheme) "Hide Step-by-Step Marking Scheme" else "View Official CBSE Step-by-Step Marking Scheme",
                    style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                )
            }

            AnimatedVisibility(visible = showMarkingScheme) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color.White.copy(alpha = 0.9f))
                        .border(1.dp, PaletteCyanBorder, RoundedCornerShape(8.dp))
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text(
                        text = "CBSE OFFICIAL MARKING BREAKDOWN:",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Black,
                            color = PaletteCyan
                        )
                    )

                    caseStudy.stepByStepMarkingScheme.forEachIndexed { index, step ->
                        Row(verticalAlignment = Alignment.Top) {
                            Text(
                                text = "• ",
                                style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold)
                            )
                            Text(
                                text = step,
                                style = MaterialTheme.typography.bodySmall.copy(
                                    fontWeight = FontWeight.Medium,
                                    color = InkBlack
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RevisionTakeawaysBox(
    takeaways: List<String>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = PaletteMintBg.copy(alpha = 0.5f)
        ),
        border = androidx.compose.foundation.BorderStroke(1.2.dp, PaletteMintBorder)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Default.CheckCircle,
                    contentDescription = "Key Takeaway",
                    tint = PaletteMint,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "ABHINAV SIR'S REVISION TAKEAWAYS",
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Black,
                        color = PaletteMint,
                        letterSpacing = 1.sp
                    )
                )
            }

            takeaways.forEach { item ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Text(
                        text = "✓ ",
                        color = PaletteMint,
                        style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Black)
                    )
                    Text(
                        text = item,
                        style = MaterialTheme.typography.bodySmall.copy(
                            fontWeight = FontWeight.SemiBold,
                            color = InkBlack
                        )
                    )
                }
            }
        }
    }
}
