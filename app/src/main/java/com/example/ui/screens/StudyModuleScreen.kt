package com.example.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.StudyRepository
import com.example.model.LanguageMode
import com.example.model.ModuleCategory
import com.example.ui.components.PaperBackground
import com.example.ui.components.StudyPageRenderer
import com.example.ui.theme.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudyModuleScreen(
    onNavigateToVault: () -> Unit,
    modifier: Modifier = Modifier
) {
    val allPages = remember { StudyRepository.allPages }
    var currentPageIndex by remember { mutableIntStateOf(0) }
    var languageMode by remember { mutableStateOf(LanguageMode.DUAL_PARALLEL) }
    var selectedModuleFilter by remember { mutableStateOf<ModuleCategory?>(null) }
    var showJumpDialog by remember { mutableStateOf(false) }

    val filteredPages = remember(selectedModuleFilter) {
        if (selectedModuleFilter == null) allPages
        else allPages.filter { it.module == selectedModuleFilter }
    }

    // Keep currentPageIndex in bounds of filteredPages
    val safePageIndex = currentPageIndex.coerceIn(0, (filteredPages.size - 1).coerceAtLeast(0))
    val currentPage = filteredPages.getOrNull(safePageIndex) ?: allPages.first()

    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Forms of Business Organisation",
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontWeight = FontWeight.Black
                                )
                            )
                        }
                        Text(
                            text = "Abhinav Sir (PGT Commerce) • Class 11 Handwritten Notes",
                            style = MaterialTheme.typography.labelSmall.copy(
                                color = PaletteGold,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                },
                actions = {
                    // Gamified Vault Button
                    FilledTonalButton(
                        onClick = onNavigateToVault,
                        colors = ButtonDefaults.filledTonalButtonColors(
                            containerColor = PalettePurpleBg,
                            contentColor = PalettePurple
                        ),
                        shape = RoundedCornerShape(10.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.SportsEsports,
                            contentDescription = "Gamified Vault",
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "VAULT",
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight.Black,
                                letterSpacing = 1.sp
                            )
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        bottomBar = {
            Surface(
                tonalElevation = 8.dp,
                shadowElevation = 8.dp,
                color = MaterialTheme.colorScheme.surface
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Previous Page Button
                    IconButton(
                        onClick = {
                            if (safePageIndex > 0) {
                                currentPageIndex = safePageIndex - 1
                                coroutineScope.launch { listState.scrollToItem(0) }
                            }
                        },
                        enabled = safePageIndex > 0
                    ) {
                        Icon(
                            imageVector = Icons.Default.ChevronLeft,
                            contentDescription = "Previous Page"
                        )
                    }

                    // Jump / Current Page Indicator
                    Surface(
                        onClick = { showJumpDialog = true },
                        shape = RoundedCornerShape(16.dp),
                        color = PaletteGoldBg,
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, PaletteGoldBorder)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "PAGE ${currentPage.pageNumber} OF 70",
                                style = MaterialTheme.typography.labelMedium.copy(
                                    fontWeight = FontWeight.Black,
                                    color = PaletteGold,
                                    letterSpacing = 1.sp
                                )
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Icon(
                                imageVector = Icons.Default.UnfoldMore,
                                contentDescription = "Jump to Page",
                                tint = PaletteGold,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }

                    // Next Page Button
                    IconButton(
                        onClick = {
                            if (safePageIndex < filteredPages.size - 1) {
                                currentPageIndex = safePageIndex + 1
                                coroutineScope.launch { listState.scrollToItem(0) }
                            }
                        },
                        enabled = safePageIndex < filteredPages.size - 1
                    ) {
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = "Next Page"
                        )
                    }
                }
            }
        },
        modifier = modifier
    ) { innerPadding ->
        PaperBackground(
            modifier = Modifier.padding(innerPadding),
            showWatermark = true,
            showRuledLines = true
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // Secondary Controls: Language Switcher & Module Filters
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 6.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    // Language Mode Row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "MODE:",
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.Bold,
                                color = PaletteCyan
                            )
                        )

                        SingleChoiceSegmentedButtonRow(
                            modifier = Modifier.height(34.dp)
                        ) {
                            SegmentedButton(
                                selected = languageMode == LanguageMode.DUAL_PARALLEL,
                                onClick = { languageMode = LanguageMode.DUAL_PARALLEL },
                                shape = SegmentedButtonDefaults.itemShape(index = 0, count = 3)
                            ) {
                                Text("Dual", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            }
                            SegmentedButton(
                                selected = languageMode == LanguageMode.ENGLISH_ONLY,
                                onClick = { languageMode = LanguageMode.ENGLISH_ONLY },
                                shape = SegmentedButtonDefaults.itemShape(index = 1, count = 3)
                            ) {
                                Text("English", fontSize = 11.sp)
                            }
                            SegmentedButton(
                                selected = languageMode == LanguageMode.HINGLISH_ONLY,
                                onClick = { languageMode = LanguageMode.HINGLISH_ONLY },
                                shape = SegmentedButtonDefaults.itemShape(index = 2, count = 3)
                            ) {
                                Text("Hinglish", fontSize = 11.sp)
                            }
                        }
                    }

                    // Module Quick Filter Chips Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        FilterChip(
                            selected = selectedModuleFilter == null,
                            onClick = {
                                selectedModuleFilter = null
                                currentPageIndex = 0
                            },
                            label = { Text("All (1–70)", fontSize = 11.sp) }
                        )

                        ModuleCategory.values().forEach { module ->
                            FilterChip(
                                selected = selectedModuleFilter == module,
                                onClick = {
                                    selectedModuleFilter = module
                                    currentPageIndex = 0
                                },
                                label = {
                                    Text(
                                        text = "${module.title.split(" ").first()} (${module.pageRange.replace("Pages ", "")})",
                                        fontSize = 11.sp
                                    )
                                }
                            )
                        }
                    }
                }

                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))

                // Scrollable Study Page Content
                LazyColumn(
                    state = listState,
                    modifier = Modifier.fillMaxSize()
                ) {
                    item {
                        StudyPageRenderer(
                            page = currentPage,
                            languageMode = languageMode
                        )
                    }
                }
            }
        }
    }

    // Quick Jump Dialog
    if (showJumpDialog) {
        AlertDialog(
            onDismissRequest = { showJumpDialog = false },
            title = {
                Text(
                    text = "Jump to Page (1 to 70)",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )
            },
            text = {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(320.dp)
                ) {
                    LazyColumn {
                        items(allPages.size) { index ->
                            val page = allPages[index]
                            ListItem(
                                headlineContent = {
                                    Text(
                                        text = "Page ${page.pageNumber}: ${page.title}",
                                        style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.SemiBold)
                                    )
                                },
                                supportingContent = {
                                    Text(
                                        text = page.module.title,
                                        style = MaterialTheme.typography.labelSmall.copy(color = PaletteCyan)
                                    )
                                },
                                leadingContent = {
                                    Surface(
                                        shape = CircleShape,
                                        color = if (safePageIndex == index) PaletteGold else PaletteGoldBg,
                                        contentColor = if (safePageIndex == index) Color.White else PaletteGold
                                    ) {
                                        Text(
                                            text = "${page.pageNumber}",
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                            style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold)
                                        )
                                    }
                                },
                                modifier = Modifier.clickable {
                                    selectedModuleFilter = null
                                    currentPageIndex = index
                                    showJumpDialog = false
                                    coroutineScope.launch { listState.scrollToItem(0) }
                                }
                            )
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showJumpDialog = false }) {
                    Text("Close")
                }
            }
        )
    }
}
