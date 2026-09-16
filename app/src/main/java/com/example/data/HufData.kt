package com.example.data

import com.example.model.*

object HufData {
    val pages = listOf(
        // PAGE 23: Joint Hindu Family Business (HUF) - Genesis & Core Concept
        StudyPage(
            pageNumber = 23,
            module = ModuleCategory.HUF,
            title = "Joint Hindu Family Business (HUF): Genesis & Heritage",
            subtitle = "A Unique Form of Business Indigenous to Indian Civilisation",
            topicDescriptionEnglish = "Joint Hindu Family Business (HUF) is a distinct commercial form found exclusively in India, governed by Hindu Succession Law. It is owned and operated by members of an undivided Hindu family possessing ancestral property.",
            topicDescriptionHinglish = "Hindu Undivided Family (HUF) business poore world me sirf India me hota hai! Ye Hindu Law ke tehat chalta hai. Isme kisi contract ki zaroorat nahi hoti—parivaar me bachha paida hote hi automatically business me hissa mil jata hai! Isme ancestral (khandani) property hona zaroori hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'H-U-F-L-A-W' -> (H)ereditary Birth, (U)ndivided Family, (F)amily Ancestral Estate, (L)imited Coparceners, (A)uthority of Karta, (W)ithout Contract.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Solar Dynasty's Ancestral Heritage (Ikshvaku Parampara)",
                loreOrContext = "From Emperor Ikshvaku down to King Raghu, Dasharatha, and Lord Rama, the royal throne, realm, ancestral codes, and family treasures were stewarded across generations under undivided family lineage and sacred primogeniture.",
                asciiFlowchart = """
[👑 Emperor Ikshvaku Ancestral Estate]
       │
       ▼ (Generations of Continuous Lineage)
[👑 King Raghu ──> King Aja ──> King Dasharatha]
       │
       ▼ (Undivided Lineage with Inherent Birthrights)
[🏹 Lord Rama (Supreme Eldest Heir / Karta) & Royal Brothers (Coparceners)]
                """.trimIndent(),
                lessonQuote = "Sacred ancestral patrimony is a trust held by the living for generations unborn."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Two Fundamental Conditions Precedent for HUF",
                    category = "Statutory Condition",
                    englishText = "An HUF business cannot come into existence unless two statutory conditions are satisfied: (1) Minimum two male/female family members; (2) Ancestral property inherited by the family through three successive generations.",
                    hinglishText = "HUF business shuru hone ke liye 2 shartein zaroori hain: (1) Parivaar me kam se kam 2 members hone chahiye; (2) Purani khandani/ancestral property honi chahiye jo kam se kam 3 generations se chali aa rahi ho.",
                    asciiFlowchart = """
[👨‍👩‍👦 Minimum 2 Family Members] + [🏛️ Inherited Ancestral Estate] ──> [⚖️ Valid Legal HUF Business]
                    """.trimIndent(),
                    microMnemonic = "MEMBERS+ANCESTRAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sacred Soil of Ayodhya Inherited by Four Sons",
                        loreOrContext = "The four royal brothers did not buy Ayodhya's territory; they inherited the sacred kingdom as indivisible ancestral heritage consecrated by Sage Vashistha.",
                        asciiFlowchart = "[🏛️ Ayodhya's Sacred Soil] ──> [Inherited as Divine Legacy] ──> [Four Royal Sons as Co-Heirs]",
                        lessonQuote = "Ancestral legacy carries spiritual obligation far weightier than newly minted gold."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Generational Textile Havelis in Old Chandni Chowk",
                        loreOrContext = "The Bansal family runs a 90-year-old pure silk saree trade from an ancestral katra in Delhi, operating under their ancestral HUF PAN card.",
                        asciiFlowchart = "[🧵 90-Yr Katra Shop] ──> [Passed 3 Generations] ──> [🧾 Single Ancestral HUF Tax Entity]",
                        lessonQuote = "Generational compounding over decades creates moats startups cannot buy."
                    ),
                    caseQuestion = "Can two unrelated friends pool money and form a Joint Hindu Family Business?",
                    caseAnswer = "No. Membership in an HUF arises exclusively through birth into a Hindu family with ancestral property, not through contract."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 23: The Modern Self-Acquired Boutique",
                    scenario = "Mr. Verma earned ₹50 Lakhs working as a software architect in Bangalore. He invested this self-acquired personal money to open a high-end coffee shop with his wife. He wants to register it as an HUF to avail separate income tax exemptions.",
                    question = "Can Mr. Verma legally operate this enterprise as an HUF business? Explain the requisite condition.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the core statutory prerequisite: HUF requires inherited ancestral property, not self-acquired income (1 Mark)",
                        "Analyze Mr. Verma's capital source: The capital is personal self-earned funds (1 Mark)",
                        "Conclusion: No, he cannot form an HUF business without inherited ancestral property; it can be run as Sole Prop, Partnership, or Company (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "HUF is governed by Hindu Law, not by the Indian Partnership Act.",
                "Membership is acquired strictly by birth/adoption, requiring ancestral property."
            )
        ),

        // PAGE 24: Two Schools of Hindu Law (Dayabhaga vs. Mitakshara)
        StudyPage(
            pageNumber = 24,
            module = ModuleCategory.HUF,
            title = "Two Schools of Hindu Law: Dayabhaga vs. Mitakshara",
            subtitle = "Regional Jurisprudence & The Landmark 2005 Amendment",
            topicDescriptionEnglish = "Hindu Law is bifurcated into two traditional schools: Dayabhaga (prevalent in West Bengal and Assam) and Mitakshara (prevalent across the rest of India). The Hindu Succession (Amendment) Act, 2005 revolutionized coparcenary rights by granting equal status to daughters.",
            topicDescriptionHinglish = "Hindu Law ke 2 schools hote hain: (1) Dayabhaga (sirf West Bengal aur Assam me)—isme bachhe ko janam se right nahi milta, pita ki maut ke baad hissa milta hai; isme male aur female dono coparcener ban sakte the pehle se. (2) Mitakshara (baaki poore India me)—isme janam lete hi ancestral property me right mil jata hai! 2005 ke Amendment ne betiyon ko beto ke barabar equal coparcener bana diya!",
            macroMemoryTrick = "MACRO MNEMONIC: 'D-M-2005' -> (D)ayabhaga (WB/Assam - On Death), (M)itakshara (Rest of India - By Birth), (2005) Equal Rights for Daughters.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Right by Birth (Janmasiddha Adhikar) of Royal Ayodhya Princes",
                loreOrContext = "Under the ancient Vedic tradition mirroring Mitakshara principles, the moment Lord Rama and his brothers took birth in Dasharatha's palace, celestial drums resounded, celebrating their inherent birthright as sons of Ayodhya.",
                asciiFlowchart = """
[👶 Birth of Royal Princes in Ayodhya]
       │
       ▼ (Instant Acquisition of Birthright by Status)
[🌟 Inherent Right in the Sacred Ancestral Heritage of Suryavansh]
       │
       ▼ (Mitakshara Doctrine Exemplified)
[👑 Indivisible Coparcenary Kinship Established from First Breath]
                """.trimIndent(),
                lessonQuote = "In the ancient lineage of righteousness, honor is inherited from the instant of birth."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Dayabhaga School vs. Mitakshara School",
                    category = "Legal Systems",
                    englishText = "Dayabhaga (West Bengal & Assam): Coparcenary rights arise only upon the death of the father; male and female members can inherit. Mitakshara (Rest of India): Rights in ancestral property are acquired instantly upon birth by a coparcener.",
                    hinglishText = "Dayabhaga me beta tab tak hissa nahi maang sakta jab tak pita zinda hain (West Bengal/Assam). Mitakshara me baaki poore Bharat me bachhe ka paida hona hi kafi hai, janam se hi uska hissa pakka!",
                    asciiFlowchart = """
[Dayabhaga (WB & Assam)] ──> [Rights arise ONLY on Death of Father] ──> [Both Males & Females inherit]
[Mitakshara (Rest of India)] ──> [Rights arise INSTANTLY AT BIRTH] ──> [Fluctuates with every birth/death]
                    """.trimIndent(),
                    microMnemonic = "DAYA-DEATH vs MITA-BIRTH",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Ayodhya's Universal Rejoicing at the Birth of Princes",
                        loreOrContext = "When Kausalya gave birth to Rama, Emperor Dasharatha immediately distributed thousands of cows and lands, recognizing the immediate arrival of the kingdom's divine heir.",
                        asciiFlowchart = "[👶 Rama's Birth] ──> [🎉 Universal Celebration] ──> [👑 Birthright Recognized Instantly]",
                        lessonQuote = "The arrival of a righteous heir immediately secures the stability of the realm."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Kolkata Art Gallery vs. Jaipur Gemstones HUF Lineage",
                        loreOrContext = "In Kolkata (Dayabhaga), Soumik could not claim partition while his 80-year-old grandfather lived; in Jaipur (Mitakshara), newborn Aryan instantly gained a mathematical share in the ancestral gem mines.",
                        asciiFlowchart = "[Jaipur Baby Born] ──> [Mitakshara Law Triggers] ──> [💎 Instant Mathematical Share in HUF Assets]",
                        lessonQuote = "Geography dictates the legal mechanics of inheritance."
                    ),
                    caseQuestion = "In which states of India is the Dayabhaga system of Hindu Law traditionally applicable?",
                    caseAnswer = "West Bengal and Assam."
                ),
                SubPointItem(
                    pointTitle = "Hindu Succession (Amendment) Act, 2005: Equal Rights for Daughters",
                    category = "Modern Reform",
                    englishText = "The 2005 Amendment conferred equal coparcenary rights by birth upon daughters in a Joint Hindu Family, granting the same rights, liabilities, and entitlement to become Karta as sons.",
                    hinglishText = "2005 ka historical kanoon: Betiyon ko bhi beto ke bilkul barabar 'Coparcener by birth' bana diya gaya! Beti chahe shaadi-shuda ho ya un-married, uska ancestral property me barabar ka hissa hai aur wo Karta bhi ban sakti hai!",
                    asciiFlowchart = """
[Amendment Act 2005] ──> [Daughter has EQUAL Coparcenary Birthright] ──> [Can become KARTA of HUF]
                    """.trimIndent(),
                    microMnemonic = "DAUGHTER = EQUAL-COPARCENER",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Mata Sita's Unquestioned Sovereign Authority in Mithila",
                        loreOrContext = "As King Janaka's eldest daughter, Sita possessed unmatched spiritual authority and wisdom, revered as Janaki across the councils of Aryavarta.",
                        asciiFlowchart = "[👑 King Janaka's Daughter] ──> [🌟 Supreme Sovereign Stature] ──> [⚖️ Revering Feminine Dharmic Power]",
                        lessonQuote = "A daughter's righteous stature is equal to the sovereign crown."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Pooja Taking Over as Karta of Ancestral Jewellery Firm",
                        loreOrContext = "Following her father's demise, Pooja (the eldest daughter and an MBA in Luxury Retail) legally assumed the role of Karta of the 85-year-old family jewellery business in Delhi.",
                        asciiFlowchart = "[👑 Eldest Daughter Pooja] ──> [⚖️ Hindu Succession Act 2005] ──> [🏛️ Officially Appointed Karta]",
                        lessonQuote = "Merit, character, and equality shatter antique patriarchal glass ceilings."
                    ),
                    caseQuestion = "Can a married daughter demand partition of her father's ancestral HUF business property today?",
                    caseAnswer = "Yes, under the Hindu Succession (Amendment) Act, 2005, a daughter is a coparcener by birth with equal rights to demand partition."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 24: The Contested Succession of Bansal Sweets",
                    scenario = "Late Shri Kedarnath ran an ancestral sweet business in Lucknow (Mitakshara school). He passed away leaving a 28-year-old daughter Ritu (an experienced operations manager) and a 19-year-old son Vivek (a college freshman). Vivek's uncle claims: 'Only males can be Karta, so Vivek must manage.'",
                    question = "Examine the legal validity of the uncle's claim in light of the Hindu Succession (Amendment) Act, 2005.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the provisions of Hindu Succession (Amendment) Act, 2005 (1 Mark)",
                        "Clarify that daughters are full coparceners with identical rights to become Karta if they are the eldest coparcener (1 Mark)",
                        "Conclusion: The uncle's claim is legally incorrect; Ritu, being the eldest surviving coparcener, has the legal right to become Karta (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Mitakshara recognizes birthright; Dayabhaga recognizes succession only upon the father's death.",
                "Since the 2005 Amendment, daughters enjoy equal coparcenary status by birth and can serve as Karta."
            )
        ),

        // PAGE 25: The Karta vs. Coparceners - Roles & Liabilities
        StudyPage(
            pageNumber = 25,
            module = ModuleCategory.HUF,
            title = "Karta vs. Coparceners: Power, Duty & Liability Asymmetry",
            subtitle = "The Absolute Patriarch/Matriarch vs. The Shielded Kin",
            topicDescriptionEnglish = "The eldest coparcener is the Karta, wielding comprehensive managerial power over all assets and contracts. In exchange for this monopoly of control, the Karta bears unlimited personal liability, whereas coparceners enjoy strictly limited liability.",
            topicDescriptionHinglish = "Parivaar ka sabse bada member 'Karta' kehlata hai. Karta ke paas dukan ka 100% control hota hai—kisi coparcener se permission lene ki zaroorat nahi hoti. LEKIN sabse bada difference: Karta ki liability UNLIMITED hoti hai (uska personal ghar bik sakta hai), jabki Coparceners (baki parivaar ke sadasya) ki liability sirf unke ancestral property ke share tak hi LIMITED hoti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'K-U-C-L' -> (K)arta has (U)nlimited liability | (C)oparceners have (L)imited liability.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Emperor Dasharatha as Sovereign Karta of the Solar Realm",
                loreOrContext = "As sovereign Karta of Ayodhya, Dasharatha executed all royal treaties, managed the state treasury, and bore unlimited personal liability for royal boons, while his royal sons enjoyed protected royal dignity under his umbrella.",
                asciiFlowchart = """
[👑 Dasharatha: THE KARTA]
       │ (100% Supreme Governance & Unlimited Sovereign Liability)
       ▼
[🏛️ Royal Ayodhya Ancestral Treasury & Realm]
       │ (Shields & Nurtures the Royal Heirs)
       ▼
[🏹 Rama, Lakshmana, Bharata, Shatrughna: THE COPARCENERS]
       │ (Protected Rights & Inherent Birthright Shares)
                """.trimIndent(),
                lessonQuote = "The supreme head bears the storm so that the lineage may flourish in safety."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Karta: Powers and Unlimited Liability",
                    category = "Structural Role",
                    englishText = "The Karta possesses absolute management rights, power to alienate ancestral property for family necessity (Legal Necessity), and power to execute commercial contracts. His liability is unlimited, extending to his personal private assets.",
                    hinglishText = "Karta dukan ka absolute commander hota hai. Wo business ke liye loan le sakta hai, deal sign kar sakta hai. Lekin agar business dooba, to creditors Karta ki personal car aur personal property bechkar paisa vasool karenge.",
                    asciiFlowchart = """
[KARTA] ──> [👔 Absolute Management Control] + [✍️ Unilateral Contract Powers] + [🚨 UNLIMITED Liability!]
                    """.trimIndent(),
                    microMnemonic = "KARTA = UNLIMITED-HELM",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Lord Rama's Sovereign Decision to Keep His Father's Word",
                        loreOrContext = "Upon Dasharatha's demise, Rama as the eldest assumed moral custody of the dynastic honor, willingly entering 14 years of forest exile to discharge his father's liability.",
                        asciiFlowchart = "[👑 Rama as Eldest Heir] ──> [Assumes Dynastic Debt] ──> [Forest Exile Borne Personally]",
                        lessonQuote = "Noble leadership willingly shoulders the heaviest burden of dynastic duty."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Grandfather as Karta Borrowing ₹40 Lakhs for Ancestral Silk Looms",
                        loreOrContext = "Bauji, the 72-year-old Karta, took a ₹40 Lakhs loan to modernize the family weaving mill. When fire gutted the warehouse, the bank attached Bauji's personal fixed deposits.",
                        asciiFlowchart = "[👴 Bauji Takes ₹40L Loan] ──> [🔥 Mill Gutted] ──> [🏦 Bauji's Personal FD Attached Directly]",
                        lessonQuote = "With ultimate sovereign executive authority comes ultimate personal liability."
                    ),
                    caseQuestion = "Can the junior coparceners question the day-to-day managerial decisions of the Karta in an HUF business?",
                    caseAnswer = "No. Junior coparceners have no legal right to interfere in the day-to-day management conducted by the Karta."
                ),
                SubPointItem(
                    pointTitle = "Coparceners: Rights and Limited Liability",
                    category = "Structural Role",
                    englishText = "Coparceners have an inherent right by birth to their share of ancestral property and can demand partition. Their liability is strictly limited to their proportionate interest in the family property; their personal private assets are 100% safe.",
                    hinglishText = "Coparceners parivaar ke wo members hain jinka khandani property me hissa hai. Inka sabse bada protection ye hai ki inki liability LIMITED hoti hai. Agar business par karza ho gaya, to inki personal bike ya personal savings ko court chhu bhi nahi sakti!",
                    asciiFlowchart = """
[Coparceners] ──> [👶 Right by Birth] + [⚖️ LIMITED Liability] + [🛡️ Private Assets 100% Safe] + [🔪 Right to Demand Partition]
                    """.trimIndent(),
                    microMnemonic = "COPARCENER = SHIELDED",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Bharata's Equitable Royal Ingress into Ancestral Welfare",
                        loreOrContext = "Bharata had an unquestioned sacred right to royal sustenance and princely inheritance, yet his personal virtue remained pristine and shielded from royal greed.",
                        asciiFlowchart = "[👑 Bharata as Royal Coparcener] ──> [Sacred Right to Lineage Share] ──> [Moral Integrity Untouched]",
                        lessonQuote = "Inherited rights should be exercised with selfless detachment."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Junior Cousin's Salary Protected from Family Sweet-Shop Bankruptcy",
                        loreOrContext = "Rohan works at Infosys earning ₹80,000/month. His family HUF sweet-shop went into ₹25 Lakhs debt. The court ruled that Rohan's Infosys salary cannot be touched by HUF creditors.",
                        asciiFlowchart = "[💼 Personal Tech Salary] ──> [🛡️ HUF Creditors Barred] ──> [💵 Personal Wealth Completely Immune]",
                        lessonQuote = "Coparceners enjoy limited liability; outside career earnings remain your private sanctuary."
                    ),
                    caseQuestion = "Can a commercial creditor of an HUF attach the personal salary of a junior coparcener?",
                    caseAnswer = "No. A coparcener's liability is strictly limited to their share in the ancestral HUF property."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 25: The Creditor Recovery from Mathur Family HUF",
                    scenario = "The Mathur Family HUF owes ₹30 Lakhs to wholesale distributors. The total value of ancestral HUF business property is ₹18 Lakhs. The Karta, Mr. Anand Mathur, owns a personal penthouse worth ₹50 Lakhs. Junior coparcener Siddharth owns personal mutual funds worth ₹10 Lakhs.",
                    question = "Determine how the creditors will recover the remaining ₹12 Lakhs shortfall from Mr. Anand Mathur and Siddharth.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ancestral Property liquidation: ₹18 Lakhs distributed to creditors (Deficit = ₹12 Lakhs) (1 Mark)",
                        "Analyze Siddharth's liability: As a coparcener, his liability is limited to ancestral share; his ₹10 Lakhs mutual funds CANNOT be attached (1 Mark)",
                        "Analyze Karta's liability: Karta possesses unlimited personal liability; the remaining ₹12 Lakhs will be extracted from Mr. Anand Mathur's personal penthouse (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Karta exercises undivided control and shoulders unlimited personal exposure.",
                "Coparceners enjoy statutory protection: their personal private assets are legally immune from HUF debts."
            )
        ),

        // PAGE 26: Features of HUF
        StudyPage(
            pageNumber = 26,
            module = ModuleCategory.HUF,
            title = "Features of HUF: Formation, Control & Continuity",
            subtitle = "The Unbroken Chain of Kinship and Commercial Perpetual Life",
            topicDescriptionEnglish = "The distinctive features of an HUF include creation by legal status/birth rather than contract, centralized control vested in the Karta, perpetual continuity surviving the death of the Karta, and inclusion of minors from their first breath.",
            topicDescriptionHinglish = "HUF ke 5 core features: (1) Formation—janam se banti hai, koi contract nahi chahiye; (2) Liability—Karta ki unlimited, coparceners ki limited; (3) Control—sirf Karta ka ekchhatra raj; (4) Continuity—Karta ki maut se business band nahi hota, agla eldest coparcener Karta ban jata hai; (5) Minor members—janam lete hi member ban jate hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'F-L-C-C-M' -> (F)ormation by Birth, (L)iability Dual, (C)ontrol Centralized, (C)ontinuity Perpetual, (M)inor Membership.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Unbroken Continuity of the Ayodhya Royal Lineage",
                loreOrContext = "When Emperor Dasharatha passed away, the Ayodhya dynasty did not dissolve into chaos. Bharata administered the realm in Rama's name, and upon Rama's return, the sovereign throne continued smoothly across cosmic eras.",
                asciiFlowchart = """
[👑 Dasharatha Passes] ──> [🛑 Potential Administrative Crisis]
                                      │
                                      ▼ (HUF Perpetual Succession Doctrine)
[👡 Bharata Acts as Regent Trustee] ──> [🏹 Lord Rama Crowned Karta] ──> [🌟 Unbroken Lineage]
                """.trimIndent(),
                lessonQuote = "The family enterprise transcends individual mortality through the unbroken continuity of duty."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Continuity and Succession of Karta",
                    category = "Feature",
                    englishText = "The death of the Karta does NOT terminate the HUF business. Unlike sole proprietorship, the enterprise possesses perpetual continuity; the next eldest surviving coparcener automatically becomes the new Karta.",
                    hinglishText = "Sole proprietorship ki tarah founder ki maut par business band nahi hota! Agar Karta ki death ho jaye, to parivaar ka jo agla sabse bada coparcener (bada beta, beti ya bhai) hoga, wo automatically naya Karta ban jayega.",
                    asciiFlowchart = """
[👴 Senior Karta Passes Away] ──> [⚡ NO Liquidation / NO Closure] ──> [👑 Next Eldest Coparcener Becomes Karta Automatically!]
                    """.trimIndent(),
                    microMnemonic = "AUTO-SUCCESSION",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sacredpaduka Regency of Prince Bharata",
                        loreOrContext = "Bharata governed Ayodhya from Nandigram placing Rama's sacred wooden sandals on the royal throne, ensuring the dynastic administration continued without interruption.",
                        asciiFlowchart = "[👡 Sacred Padukas on Throne] ──> [Uninterrupted Ayodhya Governance] ──> [Lineage Protected]",
                        lessonQuote = "Devotion to institutional continuity preserves kingdoms across dark hours."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Next Eldest Sibling Stepping In at 100-Year-Old Publishing Press",
                        loreOrContext = "When grandfather passed away, 34-year-old eldest cousin Ananya automatically stepped in as Karta for the family's Sanskrit publishing press in Varanasi without court liquidation.",
                        asciiFlowchart = "[👴 Karta Passes] ──> [📚 100-Yr Press Continues] ──> [👩 Eldest Cousin Ananya Takes Helm]",
                        lessonQuote = "True generational brands are built to outlast their mortal creators."
                    ),
                    caseQuestion = "What happens to the legal existence of an HUF business when the Karta dies?",
                    caseAnswer = "The business continues uninterrupted; the next eldest coparcener automatically becomes the new Karta."
                ),
                SubPointItem(
                    pointTitle = "Minor as Member by Birth",
                    category = "Feature",
                    englishText = "In a partnership, a minor can only be admitted to benefits with unanimous consent. In an HUF, a child becomes a coparcener/member automatically upon birth without any consent or contract.",
                    hinglishText = "Partnership me minor ko sabhi partners ki permission se laaya jata tha. Lekin HUF me permission nahi chahiye—hospital me bachha paida hua, aur pehli saans lete hi wo business ka coparcener ban gaya!",
                    asciiFlowchart = """
[👶 Newborn Child Takes First Breath] ──> [⚡ Instant Automatic Legal Ingress into HUF Estate]
                    """.trimIndent(),
                    microMnemonic = "MEMBER-AT-BIRTH",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Divine Birth of Lava and Kusha in Valmiki's Forest Hermitage",
                        loreOrContext = "Born in the hermitage of Sage Valmiki, Lava and Kusha were recognized as divine princes of the Ikshvaku race from their very birth, carrying royal entitlement in their bloodline.",
                        asciiFlowchart = "[👶 Twin Princes Born] ──> [🌟 Inherent Royal Lineage] ──> [🏹 Rightful Heirs of Ayodhya]",
                        lessonQuote = "Righteous lineage confers identity long before the world recognizes it."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Newborn Baby Given PAN & Mathematical Share in Family Rice Mill",
                        loreOrContext = "The day little Vihaan was born in Ludhiana, his grandfather added his name to the family HUF roster, adjusting the ancestral share distribution automatically.",
                        asciiFlowchart = "[🎂 Baby Vihaan Born] ──> [Added to HUF Roster] ──> [🌾 Mathematical Share in Rice Mill Assets]",
                        lessonQuote = "Family equity structures welcome the next generation from day one."
                    ),
                    caseQuestion = "Contrast the induction of a minor in a Partnership with that in an HUF.",
                    caseAnswer = "In partnership, a minor is admitted only to benefits by unanimous agreement; in HUF, membership is automatic by birth."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 26: The Succession Crisis at Agarwal Spices",
                    scenario = "Mr. Kedarnath Agarwal, Karta of a prominent spice HUF in Khari Baoli, died suddenly. The family consists of his widow (62), eldest daughter Sunita (38, chartered accountant), younger son Raghav (30), and grandson Kabir (5). Raghav claims: 'I am the adult male, so I alone am the Karta.'",
                    question = "Evaluate Raghav's claim in light of the modern Hindu Succession Act and determine who legally becomes Karta.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the legal rule: The next eldest surviving coparcener becomes Karta (1 Mark)",
                        "Apply the 2005 Amendment: Daughters are full coparceners with equal rights to become Karta based on age seniority (1 Mark)",
                        "Conclusion: Sunita (aged 38) is the eldest coparcener and legally becomes Karta; Raghav's claim is invalid (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "HUF possesses perpetual existence surviving mortal heads.",
                "Membership is acquired by status of birth, embracing minors immediately."
            )
        ),

        // PAGE 27: Merits of Joint Hindu Family Business
        StudyPage(
            pageNumber = 27,
            module = ModuleCategory.HUF,
            title = "Merits: Autonomy of Karta, Family Loyalty & Resilience",
            subtitle = "Why Blood Bonds and Central Command Power Multi-Decade Enterprises",
            topicDescriptionEnglish = "HUF combines the prompt decision-making of sole proprietorship with the risk protection of limited liability for family members. Blood relationships foster deep intrinsic loyalty and inter-generational cooperation.",
            topicDescriptionHinglish = "HUF ke 4 zabardast fayde: (1) Effective Control—Karta akele decision leta hai, koi uske kaam me tang nahi ada sakta; (2) Continued Business Life—Karta mar bhi jaye to business chalta rehta hai; (3) Limited Liability of Coparceners—family members ki personal property safe rehti hai; (4) Loyalty & Cooperation—khoon ka rishta hai, isliye log dukan ke liye jaan laga dete hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'E-C-L-I' -> (E)ffective Control, (C)ontinued Life, (L)imited Coparceners Risk, (I)ncreased Loyalty.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Invincible Brotherhood of the Four Princes of Ayodhya",
                loreOrContext = "When Kaikeyi demanded the throne for Bharata and exile for Rama, Bharata utterly rejected the crown, walked barefoot to Chitrakoot, and ruled merely as Rama's servant-trustee, demonstrating unmatched familial loyalty.",
                asciiFlowchart = """
[👑 Kingdom Offered to Bharata by Kaikeyi]
       │ (Temptation of Sovereign Power & Wealth)
       ▼
[🚫 Absolute Rejection of Selfish Gain]
       │ (Supreme Unshakable Familial Devotion)
       ▼
[👡 Sacred Padukas Placed on Throne ──> Unity of the Imperial House Preserved]
                """.trimIndent(),
                lessonQuote = "Where brothers stand united in righteousness, no external stratagem can fracture the house."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Effective Centralized Control (No Paralysis)",
                    category = "Merit",
                    englishText = "The Karta has complete autonomy in decision-making. No coparcener can interfere with his management, eliminating boardroom stalemates and facilitating prompt strategic execution.",
                    hinglishText = "Karta ko kisi se poochne ya vote karwane ki zaroorat nahi hoti. Uska decision final hota hai. Isse dukan me quick decisions hote hain aur kaam me koi rukaawat nahi aati.",
                    asciiFlowchart = """
[Karta Decides Strategy] ──> [Zero Bureaucracy / No Interruption] ──> [⚡ Swift Commercial Action]
                    """.trimIndent(),
                    microMnemonic = "CHIEF-COMMAND",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Emperor Dasharatha's Supreme Conclave Proclamation",
                        loreOrContext = "When Dasharatha decided to proclaim Rama as Yuvaraja, his executive decree was received with joyous unanimous acclamation by ministers and sages alike.",
                        asciiFlowchart = "[👑 Dasharatha's Sovereign Decree] ──> [Ministerial Harmony] ──> [Ayodhya Celebrates Yuvaraja]",
                        lessonQuote = "Decisive patriarchs inspire instant collective confidence."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Patriarch Pivoting 70-Year-Old Mustard Oil Brand to Cold-Pressed Glass Jars",
                        loreOrContext = "The 68-year-old Karta of an ancestral oil mill in Bharatpur instantly approved a ₹15 Lakhs packaging redesign without waiting for quarterly shareholder votes.",
                        asciiFlowchart = "[💡 Packaging Redesign] ──> [👴 Karta Approves Overnight] ──> [🚀 Sales Surge 300% on Blinkit]",
                        lessonQuote = "Swift execution backed by decades of intuition outmaneuvers bureaucratic startups."
                    ),
                    caseQuestion = "Why does an HUF experience fewer management deadlocks compared to an ordinary partnership firm?",
                    caseAnswer = "Because managerial control is concentrated solely in the Karta; junior coparceners cannot legally veto decisions."
                ),
                SubPointItem(
                    pointTitle = "Increased Loyalty and Blood Cooperation",
                    category = "Merit",
                    englishText = "Because the business is run by blood relatives, pride in family honor and ancestral heritage inspires greater dedication, honesty, and mutual trust than contract-based employment.",
                    hinglishText = "Khoon ka rishta business ko majboot banata hai. Dukan ka naam parivaar ki izzat se juda hota hai, isliye koi aapas me chori ya cheating kam karta hai aur sab milkar mehnat karte hain.",
                    asciiFlowchart = """
[🩸 Shared Bloodline & Ancestral Pride] ──> [🤝 High Mutual Trust] ──> [🛡️ Low Agency Fraud & High Dedication]
                    """.trimIndent(),
                    microMnemonic = "BLOOD-LOYAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Shatrughna's Silent Dedicated Service to Bharata",
                        loreOrContext = "Prince Shatrughna served alongside Bharata at Nandigram without seeking independent personal glory, embodying flawless fraternal loyalty.",
                        asciiFlowchart = "[⚔️ Shatrughna's Quiet Devotion] ──> [Flawless Fraternal Support] ──> [Ayodhya's Peace Maintained]",
                        lessonQuote = "True greatness lies in selflessly supporting the righteous endeavor of kin."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Four Cousins Guarding the Secret Spice Vault in Chandni Chowk",
                        loreOrContext = "In an 80-year-old spice trading HUF, four cousins personally manage procurement, vault access, and dispatch, ensuring zero recipe leaks to outside corporate rivals.",
                        asciiFlowchart = "[👨‍👦‍👦 4 Cousins in Trade] ──> [🔒 Total Internal Trust] ──> [🛡️ Zero Secret Recipe Leaks]",
                        lessonQuote = "Blood ties reinforced by shared purpose create an unbreachable corporate fortress."
                    ),
                    caseQuestion = "Explain how the social structure of an HUF creates an inherent defense against employee fraud.",
                    caseAnswer = "Key management positions are held by family coparceners whose personal reputation and ancestral inheritance are directly aligned with firm success."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 27: The Crisis of the Flooded Godown",
                    scenario = "During torrential floods in Surat, an ancestral textile HUF godown was submerged. Karta Mohanlal made an immediate midnight decision to hire private pump generators for ₹3 Lakhs to salvage silk bales. His junior nephews questioned the expense next morning.",
                    question = "(a) Did Mohanlal have the legal authority to incur this expense? (b) What merit of HUF is illustrated here?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "(a) Yes, the Karta possesses full managerial authority to enter contracts and preserve ancestral assets under 'Legal Necessity' (1.5 Marks)",
                        "(b) Merit: Effective Centralized Control and Prompt Emergency Decision-Making without needing partner consensus (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Centralized command eliminates decision deadlocks.",
                "Coparceners' personal assets are shielded while ancestral pride cements dedication."
            )
        ),

        // PAGE 28: Limitations of Joint Hindu Family Business
        StudyPage(
            pageNumber = 28,
            module = ModuleCategory.HUF,
            title = "Limitations: Capital Bottlenecks & Karta's Burden",
            subtitle = "When Ancient Lineage Collides with Modern Scale Requirements",
            topicDescriptionEnglish = "An HUF suffers from significant structural limitations: access to capital is confined strictly to ancestral property, the Karta bears crushing unlimited personal liability, younger coparceners suffer from lack of motivation, and family feuds can trigger destructive partition.",
            topicDescriptionHinglish = "HUF ki 4 badi kamzoriyan: (1) Limited Capital—sirf khandani property par depend karta hai, market se shares issue karke paisa nahi utha sakte; (2) Karta par Unlimited Liability ka pahad—sari galti ka bojh akele Karta par padta hai; (3) Young coparceners me demotivation—kaam koi kare, hissa sabko barabar milta hai; (4) Partition/Bantwara ka khatra.",
            macroMemoryTrick = "MACRO MNEMONIC: 'L-U-D-P' -> (L)imited Capital, (U)nlimited Karta Risk, (D)iscouraged Youth, (P)artition Vulnerability.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Kaikeyi's Palace Intrigue and the Partition of Ayodhya's Peace",
                loreOrContext = "Instigated by Manthara, Queen Kaikeyi invoked her two boons, fracturing the serene harmony of the royal palace, demanding Rama's exile and fracturing the undivided peace of the solar dynasty.",
                asciiFlowchart = """
[🐍 Poisonous Whispers of Manthara]
       │
       ▼ (Ego, Insecurity & Domestic Jealousy)
[⚡ Queen Kaikeyi Demands Two Disastrous Boons]
       │
       ▼ (Fracture of Domestic Bliss & Emperor's Heartbreak)
[💔 Divine Harmony Shattered & Ayodhya Plunged into Mourning]
                """.trimIndent(),
                lessonQuote = "When domestic jealousy infiltrates a house, even the golden palace of Ayodhya faces exile."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Limited Capital Resources (Ancestral Ceiling)",
                    category = "Limitation",
                    englishText = "The business is dependent entirely on the ancestral property and the family's creditworthiness. Outside public capital cannot be raised by issuing shares or debentures, constraining modernization.",
                    hinglishText = "Business me sirf wahi paisa lag sakta hai jo dada-pardada chhod kar gaye hain ya dukan ki savings hain. Bank se bada loan lena mushkil hota hai aur public se shares ke zariye croro rupaye raise nahi kar sakte.",
                    asciiFlowchart = """
[Ancestral Property Valuation] ──> [Ceiling on Borrowing] ──> [❌ Cannot Fund Multi-State Factory Expansion]
                    """.trimIndent(),
                    microMnemonic = "CASH-BOUND",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Vanara Force's Reliance on Natural Terrain",
                        loreOrContext = "Operating purely with forest resources, the Vanara legions had to cross the ocean using stones and trees, lacking sovereign mechanical warships.",
                        asciiFlowchart = "[🌲 Forest Materials Only] ──> [Labor-Intensive Bridge] ──> [Resource Scarcity Overcome by Sweat]",
                        lessonQuote = "Resource scarcity demands monumental personal toil to overcome."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Ancestral Brass Utensil HUF Outpaced by Venture-Backed Cookware Brands",
                        loreOrContext = "An HUF brass utensils brand in Moradabad could not compete with modern stainless-steel Teflon brands because they lacked the ₹10 Crores needed for automated robotic casting lines.",
                        asciiFlowchart = "[🥘 Ancestral Brass Foundry] ──> [❌ ₹10 Crore Robot Line Missing] ──> [📉 Market Share Lost]",
                        lessonQuote = "Heritage craft without capital depth gets swallowed by well-funded industrial competitors."
                    ),
                    caseQuestion = "Why is an HUF unable to aggressively expand into national semiconductor manufacturing?",
                    caseAnswer = "Because it is constrained by ancestral wealth and cannot raise equity capital from the capital markets."
                ),
                SubPointItem(
                    pointTitle = "Unlimited Liability of Karta & Demotivation of Coparceners",
                    category = "Limitation",
                    englishText = "The Karta shoulders unlimited risk alone. Simultaneously, hardworking younger coparceners feel demotivated because profits are shared equally by all family members irrespective of individual work contributions.",
                    hinglishText = "Karta par akele karze ka darr rehta hai. Aur doosri taraf, parivaar ke hardworking ladke sochte hain: 'Main dukan par 14 ghante kaam karu ya ghumne jau, hissa toh barabar hi milega!' Isse mehnati log demotivate ho jaate hain.",
                    asciiFlowchart = """
[Lazy Coparcener: 0 hrs work] ──┐
                                ├──> [Identical Share in Ancestral Profit!] ──> [📉 Hardworker Demotivated]
[Active Coparcener: 14 hrs work] ─┘
                    """.trimIndent(),
                    microMnemonic = "FREE-RIDER",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Demonic Court Where Sycophants Shared Royal Spoils",
                        loreOrContext = "In Ravana's palace, courtiers who did no genuine statecraft enjoyed royal nectar, while warriors on the frontline bore the brunt of war.",
                        asciiFlowchart = "[🍷 Idle Sycophants] ──> [Share Royal Luxuries] ──> [⚔️ Frontline Soldiers Suffer]",
                        lessonQuote = "When reward is decoupled from honest toil, internal decay is inevitable."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Cousin Quitting Ancestral Sweets Business to Join Fintech",
                        loreOrContext = "Aman worked 12-hour shifts managing 3 sweet shops, while his cousin slept till noon and drove the family BMW. Aman quit to join a startup with stock options.",
                        asciiFlowchart = "[💼 12-Hr Shift] vs [😴 Cousin Slacking] ──> [🚀 Aman Quits for Tech ESOPs]",
                        lessonQuote = "Equal distribution without meritocratic reward drives top talent out the door."
                    ),
                    caseQuestion = "Identify the free-rider dilemma inherent in the distribution of benefits in an HUF.",
                    caseAnswer = "Coparceners receive their ancestral share by virtue of birth, regardless of their actual industriousness or absence from business."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 28: The Family Feud and Partition of Gupta Sarees",
                    scenario = "Gupta Sarees operated as a thriving HUF in Surat for 45 years. After the demise of the elderly Karta, bitter quarrels erupted among the four brothers over store timings, personal expenditures, and modernization. Brother Alok filed for a partition in civil court.",
                    question = "Explain the impact of Alok's suit on the continuation of the HUF business.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the coparcener's right: Any adult coparcener has the legal right to demand partition of ancestral property (1 Mark)",
                        "Analyze operational impact: Filing for partition freezes banking operations, liquidates or fragments assets, and terminates the joint status (1 Mark)",
                        "Conclusion: The undivided HUF dissolves or splinters into independent individual family units (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Capital ceilings and unequal work motivation impede large-scale industrialization.",
                "A single coparcener demanding partition can fracture decades of integrated brand goodwill."
            )
        ),

        // PAGE 29: Partition & Reorganization of HUF
        StudyPage(
            pageNumber = 29,
            module = ModuleCategory.HUF,
            title = "Partition: Severance of Joint Status & Asset Division",
            subtitle = "From Undivided Kinship to Separate Individual Holdings",
            topicDescriptionEnglish = "Partition in an HUF signifies the severance of joint status and division of ancestral property. It can be a Total Partition (dividing all assets among all coparceners) or a Partial Partition (one branch exits while the rest remain joint).",
            topicDescriptionHinglish = "Bantwara (Partition) ka matlab hai parivaar ke joint status ka khatam hona aur khandani property ka aapas me hissa baantna. Partition do tarah ka hota hai: (1) Total Partition—sab kuch baant kar HUF poori tarah band ho jati hai; (2) Partial Partition—ek bhai apna hissa lekar alag ho jata hai, aur baaki parivaar joint rehta hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'P-A-R-T' -> (P)artition Demanded, (A)ssets Apportioned, (R)ights Severed, (T)otal or Partial.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Restoration of Ayodhya's Sovereignty and Rejection of Partition",
                loreOrContext = "When Lord Rama returned to Ayodhya, Prince Bharata gladly restored the unbroken crown to his eldest brother, refusing any partition of the sacred solar realm and preserving its celestial unity.",
                asciiFlowchart = """
[👑 Imperial Throne of Ayodhya]
       │
       ▼ (Bharata Refuses Any Splintering of Royal Soil)
[👡 Sacred Padukas Surrendered at Lord Rama's Lotus Feet]
       │
       ▼ (Total Undivided Sovereign Glory Restored)
[🌟 Re-establishment of the Unbroken Golden Age of Ramrajya]
                """.trimIndent(),
                lessonQuote = "The highest nobility finds joy in preserving the undivided integrity of the sacred house."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Total Partition vs. Partial Partition",
                    category = "Legal Mechanism",
                    englishText = "In a Total Partition, all coparceners divide the entire ancestral estate and the HUF ceases to exist. In a Partial Partition, a specific coparcener takes his share and severs ties, while the remaining members continue as an undivided HUF.",
                    hinglishText = "Total Partition me dukan aur zameen poori bikkar sab me hissa batega aur HUF ka PAN card surrender ho jayega. Partial Partition me sirf ek brother apna hissa lekar nikal jata hai, baaki log dukan sath chalate rehte hain.",
                    asciiFlowchart = """
[HUF Family Business] 
         │
         ├──> [TOTAL PARTITION: Entire Estate Liquidated & Split -> HUF Dissolved]
         └──> [PARTIAL PARTITION: 1 Branch Exits with Share -> Remaining Stay Joint]
                    """.trimIndent(),
                    microMnemonic = "SPLIT-OR-EXIT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Vibhishana's Departure from Lanka as a Righteous Severance",
                        loreOrContext = "Unable to sanction Ravana's unrighteousness, Vibhishana severed his connection with Lanka's court and sought righteous sanctuary with Lord Rama.",
                        asciiFlowchart = "[🚫 Unrighteous Assembly] ──> [Vibhishana Exits Court] ──> [Takes Sanctuary with Rama]",
                        lessonQuote = "Severance from unrighteousness is the first step toward enduring peace."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "One Brother Exiting Ancestral Jewellery HUF to Launch Lab-Grown Diamonds",
                        loreOrContext = "Kabir executed a partial partition from the family HUF, taking ₹50 Lakhs ancestral share to start an online lab-grown diamond brand, while his cousins continued the traditional gold showroom.",
                        asciiFlowchart = "[💎 Partial Partition Deed Signed] ──> [Kabir Launches Lab-Diamond Brand] ──> [Traditional Showroom Continues]",
                        lessonQuote = "Clean legal separation allows modern innovators to build without bitter family rancor."
                    ),
                    caseQuestion = "Can an income-tax recognized HUF execute a Partial Partition under the Income Tax Act, 1961?",
                    caseAnswer = "Under Section 171(9) of the Income Tax Act, partial partitions executed after 1978 are not recognized for tax purposes; only total partitions are recognized."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 29: The Partition Demand of Junior Coparcener Nakul",
                    scenario = "Nakul, an 18-year-old coparcener in a brass foundry HUF in Aligarh, issued a formal written notice to Karta Somnath demanding partition and his 1/4th share of ancestral properties. Somnath refused, arguing Nakul is too young and has contributed zero labor.",
                    question = "Can Somnath legally deny Nakul's partition demand? Explain Nakul's legal rights.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the coparcenary right: An adult coparcener has an absolute legal right by birth to demand partition (1 Mark)",
                        "Evaluate the labor contribution argument: Coparcenary rights arise by birth status, not by sweat equity (1 Mark)",
                        "Conclusion: Somnath cannot legally deny partition; Nakul is legally entitled to file a civil partition suit and receive his share (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Any adult coparcener can demand partition of ancestral property at any time.",
                "Total partition extinguishes the HUF entity, whereas partial partition permits remaining members to stay joint."
            )
        ),

        // PAGE 30: HUF Master Review & Comparison with Partnership
        StudyPage(
            pageNumber = 30,
            module = ModuleCategory.HUF,
            title = "HUF Master Review & Contrast with Partnership",
            subtitle = "Status vs. Contract: The Definitive High-Scoring CBSE Matrix",
            topicDescriptionEnglish = "A rigorous academic distinction contrasting Joint Hindu Family Business (governed by Hindu Law) with Partnership (governed by the Indian Partnership Act, 1932) across nine distinct commercial parameters.",
            topicDescriptionHinglish = "CBSE Board Exam ka 6-mark superstar question: 'Partnership aur Joint Hindu Family Business me kya farq hai?' Ye comparison matrix poore 6 marks pakke karega!",
            macroMemoryTrick = "MACRO MNEMONIC: 'B-A-S-I-S-9' -> (B)irth vs Agreement, (A)ct Governed, (S)tatus of Minor, (I)nterest by Birth, (S)uccession.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Imperial Durbar of Lord Rama: Kinship Harmonized with Sovereign Law",
                loreOrContext = "In the grand throne room of Ayodhya, Lord Rama presided over royal brothers (familial coparceners) alongside allied kings like Sugriva and Vibhishana (treaty partners), demonstrating the harmonious coexistence of blood duty and treaty pacts.",
                asciiFlowchart = """
             [👑 Supreme Imperial Durbar of Ayodhya]
                             │
       ┌─────────────────────┴─────────────────────┐
       ▼                                           ▼
[🩸 BLOOD LINEAGE: Rama & Brothers]        [🤝 TREATY ALLIES: Sugriva & Vibhishana]
       │ (HUF: Governed by Birthright)             │ (Partnership: Governed by Covenant)
       ▼                                           ▼
[Undivided Sacrificial Kinship]              [Mutual Strategic Sovereign Pact]
                """.trimIndent(),
                lessonQuote = "Righteous rulers harmonize the sanctuary of blood ties with the strategic power of covenant partnerships."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Distinction Matrix: Partnership vs. Joint Hindu Family Business",
                    category = "Master Distinction",
                    englishText = "Basis: 1. Governing Law (1932 Act vs Hindu Law); 2. Origin (Contract vs Birth); 3. Minor (Admitted to benefits only vs Member by birth); 4. Number of Members (2 to 50 vs Min 2, no max limit); 5. Liability (All unlimited vs Karta unlimited, coparceners limited); 6. Management (All partners vs Karta only); 7. Continuity (Fragile vs Perpetual).",
                    hinglishText = "1. Kanoon: Partnership Act 1932 vs Hindu Law. 2. Shuruat: Contract se vs Janam se. 3. Minor: Sirf munafey me vs Janam se coparcener. 4. Members: Min 2, Max 50 vs Min 2, Max NO LIMIT. 5. Liability: Sabki unlimited vs Sirf Karta ki unlimited. 6. Management: Sabhi partners vs Sirf Karta. 7. Continuity: Khatam ho sakti hai vs Karta ki maut se band nahi hoti.",
                    asciiFlowchart = """
[BASIS]          [PARTNERSHIP]                 [JOINT HINDU FAMILY (HUF)]
Governing Law:   Indian Partnership Act 1932   Hindu Succession Law
Mode of Origin:  Agreement / Contract          Status / Birth in family
Minor Member:    Only admitted to benefits     Member by birth automatically
Max Members:     Capped at 50                  No statutory maximum limit
Liability:       All partners Unlimited        Karta Unlimited | Coparceners Limited
Management:      All partners entitled         Exclusively vested in Karta
Continuity:      Dissolved on partner death    Continues; next eldest becomes Karta
                    """.trimIndent(),
                    microMnemonic = "PARTNER-VS-HUF",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Alliance with Sugriva vs. The Ayodhya Lineage",
                        loreOrContext = "Sugriva was an ally bound by fire treaty pacts (Partnership); Lakshmana was a brother bound by birthright and eternal bloodline (HUF).",
                        asciiFlowchart = "[Sugriva = Treaty Partner] vs [Lakshmana = Brother by Birth]",
                        lessonQuote = "Agreements unite minds; birth unites destinies."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Y Combinator Startup vs. 120-Year-Old Kashi Silk Saree Guild",
                        loreOrContext = "The tech startup operates under a dynamic 4-founder legal contract with ESOPs; the Kashi guild operates under ancestral coparcenary bloodlines with undivided ancestral looms.",
                        asciiFlowchart = "[YC SaaS Startup (Contract/Cap-table)] vs [Kashi Silk Guild (Lineage/Ancestral HUF)]",
                        lessonQuote = "Both forms build wealth; one scales through code, the other endures through blood."
                    ),
                    caseQuestion = "State any two grounds on which the management of an HUF differs from that of a Partnership firm.",
                    caseAnswer = "In an HUF, management is vested exclusively in the Karta, whereas in a partnership, all partners have an inherent right to participate in daily management."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 30: Comprehensive Exam Evaluator - HUF vs Partnership",
                    scenario = "Mr. Singhal runs a brassware export business with his two sons. He wants to know whether to register as a Partnership firm or continue as an HUF. His key priorities are: (1) Protecting his sons' personal properties from business losses; (2) Ensuring business does not shut down if he passes away.",
                    question = "Advise Mr. Singhal which form best satisfies both priorities. Provide clear legal justification.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "Analyze Priority 1 (Protect sons' assets): In an HUF, sons as coparceners enjoy limited liability, shielding their private properties (1.5 Marks)",
                        "Analyze Priority 2 (Continuity on death): An HUF possesses perpetual succession; on Mr. Singhal's death, the eldest son automatically becomes Karta without firm dissolution (1.5 Marks)",
                        "Conclusion: Advise him to operate as an HUF, as a Partnership would expose sons to unlimited joint liability and dissolve upon death without special deeds (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "HUF is rooted in status, bloodline, and ancestral property, offering natural succession.",
                "Partnership is rooted in voluntary contract, offering broader flexibility across unrelated partners."
            )
        )
    )
}
