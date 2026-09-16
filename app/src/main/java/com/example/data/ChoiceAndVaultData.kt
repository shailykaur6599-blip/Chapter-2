package com.example.data

import com.example.model.*

object ChoiceAndVaultData {
    val pages = listOf(
        // PAGE 63: Factors Influencing the Choice of Business Form
        StudyPage(
            pageNumber = 63,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Factors Influencing the Choice of Business Form",
            subtitle = "Strategic Trade-offs: Capital, Liability, Control & Continuity",
            topicDescriptionEnglish = "Selecting the ideal form of business organization requires a comprehensive evaluation of key strategic factors: cost and ease of formation, liability of owners, continuity, management expertise, capital requirements, degree of control, and nature of enterprise.",
            topicDescriptionHinglish = "Business shuru karte waqt sabse bada sawal: Kaun sa form chunein? Sole Prop, Partnership, HUF, Cooperative ya Company? Ye decision 7 factors par depend karta hai: Kitna kharcha hoga, liability kitni lena chahte ho, kya business hamesha chalna chahiye, control kisko chahiye, aur kitna capital lagana hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-L-C-M-C-C-N' -> (C)ost & ease, (L)iability, (C)ontinuity, (M)anagement skill, (C)apital need, (C)ontrol desired, (N)ature of trade.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Strategic Council on Mount Suvela",
                loreOrContext = "Perched upon Mount Suvela overlooking Lanka, Lord Rama, Sugriva, Vibhishana, and Lakshmana evaluated military strengths, seasonal winds, gate architectures, and logistical lines before selecting the precise tactical formation for each commander.",
                asciiFlowchart = """
             [🏔️ Strategic Summit on Mount Suvela]
                             │
       ┌─────────────────────┼─────────────────────┐
       ▼                     ▼                     ▼
[EAST GATE: Nila]     [SOUTH: Angada]       [WEST: Sugriva]
(Agile Forest Strike) (Heavy Siege Engines) (Vast Frontal Host)
       │
       ▼ (Every Commander Deployed Based on Precise Operational Fit)
[🌟 Perfect Alignment of Structural Form with Mission Objective]
                """.trimIndent(),
                lessonQuote = "The wise commander matches the vessel to the depth of the ocean."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Seven Evaluative Dimensions",
                    category = "Selection Factors",
                    englishText = "1. Cost & Ease: Sole Prop is easiest; Company is most expensive. 2. Liability: Sole Prop/Partnership has unlimited; Company/Coop has limited. 3. Continuity: Company/Coop/HUF is perpetual; Sole Prop/Partnership is fragile. 4. Management: Company attracts top CXOs; Sole Prop is limited. 5. Capital: Company can raise billions; Sole Prop is constrained. 6. Control: Sole Prop has 100% control; Company is dispersed. 7. Nature: Tailoring/bakeries prefer Sole Prop; automotives demand Company.",
                    hinglishText = "1. Kharcha & Aasani: Sole Prop sabse aasan; Company sabse mehengi. 2. Liability: Sole Prop/Partnership me unlimited risk; Company/Cooperative me safe limited liability. 3. Continuity: Company hamesha zinda rehti hai. 4. Management: Company top professionals hire kar sakti hai. 5. Capital: Company arabo raise kar sakti hai. 6. Control: Sole Prop me 100% akele ka raaj; Company me board aur shareholders me banta hai. 7. Nature: Choti dukan = Sole Prop; Car factory = Company.",
                    asciiFlowchart = """
[CRITERIA]        [CHEAPEST/EASIEST]         [INTERMEDIATE]         [HIGHEST SCALE/LIMITED RISK]
Formation Cost:   Sole Proprietorship  ──>   Partnership/HUF  ──>   Joint Stock Company
Personal Safety:  Joint Stock Company  ──>   Cooperative      ──>   Sole Prop (Unlimited Risk!)
Capital Capacity: Joint Stock Company  ──>   Partnership/HUF  ──>   Sole Proprietor (Smallest)
                    """.trimIndent(),
                    microMnemonic = "7-FACTOR-EVAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Deploying Hanuman vs. Deploying the Millions of Vanaras",
                        loreOrContext = "For silent ocean infiltration, Rama sent solitary Hanuman (agile sole vehicle); for open battlefield siege, he deployed millions under Sugriva (vast corporate host).",
                        asciiFlowchart = "[Solitary Stealth Task: Sole Champion Hanuman] vs [Total Continental Siege: Universal Allied Host]",
                        lessonQuote = "Prudence deploys the solitary scout for agility and the massive host for heavy siege."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Boutique Cloud Kitchen vs. EV Battery Gigafactory",
                        loreOrContext = "A home baker baking custom cakes chooses Sole Proprietorship for 100% control and zero compliance; an EV scooter maker incorporates a Public Ltd. company to raise ₹800 Crores.",
                        asciiFlowchart = "[Custom Cake Baker -> Sole Prop (Agile/Low Cost)] vs [EV Battery Gigafactory -> Public Ltd (Vast Capital/Limited Risk)]",
                        lessonQuote = "Match your legal structure to your capital appetite and downside exposure."
                    ),
                    caseQuestion = "Which form of business organisation is most suitable when an entrepreneur desires complete personal control and minimal legal formalities?",
                    caseAnswer = "Sole Proprietorship."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 63: The Chemical Laboratory Dilemma",
                    scenario = "Anil and Sunil wish to launch an agrochemical testing laboratory. The project requires ₹1.5 Crores capital. Both partners have modest savings and fear that if a chemical explosion occurs, toxic leaks could lead to crores of third-party damage claims against their private homes.",
                    question = "Which form of business should they choose between a General Partnership and a Company? Justify.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: They should incorporate a Private Limited Company (or Limited Liability Partnership) (1 Mark)",
                        "Analyze Risk & Liability: In a general partnership, partners have unlimited personal liability; their private homes would be seized to pay explosion damages (1 Mark)",
                        "Corporate Armor: In a company, liability is strictly limited to share capital, insulating personal homes from catastrophic third-party tort claims (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Evaluate the 7 core factors: cost, liability, continuity, management, capital, control, and nature of business.",
                "High-risk, capital-intensive ventures demand corporate limited liability."
            )
        ),

        // PAGE 64: Master Decision Tree & Form Selection Matrix
        StudyPage(
            pageNumber = 64,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Master Decision Tree: Selecting the Optimal Business Form",
            subtitle = "Algorithmic Jurisprudence for the 21st-Century Commerce Student",
            topicDescriptionEnglish = "An exhaustive algorithmic decision tree directing entrepreneurs through a logical sequence of questions to deduce their ideal business form with statutory certainty.",
            topicDescriptionHinglish = "Decision Tree: Ek ayesa flowchart jo ek glance me bata deta hai ki aapke case study ka perfect answer kya hoga! Capital kitna hai? Risk kitna hai? Owners kitne hain? Ye flowchart har exam case study ko 10 second me solve karega!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-R-O-S-S' -> (C)apital size, (R)isk appetite, (O)wnership count, (S)hared purpose, (S)cale of ambition.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Strategic Bridge Crossing Order of the Imperial Legions",
                loreOrContext = "Commander Nila established strict procedural crossing gates on the Ram Setu: advance scout vanguards first, heavy infantry ranks in the center, and sovereign command protecting the rear.",
                asciiFlowchart = """
[🌊 Shore of the Great Crossing (Decision Threshold)]
                         │
        Is capital requirement massive & public?
            ├── YES ──> [🏛️ JOINT STOCK COMPANY (Public Ltd / IPO)]
            └── NO
                 │
        Is mutual community welfare & middleman elimination the goal?
            ├── YES ──> [🤝 COOPERATIVE SOCIETY (Amul / PACS)]
            └── NO
                 │
        Is ancestral property inherited across 3 generations of family?
            ├── YES ──> [👑 HINDU UNDIVIDED FAMILY (HUF / Karta)]
            └── NO
                 │
        Are there 2 or more partners pooling non-corporate skills?
            ├── YES ──> [👥 PARTNERSHIP / LLP]
            └── NO  ──> [👤 SOLE PROPRIETORSHIP / OPC]
                """.trimIndent(),
                lessonQuote = "A clear decision hierarchy dissolves ambiguity into flawless execution."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Decision Tree Logic for Case Studies",
                    category = "Case Algorithm",
                    englishText = "Step 1: Check ownership count (1 vs 2+ vs 10+). Step 2: Check liability priority (Can personal assets be risked?). Step 3: Check capital magnitude (Thousands vs Crores). Step 4: Check objective (Private profit vs Democratic service).",
                    hinglishText = "Exam me case aate hi 4 sawal poocho: 1. Kitne log hain? (Akela hai to Sole Prop ya OPC). 2. Kya personal ghar bachana hai? (Haan to Company ya Cooperative). 3. Kitna paisa chahiye? (Bohot zyada to Public Company). 4. Kya maksad seva hai? (Haan to Cooperative).",
                    asciiFlowchart = """
[Case Scenario] ──> [Query 1: Members?] ──> [Query 2: Liability?] ──> [Query 3: Capital?] ──> [🎯 Instant Accurate Form Identified!]
                    """.trimIndent(),
                    microMnemonic = "DECISION-TREE-KEY",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Lord Rama's Infallible Discernment of Sincerity",
                        loreOrContext = "When Vibhishana stood before the camp, Rama systematically evaluated his intent through strategic logic: an exile without malice, possessing inside tactical truth, seeking dharmic sanctuary.",
                        asciiFlowchart = "[Evaluate Lineage & Intent] ──> [Weigh Strategic Risks] ──> [Universal Sanctuary Conferred]",
                        lessonQuote = "Dispassionate discernment uncovers the true strategic path."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Startup Incubator Legal Entity Selection Bot",
                        loreOrContext = "An AI legal tool asks founders 5 questions regarding foreign investor plans, co-founder equity splits, and expected revenue, recommending either a Pvt. Ltd. or LLP in 60 seconds.",
                        asciiFlowchart = "[5 Founder Questions Answered] ──> [Algorithm Analyzes VC Appetite] ──> [Recommends Pvt Ltd with 85% Fit]",
                        lessonQuote = "Algorithmic decision trees remove guesswork from statutory planning."
                    ),
                    caseQuestion = "Which business form is universally recommended when a venture requires massive equity capital and limited liability for thousands of public investors?",
                    caseAnswer = "Public Limited Company."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 64: The Three Friends' Dilemma",
                    scenario = "Three chartered accountants wish to set up an advisory firm. They want to avoid heavy company incorporation filings and high compliance costs, yet each accountant insists that he should NOT be held personally liable for professional negligence or fraud committed by the other two partners.",
                    question = "Which modern organizational form best satisfies their exact requirements? Justify.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: Limited Liability Partnership (LLP) under the LLP Act, 2008 (1 Mark)",
                        "Flexibility Justification: Offers the internal contractual flexibility of a partnership with low compliance costs compared to a company (1 Mark)",
                        "Shield Justification: In an LLP, no partner is liable for the independent wrongful acts or negligence of other partners (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Use the four-step algorithmic filter: members, capital, liability, and objective.",
                "LLP bridges traditional partnership flexibility with corporate limited liability."
            )
        ),

        // PAGE 65: Master Mnemonic Sheet & Comprehensive Mnemonics Archive
        StudyPage(
            pageNumber = 65,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Master Mnemonic Vault: High-Scoring Memory Codes",
            subtitle = "Exhaustive Repository of Every Macro & Micro Mnemonic Across All 5 Forms",
            topicDescriptionEnglish = "A consolidated revision archive compiling all macro and micro mnemonics developed across Sole Proprietorship, Partnership, HUF, Cooperative Societies, Joint Stock Companies, and Company Formation for instant recall.",
            topicDescriptionHinglish = "Abhinav Sir ka Master Mnemonic Vault! Pure chapter ke saare short tricks, acronyms aur memory hooks ka ek single page revision capsule. Exam hall me ghusne se 10 minute pehle bas ye sheet dekh lo aur saare points dimaag me chhap jayenge!",
            macroMemoryTrick = "MACRO MNEMONIC: 'ALL-MNEMONICS-MASTER-KEY' -> One sheet to unlock all 70 pages of Business Studies.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Infallible Brahmastra Arrow Resting in the Sovereign Quiver",
                loreOrContext = "Forged by Brahma, charged with sacred Vedic mantras, the Brahmastra rested silently in Lord Rama's quiver—the ultimate, concentrated weapon of last resort, ready to dissolve all opposing illusions with a single invocation.",
                asciiFlowchart = """
[🏹 Lord Rama's Divine Infallible Quiver]
       │
       ▼ (Concentration of All Vedic Potencies & Celestial Mantras)
[✨ The Brahmastra (Master Sovereign Vault of All Knowledge & Power)]
       │ (Invoked to Dissolve All Unrighteousness & Cosmic Doubt)
       ▼
[🌟 Absolute Decisive Triumph of Truth Across All Worlds!]
                """.trimIndent(),
                lessonQuote = "Mastery is the concentration of vast knowledge into a single unshakeable truth."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Consolidated Mnemonic Compendium",
                    category = "Master Cheat Sheet",
                    englishText = "1. Sole Prop Features: F-U-L-S-C-N (Formation easy, Unlimited risk, Little size, Sole control, Continuity nil, No separate entity). 2. Partnership Features: M-A-B-U-C (Mutual agency, Agreement, Business legal, Unlimited risk, Continuity fragile). 3. HUF: H-U-F-L-A-W. 4. Coop Merits: E-L-S-E-G. 5. Company Merits: L-T-P-S-P. 6. MOA Clauses: N-O-L-C-A-R.",
                    hinglishText = "Saare mnemonics ek nazar me: Sole Prop (FULSCN), Partnership (MABUC), HUF (HUFLAW), Cooperative (ELSEG), Company (LTPSP), MOA (NOLCAR), 90% Rule (90-30-15), SPICe+ (SPICE).",
                    asciiFlowchart = """
[SOLE PROP: F-U-L-S-C-N]  ──> Formation easy, Unlimited risk, Little size, Sole control, Continuity nil, No entity
[PARTNER:   M-A-B-U-C]    ──> Mutual agency, Agreement, Business legal, Unlimited risk, Continuity fragile
[HUF:       H-U-F-L-A-W]  ──> Hereditary, Undivided, Family estate, Limited coparceners, Authority Karta, Without contract
[COOP:      E-L-S-E-G]    ──> Equality in voting, Limited risk, Stable life, Economy in ops, Govt support
[COMPANY:   L-T-P-S-P]    ──> Limited liability, Transferable shares, Perpetual life, Scope expansion, Professional mgmt
[MOA:       N-O-L-C-A-R]  ──> Name, Object, Liability, Capital, Association, Registered office
                    """.trimIndent(),
                    microMnemonic = "MASTER-CHEAT-VAULT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Chanting of the Aditya Hridaya Stotram",
                        loreOrContext = "Before the final duel with Ravana, Sage Agastya taught Lord Rama the concise Aditya Hridaya hymn, concentrating all solar cosmic vigor into a 30-verse chant of instant victory.",
                        asciiFlowchart = "[Agastya Imparts Concise Hymn] ──> [Solar Vigor Awakened] ──> [Instant Victorious Focus]",
                        lessonQuote = "Concise wisdom unlocks infinite power at the decisive hour."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Anki Flashcard Deck for Class 11 Business Studies",
                        loreOrContext = "Students revised 70 Anki flashcards containing these mnemonics on their metro commute, scoring 98% in their school pre-board examination.",
                        asciiFlowchart = "[70 Mnemonics Flashcards] ──> [10-Min Metro Spaced Repetition] ──> [🏆 98% Board Score]",
                        lessonQuote = "Compress syllabus into high-retention memory algorithms."
                    ),
                    caseQuestion = "State the mnemonic for remembering the six mandatory clauses of the Memorandum of Association.",
                    caseAnswer = "'N-O-L-C-A-R' (Name, Object, Liability, Capital, Association, Registered Office)."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 65: The 5-Minute Exam Hall Recall",
                    scenario = "In the CBSE board exam, a student had 5 minutes remaining to write the six merits of a joint-stock company. Using the mnemonic 'L-T-P-S-P', she drafted all six points with complete headings and academic explanations.",
                    question = "List the six points recalled using the 'L-T-P-S-P' mnemonic.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "L - Limited Liability (0.5 Mark)",
                        "T - Transfer of Interest / Freely Transferable Shares (0.5 Mark)",
                        "P - Perpetual Succession / Continuous Existence (0.5 Mark)",
                        "S - Scope for Expansion / Vast Capital Resources (0.5 Mark)",
                        "P - Professional Management (0.5 Mark)",
                        "Accuracy: High-scoring presentation with precise CBSE terminology (0.5 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Memorize the master mnemonics for instant recall under high-pressure exam conditions.",
                "Each letter maps to an official CBSE marking scheme heading."
            )
        ),

        // PAGE 66: Exam Point Revision Corner: Top 10 Traps & Pitfalls
        StudyPage(
            pageNumber = 66,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Exam Point Revision Corner: Top 10 Traps & Pitfalls",
            subtitle = "Where Students Lose Marks & How Abhinav Sir Secures 100/100",
            topicDescriptionEnglish = "A targeted diagnostic review of the top 10 high-frequency traps, subtle statutory distinctions, and terminology blunders that cause students to lose marks in CBSE Class 11 Business Studies examinations.",
            topicDescriptionHinglish = "Exam Hall ke 10 Sabse Khatarnak Traps! Jahan 90% bacche silly mistakes karke marks gawa dete hain. Abhinav Sir ka 'Anti-Trap Armor' padho aur har tricky question ko crack karo!",
            macroMemoryTrick = "MACRO MNEMONIC: 'T-O-P-1-0-T-R-A-P-S' -> Ten classic pitfalls neutralized.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Lakshmana Disarming the Illusory Sorcery of Indrajit at Nikumbhila",
                loreOrContext = "Indrajit conjured blinding phantoms, illusory clouds, and fake apparitions of Sita. Guided by sage Vibhishana, Lakshmana saw through every optical illusion and struck the demon before the sorcery sacrifice completed.",
                asciiFlowchart = """
[🌫️ Blinding Phantoms & Illusory Traps of Indrajit]
       │
       ▼ (Vibhishana Reveals the Underlying Statutory Truth & Reality)
[🏹 Lakshmana Ignores the Illusions & Targets the Hidden Sacred Sanctuary]
       │ (Surgical Piercing of Deception With Divine Mantras)
       ▼
[✨ The Great Sorcerer Vanquished & Righteous Path Cleared!]
                """.trimIndent(),
                lessonQuote = "True vision discerns statutory reality beneath the seductive veil of illusion."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Top 5 High-Frequency Exam Traps",
                    category = "Exam Traps",
                    englishText = "Trap 1: Minor in Partnership vs HUF (Admitted only to benefits with consent vs Member by birth). Trap 2: Karta's liability is UNLIMITED; coparceners are LIMITED. Trap 3: Common Seal is OPTIONAL since 2015 Amendment, not mandatory. Trap 4: Ultra vires MOA CANNOT be ratified; ultra vires AOA CAN be ratified. Trap 5: Minimum subscription is 90% within 30 days; refund in 15 days.",
                    hinglishText = "Trap 1: Minor partnership me sabki permission se sirf munafey me aata hai, jabki HUF me janam se coparcener banta hai! Trap 2: Karta ki liability UNLIMITED hoti hai, coparcener ki LIMITED. Trap 3: Common seal ab OPTIONAL hai! Trap 4: MOA ke bahar ka kaam kabhi ratify nahi ho sakta, AOA ke bahar ka kaam shareholders ratify kar sakte hain. Trap 5: 90% capital 30 din me chahiye, warna 15 din me refund!",
                    asciiFlowchart = """
[TRAP 1: Minor Status]       ──> Partnership: Benefits Only | HUF: Coparcener by Birth!
[TRAP 2: HUF Liability]      ──> Karta: UNLIMITED | Coparcener: LIMITED to Share!
[TRAP 3: Common Seal]        ──> Companies Amendment Act 2015: OPTIONAL, not mandatory!
[TRAP 4: Ultra Vires]        ──> MOA: Void ab initio (Unratifiable) | AOA: Ratifiable by Shareholders!
[TRAP 5: Min Subscription]   ──> 90% within 30 days; 100% refund in 15 days!
                    """.trimIndent(),
                    microMnemonic = "TOP-5-TRAPS",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Hanuman Escaping the Jaws of Surasa Through Wit",
                        loreOrContext = "When demoness Surasa expanded her maw to 100 yojanas, Hanuman expanded to 200, then suddenly shrunk to the size of a thumb, entered her mouth, and exited unharmed, fulfilling her boon while escaping the trap.",
                        asciiFlowchart = "[Expanded Maw] ──> [Rapid Compression to Thumb Size] ──> [Enters & Exits Unscathed]",
                        lessonQuote = "Wit and nimble intelligence conquer traps that brute force cannot overcome."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Avoiding Trick Questions on CUET and Board Multiple Choice",
                        loreOrContext = "A CUET question asked: 'Is Common Seal mandatory for a company in 2024?' 80% answered YES; our student answered NO (optional since 2015) and secured a 100 percentile.",
                        asciiFlowchart = "[Trick Question: Common Seal Mandatory?] ──> [Identifies 2015 Amendment] ──> [Answers OPTIONAL ──> 100 Percentile!]",
                        lessonQuote = "Updated statutory knowledge is your ultimate competitive moat."
                    ),
                    caseQuestion = "Can the shareholders of a company ratify an act that is ultra vires the Memorandum of Association by passing a 100% unanimous resolution?",
                    caseAnswer = "No. An act ultra vires the Memorandum is null and void ab initio and cannot be ratified under any circumstances."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 66: The Examiner's Triple Trap Question",
                    scenario = "Identify the errors in the following three student statements: (1) 'In a partnership, a minor is a full-fledged partner bearing losses.' (2) 'Every company must compulsorily affix its common seal to all contracts.' (3) 'Karta and coparceners both have unlimited liability in an HUF.'",
                    question = "Correct all three statements with statutory precision.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Correction 1: A minor can only be admitted to the benefits of partnership with unanimous consent of all partners; he does not share losses (1 Mark)",
                        "Correction 2: Under the Companies (Amendment) Act, 2015, the Common Seal is optional; documents can be signed by two directors or one director and CS (1 Mark)",
                        "Correction 3: Only the Karta has unlimited liability; coparceners have liability strictly limited to their share in ancestral property (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Never confuse the admission of a minor in partnership with birthright in HUF.",
                "Remember that since 2015, the Common Seal is strictly optional."
            )
        ),

        // PAGE 67: Comprehensive Question Bank - Part A: Assertion-Reason & MCQs
        StudyPage(
            pageNumber = 67,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Question Bank Part A: Assertion-Reason & MCQs",
            subtitle = "CUET, Olympiad & CBSE Board Exam High-Yield Objective Vault",
            topicDescriptionEnglish = "A rigorous collection of high-yield Multiple Choice Questions and Assertion-Reasoning problems designed strictly according to the latest CBSE curriculum and CUET standards.",
            topicDescriptionHinglish = "Board Exam aur CUET ke top Assertion-Reason aur Multiple Choice Questions ka treasure vault. Har question ke sath detailed explanation di gayi hai taaki concept 100% crystal clear ho jaye!",
            macroMemoryTrick = "MACRO MNEMONIC: 'A-R-M-C-Q' -> Assertion, Reason, Mastery, Concept, Quick score.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Lord Rama's Piercing Arrows Hitting Targets Across Blind Obscurity",
                loreOrContext = "Lord Rama mastered the celestial science of archery (Shabdavedhi and Divyastras), capable of striking true targets through mist, darkness, and deceptive illusions with laser precision.",
                asciiFlowchart = """
[🏹 The Divine Bow Kodanda Drawn to the Ear]
       │
       ▼ (Laser Focus Cutting Through Dense Illusory Mist)
[✨ Celestial Arrow Strikes the Heart of Deception with Surgical Precision]
       │ (100% Accuracy in Distinguishing Truth from Falsehood)
       ▼
[🎯 Perfect Bullseye Achieved Across All Obstacles!]
                """.trimIndent(),
                lessonQuote = "Clarity of vision strikes truth unerringly amidst confusion."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "High-Yield Assertion-Reasoning Drill",
                    category = "Objective Vault",
                    englishText = "Q1: Assertion (A): A company is an artificial person. Reason (R): It is created by law and has an independent legal personality separate from its members. Ans: Both (A) and (R) are true and (R) is the correct explanation of (A). Q2: Assertion (A): A minor can become Karta of an HUF. Reason (R): HUF membership is by birth. Ans: (A) is false but (R) is true (only the eldest adult coparcener can be Karta).",
                    hinglishText = "Assertion-Reason tricks: Assertion aur Reason dono padho, fir beech me 'BECAUSE' lagakar check karo. Q1: Company artificial person hai KYUNKI kanoon use banata hai (Dono true, correct explanation). Q2: Minor Karta nahi ban sakta, isliye Assertion false hai par Reason true!",
                    asciiFlowchart = """
[Read Assertion (A)] ──> [Insert 'BECAUSE'] ──> [Read Reason (R)] ──> [Evaluate Logical Link ──>] [Option (a), (b), (c), or (d)]
                    """.trimIndent(),
                    microMnemonic = "ASSERTION-BECAUSE-REASON",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Sage Vashistha's Socratic Questioning of the Young Princes",
                        loreOrContext = "Sage Vashistha tested the four princes with complex ethical paradoxes, training their intellects to dissect assertions and justifications with dharmic rigor.",
                        asciiFlowchart = "[Ethical Paradox Posed] ──> [Dissect Assertion & Cause] ──> [Dharmic Truth Declared]",
                        lessonQuote = "Rigorous inquiry polishes intellect until it reflects divine wisdom."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Scoring 100% in CUET Business Studies Assertion-Reason Section",
                        loreOrContext = "By applying the 'Because Test' systematically across 50 questions, modern commerce aspirants eliminate ambiguous distractors and secure top North Campus DU seats.",
                        asciiFlowchart = "[Apply 'Because Test'] ──> [Eliminate Flawed Logic] ──> [🎯 Perfect 200/200 CUET Score]",
                        lessonQuote = "Methodical logical rules always defeat confusing multiple-choice distractors."
                    ),
                    caseQuestion = "State whether an unformed company can be sued on a pre-incorporation contract.",
                    caseAnswer = "No, because a non-existent company has no legal personality and cannot enter into or be bound by contracts prior to incorporation."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 67: Assertion-Reason Master Question",
                    scenario = "Assertion (A): The liability of a shareholder in a company limited by shares is limited to the unpaid amount on shares held. Reason (R): A company is a separate legal entity distinct from its members.",
                    question = "Choose the correct option: (a) Both A and R are true and R is the correct explanation of A. (b) Both A and R are true but R is not the correct explanation of A. (c) A is true but R is false. (d) A is false but R is true.",
                    marks = 2,
                    stepByStepMarkingScheme = listOf(
                        "Correct Option: (a) Both A and R are true and R is the correct explanation of A (1 Mark)",
                        "Explanation: Because the company is a separate legal person distinct from its members (Salomon doctrine), corporate debts are its own; shareholders cannot be held personally liable beyond their subscribed capital (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Use the 'Because Test' to evaluate Assertion-Reason relationships.",
                "Verify whether the assertion or reason contains factual statutory errors first."
            )
        ),

        // PAGE 68: Comprehensive Question Bank - Part B: 3 & 4-Mark Case Problems
        StudyPage(
            pageNumber = 68,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Question Bank Part B: 3 & 4-Mark Application Cases",
            subtitle = "CBSE Board Exam Step-by-Step Marking Scheme Solutions",
            topicDescriptionEnglish = "A collection of 3-mark and 4-mark case problems based on real-world business scenarios, accompanied by explicit CBSE step-by-step marking schemes and model answers.",
            topicDescriptionHinglish = "CBSE Board Exam ke 3-mark aur 4-mark ke real-life case study questions! Step-by-step marking scheme ke sath bataya gaya hai ki examiner full marks kaise deta hai aur kis point par kitne marks milte hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'I-Q-E' -> (I)dentify concept, (Q)uote from case, (E)xplain with statute.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Trial of Dharma: King Dasharatha's Dilemma",
                loreOrContext = "Faced with Kaikeyi's boons vs. his love for Rama, Emperor Dasharatha weighed sacred sovereign pledges against domestic heartbreak, dissecting duty point by point with the highest moral precision.",
                asciiFlowchart = """
[⚖️ Sacred Sovereign Boons Pledged to Kaikeyi]
                       │
                       ▼ (Weighed Against Imperial Love for Lord Rama)
[💔 Supreme Personal Agony vs. Unbending Sacred Truth of the Lineage]
                       │ (Step-by-Step Evaluation of Sovereign Duty)
                       ▼
[👑 Dharma Upholds Truth Above Mortal Desire at All Costs]
                """.trimIndent(),
                lessonQuote = "The highest righteousness evaluates duty step-by-step without wavering from truth."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The 3-Step Formula for 4-Mark Case Studies",
                    category = "Case Answering Formula",
                    englishText = "Step 1: Identify the exact business form/concept (1 Mark). Step 2: Quote the relevant lines from the scenario (1 Mark). Step 3: Explain the statutory characteristics or merits with reference to the Companies Act / Partnership Act / Hindu Law (2 Marks).",
                    hinglishText = "Case study answer likhne ka 3-step magic formula: Step 1: Pehle heading dalkar concept identify karo (1 Mark). Step 2: Question se wo line quote karo jisse pata chala (1 Mark). Step 3: Us concept ke 2 features ya rules explain karo (2 Marks). Full 4/4 marks pakke!",
                    asciiFlowchart = """
[Step 1: Identify Concept / Form] ──> [Step 2: Quote Evidence Lines from Case] ──> [Step 3: Statutory Explanation & Features] ──> [🏆 4/4 Full Marks!]
                    """.trimIndent(),
                    microMnemonic = "IDENTIFY-QUOTE-EXPLAIN",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Hanuman Presenting Sita's Choodamani to Lord Rama",
                        loreOrContext = "Hanuman did not just declare Sita was alive; he presented her jeweled hairpin (choodamani) as physical evidence and narrated her exact spoken words.",
                        asciiFlowchart = "[Declares Safety of Sita] ──> [Produces Choodamani Evidence] ──> [Quotes Sita's Exact Words]",
                        lessonQuote = "Authentic reports substantiate truth with tangible evidence and exact words."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Business Studies Board Exam Answer Sheet Presentation",
                        loreOrContext = "Anika secured 100/100 in Class 12 Boards by using black pen for headings, quoting scenario lines in quotation marks, and underlining key statutory phrases.",
                        asciiFlowchart = "[Bold Headings] + [Quoted Scenario Lines] + [Underlined Statutory Terms] ──> [💯 100/100 Board Score]",
                        lessonQuote = "Disciplined exam presentation turns good knowledge into perfect scores."
                    ),
                    caseQuestion = "State the three structural components of a model answer to a CBSE business studies case study question.",
                    caseAnswer = "(1) Identification of the concept; (2) Quoting supporting lines from the passage; (3) Detailed statutory explanation of points."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 68: The Multi-Generation Brass Foundry Crisis",
                    scenario = "Shyam, Radhey, and Mohan are brothers who inherited a 60-year-old brass utensils workshop in Moradabad from their grandfather. Shyam's 18-year-old son, Aryan, was born into the family and automatically became a co-owner. Shyam, being the eldest, manages all bank accounts and customer contracts. Following a ₹40 Lakh debt default, creditors threatened to seize Radhey's personal car.",
                    question = "(a) Identify the form of business organization. (b) Is the creditors' threat to seize Radhey's personal car legally valid? Justify.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "(a) Identification: Joint Hindu Family Business (HUF) (1 Mark)",
                        "(a) Quoting: 'inherited 60-year-old workshop', 'Aryan born automatically became co-owner', 'Shyam being eldest manages all' (1 Mark)",
                        "(b) Creditor Threat Validity: No, the creditors' threat is NOT legally valid (1 Mark)",
                        "(b) Justification: Radhey is a coparcener; under Hindu Law, a coparcener's liability is strictly limited to his share in ancestral property; his personal private assets (car) cannot be attached (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Always structure 4-mark case study answers into Identify, Quote, and Explain.",
                "Underline statutory keywords like 'limited liability' and 'ancestral property'."
            )
        ),

        // PAGE 69: Comprehensive Question Bank - Part C: 6-Mark Evaluative Questions
        StudyPage(
            pageNumber = 69,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "Question Bank Part C: 6-Mark Evaluative Questions",
            subtitle = "Master Essay Answers, Distinction Tables & Comprehensive Evaluations",
            topicDescriptionEnglish = "High-weightage 6-mark evaluative questions requiring in-depth conceptual mastery: comprehensive distinctions between organizational forms, stages of company formation, and constitutional documents.",
            topicDescriptionHinglish = "CBSE Board Exam ke sabse bade 6-mark ke long questions! Inme pure 6 points likhne hote hain proper headings aur explanations ke sath. Yahan complete model answers diye gaye hain jo examiner ko impress kar denge!",
            macroMemoryTrick = "MACRO MNEMONIC: 'S-I-X-P-A-C-K' -> Six distinct points, impeccable presentation, complete statutory citations.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Construction of the 100-Yojana Ram Setu: Monumental Grandeur",
                loreOrContext = "Spanning the vast ocean was not a minor skirmish; it was a monumental engineering feat requiring 5 continuous days, systematic stone placement, tree anchoring, and universal divine harmony.",
                asciiFlowchart = """
[🌊 Colossal 100-Yojana Cosmic Ocean]
       │
       ▼ (Monumental Strategic Architecture: 5 Days of Coordinated Engineering)
[Day 1: 14 Yojanas] ──> [Day 2: 20 Yojanas] ──> [Day 3: 21 Yojanas] ──> [Day 4: 22] ──> [Day 5: 23]
       │
       ▼ (Immense, Unshakeable Structure Built to Bear Millions of Marching Warriors)
[🌉 The Invincible Ram Setu: Complete, Flawless & Immortal Architecture!]
                """.trimIndent(),
                lessonQuote = "Monumental goals demand sustained, structured, and comprehensive execution."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Six-Point Blueprint for 6-Mark Questions",
                    category = "Long Answer Strategy",
                    englishText = "Always write: 1. A crisp introductory definition (0.5 Mark); 2. Exactly six numbered sub-headings with detailed explanations (5 Marks); 3. A concluding evaluative synthesis (0.5 Mark). Always draw a small ASCII/box diagram.",
                    hinglishText = "6-mark ke question me kabhi lamba paragraph mat likho! Pehle 2 line ka introduction, fir 6 numbered points (har point ki bold heading + 3-4 lines explanation), ek chota flowchart box diagram, aur aakhir me 2 line ka conclusion. Examiner poore 6/6 marks dega!",
                    asciiFlowchart = """
[Crisp Definition (0.5M)] ──> [Point 1 to Point 6 with Bold Headings (5.0M)] ──> [Flowchart Diagram] ──> [Conclusion (0.5M)] ──> [💯 6/6 Full Marks!]
                    """.trimIndent(),
                    microMnemonic = "6-POINT-BLUEPRINT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Six Royal Virtues Enumerated by Sage Narada",
                        loreOrContext = "When Valmiki asked who possesses all noble qualities in the mortal world, Sage Narada systematically enumerated the sixteen divine attributes of Lord Rama point by point.",
                        asciiFlowchart = "[Inquiry Posed] ──> [Systematic Enumeration of Attributes] ──> [Complete Portrait of the Ideal Sovereign]",
                        lessonQuote = "Systematic, structured description paints the clearest portrait of perfection."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Board Exam Answer Sheet Going for Model Answer Circulation",
                        loreOrContext = "CBSE board evaluators select answer sheets with structured 6-point layouts, clear headings, and margins to circulate as national model benchmark papers.",
                        asciiFlowchart = "[Structured 6 Headings] ──> [Clean Visual Diagrams] ──> [Selected as CBSE National Model Answer]",
                        lessonQuote = "Structure and clarity elevate good content into national benchmark excellence."
                    ),
                    caseQuestion = "How many distinct points with headings must be explained in a 6-mark question in CBSE Business Studies?",
                    caseAnswer = "Exactly six distinct points with clear sub-headings and detailed explanations."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 69: The 6-Mark Master Distinction",
                    scenario = "Distinguish between a Partnership firm and a Joint Stock Company on the basis of: (1) Governing Act, (2) Minimum & Maximum Members, (3) Liability of Members, (4) Transfer of Interest, (5) Continuity, and (6) Mutual Agency.",
                    question = "Draft a comprehensive comparative matrix covering all six statutory parameters.",
                    marks = 6,
                    stepByStepMarkingScheme = listOf(
                        "1. Governing Act: Indian Partnership Act, 1932 vs Companies Act, 2013 (1 Mark)",
                        "2. Membership: Min 2, Max 50 vs Private: Min 2, Max 200 / Public: Min 7, Max Unlimited (1 Mark)",
                        "3. Liability: Unlimited, joint and several vs Limited to unpaid share capital (1 Mark)",
                        "4. Transfer of Interest: Restricted, requires unanimous partner consent vs Freely transferable on stock exchanges for public co. (1 Mark)",
                        "5. Continuity: Fragile, dissolved by partner death/insolvency vs Perpetual succession, continuous existence (1 Mark)",
                        "6. Mutual Agency: Inherent mutual agency (every partner is principal and agent) vs No mutual agency among shareholders (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "6-mark answers must feature exactly 6 structured points with distinct sub-headings.",
                "Always contrast points across identical comparative parameters."
            )
        ),

        // PAGE 70: The Gamified Assessment Vault & Interactive Puzzles
        StudyPage(
            pageNumber = 70,
            module = ModuleCategory.CHOICE_AND_VAULT,
            title = "The Gamified Assessment Vault: Interactive Puzzles",
            subtitle = "Crosswords, Matchmakers, Legal Blunder Hunters & Rapid-Fire Trivia",
            topicDescriptionEnglish = "An exhilarating gamified finale featuring four interactive intellectual challenges: The Corporate Crossword Cipher, Entrepreneur Matchmaker, Spot the Legal Blunder, and the Rapid-Fire Board Exam Trivia Challenge.",
            topicDescriptionHinglish = "Class 11 Business Studies ka Gamified Assessment Vault! 4 zabardast games: (1) Corporate Crossword—clues padhkar words decode karo; (2) Entrepreneur Matchmaker—entrepreneurs ko unke perfect business form se jodo; (3) Spot the Legal Blunder—deed aur notices me chhupe illegal mistakes dhoondo; (4) Rapid-Fire Trivia Challenge!",
            macroMemoryTrick = "MACRO MNEMONIC: 'P-U-Z-Z-L-E' -> (P)uzzle mastery, (U)ltimate recall, (Z)ero doubts, (Z)eal for commerce, (L)egal hunter, (E)xcellence achieved.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Celestial Shower of Flowers upon the Golden Coronation of Lord Rama",
                loreOrContext = "With Ravana vanquished, the ocean bridged, and truth triumphant, devas showered fragrant parijata flowers from the heavens, celebrating the eternal reign of righteousness across all three worlds.",
                asciiFlowchart = """
[🌸 Celestial Shower of Heavenly Flowers from the Heavens]
       │
       ▼ (Universal Celebration of Dharma, Truth & Righteous Effort)
[👑 The Golden Coronation of Lord Rama & Mata Sita in Ayodhya]
       │ (Peace, Prosperity, Righteous Law & Universal Joy Established)
       ▼
[🌟 THE GOLDEN AGE OF RAMRAJYA COMMENCES ACROSS ALL CREATION!]
                """.trimIndent(),
                lessonQuote = "When duty is discharged with unwavering virtue, the heavens themselves shower blessings of glory."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Game 1: Decode the Corporate Crossword",
                    category = "Gamified Puzzle",
                    englishText = "Clue 1 (Across): The supreme head of an HUF with unlimited liability (5 letters). Answer: KARTA. Clue 2 (Down): The doctrine establishing a company is separate from members (7 letters). Answer: SALOMON. Clue 3 (Across): Minimum percentage required for subscription (90). Answer: NINETY. Clue 4 (Down): Document defining internal bye-laws (3 letters). Answer: AOA.",
                    hinglishText = "Crossword clues: 1 (Across): HUF ka supreme boss (5 letters) = KARTA. 2 (Down): Famous case jisne company ko alag insaan banaya (7 letters) = SALOMON. 3 (Across): Minimum subscription kitne percent (6 letters) = NINETY. 4 (Down): Internal house rules document (3 letters) = AOA.",
                    asciiFlowchart = """
[CLUES] ──> [1. Across: K-A-R-T-A] + [2. Down: S-A-L-O-M-O-N] + [3. Across: N-I-N-E-T-Y] + [4. Down: A-O-A] ──> [🏆 CIPHER UNLOCKED!]
                    """.trimIndent(),
                    microMnemonic = "CROSSWORD-MASTER",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Riddles of the Yaksha Answered by Yudhishthira",
                        loreOrContext = "When questioned at the enchanted lake, Prince Yudhishthira decoded every metaphysical riddle with flawless dharmic precision, restoring his fallen brothers to life.",
                        asciiFlowchart = "[Metaphysical Riddles Posed] ──> [Flawless Dharmic Solutions] ──> [Fallen Brothers Revived]",
                        lessonQuote = "Clarity of mind turns baffling riddles into gateways of triumph."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Commerce Hackathon Crossword Sprint",
                        loreOrContext = "Delhi University commerce fest featured a live digital crossword where students competed in speed-typing company law terms, winning prizes in under 90 seconds.",
                        asciiFlowchart = "[Live Screen Crossword] ──> [Speed-Typing Statutory Terms] ──> [🥇 ₹25,000 Hackathon Prize]",
                        lessonQuote = "Gamified active recall cements lifelong retention."
                    ),
                    caseQuestion = "Solve the crossword clue: 'The minimum number of adult members required to form a cooperative society' (3 letters).",
                    caseAnswer = "TEN."
                ),
                SubPointItem(
                    pointTitle = "Game 2: Spot the Legal Blunder",
                    category = "Gamified Puzzle",
                    englishText = "Blunder 1: 'A private limited company issued a prospectus on TV inviting the public to buy shares.' (BLUNDER! Section 2(68) prohibits public invitation). Blunder 2: 'Shareholders ratified an ultra vires MOA transaction by unanimous vote.' (BLUNDER! Ultra vires MOA is void ab initio). Blunder 3: 'A cooperative gave 10 votes to a rich member.' (BLUNDER! Rule is 'One man, one vote').",
                    hinglishText = "Legal Galtiyan pakdo: Galti 1: Private company ne TV par ad dekar public se shares maange (ILLEGAL! Section 2(68) me strict ban hai). Galti 2: MOA ke bahar ka contract shareholders ne vote dekar pass kar diya (ILLEGAL! Ultra vires MOA 100% void hota hai, ratify nahi ho sakta). Galti 3: Cooperative me ameer aadmi ko 10 vote diye (ILLEGAL! Niyam hai 'One man, one vote').",
                    asciiFlowchart = """
[Detect Statutory Violation] ──> [Identify Breached Legal Section] ──> [Formulate Lawful Correction] ──> [🛡️ Legal Blunder Neutralized!]
                    """.trimIndent(),
                    microMnemonic = "BLUNDER-HUNTER",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Vibhishana Pointing Out the Illegal Execution of an Envoy",
                        loreOrContext = "When Ravana ordered Hanuman to be put to death, Vibhishana intervened citing international Rajadharma: 'A king cannot lawfully execute an emissary!' Ravana was forced to commute the sentence.",
                        asciiFlowchart = "[Unlawful Execution Ordered] ──> [Vibhishana Cites Rajadharma Code] ──> [Sentence Lawfully Commuted]",
                        lessonQuote = "Upholding statutory law protects the assembly from moral disgrace."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Auditing a Startup's Term Sheet for Red Flags",
                        loreOrContext = "A smart young founder spotted an illegal clause in an angel investor's term sheet that tried to restrict the founder's right to vote, forcing the VC to remove the blunder.",
                        asciiFlowchart = "[Reviews VC Term Sheet] ──> [Spots Illegal Voting Restriction] ──> [Forces VC to Correct Clause]",
                        lessonQuote = "Legal literacy is an entrepreneur's greatest superpower."
                    ),
                    caseQuestion = "Spot the blunder in this statement: 'The Karta and all coparceners in an HUF have joint unlimited liability for family debts.'",
                    caseAnswer = "Blunder: Coparceners do NOT have unlimited liability; only the Karta has unlimited liability, while coparceners have limited liability."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 70: The Entrepreneur Matchmaker Challenge",
                    scenario = "Match each of the following 3 entrepreneurs to their optimal business form: (1) Ananya wants to run a boutique fashion tailoring shop alone with total secrecy. (2) 12 small tomato farmers want to eliminate commission agents and sell collectively. (3) Rahul and 3 techies are launching an AI supercomputing platform needing ₹100 Crores venture capital with limited liability.",
                    question = "Provide the exact form for each entrepreneur with a 1-line justification.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "(1) Ananya: Sole Proprietorship — Ideal for personalized service, small capital, and 100% confidential operational control (1 Mark)",
                        "(2) 12 Farmers: Marketing Cooperative Society — Ideal for small producers pooling output to eliminate middlemen markups (1 Mark)",
                        "(3) Rahul & Techies: Joint Stock Company (Private Limited converting to Public) — Ideal for massive capital raising, institutional venture capital, and limited risk (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Congratulations! You have completed all 70 pages of the Master Business Studies Module with Abhinav Sir.",
                "Review the Mnemonics, Master Decision Trees, and Exam Traps to score a perfect 100/100 in your Board and CUET exams!"
            )
        )
    )

    // Gamified Vault Puzzle Data
    val crosswordClues = listOf(
        CrosswordClue(1, true, "Supreme manager of HUF with unlimited liability", "KARTA", 0, 0),
        CrosswordClue(2, false, "Landmark British legal case that birthed corporate personality", "SALOMON", 0, 0),
        CrosswordClue(3, true, "Minimum percentage subscription required under SEBI rules", "NINETY", 2, 1),
        CrosswordClue(4, false, "Document containing internal bye-laws of a company", "AOA", 2, 4),
        CrosswordClue(5, true, "Democratic voting rule in cooperative societies: One ___ One Vote", "MAN", 4, 2)
    )

    val matchmakerItems = listOf(
        MatchmakerItem(
            id = 1,
            entrepreneurName = "Ananya Sharma",
            scenario = "Boutique fashion designer wanting single-person ownership, zero regulatory hassle, and total design secrecy.",
            optimalForm = "Sole Proprietorship",
            rationale = "Perfect for personalized services requiring confidential craftsmanship, direct customer contact, and 100% control."
        ),
        MatchmakerItem(
            id = 2,
            entrepreneurName = "Kisan Vikas Group",
            scenario = "40 small mustard farmers being exploited by mandi commission agents, seeking fair returns.",
            optimalForm = "Cooperative Society (Marketing / Producers)",
            rationale = "Pools small farmer output, eliminates parasitic middlemen, and operates under democratic 'One man, one vote'."
        ),
        MatchmakerItem(
            id = 3,
            entrepreneurName = "Vikram & 3 Co-Founders",
            scenario = "Building an electric vertical takeoff aircraft (eVTOL) needing ₹250 Crores in venture funding with high prototype risk.",
            optimalForm = "Private Limited Company (Joint Stock Company)",
            rationale = "Essential for raising massive multi-crore equity funding from venture capital funds while shielding founders with limited liability."
        ),
        MatchmakerItem(
            id = 4,
            entrepreneurName = "The Mathur Family",
            scenario = "Three generations living together with ancestral gold smithing workshops passed down from great-grandfather.",
            optimalForm = "Hindu Undivided Family (HUF)",
            rationale = "Inherited ancestral property across generations governed by Hindu Law with Karta leading and coparceners enjoying birthrights."
        ),
        MatchmakerItem(
            id = 5,
            entrepreneurName = "Arjun (Solo AI Architect)",
            scenario = "Single software freelancer wanting corporate limited liability and an institutional entity to sign global enterprise contracts.",
            optimalForm = "One Person Company (OPC)",
            rationale = "Combines 100% sole ownership with the corporate limited liability shield and perpetual succession via a mandatory nominee."
        )
    )

    val legalBlunders = listOf(
        LegalBlunderItem(
            id = 1,
            clauseText = "Clause 4 of Moonshot Pvt. Ltd. AOA: 'The company may issue a television and newspaper advertisement inviting the general public to subscribe to its equity shares.'",
            isBlunder = true,
            statutoryCorrection = "FATAL BLUNDER: Section 2(68) of the Companies Act, 2013 strictly prohibits any Private Limited Company from inviting the public to subscribe for its securities."
        ),
        LegalBlunderItem(
            id = 2,
            clauseText = "Resolution 12 of Agro Mills Ltd.: 'The company hereby ratifies by unanimous 100% shareholder vote a loan contract executed for speculative cryptocurrency trading, which was outside the MOA Object Clause.'",
            isBlunder = true,
            statutoryCorrection = "FATAL BLUNDER: Under the Doctrine of Ultra Vires (Ashbury Railway Carriage v. Riche), any act outside the MOA Object Clause is void ab initio and CANNOT be ratified even by 100% unanimous shareholder consent."
        ),
        LegalBlunderItem(
            id = 3,
            clauseText = "Bye-Law 8 of Shanti Cooperative: 'Any member who deposits over ₹5 Lakhs share capital shall be entitled to cast 5 votes in the annual election of the Managing Committee.'",
            isBlunder = true,
            statutoryCorrection = "FATAL BLUNDER: Cooperative Societies Act, 1912 mandates the sacred democratic principle of 'One Man, One Vote'. Wealth or shareholding cannot purchase additional voting power."
        ),
        LegalBlunderItem(
            id = 4,
            clauseText = "Bank Loan Notice to Mathur HUF: 'Notice is hereby served to seize the personal residential apartment belonging to junior coparcener Siddharth to settle the business overdraft.'",
            isBlunder = true,
            statutoryCorrection = "FATAL BLUNDER: Under Hindu Law, coparceners enjoy strictly limited liability capped at their share in ancestral property; their personal private assets are legally immune from creditors."
        ),
        LegalBlunderItem(
            id = 5,
            clauseText = "Board Minutes of Nova Tech Ltd.: 'Since public subscription reached 82% of the issued amount within 30 days, the directors hereby proceed to allot shares to all applicants.'",
            isBlunder = true,
            statutoryCorrection = "FATAL BLUNDER: Section 39(1) of the Companies Act and SEBI mandate a strict 90% Minimum Subscription. If 90% is not reached, zero shares can be allotted and 100% application money must be refunded within 15 days."
        )
    )
}
