package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.data.ChoiceAndVaultData
import com.example.data.StudyRepository
import com.example.model.*
import com.example.ui.components.PaperBackground
import com.example.ui.theme.*

enum class VaultTab(val title: String) {
    QUIZ("Board & CUET Quiz"),
    CROSSWORD("Corporate Crossword"),
    MATCHMAKER("Entrepreneur Match"),
    LEGAL_BLUNDER("Spot Legal Blunder"),
    MNEMONICS("Master Mnemonic Sheet")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GamifiedVaultScreen(
    onNavigateBackToNotes: () -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedTab by remember { mutableStateOf(VaultTab.QUIZ) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "GAMIFIED ASSESSMENT VAULT",
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Black,
                                letterSpacing = 1.sp
                            )
                        )
                        Text(
                            text = "Class 11 Business Studies | Abhinav Sir (PGT Commerce)",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = PaletteGold
                            )
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBackToNotes) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back to Study Notes"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        modifier = modifier
    ) { innerPadding ->
        PaperBackground(
            modifier = Modifier.padding(innerPadding),
            showWatermark = true,
            showRuledLines = true
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // Scrollable tab row
                ScrollableTabRow(
                    selectedTabIndex = selectedTab.ordinal,
                    edgePadding = 12.dp,
                    containerColor = Color.Transparent,
                    contentColor = PalettePurple
                ) {
                    VaultTab.values().forEach { tab ->
                        Tab(
                            selected = selectedTab == tab,
                            onClick = { selectedTab = tab },
                            text = {
                                Text(
                                    text = tab.title,
                                    fontWeight = if (selectedTab == tab) FontWeight.Bold else FontWeight.Normal
                                )
                            }
                        )
                    }
                }

                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)

                // Tab Content
                when (selectedTab) {
                    VaultTab.QUIZ -> QuizTabContent()
                    VaultTab.CROSSWORD -> CrosswordTabContent()
                    VaultTab.MATCHMAKER -> MatchmakerTabContent()
                    VaultTab.LEGAL_BLUNDER -> LegalBlunderTabContent()
                    VaultTab.MNEMONICS -> MasterMnemonicTabContent()
                }
            }
        }
    }
}

