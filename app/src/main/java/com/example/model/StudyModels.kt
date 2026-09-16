package com.example.model

enum class ModuleCategory(val title: String, val pageRange: String, val startPage: Int, val endPage: Int) {
    SOLE_PROPRIETORSHIP("Sole Proprietorship", "Pages 01–08", 1, 8),
    PARTNERSHIP("Partnership", "Pages 09–22", 9, 22),
    HUF("Hindu Undivided Family (HUF)", "Pages 23–30", 23, 30),
    COOPERATIVE("Cooperative Societies", "Pages 31–42", 31, 42),
    JOINT_STOCK_COMPANY("Joint Stock Company", "Pages 43–52", 43, 52),
    FORMATION("Formation of a Company", "Pages 53–62", 53, 62),
    CHOICE_AND_VAULT("Choice of Form & Vault", "Pages 63–70", 63, 70);

    companion object {
        val COMPANY = JOINT_STOCK_COMPANY
    }
}

enum class LanguageMode {
    DUAL_PARALLEL,
    ENGLISH_ONLY,
    HINGLISH_ONLY
}

data class VisualCharacterExample(
    val title: String,
    val loreOrContext: String,
    val asciiFlowchart: String,
    val lessonQuote: String? = null
)

data class SubPointItem(
    val pointTitle: String,
    val category: String, // "Feature", "Merit", "Limitation", "Partner Type", "Clause", etc.
    val englishText: String,
    val hinglishText: String,
    val asciiFlowchart: String,
    val microMnemonic: String,
    val ramayanaLoreExample: VisualCharacterExample,
    val genZExample: VisualCharacterExample,
    val caseQuestion: String,
    val caseAnswer: String
)

data class TopicCaseStudy(
    val caseTitle: String,
    val scenario: String,
    val question: String,
    val marks: Int,
    val stepByStepMarkingScheme: List<String>
)

data class StudyPage(
    val pageNumber: Int,
    val module: ModuleCategory,
    val title: String,
    val subtitle: String,
    val topicDescriptionEnglish: String,
    val topicDescriptionHinglish: String,
    val macroMemoryTrick: String,
    val ramayanaMasterVisualScene: VisualCharacterExample,
    val subPoints: List<SubPointItem>,
    val topicCaseStudies: List<TopicCaseStudy> = emptyList(),
    val revisionTakeaways: List<String> = emptyList()
)

// Assessment & Question Bank Models
enum class QuestionType {
    MCQ,
    ASSERTION_REASONING,
    CUET_OLYMPIAD,
    CBSE_PYQ
}

data class QuizQuestion(
    val id: Int,
    val type: QuestionType,
    val topic: String,
    val questionText: String,
    val options: List<String> = emptyList(),
    val correctOptionIndex: Int = -1,
    val cbseMarks: String = "1 Mark",
    val explanationEnglish: String,
    val explanationHinglish: String,
    val markingSchemePoints: List<String> = emptyList()
)

// Gamified Puzzles Models
data class CrosswordClue(
    val number: Int,
    val isAcross: Boolean,
    val clue: String,
    val answer: String,
    val row: Int,
    val col: Int
)

data class DeedClauseItem(
    val id: Int,
    val clauseName: String,
    val statutoryRequirement: String,
    val implicationIfSilent: String
)

data class WordSearchPuzzle(
    val grid: List<List<Char>>,
    val targetWords: List<String>,
    val hints: Map<String, String>
)

data class PartnerPersona(
    val id: Int,
    val partnerType: String,
    val capitalContribution: String,
    val managementParticipation: String,
    val profitLossShare: String,
    val liabilityStatus: String,
    val characterPersona: String
)

data class LegalBlunderItem(
    val id: Int,
    val clauseText: String,
    val isBlunder: Boolean,
    val statutoryCorrection: String
)

data class MatchmakerItem(
    val id: Int,
    val entrepreneurName: String,
    val scenario: String,
    val optimalForm: String,
    val rationale: String
)
