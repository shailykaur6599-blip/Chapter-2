package com.example.data

import com.example.model.*

object StudyRepository {
    val allPages: List<StudyPage> by lazy {
        SoleProprietorshipData.pages +
        PartnershipData.pages +
        HufData.pages +
        CooperativeSocietiesData.pages +
        JointStockCompanyData.pages +
        CompanyFormationData.pages +
        ChoiceAndVaultData.pages
    }

    fun getPage(pageNumber: Int): StudyPage? {
        return allPages.find { it.pageNumber == pageNumber }
    }

    fun getPagesForModule(module: ModuleCategory): List<StudyPage> {
        return allPages.filter { it.module == module }
    }

    // High-Yield Quiz Questions Bank (Assertion-Reason, MCQs, CUET/Olympiad)
    val quizQuestions = listOf(
        QuizQuestion(
            id = 1,
            type = QuestionType.MCQ,
            topic = "Sole Proprietorship",
            questionText = "Which of the following forms of business organisation has NO separate legal entity from its owner?",
            options = listOf("Joint Stock Company", "Cooperative Society", "Sole Proprietorship", "Limited Liability Partnership"),
            correctOptionIndex = 2,
            cbseMarks = "1 Mark",
            explanationEnglish = "In Sole Proprietorship, the law does not make any distinction between the owner and the business enterprise. There is no separate legal entity.",
            explanationHinglish = "Sole Proprietorship me kanoon dukan aur dukan ke malik ko ek hi maanta hai, koi alag legal astitva nahi hota."
        ),
        QuizQuestion(
            id = 2,
            type = QuestionType.ASSERTION_REASONING,
            topic = "Joint Stock Company",
            questionText = "Assertion (A): A company continues to exist even if all its members die in an accident.\nReason (R): A company possesses perpetual succession, being an artificial person created by law.",
            options = listOf(
                "Both (A) and (R) are true and (R) is the correct explanation of (A)",
                "Both (A) and (R) are true but (R) is not the correct explanation of (A)",
                "(A) is true but (R) is false",
                "(A) is false but (R) is true"
            ),
            correctOptionIndex = 0,
            cbseMarks = "1 Mark",
            explanationEnglish = "Perpetual succession means members may come and members may go, but the company goes on forever until dissolved by lawful winding-up.",
            explanationHinglish = "Company kanoon dwara banai gayi artificial person hai, isliye members ke aane-jaane ya marne se company par koi farak nahi padta."
        ),
        QuizQuestion(
            id = 3,
            type = QuestionType.MCQ,
            topic = "Cooperative Societies",
            questionText = "The principle of 'One Man, One Vote' in Cooperative Societies is an embodiment of:",
            options = listOf("Capital Supremacy", "Democratic Control", "State Patronage", "Unlimited Liability"),
            correctOptionIndex = 1,
            cbseMarks = "1 Mark",
            explanationEnglish = "Section 5 of Cooperative Societies Act guarantees democratic control where voting power is equal regardless of the capital contributed.",
            explanationHinglish = "Cooperative society me chahe kisi ne 1 share khareeda ho ya 100 shares, sabhi ko 1 hi vote milta hai. Isse 'Democratic Control' kehte hain."
        ),
        QuizQuestion(
            id = 4,
            type = QuestionType.CBSE_PYQ,
            topic = "Hindu Undivided Family",
            questionText = "What is the liability of the Karta and coparceners in an HUF business?",
            options = listOf(
                "Both Karta and coparceners have unlimited liability",
                "Karta has unlimited liability, while coparceners have limited liability",
                "Karta has limited liability, while coparceners have unlimited liability",
                "Both have limited liability to share capital"
            ),
            correctOptionIndex = 1,
            cbseMarks = "1 Mark",
            explanationEnglish = "Under Hindu Law, the Karta alone possesses unlimited liability, making his personal property attachable, while coparceners' liability is strictly limited to their share in ancestral property.",
            explanationHinglish = "Karta ki liability UNLIMITED hoti hai (uska personal ghar bik sakta hai), jabki baki coparceners ki liability sirf unke ancestral share tak LIMITED hoti hai."
        ),
        QuizQuestion(
            id = 5,
            type = QuestionType.CUET_OLYMPIAD,
            topic = "Company Formation",
            questionText = "Under SEBI regulations, what is the minimum subscription percentage and the statutory time window to achieve it?",
            options = listOf(
                "80% within 60 days",
                "90% within 30 days",
                "75% within 15 days",
                "100% within 45 days"
            ),
            correctOptionIndex = 1,
            cbseMarks = "1 Mark",
            explanationEnglish = "Section 39(1) of Companies Act and SEBI regulations mandate that at least 90% of issued capital must be subscribed within 30 days of issue opening, failing which 100% money must be refunded within 15 days.",
            explanationHinglish = "Rule 90-30-15: 90% subscription 30 din ke andar aana compulsory hai, warna agle 15 dino me pura paisa wapas lautaana padega."
        ),
        QuizQuestion(
            id = 6,
            type = QuestionType.ASSERTION_REASONING,
            topic = "Memorandum of Association",
            questionText = "Assertion (A): An ultra vires contract can be validated by a unanimous resolution passed by all shareholders of the company.\nReason (R): Any act beyond the Object Clause of the Memorandum of Association is void ab initio.",
            options = listOf(
                "Both (A) and (R) are true and (R) is the correct explanation of (A)",
                "Both (A) and (R) are true but (R) is not the correct explanation of (A)",
                "(A) is true but (R) is false",
                "(A) is false but (R) is true"
            ),
            correctOptionIndex = 3,
            cbseMarks = "1 Mark",
            explanationEnglish = "An act ultra vires the Memorandum is fundamentally null and void ab initio (Ashbury Railway Carriage v. Riche). It cannot be ratified or cured even by 100% unanimous shareholder vote.",
            explanationHinglish = "MOA ke bahar ka contract shuru se void ab initio hota hai, isliye 100% shareholders milkar bhi use kabhi valid nahi bana sakte. Assertion jhootha hai, Reason sach hai."
        )
    )
}
