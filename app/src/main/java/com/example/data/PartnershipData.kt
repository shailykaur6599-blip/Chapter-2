package com.example.data

import com.example.model.*

object PartnershipData {
    val pages = listOf(
        // PAGE 09: Partnership - Genesis & Statutory Definition
        StudyPage(
            pageNumber = 9,
            module = ModuleCategory.PARTNERSHIP,
            title = "Partnership: Genesis, Mutual Trust & Legal Definition",
            subtitle = "Indian Partnership Act, 1932 (Section 4)",
            topicDescriptionEnglish = "Section 4 of the Indian Partnership Act, 1932 defines Partnership as: 'The relation between persons who have agreed to share the profits of a business carried on by all or any of them acting for all.'",
            topicDescriptionHinglish = "Indian Partnership Act, 1932 ke Section 4 ke hisaab se: Jab do ya do se zyada log aapas me milkar kisi legal business ke munafey (profits) ko aapas me baantne ka samjhauta karte hain, aur wo business ya to sab milkar chalate hain ya unme se koi ek sabki taraf se chalata hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'P-A-R-T-N-E-R' -> (P)ersons Two or More, (A)greement Mandatory, (R)egistration Optional, (T)rade/Business Legal, (N)o Company Veil, (E)veryone Agent & Principal, (R)isk & Profit Shared.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Alliance of Lord Rama and King Sugriva (Agni-Sakshi)",
                loreOrContext = "Before the sacred sacrificial fire, Lord Rama and Sugriva formed a sacred partnership. Lord Rama pledged to eliminate the oppressive tyrant Bali, and Sugriva pledged the entire Vanara army to search for and rescue Sita Mata.",
                asciiFlowchart = """
[🏹 Lord Rama (Sovereign Ally)] <====== (Sacred Fire Pact) ======> [👑 Sugriva (Vanara Sovereign)]
              │                                                             │
              ├─> Pledges Divine Might & Just Rule                         ├─> Pledges Millions of Scout Vanaras
              ▼                                                             ▼
[🎯 Overcoming Bali & Restoring Kishkindha] <─── Mutual Goal ───> [🌊 Locating Sita Mata in Lanka]
                """.trimIndent(),
                lessonQuote = "A righteous partnership unites complementary strengths under an inviolable bond of mutual honor."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Two or More Persons (Membership Ceilings)",
                    category = "Statutory Rule",
                    englishText = "There must be at least 2 persons to form a partnership. Under Section 464 of the Companies Act, 2013 and Rule 10 of Companies (Miscellaneous) Rules 2014, the maximum number of partners is 50.",
                    hinglishText = "Partnership banane ke liye kam se kam 2 log chahiye. Aur maximum limit Companies Act 2013 ke rules ke according 50 partners ki hoti hai. 50 se zyada hote hi wo illegal association ban jayegi!",
                    asciiFlowchart = """
[Min: 2 Individuals] ──> [⚖️ Legal Partnership Zone] ──> [Max: 50 Partners (Rule 10)]
                    """.trimIndent(),
                    microMnemonic = "LIMIT: 2 TO 50",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Rama and Lakshmana's Indivisible Brotherly Bond",
                        loreOrContext = "From Ayodhya to Dandakaranya, Rama and Lakshmana operated as an inseparable pair, combining supreme discernment with boundless martial execution.",
                        asciiFlowchart = "[🏹 Lord Rama] + [🏹 Lakshmana] ──> [🛡️ Complete Cosmic Security]",
                        lessonQuote = "Two harmonious minds can vanquish infinite obstacles."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Co-Founders of an AI Video Editing Tool",
                        loreOrContext = "Rohan (AI researcher) and Tanya (growth marketer) joined hands with a 50-50 equity handshake to build 'CutGenie'.",
                        asciiFlowchart = "[🤖 Rohan: Tech] + [📈 Tanya: Sales] ──> [🚀 Fast Product-Market Fit]",
                        lessonQuote = "Solo founders run fast, but paired co-founders run far."
                    ),
                    caseQuestion = "52 individuals decide to form an ordinary partnership firm to operate an import-export agency. Is this firm legally valid under Indian law?",
                    caseAnswer = "No. The maximum limit is 50 partners; having 52 makes it an illegal association under Companies Act 2013."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 9: The Charity Clinic Dispute",
                    scenario = "Dr. Ajay and Dr. Bharat jointly bought an MRI machine to treat impoverished patients free of cost in their rural village. They share electricity expenses equally but charge zero fees from patients.",
                    question = "Is this arrangement a 'Partnership' under the Indian Partnership Act, 1932? Justify with reference to Section 4.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the statutory definition of Partnership under Section 4 (1 Mark)",
                        "Analyze the essential element: 'Carrying on of a Business with Profit Motive' (1 Mark)",
                        "Conclusion: No, this is a charitable joint venture/co-ownership, not a commercial partnership, because there is no intention to earn and share commercial profit (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Partnership requires minimum 2 and maximum 50 partners.",
                "Business must be lawful with the motive of earning and distributing profit."
            )
        ),

        // PAGE 10: Features - Agreement & Mutual Agency
        StudyPage(
            pageNumber = 10,
            module = ModuleCategory.PARTNERSHIP,
            title = "Agreement & Mutual Agency: The True Cardinal Test",
            subtitle = "Why Partnership is Born from Contract, Not from Status",
            topicDescriptionEnglish = "Partnership arises from contract (agreement), never from birth or operation of law (unlike HUF). Mutual Agency is the true legal litmus test of partnership: every partner is both an agent and a principal.",
            topicDescriptionHinglish = "Partnership janam se nahi banti, balki 'Agreement' (samjhoute) se banti hai. Aur sabse important concept hai 'Mutual Agency'—iska matlab har partner firm ka agent bhi hai (apne actions se doosro ko baandhta hai) aur principal bhi hai (doosre partners ke acts se khud bandhta hai)!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-A-R-D-I-N-A-L' -> (C)ontractual Origin, (A)gent & Principal, (R)eciprocal Duty, (D)eeds Signed, (I)mplied Authority, (N)ot by Birth, (A)ll for One, (L)egal Nexus.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Angada's Sovereign Mission to Ravana's Royal Court",
                loreOrContext = "When Angada entered Ravana's court as an envoy, he was an Agent representing Lord Rama (Principal). Whatever terms Angada laid down bound the entire alliance under sovereign international diplomacy.",
                asciiFlowchart = """
[🏹 Lord Rama (Principal)] 
       │ (Grants Envoy Mandate)
       ▼
[👑 Angada (Agent in Ravana's Assembly)] 
       │ (Actions & Terms Legally Bind the Sovereign Alliance)
       ▼
[⚖️ Mutual Agency in Sovereign Statecraft]
                """.trimIndent(),
                lessonQuote = "An accredited envoy binds the honor of his sovereign with every word."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Agreement (Voluntary Contractual Nexus)",
                    category = "Feature",
                    englishText = "Partnership is the outcome of an agreement between two or more persons. It can be oral or written (Partnership Deed), but can never arise automatically by status or hereditary birth.",
                    hinglishText = "Partnership hamesha contract se shuru hoti hai. Chahe aapas me bolkar tay karo (oral) ya stamp paper par likhkar (written). Kisi ke ghar paida hone se koi partner nahi banta.",
                    asciiFlowchart = """
[🤝 Mutual Assent] ──> [📜 Written/Oral Agreement] ──> [🚀 Legal Partnership Established]
                    """.trimIndent(),
                    microMnemonic = "CONTRACT-BORN",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Vibhishana's Formal Asylum Pact (Sharanagati)",
                        loreOrContext = "Vibhishana did not become Lord Rama's ally merely by royal lineage; he formally sought refuge at Lord Rama's feet, forming an inviolable covenant of mutual righteousness.",
                        asciiFlowchart = "[🛡️ Vibhishana Seeks Asylum] ──> [🤝 Lord Rama's Pledge] ──> [👑 King of Lanka Crowned]",
                        lessonQuote = "Commitment cemented by clear voluntary covenants outlasts all dynastic ties."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Founders' Agreement for an EdTech SaaS Venture",
                        loreOrContext = "Before coding their app, Ankur and Priya signed a clear Founders' Agreement specifying equity, vesting schedule, and IP ownership.",
                        asciiFlowchart = "[📝 Founders' Accord] ──> [🔒 Vested Equity Terms] ──> [🛡️ Zero Future Legal Disputes]",
                        lessonQuote = "Clear written contracts are the greatest shields of lifelong friendships."
                    ),
                    caseQuestion = "Three brothers inherit a commercial textile mill upon their father's death. Do they automatically become legal partners?",
                    caseAnswer = "No. Inheritance creates co-ownership or an HUF, not a partnership. A partnership requires a voluntary contractual agreement."
                ),
                SubPointItem(
                    pointTitle = "Mutual Agency (The True Test of Partnership)",
                    category = "Feature",
                    englishText = "Every partner is simultaneously an agent and a principal. As an agent, he binds the other partners by his acts in the ordinary course of business. As a principal, he is bound by the acts of any other partner.",
                    hinglishText = "Mutual Agency partnership ka dil hai! Agar Partner 'A' ne shop ke naam par raw material udhaar liya, to us bill ko chukane ke liye Partner 'B' aur 'C' bhi barabar zimmedar hain, chahe wo shop par maujood na rahe ho.",
                    asciiFlowchart = """
             ┌─── (Binds others as AGENT) ───┐
             ▼                               │
[Partner A in Market]                 [Partner B & Partner C]
             ▲                               │
             └── (Bound by others as PRINCIPAL) ┘
                    """.trimIndent(),
                    microMnemonic = "AGENT+PRINCIPAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Hanuman Ji's Promise to Sita Mata on Behalf of Rama",
                        loreOrContext = "When Hanuman Ji showed the royal signet ring to Sita Mata in Ashoka Vatika, his promise of imminent rescue legally and morally bound Lord Rama and the whole allied army.",
                        asciiFlowchart = "[💍 Rama's Ring Displayed] ──> [🐒 Hanuman Promises Rescue] ──> [🏹 Lord Rama Bound to Fulfill]",
                        lessonQuote = "The agent's deed is the principal's solemn debt."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Partner Signs ₹5 Lakh Influencer Contract for Startup",
                        loreOrContext = "Karan, a partner in a sneaker brand, signed an agency contract for ₹5 Lakhs. Even though his partner Sid was traveling, Sid's share of company funds was legally bound by Karan's signature.",
                        asciiFlowchart = "[✍️ Karan Signs Deal] ──> [⚖️ Implied Authority] ──> [💸 Sid & Company Both Bound to Pay]",
                        lessonQuote = "Pick partners you would trust with your own signature."
                    ),
                    caseQuestion = "In an agency test of partnership, why is profit-sharing alone called 'prima facie' evidence rather than 'conclusive' evidence?",
                    caseAnswer = "Because moneylenders, widows, or employees may share profits, but true partnership exists ONLY when mutual agency is present."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 10: The Rogue Purchase of Raw Silk",
                    scenario = "Kavita, Sunita, and Deepa are partners in 'Elegance Fabrics'. Deepa, without informing others, ordered 1,000 meters of raw silk on the firm's letterhead from a supplier. The market crashed, and the firm suffered a loss of ₹4 Lakhs. Kavita and Sunita refused to pay, arguing Deepa acted without their permission.",
                    question = "Can the supplier recover the money from Kavita and Sunita? Explain the legal doctrine.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the doctrine of Mutual Agency in Partnership (1 Mark)",
                        "Explain that every partner has 'Implied Authority' to bind the firm by acts done in the ordinary course of business (1 Mark)",
                        "Conclusion: Yes, the supplier can legally recover the dues from Kavita, Sunita, or the firm's assets jointly (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Mutual agency distinguishes partnership from mere co-ownership or profit-sharing.",
                "Every partner's signature in ordinary commercial transactions binds the entire partnership."
            )
        ),

        // PAGE 11: Features - Sharing of Profit & Unlimited Liability
        StudyPage(
            pageNumber = 11,
            module = ModuleCategory.PARTNERSHIP,
            title = "Profit Sharing & Joint Unlimited Liability",
            subtitle = "Sharing the Bounty & Joint-and-Several Exposure",
            topicDescriptionEnglish = "Partners agree to distribute profits and losses according to their agreed contractual ratio. Concurrently, all partners carry joint and several unlimited liability for every obligation incurred by the firm.",
            topicDescriptionHinglish = "Munafa tay shuda ratio (jaise 2:1 ya 50:50) me baanta jata hai. Lekin liability 'Joint & Several' hoti hai—iska matlab agar business me karza hua, to sabhi partners milkar bhi chukayenge, aur agar baki partners bhag gaye to akela amir partner apni personal property se poora karza chukane ke liye legally majboor kiya ja sakta hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'J-A-S-P' -> (J)oint Liability, (A)ll Partners Bound, (S)everal Exposure, (P)rofit Apportioned.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Division of Divine Payasam Among the Three Queens",
                loreOrContext = "From the Putrakameshti Yajna, Emperor Dasharatha divided the sacred nectar pot among Queens Kausalya, Kaikeyi, and Sumitra according to divine decree, demonstrating harmonious equitable sharing.",
                asciiFlowchart = """
[🏆 Sacred Divine Payasam]
       │
       ├──> Queen Kausalya (Half Share)
       ├──> Queen Kaikeyi (Equitable Share)
       └──> Queen Sumitra (Double Allotment for Twin Warriors)
                """.trimIndent(),
                lessonQuote = "Equitable distribution of sacred fruits cements eternal familial harmony."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Sharing of Profit (And Losses)",
                    category = "Feature",
                    englishText = "An agreement to share profits is an essential requisite. While partners can agree that a minor partner will share ONLY profits, an ordinary adult partner cannot contract out of all liability toward third parties.",
                    hinglishText = "Business ka main maqsad profit kamana aur use aapas me baantna hota hai. Agar Deed silent hai to Indian Partnership Act ke mutabiq profit aur loss barabar (1:1) batega.",
                    asciiFlowchart = """
[Net Business Surplus] ──> [Partnership Deed Ratio (e.g., 3:2:1)] ──> [Individual Partner Capital Accounts]
                    """.trimIndent(),
                    microMnemonic = "SPLIT-GAIN",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Restoration of Kishkindha's Royal Spoils",
                        loreOrContext = "Upon Bali's demise, Sugriva shared the administrative honors and treasury responsibly with Angada, maintaining peace across all monkey clans.",
                        asciiFlowchart = "[👑 Royal Treasury Restored] ──> [🤝 Sugriva & Angada Allotment] ──> [🐒 Peaceful Kishkindha]",
                        lessonQuote = "Righteous leadership shares prosperity transparently."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Podcast Studio 60-40 Ad Revenue Share Model",
                        loreOrContext = "Zaid (host) and Aman (sound engineer) agreed on a 60-40 YouTube and Spotify ad sponsorship split, automated via Stripe split-pay.",
                        asciiFlowchart = "[🎙️ Brand Sponsorships: ₹10L] ──> [Zaid: ₹6L (60%)] + [Aman: ₹4L (40%)]",
                        lessonQuote = "Fair incentives keep creative partnerships thriving for years."
                    ),
                    caseQuestion = "If the Partnership Deed does not mention the profit-sharing ratio, how will the year-end net profit of ₹90,000 be divided among three partners?",
                    caseAnswer = "Equally: ₹30,000 each, as per Section 13(b) of the Indian Partnership Act, 1932."
                ),
                SubPointItem(
                    pointTitle = "Joint and Several Liability (The Creditor's Trap)",
                    category = "Feature",
                    englishText = "The liability of partners is unlimited. Moreover, liability is joint and several: a creditor can sue all partners together (jointly) or single out the wealthiest partner alone (severally) for the entire recovery.",
                    hinglishText = "Agar partnership firm par 20 lakh ka karza hai, to bank sabhi partners par case kar sakta hai (joint). Aur agar 2 partner bhikhari nikal gaye, to teesre amir partner se akele poora 20 lakh uske ghar-car bechkar vasool kar sakta hai (several)!",
                    asciiFlowchart = """
[Creditor Claim: ₹30 Lakhs] 
           │
           ├──> Can sue Firm Assets (₹10L)
           └──> Can seize Partner X's Personal Bungalow for remaining ₹20L!
                    """.trimIndent(),
                    microMnemonic = "JOINT-SEVERAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Joint Vanara Search Oath for Sita Mata",
                        loreOrContext = "When Angada's southern search party faced thirst in the enchanted cave, the entire group accepted collective responsibility to succeed or face fasting unto death together.",
                        asciiFlowchart = "[🧭 Search Party Oath] ──> [🛡️ Collective Resolve] ──> [🌊 Ocean Reached United]",
                        lessonQuote = "In true pacts, adversity is borne shoulder to shoulder without finger-pointing."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Failed Cloud Gaming Startup Liability Hunt",
                        loreOrContext = "Three college buddies ran a gaming lounge with a ₹12 Lakh server lease. Two friends had zero bank balance; the leasing firm froze the third partner's ancestral bank account.",
                        asciiFlowchart = "[📉 Venture Shuts Down] ──> [💸 ₹12L Debt] ──> [🏦 Solitary Wealthy Partner Frozen]",
                        lessonQuote = "Know your co-founder's integrity before co-signing joint commercial debt."
                    ),
                    caseQuestion = "Explain the term 'Several Liability' in the context of a general partnership firm.",
                    caseAnswer = "It means each partner is individually responsible for fulfilling the entirety of the firm's financial obligations if other partners default."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 11: The Insolvent Partner Escape",
                    scenario = "A partnership firm consisting of Aman, Bobby, and Chetan suffered a catastrophic fire, leaving commercial debts of ₹15 Lakhs. Firm assets fetched ₹3 Lakhs. Aman was declared legally insolvent with zero personal assets, and Bobby vanished abroad.",
                    question = "How much can the creditors legally recover from Chetan, who possesses personal assets worth ₹50 Lakhs?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Calculate net unpaid firm debt: ₹15 Lakhs - ₹3 Lakhs = ₹12 Lakhs (1 Mark)",
                        "State the doctrine of 'Joint and Several Liability' of partners (1 Mark)",
                        "Conclusion: Creditors can legally recover the entire remaining ₹12 Lakhs from Chetan's personal assets. Chetan may later claim contribution from Bobby if traced (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Profits are shared in the contractual ratio or equally if the deed is silent.",
                "Joint and several liability exposes individual personal assets to the full extent of firm liabilities."
            )
        ),

        // PAGE 12: Merits of Partnership
        StudyPage(
            pageNumber = 12,
            module = ModuleCategory.PARTNERSHIP,
            title = "Merits: Synergy of Resources, Wisdom & Shared Burden",
            subtitle = "Why Two Heads and Multiple Pockets Outperform One",
            topicDescriptionEnglish = "Partnership expands the capital base, incorporates balanced multi-disciplinary decision-making, diffuses personal risk across multiple shoulders, and preserves commercial secrecy.",
            topicDescriptionHinglish = "Partnership ke 5 zabardast merits: (1) Formation aasaan hai, (2) Balanced Decisions—alag alag skills mil jati hain, (3) More Capital—zyada log zyada paisa layenge, (4) Risk Sharing—nuksan akele nahi jhelna padta, aur (5) Secrecy—accounts public ko nahi dikhane padte.",
            macroMemoryTrick = "MACRO MNEMONIC: 'F-A-R-M-S' -> (F)ormation Ease, (A)bility Balanced, (R)isk Shared, (M)ore Funds, (S)ecrecy Maintained.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Four Sons of Dasharatha Securing the Four Quarters of the Realm",
                loreOrContext = "Lord Rama, Bharata, Lakshmana, and Shatrughna possessed distinct virtues: Rama exemplified supreme Dharma, Lakshmana steadfast valor, Bharata righteous administration, and Shatrughna defense against internal subversion.",
                asciiFlowchart = """
             [👑 Ayodhya Sovereign Enterprise]
                            │
       ┌────────────┬───────┴────────┬────────────┐
       ▼            ▼                ▼            ▼
 [🏹 Rama: Dharma] [👡 Bharata: Admin] [🛡️ Lakshmana: Valor] [⚔️ Shatrughna: Internal Defense]
                            │
                            ▼
              [🌟 Unshakable Golden Age of Ramrajya]
                """.trimIndent(),
                lessonQuote = "When complementary virtues unite under a righteous charter, prosperity becomes impregnable."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Ease of Formation and Closure",
                    category = "Merit",
                    englishText = "A partnership can be created easily through a simple agreement between two or more competent individuals. Registration under the Indian Partnership Act, 1932 is strictly optional.",
                    hinglishText = "Partnership shuru karna bahut aasan hai. Sirf ek samjhauta (oral ya written deed) karo aur kaam shuru. Registration karwana bhi mandatory nahi hai, optional hai.",
                    asciiFlowchart = """
[Two Friends] ──> [Draft 2-page Deed] ──> [🚀 Immediate Commercial Operation]
                    """.trimIndent(),
                    microMnemonic = "QUICK-FORM",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Vanara Chiefs Conclave at Matanga Hill",
                        loreOrContext = "Sugriva convened Jambavan, Nala, Nila, and Angada instantly on the mountain ridge to form the council for the southern expedition without parliamentary delay.",
                        asciiFlowchart = "[⛰️ Mountain Ridge] ──> [🤝 Immediate Vanara Alliance] ──> [🏹 Mission Launched]",
                        lessonQuote = "True alliances form swiftly where noble intent converges."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Two Developers Launching a Notion Workspace Agency",
                        loreOrContext = "Aarav and Neil opened a joint bank account, drafted a 1-page partnership deed on legal paper, and were live with their first client in 48 hours.",
                        asciiFlowchart = "[💻 Notion Templates] ──> [📄 Simple Deed] ──> [💳 First ₹2L Client Billed]",
                        lessonQuote = "Move fast and build traction; legal friction should not delay execution."
                    ),
                    caseQuestion = "Is it mandatory to register a partnership firm with the Registrar of Firms before commencing business?",
                    caseAnswer = "No. Registration is optional under the Indian Partnership Act, 1932."
                ),
                SubPointItem(
                    pointTitle = "Balanced Decision Making (Multi-Skill Synergy)",
                    category = "Merit",
                    englishText = "Partners bring diverse skills—one may excel in marketing, another in manufacturing, and a third in taxation. Division of labor fosters superior, balanced strategic deliberations.",
                    hinglishText = "Sole proprietor akele sab nahi sambhal sakta tha, lekin partnership me kaam divide ho jata hai: ek partner sales sambhalega, doosra accounts aur teesra factory! Isse decisions bahut mature aur balanced hote hain.",
                    asciiFlowchart = """
[Partner A: Sales Wiz] + [Partner B: Tech Expert] + [Partner C: Finance Pro] ──> [🧠 Flawless Balanced Decisions]
                    """.trimIndent(),
                    microMnemonic = "MULTI-BRAIN",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Jambavan Awakening Hanuman Ji's Latent Powers",
                        loreOrContext = "When the ocean crossing seemed impossible, the elder strategist Jambavan reminded Hanuman Ji of his divine strength, perfectly combining strategic wisdom with divine kinetic power.",
                        asciiFlowchart = "[🧘 Jambavan's Wisdom] ──> [⚡ Awakens Hanuman's Might] ──> [🌊 Ocean Crossed]",
                        lessonQuote = "The counsel of a wise elder unlocks the dormant prowess of the warrior."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "FinTech App Trio: Dev, Designer & Compliance Lawyer",
                        loreOrContext = "A cybersecurity coder, a Figma UI designer, and a chartered accountant partnered together to create a seamless, 100% RBI-compliant payment app.",
                        asciiFlowchart = "[🎨 UI/UX] + [💻 Code] + [⚖️ RBI Compliance] ──> [🏆 Top 10 FinTech Launch]",
                        lessonQuote = "Interdisciplinary teams solve problems single-discipline founders never notice."
                    ),
                    caseQuestion = "How does partnership overcome the managerial deficiency of sole proprietorship?",
                    caseAnswer = "By bringing together partners with complementary skillsets, enabling specialization and balanced decisions."
                ),
                SubPointItem(
                    pointTitle = "Sharing of Risks (Diffused Vulnerability)",
                    category = "Merit",
                    englishText = "Commercial losses are distributed across all partners in the agreed profit/loss ratio. The anxiety of total ruin does not crush any solitary founder.",
                    hinglishText = "Agar business me 10 lakh ka nuksan ho gaya aur 5 partners hain, to sab par 2-2 lakh ka bojh padega. Kisi ek akeli family ka diwala nahi nikalta.",
                    asciiFlowchart = """
[🔥 Market Loss: ₹12 Lakhs] ──> [Divides into 4 Partners x ₹3 Lakhs Each] ──> [🛡️ No Single Founder Crushed]
                    """.trimIndent(),
                    microMnemonic = "DIFFUSE-RISK",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Joint Vanara Retaliation Against Indrajit's Illusions",
                        loreOrContext = "When Indrajit deployed sorcery and darkness, Angada, Sugriva, and Hanuman covered different sectors of the army, preventing collective panic through distributed courage.",
                        asciiFlowchart = "[🌑 Indrajit's Illusions] ──> [🛡️ Distributed Defense by Vanara Chiefs] ──> [☀️ Battle Maintained]",
                        lessonQuote = "Shared resilience transforms crushing storms into enduring armor."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Three Chefs Opening an Experimental Fusion Bistro",
                        loreOrContext = "When unseasonal rains slashed footfalls during their first 2 months, each of the three chef partners absorbed ₹80,000 of fixed overheads without folding.",
                        asciiFlowchart = "[📉 Slow Monsoon Footfall] ──> [Split Overheads Across 3 Founders] ──> [🌱 Bistro Survived to Profit]",
                        lessonQuote = "A heavy boulder that breaks one spine is easily carried by three sets of shoulders."
                    ),
                    caseQuestion = "Why are partners typically willing to take bolder innovation risks compared to a sole proprietor?",
                    caseAnswer = "Because downside losses are shared among multiple partners rather than falling entirely on one individual."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 12: Transition from Sharma Sole Trader to Triad Partners",
                    scenario = "Sunil operated an automobile spare-parts shop. He had immense sales acumen but was constantly audited due to poor inventory records. He invited his brother-in-law (a certified cost accountant) and a mechanical engineer to join him as equal partners.",
                    question = "Explain two distinct merits of partnership realized by Sunil's enterprise after this transition.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Merit 1: Balanced Decision Making & Specialization of Labor (Sales + Accounts + Engineering) (1.5 Marks)",
                        "Identify Merit 2: Larger Financial Base / Sharing of Business Risk (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Synergy of skills enhances strategic robustness and minimizes operational blind spots.",
                "Risk dispersal protects individual families from sudden insolvency."
            )
        ),

        // PAGE 13: Limitations of Partnership
        StudyPage(
            pageNumber = 13,
            module = ModuleCategory.PARTNERSHIP,
            title = "Limitations: Infinite Liability, Ego Conflicts & Fragility",
            subtitle = "The Inevitable Friction of Co-Ownership",
            topicDescriptionEnglish = "Partnership exhibits severe vulnerabilities: unlimited joint and several liability, capital bottlenecks constrained by 50 partners, destructive ego friction, lack of continuity, and lack of public confidence due to non-disclosure.",
            topicDescriptionHinglish = "Partnership ki 5 sabse badi kamzoriyan: (1) Unlimited Liability—saare partners personal property se bandhe hain, (2) Limited Capital—max 50 log hi jud sakte hain, (3) Conflicts/Jhagre—partners ke beech ego clash aur distrust sabse bada killer hai, (4) Lack of Continuity—kisi ek ki maut ya pagalpan se firm dissolve ho sakti hai, aur (5) Public Trust ki kami.",
            macroMemoryTrick = "MACRO MNEMONIC: 'U-C-L-I-P' -> (U)nlimited Liability, (C)onflict Vulnerability, (L)ack of Continuity, (I)nvestment Capped, (P)ublic Trust Low.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Tragic Brotherly Conflict Between Bali and Sugriva",
                loreOrContext = "Bali and Sugriva initially ruled Kishkindha in fraternal affection. A tragic communication breakdown at Mayavi's cave led to mistrust, bitter hostility, and mutual warfare that splintered the royal house.",
                asciiFlowchart = """
[👑 Fraternal Alliance: Bali & Sugriva]
       │ (Communication Breakdown at Mayavi's Cave)
       ▼
[⚡ Suspicion, Accusation & Ego Clash]
       │ (Total Rupture of Mutual Trust)
       ▼
[💥 Kingdom Splintered & Inevitable Fall of Bali]
                """.trimIndent(),
                lessonQuote = "When suspicion infiltrates an alliance, even cosmic brotherhood dissolves into catastrophe."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Possibility of Conflicts (Ego and Vision Clashes)",
                    category = "Limitation",
                    englishText = "Shared authority fosters friction. An obstinate partner can paralyze daily operations through vetoes, disagreements over reinvestment of profits, or interpersonal jealousy.",
                    hinglishText = "Jaha 4 bartan honge, waha aawaz toh aayegi hi! Agar do partners me ego clash ho gaya ya ek ne mehnat karna band kar diya, to dukan me ladai-jhagre shuru ho jate hain aur business band ho jata hai.",
                    asciiFlowchart = """
[Partner 1: Aggressive Growth] <─── EGO CLASH ───> [Partner 2: Conservative Caution]
                     │
                     ▼
           [🛑 Paralyzed Decision Making & Impasse]
                    """.trimIndent(),
                    microMnemonic = "EGO-CLASH",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Split in Ravana's Council of Ministers",
                        loreOrContext = "In Lanka's war council, Vibhishana advocated righteousness while Indrajit and Prahasta indulged in sycophantic aggression, creating a fatal internal fracture.",
                        asciiFlowchart = "[⚖️ Vibhishana: Dharma] vs [⚔️ Indrajit: Blind Ego] ──> [💔 Rupture of Lanka's Unity]",
                        lessonQuote = "An enterprise divided against itself from within cannot withstand external adversity."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Viral D2C Clothing Brand Torn Apart by Influencer Marketing Spends",
                        loreOrContext = "Rishi wanted to spend ₹10 Lakhs on Bollywood celebrity placements; his partner Kunal wanted to invest in fabric durability. They stopped talking and shut the brand.",
                        asciiFlowchart = "[🎥 Celebrity Marketing] vs [🧵 Fabric R&D] ──> [❌ Partnership Dissolved in 6 Mos]",
                        lessonQuote = "Misaligned founder values will sink a startup faster than competitor attacks."
                    ),
                    caseQuestion = "Why does the doctrine of Mutual Agency amplify the risk of conflicts in partnership?",
                    caseAnswer = "Because any foolish or dishonest decision taken by one partner legally binds all other partners to financial liability."
                ),
                SubPointItem(
                    pointTitle = "Lack of Continuity",
                    category = "Limitation",
                    englishText = "Under Section 35 of the Indian Partnership Act, 1932, a partnership firm stands dissolved upon the death, insolvency, or insanity of any partner, unless there is a contract to the contrary.",
                    hinglishText = "Agar 3 partners hain aur unme se ek partner ki death ho jaye ya wo pagal/insolvent ho jaye, to legally partnership turant khatam ho jati hai (jab tak deed me pehle se baki 2 ke continue karne ka clause na ho).",
                    asciiFlowchart = """
[3-Partner Firm] ──> [💀 Sudden Demise of Partner A] ──> [🛑 Legal Dissolution of Firm]
                    """.trimIndent(),
                    microMnemonic = "FRAGILE-LIFE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Dissolution of Kumbhakarna's Military Support",
                        loreOrContext = "Kumbhakarna warned Ravana against battle, but entered combat out of familial loyalty. Once Kumbhakarna fell, Lanka's military frontline collapsed irrecoverably.",
                        asciiFlowchart = "[🛡️ Kumbhakarna Falls] ──> [📉 Total Loss of Titan Guard] ──> [🏰 Lanka Left Defenseless]",
                        lessonQuote = "Alliances reliant on a few mighty pillars crumble when a key pillar is severed."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Two-Doctor Diagnostic Clinic Paralyzed by Partner's Migration",
                        loreOrContext = "Dr. Sameer and Dr. Preeti ran an ultrasound lab. When Dr. Preeti secured a fellowship in London, the partnership firm was dissolved and the lab assets auctioned.",
                        asciiFlowchart = "[🏥 2-Doctor Clinic] ──> [✈️ 1 Doctor Migrates] ──> [🔨 Clinic Equipment Auctioned]",
                        lessonQuote = "Without institutional continuity, human mobility dissolves collaborative ventures."
                    ),
                    caseQuestion = "Can the surviving partners continue the business after the death of a partner in a 2-person firm?",
                    caseAnswer = "No. A partnership requires a minimum of two persons; upon one's death, the firm automatically ceases to exist."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 13: The Disastrous Speculation of Partner Rajat",
                    scenario = "Rajat, Mohit, and Sahil run a wholesale grain trading partnership. Rajat, lured by speculative commodity futures, committed the firm to a ₹25 Lakhs forward wheat contract without consulting Mohit or Sahil. A global price crash left the firm facing a ₹15 Lakhs shortfall.",
                    question = "(a) Are Mohit and Sahil legally bound to pay for Rajat's speculative commitment? (b) Which feature and limitation of partnership are illustrated here?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "(a) Yes, Mohit and Sahil are legally bound due to Mutual Agency and Implied Authority in trade (1 Mark)",
                        "(b) Feature: Mutual Agency (every partner binds the firm) (1 Mark)",
                        "(c) Limitation: Unlimited Liability & Danger of One Partner's Indiscretion (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Internal disharmony and lack of perpetual succession make partnerships inherently precarious.",
                "Unlimited joint liability turns every partner into a hostage to the other partners' judgment."
            )
        ),

        // PAGE 14: Types of Partners - Active & Sleeping Partners
        StudyPage(
            pageNumber = 14,
            module = ModuleCategory.PARTNERSHIP,
            title = "Types of Partners: Active (Ostensible) vs. Sleeping (Dormant)",
            subtitle = "The Operational Dynamo vs. The Silent Capital Provider",
            topicDescriptionEnglish = "Partners are classified based on four parameters: Capital contribution, Management participation, Profit/Loss sharing, and Liability exposure. Active partners run daily affairs; Sleeping partners provide capital and share profits while remaining passive in administration.",
            topicDescriptionHinglish = "Partners 4 baato se pehchane jaate hain: (1) Capital lagayi ya nahi? (2) Management me hissa liya ya nahi? (3) Profit/Loss me hissa hai ya nahi? (4) Liability limited hai ya unlimited? Active partner dukan par baithkar kaam karta hai aur sabke samne hota hai; Sleeping partner sirf paisa lagata hai aur so jata hai, dukan me daily kaam nahi karta.",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-M-P-L Matrix' -> (C)apital, (M)anagement, (P)rofit, (L)iability.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Hanuman Ji (The Active Champion) and Mainaka Mountain (The Resting Ally)",
                loreOrContext = "While Hanuman Ji was the tirelessly active envoy flying through the skies to Lanka, Mount Mainaka rose from the ocean depths to offer a resting station, functioning as a silent, dormant sanctuary of support.",
                asciiFlowchart = """
[🌊 Ocean Expanse]
       │
       ├──> [🐒 Hanuman Ji: ACTIVE OPERATIONAL ENVOY (Flies, Fights, Explores, Binds Alliance)]
       └──> [⛰️ Mainaka Mountain: DORMANT SANCTUARY (Provides Base Support, Rests in Ocean)]
                """.trimIndent(),
                lessonQuote = "Great campaigns require both visible kinetic dynamos and unshakeable bedrock sanctuaries."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Active Partner (Ostensible Partner)",
                    category = "Partner Type",
                    englishText = "Contributes capital, actively participates in the day-to-day management of business, shares profits and losses, and possesses unlimited liability. He must give public notice upon retirement to discharge future liability.",
                    hinglishText = "Ye dukan ka sabse active khiladi hota hai: Paisa lagata hai, daily shop par baithta hai, profit/loss share karta hai, aur liability UNLIMITED hoti hai. Agar ye retire hoga to public notice dena compulsory hai!",
                    asciiFlowchart = """
[Active Partner] ──> [💰 Capital: YES] + [👔 Management: YES] + [📈 Profit: YES] + [⚖️ Liability: UNLIMITED]
                    """.trimIndent(),
                    microMnemonic = "ACTIVE = ALL-YES",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Lakshmana's Tireless Active Stewardship in the Wilderness",
                        loreOrContext = "Lakshmana was the active, vigilant guardian who felled trees, built hermitage huts, stood night watch, and engaged every incoming demonic assault.",
                        asciiFlowchart = "[🏹 Lakshmana] ──> [🪓 Builds Panchavati Huts] ──> [⚔️ Active Frontline Guard]",
                        lessonQuote = "Operational excellence is the cornerstone of every righteous triumph."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "COO & Managing Partner of a Quick-Commerce Dark Store",
                        loreOrContext = "Devraj works 14-hour days inside dark stores managing delivery fleets, inventory replenishment, and customer grievances.",
                        asciiFlowchart = "[🛵 14-Hr Dark Store Management] ──> [📦 Operational Dynamo] ──> [📈 High Daily GMV]",
                        lessonQuote = "The managing partner is the heart pump that circulates lifeblood through the business."
                    ),
                    caseQuestion = "What happens if an Active Partner retires without issuing a public notice in local newspapers?",
                    caseAnswer = "He remains personally liable to third parties for all debts incurred by the firm even after his actual retirement."
                ),
                SubPointItem(
                    pointTitle = "Sleeping or Dormant Partner",
                    category = "Partner Type",
                    englishText = "Contributes capital, shares profits and losses, and possesses unlimited liability, but DOES NOT participate in day-to-day management. He is NOT required to give public notice upon retirement.",
                    hinglishText = "Ye wo partner hai jo paisa lagata hai, munafa aur nuksan bhi leta hai, aur karze ke liye liability bhi UNLIMITED hoti hai; lekin dukan par management me bilkul nahi baithta. Iske retirement par public notice ki zaroorat nahi hoti.",
                    asciiFlowchart = """
[Sleeping Partner] ──> [💰 Capital: YES] + [🛋️ Management: NO] + [📈 Profit: YES] + [⚖️ Liability: UNLIMITED]
                    """.trimIndent(),
                    microMnemonic = "SLEEP = NO-MGMT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "King Janaka's Distant Moral Support from Mithila",
                        loreOrContext = "King Janaka provided sacred blessings and deep moral capital from Mithila, without personally marching to the southern shores of Lanka.",
                        asciiFlowchart = "[👑 King Janaka in Mithila] ──> [🌟 Moral & Sacred Capital] ──> [🏹 Active Campaign in Lanka]",
                        lessonQuote = "Benevolent silence backed by capital anchors great endeavors."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Angel Investor as Sleeping Partner in an AI Design Agency",
                        loreOrContext = "Tanvi invested ₹10 Lakhs in her friend's 3D animation firm. She takes 25% of annual profits but never visits the design studio or talks to clients.",
                        asciiFlowchart = "[💳 ₹10L Seed Injected] ──> [🛋️ Zero Client Management] ──> [💵 25% Profit Share]",
                        lessonQuote = "Passive capital allows builders to build without micro-management interference."
                    ),
                    caseQuestion = "Is a sleeping partner's private wealth immune from creditors if the firm goes bankrupt?",
                    caseAnswer = "No. A sleeping partner possesses unlimited liability just like an active partner."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 14: The Unnoticed Retirement of Mr. Khanna",
                    scenario = "Mr. Khanna was an active partner in 'Khanna & Sons Garments'. On March 1, he quietly resigned and retired to Dehradun without publishing any notification in the official gazette or newspapers. On April 15, the firm borrowed ₹8 Lakhs from a bank and defaulted.",
                    question = "Is Mr. Khanna liable to repay the bank loan taken after his retirement? Explain.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the statutory rule: An Active Partner must issue a Public Notice upon retirement (Section 32) (1 Mark)",
                        "Explain that third parties are entitled to presume that existing active partners continue until public notice is issued (1 Mark)",
                        "Conclusion: Yes, Mr. Khanna remains legally liable to the bank due to failure to issue public notice (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Active partners manage daily affairs and MUST issue public notice upon retiring.",
                "Sleeping partners contribute capital and bear unlimited liability, but do not manage."
            )
        ),

        // PAGE 15: Types of Partners - Secret & Nominal Partners
        StudyPage(
            pageNumber = 15,
            module = ModuleCategory.PARTNERSHIP,
            title = "Types of Partners: Secret vs. Nominal Partners",
            subtitle = "The Hidden Stakeholder vs. The Borrowed Name",
            topicDescriptionEnglish = "A Secret Partner is a genuine partner whose association with the firm is concealed from the general public. A Nominal Partner contributes neither capital nor managerial work, but graciously lends his esteemed name/reputation to the firm.",
            topicDescriptionHinglish = "Secret Partner ek sachha partner hota hai (paisa lagata hai, management karta hai, profit leta hai, unlimited liability hoti hai), par public ko pata nahi hota ki wo partner hai! Nominal Partner bilkul ulta hai: na paisa lagata hai, na management karta hai, na profit leta hai—sirf apna famous naam dukan ko use karne ke liye de deta hai; lekin creditors ke samne uski liability UNLIMITED hoti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'S-N-MATRIX' -> Secret = Hidden Truth | Nominal = Borrowed Name.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Vibhishana's Covert Intelligence Network in Lanka",
                loreOrContext = "Before openly crossing the ocean, Vibhishana quietly counterbalanced Ravana's demonic tyranny from within, functioning with absolute covert strategic discretion.",
                asciiFlowchart = """
[🏰 Inner Citadel of Lanka]
       │
       ├──> [🤫 Secret Strategic Advisor: Shielding Dharma from Shadows]
       └──> [👑 Open Sovereign Delegation: Lord Rama's Allied Front]
                """.trimIndent(),
                lessonQuote = "The deepest anchors of victory often operate unseen by the crowd."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Secret Partner",
                    category = "Partner Type",
                    englishText = "Contributes capital, participates in management secretly, shares profits and losses, and possesses UNLIMITED liability. His connection to the firm is deliberately kept hidden from the public.",
                    hinglishText = "Ye andar se poora partner hai! Paisa lagaya hai, meetings me decision leta hai, profit leta hai, liability bhi unlimited hai; bas bahar ki duniya aur customers se uska naam chupaya jata hai.",
                    asciiFlowchart = """
[Secret Partner] ──> [💰 Cap: YES] + [👔 Mgmt: YES (Secret)] + [📈 Profit: YES] + [⚖️ Liability: UNLIMITED]
                    """.trimIndent(),
                    microMnemonic = "SECRET = HIDDEN-REAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Guha's Covert River Logistics Network",
                        loreOrContext = "Nishadraj Guha deployed his boatmen quietly along the riverbanks to ensure Rama, Sita, and Lakshmana moved unharmed without alerting royal spies.",
                        asciiFlowchart = "[🛶 Guha's Quiet Network] ──> [🛡️ Secret Protection on River] ──> [🏹 Safe Passage Guaranteed]",
                        lessonQuote = "Quiet, unpublicized allegiance protects sacred causes."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Senior Tech Lead Moonlighting as Secret Co-Founder",
                        loreOrContext = "Vikram is a full-time senior engineer at Google. He secretly invested ₹15 Lakhs and designs architecture for his brother's AI startup under an NDA.",
                        asciiFlowchart = "[🏢 Full-Time Job Shield] ──> [🤫 Secret Architecture & Equity] ──> [💰 Real Profit Share]",
                        lessonQuote = "True leverage works in silence while results make the noise."
                    ),
                    caseQuestion = "If a Secret Partner's identity is discovered by a bank creditor, can the bank seize his private assets to recover unpaid firm debt?",
                    caseAnswer = "Yes. A secret partner carries full unlimited liability once his partnership status is established."
                ),
                SubPointItem(
                    pointTitle = "Nominal Partner",
                    category = "Partner Type",
                    englishText = "Lends his famous name and goodwill to the firm. He contributes NO capital, does NOT participate in management, and shares NO profits. However, he is fully liable to third parties who lent credit relying on his name.",
                    hinglishText = "Nominal ka matlab 'sirf naam ka'! Na ek rupya capital lagata hai, na dukan sambhalta hai, na profit leta hai. Bas apna famous naam use karne deta hai. LEKIN sabse badi cheez: public ke samne liability UNLIMITED hoti hai!",
                    asciiFlowchart = """
[Nominal Partner] ──> [💰 Cap: NO] + [👔 Mgmt: NO] + [📈 Profit: NO] + [⚖️ Liability: UNLIMITED!]
                    """.trimIndent(),
                    microMnemonic = "NOMINAL = NAME-ONLY",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Prestigious Solar Dynasty (Suryavansh) Banner",
                        loreOrContext = "The illustrious name of Emperor Raghu and Ikshvaku was invoked across Aryavarta, inspiring instant reverence and unquestioned creditworthiness throughout the three worlds.",
                        asciiFlowchart = "[👑 Raghu's Sacred Name] ──> [🌟 Unquestioned Trust] ──> [🏹 Reassurance of Righteousness]",
                        lessonQuote = "A peerless reputation lends instant credibility to all who stand under its canopy."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Celebrity Influencer Lending Name to a Streetwear Startup",
                        loreOrContext = "A Bollywood actor allowed his gym friend's startup to use his name as 'Co-Founder & Brand Partner'. When the company defaulted on fabric suppliers, suppliers legally sued the actor!",
                        asciiFlowchart = "[🌟 Celebrity Lends Name] ──> [📦 Startup Takes ₹50L Debt] ──> [⚖️ Celebrity Held Personally Liable!]",
                        lessonQuote = "Never lend your name casually to a business whose liabilities you cannot stomach."
                    ),
                    caseQuestion = "Does a Nominal Partner share in the profits of the firm? What is his liability to creditors?",
                    caseAnswer = "No, he does not share profits; however, his liability toward third-party creditors is fully unlimited."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 15: The Celebrity Endorser Turned Involuntary Debtor",
                    scenario = "Ranveer, a renowned fitness creator, allowed his friend's protein-shake firm to advertise him as 'Partner in Nutrition'. He invested zero capital and received zero profits. The firm took a ₹20 Lakhs loan from a cooperative bank citing Ranveer's partnership, and went bankrupt.",
                    question = "Identify Ranveer's partner type and determine whether the bank can legally seize Ranveer's personal luxury car to recover the dues.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Partner Type: Nominal Partner (1 Mark)",
                        "State the legal doctrine: A nominal partner lends his name and reputation, inducing third parties to extend credit (1 Mark)",
                        "Conclusion: Yes, the bank can attach Ranveer's personal luxury car because a nominal partner bears unlimited liability to third parties (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Secret partners have real capital and profit stakes, but concealed identity.",
                "Nominal partners contribute zero funds and take zero profit, but bear full unlimited liability."
            )
        ),

        // PAGE 16: Types of Partners - Estoppel & Holding Out
        StudyPage(
            pageNumber = 16,
            module = ModuleCategory.PARTNERSHIP,
            title = "Types of Partners: Partner by Estoppel & Holding Out",
            subtitle = "The Legal Traps of Conduct and Permitted Representation",
            topicDescriptionEnglish = "Partners by Estoppel and Holding Out are not actual partners. They become liable to third parties because by their own conduct, words, or silence, they allowed reasonable people to believe they were partners, inducing credit extension.",
            topicDescriptionHinglish = "Ye dono partners dukan ke real partner nahi hote, par kanoon inko lapet leta hai! 'Partner by Estoppel' wo hai jo apni zubaan ya harkaton se doosro ko dikhata hai ki 'Haan, main partner hoon!' 'Partner by Holding Out' wo hai jisko doosre log partner bol rahe hain aur wo chup-chaap sunkar deny nahi karta. Dono ko karza chukana padega!",
            macroMemoryTrick = "MACRO MNEMONIC: 'E-H-TRAP' -> (E)stoppel = Own Words/Actions | (H)olding Out = Silence when represented by others.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Maricha's Golden Deer Disguise (The Danger of False Representation)",
                loreOrContext = "Demon Maricha assumed the radiant exterior of an exquisite golden deer. His external representation misled Mata Sita, causing consequences that altered cosmic history.",
                asciiFlowchart = """
[🦌 Radiant Golden Fur Representation] 
       │ (Deceptive External Conduct)
       ▼
[🏹 Enticement & Reliance Placed on Exterior Form] 
       │ (Irrevocable Chain of Cosmic Consequences)
       ▼
[⚖️ Bound by the Repercussions of Conduct]
                """.trimIndent(),
                lessonQuote = "The world judges and binds you by the form and impression you deliberately project."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Partner by Estoppel (Conduct & Word Trap)",
                    category = "Partner Type",
                    englishText = "A person who by his own words, written statement, or conduct deliberately represents himself as a partner, is estopped from denying his status to any third party who gave credit relying on that representation.",
                    hinglishText = "Agar koi insaan kisi meeting me khud aage badhkar bole: 'Arrey ye dukan meri hi hai, main isme partner hoon, aap maal supply karo!'—to kanoon use 'Estoppel' ke tehat partner maan lega aur karza usi se vasool karega.",
                    asciiFlowchart = """
[Person X Claims: 'I am Partner!'] ──> [Creditor Gives ₹5L Goods] ──> [X Estopped from Denying Liability!]
                    """.trimIndent(),
                    microMnemonic = "ESTOP = OWN-LIPS",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Kabandha's True Form Concealed in Gross Appearance",
                        loreOrContext = "Cursed to appear as a headless demon, Kabandha was treated as a terrifying adversary until Lord Rama's liberating touch revealed his celestial Gandharva identity.",
                        asciiFlowchart = "[👹 Demon Appearance] ──> [⚔️ Engagement by Rama] ──> [✨ Celestial Identity Restored]",
                        lessonQuote = "External projection dictates the nature of all immediate interactions."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Influencer Boasting on LinkedIn: 'Co-Founder at XYZ'",
                        loreOrContext = "Varun posted on LinkedIn: 'Proud Co-Founder at D2C Threads'. A fabric supplier gave ₹10 Lakhs credit based on Varun's 200k follower profile. The court held Varun liable by Estoppel.",
                        asciiFlowchart = "[📱 LinkedIn Bio: 'Co-Founder'] ──> [🏭 ₹10L Fabric Credit Given] ──> [⚖️ Court Holds Varun Liable]",
                        lessonQuote = "Clout-chasing on social media carries real enforceable commercial liabilities."
                    ),
                    caseQuestion = "Seema accompanied her friend Ritu to a wholesale jewelry market. Seema stated: 'Ritu and I run this boutique together.' The wholesaler supplied ₹2 Lakhs gems on credit. Can the wholesaler sue Seema?",
                    caseAnswer = "Yes, Seema is a Partner by Estoppel and is legally liable for the credit extended."
                ),
                SubPointItem(
                    pointTitle = "Partner by Holding Out (The Danger of Silence)",
                    category = "Partner Type",
                    englishText = "A person who is publicly represented as a partner by others and KNOWINGLY PERMITS IT (does not issue a timely denial/denouncement), becomes liable to those who give credit relying on that representation.",
                    hinglishText = "Yaha insaan khud nahi bolta, balki doosra partner bolta hai: 'Bhaiya, ye hamare partner hain!' aur ye shant khada rehta hai, mana nahi karta. Agar isne turant deny nahi kiya, to kanoon ise 'Holding Out' ke tehat fasayega!",
                    asciiFlowchart = """
[Partner A tells Bank: 'Mr. Y is our partner!'] 
                     │
[Mr. Y stays silent & smiles] ──> [Bank issues loan] ──> [Mr. Y Liable by Holding Out!]
                    """.trimIndent(),
                    microMnemonic = "HOLD-OUT = SILENT-CONSENT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Silence of Royal Elders in Assemblies",
                        loreOrContext = "When unrighteous proposals were voiced in royal courts, sages taught that silence in the face of misrepresentation amounts to tacit endorsement.",
                        asciiFlowchart = "[🗣️ Misrepresentation Uttered] ──> [🤐 Silent Assent] ──> [⚖️ Moral Complicity Incurred]",
                        lessonQuote = "Righteousness demands an instant vocal objection when truth is distorted."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Pitch Deck Name Drop Ignored by Senior Designer",
                        loreOrContext = "A startup listed Shreya as 'Founding Design Partner' in their investor pitch deck. Shreya saw it, laughed, and did not demand removal. An angel invested ₹25 Lakhs. Shreya is bound by Holding Out.",
                        asciiFlowchart = "[📊 Pitch Deck Lists Shreya] ──> [🤐 Shreya Does Not Deny] ──> [💸 Angel Sues Shreya for Default]",
                        lessonQuote = "Never tolerate unauthorized use of your professional name; refute immediately in writing."
                    ),
                    caseQuestion = "How can a person avoid being held liable as a Partner by Holding Out when falsely introduced as a partner?",
                    caseAnswer = "By immediately and publicly denying the statement at the time it is made, or issuing a prompt public refutation."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 16: The Silent Observer at the Hardware Guild",
                    scenario = "Mr. Verma, a wealthy retired civil engineer, accompanied his nephew to a timber wholesaler. The nephew introduced Mr. Verma saying, 'My uncle is my sleeping partner in this venture.' Mr. Verma smiled and remained silent. Relying on Verma's wealth, the merchant gave ₹6 Lakhs timber on credit. The nephew absconded.",
                    question = "Is Mr. Verma legally liable to pay the ₹6 Lakhs timber debt? Explain the exact legal doctrine.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the legal doctrine: Partner by Holding Out (1 Mark)",
                        "Explain that Mr. Verma knowingly permitted himself to be represented as a partner and remained silent without denying (1 Mark)",
                        "Conclusion: Yes, Mr. Verma is liable to the timber merchant who extended credit based on that representation (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Estoppel arises from your own affirmative words or conduct.",
                "Holding out arises from your negligent or acquiescent silence when introduced as a partner by others."
            )
        ),

        // PAGE 17: Minor in Partnership
        StudyPage(
            pageNumber = 17,
            module = ModuleCategory.PARTNERSHIP,
            title = "Status of a Minor in Partnership (Section 30)",
            subtitle = "Benevolent Ingress to Benefits vs. Shielded Liability",
            topicDescriptionEnglish = "Under the Indian Contract Act, 1872, an agreement with a minor is void ab initio. However, under Section 30 of the Indian Partnership Act, 1932, a minor may be admitted to the BENEFITS of an existing partnership firm with the unanimous consent of all partners.",
            topicDescriptionHinglish = "Indian Contract Act kehta hai ki minor (18 saal se chota) contract kar hi nahi sakta. Lekin Indian Partnership Act ka Section 30 ek special chhoot deta hai: Sabhi partners ki 100% razamandi se ek minor ko partnership ke BENEFITS (sirf munafey) me shaamil kiya ja sakta hai. Minor ka personal ghar-baar kabhi kurk nahi ho sakta!",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-I-N-O-R-3-0' -> (M)utual Consent All, (I)mmunity of Personal Assets, (N)o Losses Borne, (O)ption at 18, (R)ights to Inspect Books.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Young Princes Lava and Kusha Under Sage Valmiki's Tutelage",
                loreOrContext = "The twin boys Lava and Kusha were sheltered within Sage Valmiki's hermitage, learning the sacred Ramayana and divine archery with sovereign immunity and complete spiritual protection before coming of age.",
                asciiFlowchart = """
[🏹 Sage Valmiki's Sacred Ashram]
       │
       ├──> [Immunity from Sovereign Imperial Warfare & Politics]
       ├──> [Direct Access to the Supreme Sacred Wisdom of Ramayana]
       │
       ▼
[👑 Grand Proclamation of Identity Upon Attaining Maturity at Ayodhya]
                """.trimIndent(),
                lessonQuote = "The youth are sheltered under divine guardianship until maturity demands sovereign accountability."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Position of Minor Before Attaining Majority",
                    category = "Statutory Rule",
                    englishText = "A minor shares ONLY in profits and has access to inspect firm accounts. His liability is confined strictly to his agreed share in firm property; his personal private property can NEVER be attached by creditors.",
                    hinglishText = "18 saal ka hone se pehle: Minor sirf munafa leta hai, accounts inspect kar sakta hai. Agar firm doobti hai to minor ka lagaya hua paisa doob sakta hai, par uski personal cycle ya ghar court nahi chheen sakti!",
                    asciiFlowchart = """
[Minor in Firm] ──> [📈 Share in Profits: YES] + [💰 Capital at Risk: YES] + [🏠 Personal Assets at Risk: ABSOLUTE ZERO!]
                    """.trimIndent(),
                    microMnemonic = "MINOR-SHIELD",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Young Prince Angada Crowned Yuvaraja Under Royal Tutelage",
                        loreOrContext = "Upon Bali's demise, Prince Angada was crowned heir apparent (Yuvaraja), receiving royal honors while King Sugriva shouldered active administrative governance.",
                        asciiFlowchart = "[👑 Angada as Yuvaraja] ──> [Protected Royal Status] ──> [Sugriva Bears Sovereign Liability]",
                        lessonQuote = "Heirs are nurtured with rights while seasoned guardians navigate the storm."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "16-Year-Old Prodigy Coder in Web3 Startup",
                        loreOrContext = "16-year-old Aditya wrote the smart contracts for a DeFi app. The founders admitted him to 15% profit benefits. When the startup was hacked, creditors could not touch Aditya's private bank account.",
                        asciiFlowchart = "[💻 16-Yr Coder Admitted] ──> [🔐 Startup Hacks / Insolvency] ──> [🛡️ Minor's Personal Wealth Fully Shielded]",
                        lessonQuote = "Genius knows no age, but the law rightly shields youth from commercial predators."
                    ),
                    caseQuestion = "Can a partnership firm be constituted exclusively by two minor partners?",
                    caseAnswer = "No. A minor cannot create a partnership; there must be a pre-existing valid partnership of adults into which he is admitted."
                ),
                SubPointItem(
                    pointTitle = "Position of Minor on Attaining Majority (6-Month Public Notice)",
                    category = "Statutory Rule",
                    englishText = "Within 6 months of attaining majority (or obtaining knowledge of admission), he must give public notice deciding whether to become a full partner. If he fails to give notice, he automatically becomes a full partner with retroactive unlimited liability from his initial admission date!",
                    hinglishText = "18 saal ka hote hi 6 mahine ka timer shuru! 6 mahine ke andar public notice dekar batana padega ki wo full partner banega ya bahar niklega. Agar 6 mahine chup baith gaya, to kanoon use AUTOMATIC full partner bana dega, aur jab se wo dukan me aaya tha tab se lekar aaj tak ke saare karzo ke liye UNLIMITED liable ho jayega!",
                    asciiFlowchart = """
[Turns 18 Years Old] ──> [⏰ 6-Month Decision Window] 
                               │
       ┌───────────────────────┴───────────────────────┐
       ▼                                               ▼
[Issues Notice: 'I Leave Firm']             [SILENCE for 6 Months]
       │                                               │
[Leaves with ZERO past liability]           [AUTOMATIC Full Partner with RETROACTIVE Unlimited Liability!]
                    """.trimIndent(),
                    microMnemonic = "6-MONTH-CLOCK",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Lord Rama's Coronation Ceremony upon Attaining Full Sovereign Age",
                        loreOrContext = "Upon returning from 14 years of exile and completing all sacred tapasya, Lord Rama assumed the sovereign imperial crown with universal public acclaim.",
                        asciiFlowchart = "[👑 14-Yr Tapasya Completed] ──> [📜 Sovereign Public Notice] ──> [🌟 Eternal Ramrajya Commenced]",
                        lessonQuote = "Maturity demands stepping forward publicly to shoulder the full mantle of destiny."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Teen Gaming Streamer Turning 18 Forgetting Legal Notice",
                        loreOrContext = "Siddharth was admitted to benefits in an esports firm at 17. He turned 18 and forgot to issue a public notice. Seven months later, the firm defaulted on ₹40 Lakhs; courts attached Siddharth's bank account.",
                        asciiFlowchart = "[🎂 Turns 18 + Forgets Notice] ──> [🚨 7 Months Pass] ──> [⚖️ Held Fully & Retroactively Liable]",
                        lessonQuote = "Legal deadlines don't send push notifications; ignorance of the law is never an excuse."
                    ),
                    caseQuestion = "What is the legal status of an admitted minor who remains completely silent for 7 months after turning 18?",
                    caseAnswer = "He automatically becomes a full partner with unlimited liability dating back to when he was first admitted to benefits."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 17: The 18th Birthday Dilemma of Master Ayush",
                    scenario = "Ayush was admitted to the benefits of 'Metro Traders' at age 15 with 20% profit share. On May 10, 2024, Ayush celebrated his 18th birthday. He did not issue any public notice until December 25, 2024, when he announced his intention to withdraw.",
                    question = "Evaluate Ayush's legal liability for firm debts incurred between May 2024 and December 2024.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the 6-month statutory window under Section 30 (May 10 to Nov 10, 2024) (1 Mark)",
                        "Explain that since Ayush failed to issue notice within 6 months, he automatically became a full partner on Nov 10, 2024 (1 Mark)",
                        "Conclusion: His delayed December notice is invalid; Ayush is personally and retroactively liable for all debts as an adult full partner (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "A minor can only be admitted to the benefits of an existing partnership with unanimous consent.",
                "Failure to elect out within 6 months of turning 18 triggers automatic full partnership with retroactive unlimited liability."
            )
        ),

        // PAGE 18: Types of Partnership - Duration & Liability
        StudyPage(
            pageNumber = 18,
            module = ModuleCategory.PARTNERSHIP,
            title = "Types of Partnerships: Duration & Liability Classification",
            subtitle = "From Fleeting Joint Ventures to Modern Limited Liability Partnerships",
            topicDescriptionEnglish = "Partnerships are classified by Duration (Partnership at Will vs. Particular Partnership) and by Liability (General Partnership vs. Limited Liability Partnership under LLP Act, 2008).",
            topicDescriptionHinglish = "Partnership do tareeqo se baanti jaati hai: Duration ke hisaab se: (1) Partnership at Will—jab tak partners ka dil kare chalao, kisi ek ke notice se band; (2) Particular Partnership—kisi specific project ya time ke liye banti hai. Liability ke hisaab se: (1) General—sabki unlimited liability; (2) LLP (Limited Liability Partnership)—isme partners ki liability unke capital tak limited hoti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'W-P-G-L' -> (W)ill, (P)articular, (G)eneral, (L)imited Liability Partnership.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Alliance for Crossing the Ocean vs. The Eternal Fraternal Union",
                loreOrContext = "The bridge construction pact with Nala and Nila was a Particular Partnership (concluded upon reaching Lanka's shore), whereas the fraternal alliance between Rama and Lakshmana was an indissoluble, perpetual union.",
                asciiFlowchart = """
[🌊 Ocean Barrier Encountered]
       │
       ├──> [PARTICULAR ALLIANCE: Bridge Construction with Nala & Nila (Dissolved on completion)]
       └──> [PERPETUAL UNION: Rama & Lakshmana (Unconditional Life-long Covenant)]
                """.trimIndent(),
                lessonQuote = "Prudent leaders distinguish between project-based pacts and lifelong covenants."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Partnership at Will vs. Particular Partnership",
                    category = "Classification",
                    englishText = "Partnership at Will exists at the pleasure of the partners with no fixed term; it can be dissolved by any partner giving written notice. Particular Partnership is formed for a specific venture (e.g., building a bridge) and dissolves automatically upon project completion.",
                    hinglishText = "Partnership at Will ka koi fixed time nahi hota; jab bhi koi ek partner written notice dega, firm dissolve ho jayegi. Particular Partnership kisi khaas kaam ke liye banti hai (jaise ek cinema hall banana); kaam poora hua aur partnership khatam!",
                    asciiFlowchart = """
[At Will] ──> [No Fixed Expiry] ──> [Dissolved by written notice of ANY partner]
[Particular] ──> [Single Specific Venture] ──> [Automatically Ends on Completion]
                    """.trimIndent(),
                    microMnemonic = "WILL vs PROJECT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The 5-Day Cosmic Setu Construction Venture",
                        loreOrContext = "Architect Nala directed the building of the Ram Setu bridge. Once the army crossed, the special engineering partnership was gloriously fulfilled.",
                        asciiFlowchart = "[🌉 5-Day Setu Mission] ──> [Army Crosses to Lanka] ──> [🎯 Objective Fulfilled & Venture Concluded]",
                        lessonQuote = "Task-oriented pacts dissolve naturally in triumphant fulfillment."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Music Festival Food Pop-Up Partnership",
                        loreOrContext = "Kabir and Rhea pooled ₹2 Lakhs solely to run a burger stall for the 3-day Sunburn festival in Goa. On day 4, they split profits and the firm ceased.",
                        asciiFlowchart = "[🍔 3-Day Festival Pop-Up] ──> [Split ₹4 Lakhs Net Profit] ──> [🏁 Firm Automatically Ceases]",
                        lessonQuote = "Spin up fast, extract margin, settle accounts, and dissolve cleanly."
                    ),
                    caseQuestion = "Three builders form a partnership to construct a shopping mall in Noida. When does this partnership dissolve naturally?",
                    caseAnswer = "Upon completion of the mall construction and settlement of accounts, as it is a Particular Partnership."
                ),
                SubPointItem(
                    pointTitle = "General Partnership vs. Limited Liability Partnership (LLP)",
                    category = "Classification",
                    englishText = "In General Partnership, liability of all partners is unlimited and joint. In an LLP (governed by LLP Act, 2008), the firm is a separate legal body with perpetual succession, and partners enjoy limited liability up to their agreed contribution.",
                    hinglishText = "General Partnership me sabka sab kuch daao par laga hota hai (unlimited liability). Lekin LLP me company jaisi khubiyaan hoti hain: registration mandatory hai, liability limited hoti hai, aur ek partner ke fraud ke liye doosre partner ki personal property safe rehti hai!",
                    asciiFlowchart = """
[General Partnership: Unincorporated | Unlimited Joint Liability | Fragile Life]
                                      vs
[LLP (Act 2008): Body Corporate | Limited Liability | Perpetual Succession]
                    """.trimIndent(),
                    microMnemonic = "LLP = SHIELDED-MODERN",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Shield of Divine Kavacha Granted to Celestial Guardians",
                        loreOrContext = "Celestial warriors were endowed with divine impenetrable armor (Kavacha), ensuring external weapons could not pierce their personal core being.",
                        asciiFlowchart = "[🛡️ Divine Armor (Kavacha)] ──> [Absorbs Battlefield Impact] ──> [Core Warrior Remains Safe]",
                        lessonQuote = "Wise structures incorporate defensive armor against catastrophic exposure."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "AI Design Agency Choosing LLP Over General Partnership",
                        loreOrContext = "Two UI designers registered an LLP so that if an AI tool accidentally causes a client copyright lawsuit, their personal apartments remain 100% legally shielded.",
                        asciiFlowchart = "[🏛️ Registered LLP] ──> [Client Sues for ₹1 Crore] ──> [🛡️ Personal Flats 100% Protected]",
                        lessonQuote = "Modern entrepreneurs use LLP structures to cap risk while chasing moonshots."
                    ),
                    caseQuestion = "State two key differences between a traditional partnership firm and a Limited Liability Partnership (LLP).",
                    caseAnswer = "(1) LLP has a separate legal entity with perpetual succession; (2) Partners in an LLP enjoy limited liability."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 18: The Bridge Construction Syndicate",
                    scenario = "Engineers Malhotra and Qureshi formed 'MQ Infrastructure' solely to construct a 4-km bypass flyover for NHAI. The flyover was inaugurated by the Union Minister and final bills cleared. Malhotra wants to dissolve the firm; Qureshi insists the firm must continue to bid for other tenders.",
                    question = "Advise Qureshi on the legal status of the firm under the Indian Partnership Act, 1932.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the category: Particular Partnership (1 Mark)",
                        "State the legal rule: A particular partnership is formed for a specific venture and dissolves automatically on its completion (1 Mark)",
                        "Conclusion: The firm stands legally dissolved upon flyover completion; Qureshi cannot force continuation without a fresh agreement (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Partnership at Will ends upon written notice; Particular Partnership ends upon project completion.",
                "LLP blends the flexibility of partnership with the limited liability shield of a joint-stock company."
            )
        ),

        // PAGE 19: Partnership Deed & Essential Clauses
        StudyPage(
            pageNumber = 19,
            module = ModuleCategory.PARTNERSHIP,
            title = "Partnership Deed: The Sovereign Constitution of the Firm",
            subtitle = "Written Clarity as the Antidote to Future Acrimony",
            topicDescriptionEnglish = "A Partnership Deed is the written legal document signed by all partners, containing terms and conditions governing the internal management, profit-sharing, and dissolution of the firm. It serves as the constitutional charter preventing future disputes.",
            topicDescriptionHinglish = "Partnership Deed dukan ka 'Samvidhan' (constitution) hai! Ye ek written stamp paper document hota hai jisme sabhi partners sign karte hain. Isme likha hota hai kisne kitna paisa lagaya, kisko kitna profit milega, kisko salary milegi, aur dispute kaise solve hoga.",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-A-P-I-T-A-L-D-E-E-D' -> (C)apital, (A)ccounts, (P)rofit Ratio, (I)nterest Rates, (T)erm/Duration, (A)uditors, (L)iabilities, (D)issolution Rules.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Inscription of the Imperial Charter at Ayodhya",
                loreOrContext = "Whenever sovereign treaties were ratified in ancient Aryavarta, royal scribes engraved terms on copper plates (Tamra-Patra) stamped with the imperial royal seal, eliminating ambiguity across generations.",
                asciiFlowchart = """
[📜 Copper Plate Tamra-Patra]
       │
       ├──> Inscribed with Terms of Tribute & Alliance
       ├──> Stamped with the Royal Seal of Ikshvaku Dynasty
       │
       ▼
[🏛️ Inviolate Constitutional Peace Preserved for Millennia]
                """.trimIndent(),
                lessonQuote = "Ink on copper endures long after human memory fades into dispute."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Essential Clauses of the Partnership Deed",
                    category = "Document Clauses",
                    englishText = "Key clauses include: (1) Name and location of firm; (2) Duration of business; (3) Capital contribution by each partner; (4) Profit and Loss sharing ratio; (5) Interest on capital and drawings; (6) Salaries/commissions; (7) Duties and powers; (8) Arbitration method.",
                    hinglishText = "Deed me ye 8 baatein likhna zaroori hai: Dukan ka naam aur address, kitne saal chalegi, kisne kitna paisa lagaya, munafa kis ratio me batega, interest milega ya nahi, salary milegi ya nahi, aur ladai hone par court jayenge ya arbitrator ke paas.",
                    asciiFlowchart = """
             [📜 Partnership Deed Clauses]
                           │
       ┌───────────┬───────┴───────┬───────────┐
       ▼           ▼               ▼           ▼
[💰 Capital] [📈 P&L Ratio] [💵 Interest/Salary] [⚖️ Dispute Method]
                    """.trimIndent(),
                    microMnemonic = "DEED-CLAUSES",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Royal Boundaries Demarcated by King Sagara",
                        loreOrContext = "King Sagara established clear boundary pillars for royal pasture lands so adjacent kingdoms would never clash over agricultural jurisdictions.",
                        asciiFlowchart = "[🏛️ Stone Boundary Pillars] ──> [🌾 Demarcated Pastures] ──> [🕊️ Centuries of Border Peace]",
                        lessonQuote = "Clear boundaries are the bedrock of enduring amity."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Notion Founders' Agreement with Reverse Vesting Clauses",
                        loreOrContext = "Three college friends inserted a 4-year reverse vesting schedule into their partnership deed, ensuring that if a partner quits in month 6, he cannot run away with 33% of the company.",
                        asciiFlowchart = "[📝 Reverse Vesting Clause] ──> [🏃 Partner Quits Early] ──> [🛡️ Company Equity Protected]",
                        lessonQuote = "Document worst-case human departures when everyone still loves each other."
                    ),
                    caseQuestion = "Name any two financial clauses that should be explicitly specified in a Partnership Deed.",
                    caseAnswer = "(1) Profit and Loss Sharing Ratio; (2) Rate of Interest on Capital and Drawings."
                ),
                SubPointItem(
                    pointTitle = "Rules Applicable in the Absence of Partnership Deed",
                    category = "Statutory Rule",
                    englishText = "Under Indian Partnership Act, 1932, if the deed is silent: (1) Profit/Loss shared EQUALLY; (2) NO interest on capital; (3) NO interest on drawings; (4) NO salary/remuneration; (5) 6% per annum interest allowed on partner's loan to firm!",
                    hinglishText = "Agar Partnership Deed nahi banayi ya chup hai, to kanoon ke 5 golden rules chalenge: (1) Profit/Loss bilkul EQUAL batega; (2) Capital par 0% interest; (3) Drawings par 0% interest; (4) Salary/Commission = ZERO; (5) Partner ke diye loan par 6% per annum interest milega!",
                    asciiFlowchart = """
[Deed Silent / Missing] ──> [Profit: 1:1 EQUAL] + [Salary: ₹0] + [IoC: 0%] + [Partner Loan Interest: 6% p.a.]
                    """.trimIndent(),
                    microMnemonic = "SILENT = EQUAL+6%",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Universal Vedic Dharma Stepping in During Customary Silence",
                        loreOrContext = "When local kingdom customary decrees were silent on succession disputes, royal sages immediately defaulted to the eternal Vedic code of righteous primogeniture.",
                        asciiFlowchart = "[❓ Local Custom Silent] ──> [🧘 Sages Consult Vedic Code] ──> [⚖️ Default Dharma Applied]",
                        lessonQuote = "Where individual covenants are silent, the statutory law of righteousness reigns supreme."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Founder Claiming ₹50,000 Monthly Salary Without Deed Clause",
                        loreOrContext = "Akash worked 16 hours a day and demanded ₹50,000 monthly salary from his partner Neil. Because their deed had no salary clause, the court awarded him ₹0 salary.",
                        asciiFlowchart = "[💼 Akash Demands Salary] ──> [📜 Deed is Silent] ──> [❌ Court Rules: ₹0 Remuneration]",
                        lessonQuote = "If it isn't written in the deed, your sweat equity counts as zero in court."
                    ),
                    caseQuestion = "A partner advanced a personal loan of ₹2 Lakhs to the firm. The deed is silent regarding interest. What rate of interest can he legally claim?",
                    caseAnswer = "6% per annum, as stipulated under Section 13(d) of the Indian Partnership Act, 1932."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 19: The Capital vs. Sweat Equity Quarrel",
                    scenario = "Gaurav contributed ₹10 Lakhs capital but did zero work. Pranav contributed ₹1 Lakh capital but ran the store 12 hours daily. At year-end, the firm made ₹6 Lakhs profit. Gaurav demands profit in the 10:1 capital ratio and 12% interest on capital. Pranav demands ₹30,000 monthly salary. There is no written Partnership Deed.",
                    question = "Resolve this dispute strictly applying the provisions of the Indian Partnership Act, 1932.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "Profit Sharing: In the absence of a deed, profits must be divided EQUALLY (₹3 Lakhs each), not in capital ratio (1.5 Marks)",
                        "Interest on Capital: Gaurav is entitled to ZERO interest on his capital (1 Mark)",
                        "Salary/Remuneration: Pranav is entitled to ZERO monthly salary despite working 12 hours daily (1 Mark)",
                        "Final distribution: ₹3,00,000 to Gaurav and ₹3,00,000 to Pranav (0.5 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "A written partnership deed avoids bitter post-growth family and financial litigation.",
                "In the absence of a deed, profits are equal, no salaries or capital interest are allowed, and partner loans earn 6% p.a."
            )
        ),

        // PAGE 20: Registration of Partnership Firm & Consequences of Non-Registration
        StudyPage(
            pageNumber = 20,
            module = ModuleCategory.PARTNERSHIP,
            title = "Registration & Severe Consequences of Non-Registration",
            subtitle = "Why Optional Registration is Virtually Compulsory in Practice",
            topicDescriptionEnglish = "Registration of a partnership firm under the Indian Partnership Act, 1932 is optional. However, Section 69 imposes severe legal disabilities on an unregistered firm, making registration practically essential for commercial survival.",
            topicDescriptionHinglish = "Indian Partnership Act ke hisaab se registration karwana OPTIONAL (marzi par) hai. Lekin agar aapne registration nahi karwaya, to Section 69 aapke haath-pair baandh deta hai: Aap kisi defaulting customer ya third party par court case nahi kar sakte! Isliye samajhdaar log hamesha registration karwate hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'N-O-S-U-E' -> (N)o Suit Against Third Parties, (O)ther Partners Cannot Be Sued, (S)et-off Capped at ₹100, (U)nregistered Vulnerability, (E)xposure Absolute.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Royal Seal of Lord Rama (Mudrika) Given to Hanuman Ji",
                loreOrContext = "Before Hanuman Ji flew across the ocean, Lord Rama handed him his personal engraved royal signet ring (Mudrika). When presented to Sita Mata, this unchallengeable credential opened all doors and proved official sovereign authority.",
                asciiFlowchart = """
[🏹 Lord Rama's Sacred Hands] ──> [💍 Royal Signet Ring (Mudrika)]
                                              │
                                              ▼
[🐒 Hanuman Ji Displays Mudrika in Lanka] ──> [✨ Unchallengeable Authenticity & Total Credibility]
                """.trimIndent(),
                lessonQuote = "Official credentials transform an envoy into an inviolable force of law."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Consequences of Non-Registration (Section 69 Disabilities)",
                    category = "Statutory Disability",
                    englishText = "An unregistered firm suffers three severe disabilities: (1) It CANNOT file a lawsuit against any third party for breach of contract; (2) A partner CANNOT sue co-partners or the firm; (3) It CANNOT claim a set-off exceeding ₹100 in court.",
                    hinglishText = "Agar dukan registered nahi hai, to 3 bade jhatke: (1) Agar customer ne 5 lakh ka maal lekar paise nahi diye, to dukan us par court case nahi kar sakti! (2) Ek partner doosre cheating partner par case nahi kar sakta; (3) Court me ₹100 se zyada ka set-off claim nahi kar sakte.",
                    asciiFlowchart = """
[❌ Unregistered Firm] ──> [🚫 CANNOT Sue Defaulting Third Parties (Debts > ₹100)]
                     ──> [🚫 CANNOT Sue Cheating Co-Partners in Court]
                     ──> [⚠️ BUT Third Parties CAN Freely Sue the Firm!]
                    """.trimIndent(),
                    microMnemonic = "SEC-69-TRAP",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Ravana's Disregard of International Diplomatic Immunity",
                        loreOrContext = "When Ravana sought to execute envoy Hanuman, Vibhishana intervened citing ancient unwritten international law: 'An accredited envoy cannot be slain, but may be marked.'",
                        asciiFlowchart = "[⚔️ Ravana Orders Death] ──> [📜 Vibhishana Cites Law of Envoys] ──> [🕊️ Envoy Life Spared]",
                        lessonQuote = "Law protects those who operate under recognized, accredited covenants."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Unregistered D2C Brand Defrauded by Retail Chain",
                        loreOrContext = "An unregistered footwear partnership supplied ₹15 Lakhs shoes to a mall store. The store defaulted. When the founders went to court, the judge dismissed the case because the firm was unregistered!",
                        asciiFlowchart = "[📦 ₹15L Shoes Supplied] ──> [🛑 Retailer Defaults] ──> [🏛️ Court Dismisses Case Under Sec 69!]",
                        lessonQuote = "Save ₹2,000 on registration fees, lose ₹15 Lakhs in bad debts."
                    ),
                    caseQuestion = "Can a third party file a lawsuit against an unregistered partnership firm to recover unpaid dues?",
                    caseAnswer = "Yes. Non-registration bars the firm from suing others, but does NOT prevent third parties from suing the firm."
                ),
                SubPointItem(
                    pointTitle = "Rights Unaffected by Non-Registration",
                    category = "Statutory Exception",
                    englishText = "Non-registration does NOT affect: (1) The right of third parties to sue the firm; (2) The right of partners to sue for dissolution of the firm and settlement of accounts; (3) The powers of official assignees/receivers in insolvency.",
                    hinglishText = "Non-registration ke bawajood kya kiya ja sakta hai? (1) Third party firm par case kar sakti hai; (2) Partners dukan ko legally band (dissolve) karne aur accounts settle karne ke liye court ja sakte hain; (3) Criminal case file kiya ja sakta hai.",
                    asciiFlowchart = """
[Still Allowed Even Without Registration] ──> [Suit for Firm Dissolution] + [Criminal Cases] + [Creditors Suing Firm]
                    """.trimIndent(),
                    microMnemonic = "STILL-ALLOWED",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Righteous Dissolution of Vali's Oppressive Reign",
                        loreOrContext = "Even when Bali violated customary fraternal norms, the sovereign moral law allowed Lord Rama to intervene and restore Kishkindha's balance of justice.",
                        asciiFlowchart = "[⚖️ Cosmic Justice Invoked] ──> [🎯 Overthrowing Injustice] ──> [🕊️ Righteous Order Restored]",
                        lessonQuote = "The doors of fundamental justice remain open to dissolve unrighteous pacts."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Partners Filing for Dissolution of Unregistered Tech Studio",
                        loreOrContext = "Rohan and Samir operated an unregistered gaming lab. When irreconcilable differences arose, Rohan successfully petitioned the civil court to auction assets and divide proceeds.",
                        asciiFlowchart = "[⚡ Irreconcilable Dispute] ──> [🏛️ Petition for Dissolution Allowed] ──> [💰 Assets Auctioned & Split]",
                        lessonQuote = "The law provides a clean surgical exit even when initial papers were informal."
                    ),
                    caseQuestion = "Can a partner of an unregistered firm approach the court to dissolve the firm?",
                    caseAnswer = "Yes. Suing for dissolution and realization of firm property is explicitly exempted under Section 69."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 20: The Unenforceable ₹5 Lakh Software Contract",
                    scenario = "'Apex Solutions' is an unregistered partnership firm of three coders. They delivered a custom ERP software package worth ₹5 Lakhs to ABC Ltd. ABC Ltd used the software but refused to pay the remaining ₹3.5 Lakhs balance. Apex Solutions filed a civil recovery suit.",
                    question = "Will the court entertain the recovery suit filed by Apex Solutions? Suggest the remedial step available to the firm.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State Section 69 of the Indian Partnership Act, 1932: An unregistered firm cannot sue third parties on contracts (1 Mark)",
                        "Ruling: The civil court will dismiss the suit as legally unmaintainable (1 Mark)",
                        "Remedial step: The firm can get itself registered with the Registrar of Firms, settle arrears, and file a fresh suit before the limitation period expires (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Registration is technically optional under law, but commercially mandatory in practice.",
                "Third parties can sue unregistered firms, but the firm cannot sue third parties for debts over ₹100."
            )
        ),

        // PAGE 21: Registration Procedure (Registrar of Firms)
        StudyPage(
            pageNumber = 21,
            module = ModuleCategory.PARTNERSHIP,
            title = "Registration Procedure: Filing with Registrar of Firms",
            subtitle = "From Statement of Particulars to Certificate of Registration",
            topicDescriptionEnglish = "Registration is effected by filing a formal statement with the Registrar of Firms of the state in which the place of business is situated, accompanied by prescribed fees and signed by all partners.",
            topicDescriptionHinglish = "Registration ka procedure 4 simple steps me hota hai: (1) Statement taiyar karo (dukan ka naam, pata, partners ke naam aur joining date); (2) Sabhi partners us par sign aur verify karein; (3) State ke 'Registrar of Firms' (ROF) ke paas prescribed fees ke sath jama karo; (4) Registrar check karke 'Certificate of Registration' issue kar dega.",
            macroMemoryTrick = "MACRO MNEMONIC: 'S-F-V-R' -> (S)tatement drafted, (F)ees paid, (V)erified by all, (R)egistration Certificate issued.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Formal Consecration of Sugriva as Sovereign of Kishkindha",
                loreOrContext = "After Vali's fall, sages, ministers, and commanders gathered in formal assembly with holy waters from seven seas, consecrating Sugriva with sacred Vedic rites and inscribing his sovereign ascension in royal scrolls.",
                asciiFlowchart = """
[💧 Waters of Seven Holy Seas] ──> [🧘 Sages Chant Consecration Mantras]
                                                 │
                                                 ▼
[👑 Sugriva Formally Crowned] ──> [📜 Inscribed in State Chronicles as Legitimate Sovereign]
                """.trimIndent(),
                lessonQuote = "Sacred ceremonies and public records elevate de facto power into de jure sovereign authority."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Step-by-Step Registration Procedure",
                    category = "Legal Procedure",
                    englishText = "Step 1: Submission of Application Form to the Registrar of Firms containing firm name, principal place, other branches, joining dates, and partner addresses. Step 2: Verification and signature by all partners. Step 3: Payment of prescribed government stamp duty and fees. Step 4: Registrar records entry in the Register of Firms and issues Certificate of Registration.",
                    hinglishText = "Sabse pehle application form bharo -> Sabhi partners ke sign karwao -> Government fees bharo -> Registrar of Firms verify karke entry karega aur 'Certificate of Registration' de dega. Ab aapki firm officially registered hai!",
                    asciiFlowchart = """
[📝 Draft Statement Form] ──> [✍️ Signatures of ALL Partners] ──> [🏛️ Registrar of Firms Review] ──> [📜 Certificate Issued!]
                    """.trimIndent(),
                    microMnemonic = "REG-4-STEPS",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Vibhishana's Formal Consecration at the Lanka Sea Shore",
                        loreOrContext = "Lord Rama instructed Lakshmana to bring sea water in a golden pot and formally consecrate Vibhishana as King of Lanka before the entire allied army.",
                        asciiFlowchart = "[🌊 Golden Pot of Sea Water] ──> [Lakshmana Anoints Vibhishana] ──> [👑 Rightful King Proclaimed]",
                        lessonQuote = "Legitimacy established before witnesses dispels all doubt."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Online Filing on State ROF Portal for D2C Apparel Brand",
                        loreOrContext = "Kritika uploaded the scanned notarized partnership deed and Aadhaar cards on the Maharashtra ROF portal, paid ₹1,500 fees, and downloaded the digital Certificate in 10 days.",
                        asciiFlowchart = "[💻 State ROF Portal Upload] ──> [💳 ₹1,500 Online Fee] ──> [📥 Download Digital Certificate]",
                        lessonQuote = "Modern e-governance transforms legal compliance into a frictionless afternoon task."
                    ),
                    caseQuestion = "At what point in the procedure does a partnership firm become legally recognized as a registered firm?",
                    caseAnswer = "When the Registrar of Firms makes an entry in the Register of Firms and issues the Certificate of Registration."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 21: The Defective Application of City Drycleaners",
                    scenario = "Sunil and Anil submitted an application for registration to the Registrar of Firms. However, Sunil signed the form on behalf of Anil using a forged signature without power of attorney. The Registrar issued a registration certificate. Later, a creditor challenged the validity of registration.",
                    question = "Is the registration legally valid? State the requirement of the Indian Partnership Act, 1932 regarding application signing.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State statutory rule: The statement must be signed and verified by ALL partners or by their specially authorized agents (1 Mark)",
                        "Analyze forgery: A forged signature invalidates the verification mandate (1 Mark)",
                        "Conclusion: Registration is defective and voidable upon proof of fraudulent verification (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Registration can be done at the time of formation or at any time during the currency of the firm.",
                "Every partner's verified signature or legal power of attorney is mandatory on the application."
            )
        ),

        // PAGE 22: Comprehensive Partnership Master Review & Distinction Table
        StudyPage(
            pageNumber = 22,
            module = ModuleCategory.PARTNERSHIP,
            title = "Partnership Master Matrix & Comprehensive Review",
            subtitle = "Sole Proprietorship vs. Partnership vs. LLP at a Glance",
            topicDescriptionEnglish = "A multi-dimensional comparison contrasting Sole Proprietorship, General Partnership, and Limited Liability Partnership (LLP) across governance, membership, capital, liability, and survival.",
            topicDescriptionHinglish = "Master Revision Table: Sole Proprietorship, General Partnership, aur LLP ke beech ka complete comparison chart. Exam me 4 ya 6 marks ka question aane par ye table full marks dilwayegi!",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-L-C-R-S' -> (M)embership, (L)iability, (C)ontrol, (R)egistration, (S)uccession.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Imperial Review of Allied Forces Before the Lanka Campaign",
                loreOrContext = "On the Suvela mountain peak, Lord Rama, Sugriva, Vibhishana, and Lakshmana surveyed Lanka's four colossal gates, methodically allocating specialized legion commanders to each battlement.",
                asciiFlowchart = """
             [🏔️ Suvela Mountain Command Summit]
                             │
       ┌─────────────┬───────┴───────┬─────────────┐
       ▼             ▼               ▼             ▼
[East Gate: Nila] [South: Angada] [West: Sugriva] [North Gate: Lord Rama & Lakshmana]
                             │
                             ▼
              [🎯 Flawless Multi-Front Strategic Coordination]
                """.trimIndent(),
                lessonQuote = "Systematic structural mapping before the battle guarantees victory on every flank."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Distinction Matrix: Sole Prop vs. Partnership vs. LLP",
                    category = "Master Distinction",
                    englishText = "Sole Prop: 1 member, unlimited liability, no registration, no perpetual succession. Partnership: 2 to 50 members, joint & several unlimited liability, optional registration, no perpetual succession. LLP: Min 2 (no max limit), limited liability, mandatory incorporation under LLP Act 2008, perpetual succession.",
                    hinglishText = "Sole Prop: 1 maalik, unlimited risk, koi registration nahi. Partnership: 2 se 50 partners, unlimited joint risk, optional registration. LLP: Min 2 (no upper limit), limited risk, mandatory registration with ROC, perpetual succession!",
                    asciiFlowchart = """
[BASIS]        [SOLE PROPRIETOR]     [PARTNERSHIP]         [LLP (ACT 2008)]
Members:       Only 1                2 to 50               Min 2, No Max
Liability:     Unlimited             Joint & Several Unl.  Limited to capital
Registration:  Nil                   Optional              Mandatory (ROC)
Entity:        No separate entity    No separate entity    Distinct Body Corporate
Perpetual:     No                    No                    Yes (Forever)
                    """.trimIndent(),
                    microMnemonic = "MASTER-TRIPLET",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Evolutionary Progression of Royal Assemblies",
                        loreOrContext = "From solitary forest austerity to allied Vanara confederation and finally to the eternal imperial assembly of Ayodhya, structures evolved to match expanding cosmic missions.",
                        asciiFlowchart = "[Solitary Austerity] ──> [Allied Confederation] ──> [Sovereign Imperial Realm]",
                        lessonQuote = "Scale demands institutional evolution from individual hustle to immortal structures."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Founder Journey: Freelancer -> Agency Partner -> FinTech LLP",
                        loreOrContext = "Tanya started as a freelance copywriter (Sole Prop), took a partner to scale to 10 clients (Partnership), and incorporated an LLP when taking on enterprise corporate retainers.",
                        asciiFlowchart = "[Solo Freelance] ──> [2-Person Partnership] ──> [Enterprise LLP with Limited Liability]",
                        lessonQuote = "Upgrade your corporate vehicle as the stakes of the game multiply."
                    ),
                    caseQuestion = "Which business form combines the internal flexibility of a partnership with the limited liability of a company?",
                    caseAnswer = "Limited Liability Partnership (LLP) under the LLP Act, 2008."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 22: The Strategic Restructuring of Zenith Logistics",
                    scenario = "Four partners running an inter-state logistics fleet are worried about highway accident liability claims that could wipe out their personal ancestral homes. They wish to retain partnership flexibility but eliminate unlimited personal exposure.",
                    question = "What legal reorganization would you recommend to Zenith Logistics? State two definitive advantages of this form.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: Convert into a Limited Liability Partnership (LLP) under LLP Act, 2008 (1 Mark)",
                        "Advantage 1: Limited Liability - Personal property of partners is protected against torts and debt (1 Mark)",
                        "Advantage 2: Separate Legal Entity & Perpetual Succession - Firm continues unaffected by partner changes (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Partnership scales capital and managerial talent beyond sole proprietorship limits.",
                "LLP represents the contemporary gold standard for professionals seeking limited liability without full corporate burden."
            )
        )
    )
}