@Composable
fun QuizTabContent() {
    val questions = StudyRepository.quizQuestions
    var score by remember { mutableIntStateOf(0) }
    var answeredCount by remember { mutableIntStateOf(0) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = PaletteGoldBg.copy(alpha = 0.7f)),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteGoldBorder)
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "CBSE & CUET EXAM ARENA",
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight.Black,
                                color = PaletteGold
                            )
                        )
                        Text(
                            text = "Real-time accuracy & statutory rationale",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                    Surface(
                        shape = CircleShape,
                        color = PaletteGold,
                        contentColor = Color.White
                    ) {
                        Text(
                            text = "$score / ${questions.size}",
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Black)
                        )
                    }
                }
            }
        }

        items(questions) { question ->
            QuizQuestionCard(
                question = question,
                onAnswerSubmitted = { isCorrect ->
                    if (isCorrect) score++
                    answeredCount++
                }
            )
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun QuizQuestionCard(
    question: QuizQuestion,
    onAnswerSubmitted: (Boolean) -> Unit
) {
    var selectedOption by remember { mutableIntStateOf(-1) }
    var hasAnswered by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = PaletteCyanBg,
                    border = androidx.compose.foundation.BorderStroke(1.dp, PaletteCyanBorder)
                ) {
                    Text(
                        text = question.type.name.replace("_", " "),
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = PaletteCyan
                        )
                    )
                }

                Text(
                    text = question.cbseMarks,
                    style = MaterialTheme.typography.labelSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = PaletteGold
                    )
                )
            }

            Text(
                text = question.questionText,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Bold
                )
            )

            // Options
            question.options.forEachIndexed { index, option ->
                val isSelected = selectedOption == index
                val isCorrect = index == question.correctOptionIndex

                val containerColor = when {
                    !hasAnswered && isSelected -> PalettePurpleBg
                    hasAnswered && isCorrect -> PaletteMintBg
                    hasAnswered && isSelected && !isCorrect -> PaletteCrimsonBg
                    else -> MaterialTheme.colorScheme.surface
                }

                val borderColor = when {
                    !hasAnswered && isSelected -> PalettePurpleBorder
                    hasAnswered && isCorrect -> PaletteMintBorder
                    hasAnswered && isSelected && !isCorrect -> PaletteCrimsonBorder
                    else -> MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(containerColor)
                        .border(1.dp, borderColor, RoundedCornerShape(8.dp))
                        .clickable(enabled = !hasAnswered) {
                            selectedOption = index
                            hasAnswered = true
                            onAnswerSubmitted(isCorrect)
                        }
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "${('A' + index)}. ",
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = option,
                        style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Medium)
                    )
                }
            }

            // Reveal statutory explanation upon selection
            AnimatedVisibility(visible = hasAnswered) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(PaletteMintBg.copy(alpha = 0.4f))
                        .border(1.dp, PaletteMintBorder, RoundedCornerShape(8.dp))
                        .padding(10.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "CBSE STATUTORY EXPLANATION:",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Black,
                            color = PaletteMint
                        )
                    )
                    Text(
                        text = question.explanationEnglish,
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "Hinglish: ${question.explanationHinglish}",
                        style = MaterialTheme.typography.bodySmall.copy(
                            color = InkBlack,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun CrosswordTabContent() {
    val clues = ChoiceAndVaultData.crosswordClues

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = PalettePurpleBg.copy(alpha = 0.65f)),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, PalettePurpleBorder)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = "CORPORATE CROSSWORD CIPHER",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black,
                            color = PalettePurple
                        )
                    )
                    Text(
                        text = "Tap any clue to reveal the statutory keyword and verify your recall.",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }

        items(clues) { clue ->
            var isRevealed by remember { mutableStateOf(false) }

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                shape = CircleShape,
                                color = if (clue.isAcross) PaletteCyan else PalettePurple,
                                contentColor = Color.White
                            ) {
                                Text(
                                    text = "${clue.number}",
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp),
                                    style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold)
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = if (clue.isAcross) "ACROSS (${clue.answer.length} letters)" else "DOWN (${clue.answer.length} letters)",
                                style = MaterialTheme.typography.labelSmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = if (clue.isAcross) PaletteCyan else PalettePurple
                                )
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = clue.clue,
                            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Medium)
                        )
                    }

                    Spacer(modifier = Modifier.width(8.dp))

                    Button(
                        onClick = { isRevealed = !isRevealed },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isRevealed) PaletteMint else PaletteGold
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = if (isRevealed) clue.answer else "REVEAL",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Black,
                                letterSpacing = 1.sp
                            )
                        )
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun MatchmakerTabContent() {
    val items = ChoiceAndVaultData.matchmakerItems

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = PaletteCyanBg.copy(alpha = 0.65f)),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteCyanBorder)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = "ENTREPRENEUR MATCHMAKER",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black,
                            color = PaletteCyan
                        )
                    )
                    Text(
                        text = "Match each entrepreneur's specific capital & liability constraints with the ideal business form.",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }

        items(items) { item ->
            var showSolution by remember { mutableStateOf(false) }

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = item.entrepreneurName,
                        style = MaterialTheme.typography.titleSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = PalettePurple
                        )
                    )
                    Text(
                        text = item.scenario,
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        OutlinedButton(
                            onClick = { showSolution = !showSolution },
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = if (showSolution) "Hide Ideal Match" else "Reveal Optimal Match & Rationale",
                                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                            )
                        }
                    }

                    AnimatedVisibility(visible = showSolution) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(PaletteMintBg.copy(alpha = 0.5f))
                                .border(1.dp, PaletteMintBorder, RoundedCornerShape(8.dp))
                                .padding(10.dp)
                        ) {
                            Text(
                                text = "OPTIMAL FORM: ${item.optimalForm.uppercase()}",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Black,
                                    color = PaletteMint
                                )
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = "Statutory Rationale: ${item.rationale}",
                                style = MaterialTheme.typography.bodySmall.copy(
                                    color = InkBlack,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                        }
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun LegalBlunderTabContent() {
    val blunders = ChoiceAndVaultData.legalBlunders

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = PaletteCrimsonBg.copy(alpha = 0.65f)),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteCrimsonBorder)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = "SPOT THE LEGAL BLUNDER",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black,
                            color = PaletteCrimson
                        )
                    )
                    Text(
                        text = "Carefully analyze these mock clauses, resolutions, and notices to spot fatal statutory blunders!",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }

        items(blunders) { blunder ->
            var showCorrection by remember { mutableStateOf(false) }

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Column(
                    modifier = Modifier.padding(14.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "LEGAL DEED / RESOLUTION EXTRACT:",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = PaletteCrimson
                        )
                    )
                    Text(
                        text = blunder.clauseText,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                        )
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Button(
                            onClick = { showCorrection = !showCorrection },
                            colors = ButtonDefaults.buttonColors(containerColor = PaletteCrimson),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = if (showCorrection) "Hide Correction" else "Spot the Fatal Blunder!",
                                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.Bold)
                            )
                        }
                    }

                    AnimatedVisibility(visible = showCorrection) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.White.copy(alpha = 0.9f))
                                .border(1.2.dp, PaletteCrimsonBorder, RoundedCornerShape(8.dp))
                                .padding(10.dp)
                        ) {
                            Text(
                                text = blunder.statutoryCorrection,
                                style = MaterialTheme.typography.bodySmall.copy(
                                    fontWeight = FontWeight.Bold,
                                    color = PaletteCrimson
                                )
                            )
                        }
                    }
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun MasterMnemonicTabContent() {
    val masterMnemonics = listOf(
        Pair("Sole Proprietorship Features", "F-U-L-S-C-N: Formation easy, Unlimited liability, Little capital, Sole control, Continuity zero, No separate entity"),
        Pair("Partnership Core Features", "M-A-B-U-C: Mutual agency, Agreement, Business legal, Unlimited liability, Continuity fragile"),
        Pair("Hindu Undivided Family (HUF)", "H-U-F-L-A-W: Hereditary membership, Undivided family estate, Family coparceners, Limited liability of members, Authority of Karta, Without contract"),
        Pair("Cooperative Society Merits", "E-L-S-E-G: Equality in voting, Limited liability, Stable life, Economy in operations, Government support"),
        Pair("Joint Stock Company Merits", "L-T-P-S-P: Limited liability, Transfer of interest, Perpetual succession, Scope for expansion, Professional management"),
        Pair("MOA Mandatory Clauses", "N-O-L-C-A-R: Name clause, Object clause, Liability clause, Capital clause, Association clause, Registered office clause"),
        Pair("Minimum Subscription Rule", "90-30-15: 90% minimum capital, within 30 days, refund in 15 days"),
        Pair("Company Incorporation Portal", "S-P-I-C-E: Simplified Proforma for Incorporating Company Electronically Plus")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = PaletteGoldBg.copy(alpha = 0.7f)),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteGoldBorder)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = "ABHINAV SIR'S MASTER MNEMONIC SHEET",
                        style = MaterialTheme.typography.titleMedium.copy(
                            fontWeight = FontWeight.Black,
                            color = PaletteGold
                        )
                    )
                    Text(
                        text = "All memory codes across 70 pages for instant pre-exam recall.",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }

        items(masterMnemonics) { (topic, mnemonic) ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant)
            ) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        text = topic,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = PaletteCyan
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = mnemonic,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.Bold,
                            color = PaletteGold
                        )
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}
