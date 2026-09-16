package com.example.data

import com.example.model.*

object SoleProprietorshipData {
    val pages = listOf(
        // PAGE 01: Concept & Definition
        StudyPage(
            pageNumber = 1,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Sole Proprietorship: Genesis & Core Definition",
            subtitle = "The Oldest & Simplest Form of Commercial Enterprise",
            topicDescriptionEnglish = "A Sole Proprietorship is an unincorporated business enterprise owned, managed, controlled, and financed by a single individual who is the sole recipient of all profits and bears entire risk of loss.",
            topicDescriptionHinglish = "Sole Proprietorship ka matlab hai ek aisi dukan ya business jisme sirf ek hi maalik (proprietor) hota hai. Wahi saari capital lagata hai, poora control rakhta hai, aur akele hi saara munafa ya nuksan jhelta hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'S-O-L-E' -> (S)ingle Owner, (O)ne-man Control, (L)imited Resources, (E)ntire Risk Bearer.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Kewat's Independent Boat Ferry Service at the Ganga Shore",
                loreOrContext = "When Lord Rama, Sita, and Lakshmana reached the holy river Ganga, Kewat operated his solitary ferry boat with complete personal devotion, total control, and direct responsibility for every passenger.",
                asciiFlowchart = """
[🚣 Kewat (Sole Owner)]
       │ (100% Capital: Single Wooden Boat)
       ▼
[🌊 Direct River Crossing Service]
       │ (Direct Patron Contact: Lord Rama)
       ▼
[✨ Full Spiritual Fruit & Zero Agency Conflict]
                """.trimIndent(),
                lessonQuote = "A single-hearted master steers his vessel without bureaucratic friction."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Single Ownership & Capital Commitment",
                    category = "Core Concept",
                    englishText = "The enterprise is wholly owned by one individual who arranges capital through personal savings, inheritance, or uncollateralized borrowings.",
                    hinglishText = "Business ka maalik sirf ek insaan hota hai. Saara paisa uski apni savings ya personal loan se lagta hai. Koi dusra partner ya shareholder nahi hota.",
                    asciiFlowchart = """
[💰 Personal Savings] ──> [👤 Sole Entrepreneur] ──> [🏪 100% Equity Ownership]
                    """.trimIndent(),
                    microMnemonic = "SOLO-CAP",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Shabari's Sole Ashram Grove Hospitality",
                        loreOrContext = "Mother Shabari single-handedly gathered and tasted each berry for Lord Rama with unmatched dedication and total self-reliance.",
                        asciiFlowchart = "[👵 Shabari] ──> [🫐 Handpicked Berries] ──> [🏹 Lord Rama's Acceptance]",
                        lessonQuote = "Personal accountability creates the purest offering."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Aryan's Curated Vintage Sneaker Reselling Hustle",
                        loreOrContext = "Aryan runs 'SneakDrop' from his dorm room, sourcing rare Dunks with his own pocket money, keeping 100% profit margins.",
                        asciiFlowchart = "[👟 Aryan's Savings] ──> [📱 Instagram DM Sales] ──> [💵 100% Net Profit]",
                        lessonQuote = "Bootstrapped from zero, owning 100% of the equity."
                    ),
                    caseQuestion = "Rohan started a custom phone-case studio using Rs. 50,000 from his savings. Identify the form of business organisation.",
                    caseAnswer = "Sole Proprietorship, as it is owned, funded, and operated solely by Rohan."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 1: Ananya's Designer Boutique Expansion Dilemma",
                    scenario = "Ananya established 'Vogue Threads' as a sole proprietor in Jaipur. Her bespoke bridal lehengas became famous across Instagram. However, she struggles to fulfill bulk orders from Delhi due to cash constraints and 18-hour daily work shifts.",
                    question = "(a) Identify two inherent limitations of sole proprietorship faced by Ananya. (b) What alternative form of business would you advise her to adopt?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Step 1: Identify Limitation 1 -> Limited Managerial Ability & Limited Capital Resources (1 Mark)",
                        "Step 2: Analysis of Personal Exhaustion and Capital Crunch (1 Mark)",
                        "Step 3: Recommendation -> Partnership or Private Limited Company for pooled capital and specialization (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Oldest form governed by common law, not by any dedicated specific legislative act.",
                "Proprietor and business are legally not distinct entities in terms of liability."
            )
        ),

        // PAGE 02: Features - Formation & Closure, Unlimited Liability
        StudyPage(
            pageNumber = 2,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Sole Proprietorship: Critical Structural Features",
            subtitle = "Ease of Inception vs. The Burden of Unlimited Liability",
            topicDescriptionEnglish = "Two defining structural pillars of sole proprietorship are frictionless commencement without complex legal charters, juxtaposed against unlimited personal liability for unpaid debts.",
            topicDescriptionHinglish = "Sole proprietorship shuru karna aur band karna sabse aasaan hai kyunki koi legal registration mandatory nahi hoti. Par sabse bada khatra hai 'Unlimited Liability'—agar karza zyada ho gaya to ghar-baar tak bik sakta hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'F-U-C-K' -> (F)ormation Easy, (U)nlimited Liability, (C)ontrol Sole, (K)inship/No Separate Entity.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "King Dasharatha's Sacred Word (Pratigya)",
                loreOrContext = "Dasharatha bore unlimited personal liability for his sacred boons granted to Kaikeyi. Even when it cost his life, personal honour was inseparable from royal commitment.",
                asciiFlowchart = """
[👑 Dasharatha's Royal Word] ──> [⚖️ Unlimited Personal Liability] ──> [🏛️ Supreme Sacrifice]
                """.trimIndent(),
                lessonQuote = "In true proprietorship, the owner's personal self stands directly on the line."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Formation and Closure (No Strict Legislation)",
                    category = "Feature",
                    englishText = "Hardly any legal formalities are required to start a sole proprietorship. In some trades, a local municipal trade licence or GST registration suffices. Closure is equally straightforward.",
                    hinglishText = "Isko shuru karne ke liye koi Act ya rigid registration nahi chahiye. Bas basic local gumasta/shop license ya GST lo aur dukan shuru! Band karna ho toh jab marzi shutter gira do.",
                    asciiFlowchart = """
[💡 Business Idea] ──> [📄 Basic Shop License] ──> [🚀 Immediate Operation]
                    """.trimIndent(),
                    microMnemonic = "EASY-START",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Guha's Sringaverapura Outpost Establishment",
                        loreOrContext = "Nishadraj Guha maintained his tribal river trading post with swift personal sovereignty without awaiting long parliamentary clearances.",
                        asciiFlowchart = "[🛶 Guha] ──> [🏕️ Instant Riverpost] ──> [📦 Frictionless Trade]",
                        lessonQuote = "Speed of execution is the ultimate sovereign advantage."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Tanmay's Substack & AI Prompt Engineering Newsletter",
                        loreOrContext = "Tanmay launched 'PromptWizard' within 45 minutes on Substack and Stripe, with zero corporate registrar filings.",
                        asciiFlowchart = "[💻 Laptop + Domain] ──> [📧 Substack Live] ──> [💳 First 500 Subscribers]",
                        lessonQuote = "Zero bureaucratic gatekeepers between your hustle and your customers."
                    ),
                    caseQuestion = "Vikram started a fruit stall on MG Road without forming a registered company. Is this legally permissible?",
                    caseAnswer = "Yes, sole proprietorship does not require statutory incorporation under Indian law."
                ),
                SubPointItem(
                    pointTitle = "Unlimited Liability (The Sword of Damocles)",
                    category = "Feature",
                    englishText = "The sole proprietor possesses unlimited liability. If business assets fall short of commercial obligations, creditors have the legal right to claim personal assets (house, car, jewelry).",
                    hinglishText = "Business ke nuksan ke liye maalik ki personal property bhi kurk ho sakti hai. Business aur maalik alag-alag nahi hote, isliye dukan ka karza ghar ke gehne bechkar bhi chukana padega!",
                    asciiFlowchart = """
[Business Debt: ₹15L] > [Business Assets: ₹8L] 
                     │
                     ▼
[Deficit ₹7L Extracted from Personal House/Savings!]
                    """.trimIndent(),
                    microMnemonic = "UNLIM-RISK",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Harishchandra's Moral Fulfillment of Commercial Debt",
                        loreOrContext = "To pay Sage Vishwamitra's promised dakshina, King Harishchandra sold his personal liberty, palace, and worked at the cremation ghats.",
                        asciiFlowchart = "[👑 King's Promise] ──> [🏚️ Loss of Kingdom] ──> [💀 Personal Self Pledged]",
                        lessonQuote = "Honor demands that obligations extend beyond material boundaries."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Kabir's Over-leveraged D2C Cloud Kitchen",
                        loreOrContext = "Kabir took an uncollateralized personal credit line of ₹8 Lakhs for fancy kitchen ovens. When orders dried up, bank recovery agents seized his personal motorbike.",
                        asciiFlowchart = "[🍳 Cloud Kitchen Fails] ──> [📉 ₹8L Dues] ──> [🏍️ Personal Vehicle Seized]",
                        lessonQuote = "Risk is real; calculate leverage before chasing unverified hype."
                    ),
                    caseQuestion = "Suresh has business debts of ₹5 Lakhs but shop assets are worth only ₹3 Lakhs. Can the creditor touch Suresh's private bank account?",
                    caseAnswer = "Yes. In a sole proprietorship, liability is unlimited, so personal savings can be attached."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 2: Creditor Recovery from Ramesh Kirana Store",
                    scenario = "Ramesh ran an unregistered grocery store. A devastating short-circuit destroyed stock worth ₹6 Lakhs. Ramesh owed wholesaler M/s Gupta Traders ₹4 Lakhs. Ramesh claims: 'My shop is bankrupt, so I cannot pay.'",
                    question = "Advise M/s Gupta Traders under Business Studies principles regarding legal recovery from Ramesh.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the doctrine of Unlimited Liability in Sole Proprietorship (1 Mark)",
                        "Clarify that Sole Proprietor has No Separate Legal Entity from the firm (1 Mark)",
                        "Conclusion: Gupta Traders can legally attach Ramesh's personal savings or personal land to recover ₹4 Lakhs (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Lack of separate legal existence links the owner's personal wealth directly to commercial risk.",
                "Simplicity in creation comes at the cost of personal exposure."
            )
        ),

        // PAGE 03: Features - Sole Risk Bearer, Control & No Separate Legal Entity
        StudyPage(
            pageNumber = 3,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Sole Risk Bearer, Centralised Control & Entity Illusion",
            subtitle = "Direct Incentive vs. The Fragility of Identity",
            topicDescriptionEnglish = "The sole proprietor is the solitary risk bearer and sole profit recipient, enjoying total decision-making autonomy while lacking a distinct legal personality separate from the individual.",
            topicDescriptionHinglish = "Proprietor akela hi 'Hero' hai aur akela hi 'Zero'! Sara profit uska apna hota hai jisse 100% motivation milti hai. Decision lene me kisi partner se puchna nahi padta, par kanoon ki nazar me dukan aur dukanndar ek hi hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'R-C-E' -> (R)isk Bearer Sole, (C)ontrol Undivided, (E)ntity Absence.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Jatayu's Autonomous Heroic Intervention",
                loreOrContext = "When Ravana abducted Sita, elderly Jatayu attacked Ravana without awaiting reinforcements or holding a council meeting. He bore the absolute operational risk and earned eternal immortal glory.",
                asciiFlowchart = """
[🦅 Jatayu Sees Injustice] 
       │ (Instant Autonomous Decision)
       ▼
[⚔️ Direct Combat with Ravana] 
       │ (100% Risk Borne Personally)
       ▼
[🕊️ Supreme Moksha & Lord Rama's Gratitude]
                """.trimIndent(),
                lessonQuote = "When duty calls, solitary bravery cuts through all bureaucratic hesitation."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Sole Risk Bearer and Profit Recipient",
                    category = "Feature",
                    englishText = "The proprietor shoulders the entire risk of failure alone. In return, all profits belong to him directly, establishing the most potent direct relationship between effort and reward.",
                    hinglishText = "Saara risk akela uthana padta hai, lekin sabse sweet baat ye hai ki jo bhi munafa hoga wo kisi ke sath share nahi karna padega. Jitni mehnat, utna seedha reward!",
                    asciiFlowchart = """
[💪 100% Personal Effort] ──> [📈 Revenue Boost] ──> [💰 100% Pocket Retention]
                    """.trimIndent(),
                    microMnemonic = "DIRECT-REWARD",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Hanuman Ji's Solitary Reconnaissance Mission to Lanka",
                        loreOrContext = "Hanuman Ji crossed the ocean alone, bearing total risk of capture, and returned with Sita Mata's Chudamani, earning Lord Rama's direct embrace.",
                        asciiFlowchart = "[🐒 Solo Ocean Leap] ──> [🔥 Lanka Infiltration] ──> [👑 Supreme Divine Favor]",
                        lessonQuote = "Solitary risk undertaken with pure focus yields undivided triumph."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Meera's 3D Blender Graphic Assets Store",
                        loreOrContext = "Meera spent 3 months coding procedural 3D materials and sells them on Gumroad. Every dollar lands straight into her bank account.",
                        asciiFlowchart = "[🎨 3 Months Solo Coding] ──> [🌐 Global Gumroad Sales] ──> [💳 $4k/Mo Direct Income]",
                        lessonQuote = "Direct leverage means no middlemen slicing your margin."
                    ),
                    caseQuestion = "Explain how sole proprietorship provides the highest degree of personal motivation.",
                    caseAnswer = "Due to the absence of profit-sharing; the owner knows every extra rupee earned directly enters their pocket."
                ),
                SubPointItem(
                    pointTitle = "Lack of Separate Legal Entity",
                    category = "Feature",
                    englishText = "In the eyes of the law, no distinction exists between the sole proprietor and his business. The owner is personally responsible for every tort, contractual breach, and commercial debt of the firm.",
                    hinglishText = "Kanoon ki aankho me 'Raju Stationery' aur 'Raju' do alag cheezein nahi hain. Agar dukan kisi ka paisa dubayegi to case Raju par chalega, dukan par nahi.",
                    asciiFlowchart = """
[Law: Court of Justice] ──> [Owner == Business (Single Legal Persona)]
                    """.trimIndent(),
                    microMnemonic = "NO-VEIL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "King Angada's Unyielding Identity as Royal Envoy",
                        loreOrContext = "When Angada planted his foot in Ravana's court, Angada and Lord Rama's sovereign delegation were inseparable in stature and accountability.",
                        asciiFlowchart = "[🦶 Angada's Firm Foot] ──> [⚖️ Envoy Inseparable from Sovereign Message]",
                        lessonQuote = "Integrity means your word and your presence are indistinguishable."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Freelance UI Designer Copyright Infringement Notice",
                        loreOrContext = "Rishi used a copyrighted font in a freelance app project under the name 'PixelCraft Studios'. The font foundry sued Rishi personally in civil court.",
                        asciiFlowchart = "[💻 Rishi ('PixelCraft')] ──> [⚖️ Legal Notice] ──> [🏛️ Rishi Personally Sued]",
                        lessonQuote = "A trade name is just a label; legally, you stand in the dock."
                    ),
                    caseQuestion = "Can a sole proprietorship sue a customer in its own trade name without naming the owner?",
                    caseAnswer = "No. Law recognizes the owner personally, not the unregistered business moniker."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 3: Profit Retention & Tax Identity",
                    scenario = "Devansh opened a gaming lounge. He earned ₹12 Lakhs net profit in his first year. He wondered if the business needs to file an independent corporate income tax return.",
                    question = "Advise Devansh on the legal identity and tax filing process of a sole proprietorship.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Mention that a sole proprietorship has No Separate Legal Entity (1 Mark)",
                        "Business income is clubbed directly with the individual proprietor's personal income (1 Mark)",
                        "Tax is assessed at individual slab rates using the proprietor's PAN card (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Direct incentive motivates relentless personal effort.",
                "Business identity and personal identity are legally identical."
            )
        ),

        // PAGE 04: Features - Lack of Business Continuity
        StudyPage(
            pageNumber = 4,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Lack of Business Continuity & Mortal Fragility",
            subtitle = "When the Founder Falls, the Business Shuts Down",
            topicDescriptionEnglish = "A sole proprietorship suffers from acute existential vulnerability. Because the firm and the proprietor are co-terminus, the illness, death, insanity, imprisonment, or insolvency of the owner immediately strikes at the survival of the enterprise.",
            topicDescriptionHinglish = "Sole proprietorship me 'Perpetual Succession' (lagataar chalte rehna) nahi hota. Agar maalik beemar pad gaya, pagal ho gaya, jail chala gaya ya uski death ho gayi, to dukan turant band ho jaati hai jab tak koi legal heir usse sambhal na le.",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-O-R-T-A-L' -> (M)ortal Owner, (O)rphan Enterprise, (R)uptured Supply, (T)ermination Swift, (A)ssets Liquidated, (L)ack of Continuity.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Kishkindha's Vulnerability During Bali's Protracted Cave Duel",
                loreOrContext = "When Bali remained inside Mayavi's cavern for a year without communicating, the monkey realm fell into immediate existential uncertainty and grief.",
                asciiFlowchart = """
[👑 King Bali in Solitary Battle]
       │ (Absence of Sovereign Communication)
       ▼
[🏔️ Sealed Cave & Kishkindha in Existential Turmoil]
       │ (Absence of Institutional Succession)
       ▼
[👑 Sugriva Compelled to Assume Regency]
                """.trimIndent(),
                lessonQuote = "Institutions built solely around one mortal leader face instant crisis upon their silence."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Lack of Business Continuity",
                    category = "Feature",
                    englishText = "The life cycle of a sole proprietorship is strictly tied to the life span and capacity of its owner. Unlike joint-stock companies, there is zero perpetual succession.",
                    hinglishText = "Company ki tarah yaha 'Members may come, members may go, but company goes on forever' wala concept nahi chalta. Founder khatam = dukan band hone ka khatra!",
                    asciiFlowchart = """
[👤 Sole Proprietor Decease/Incapacity] ──> [❌ Instant Operational Freeze] ──> [🏚️ Business Dissolved]
                    """.trimIndent(),
                    microMnemonic = "NO-PERPETUAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Ayodhya's Momentary Succession Vacuum",
                        loreOrContext = "With Dasharatha's demise and Rama in exile, Ayodhya's administration paused until Bharata placed the sacred padukas on the throne.",
                        asciiFlowchart = "[👑 Dasharatha Departed] ──> [🛑 Administrative Stagnation] ──> [👡 Paduka Regency Needed]",
                        lessonQuote = "A governance model without institutional continuity creates governance voids."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Pooja's Solo Wedding Planning Consultancy",
                        loreOrContext = "Pooja was hospitalized with dengue right during the peak wedding week of December. Having no partners or deputies, all 4 wedding events were cancelled.",
                        asciiFlowchart = "[👰 4 Grand Weddings Booked] ──> [🏥 Pooja Hospitalized] ──> [🛑 Entire Business Stalls]",
                        lessonQuote = "If your business cannot run without your active breath, you don't own a business—you own a job."
                    ),
                    caseQuestion = "Why do banks hesitate to give long-term 20-year commercial loans to sole proprietors?",
                    caseAnswer = "Due to lack of continuity; if the proprietor dies or becomes incapacitated, the loan recovery becomes highly precarious."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 4: The Sudden Demise of Master Goldsmith Nathulal",
                    scenario = "Nathulal was a celebrated master goldsmith operating 'Nathulal Jewellers'. His bespoke filigree technique was known only to him. Upon his sudden cardiac arrest, his sons, who are software engineers, could not craft ornaments, and loyal patrons withdrew their advances.",
                    question = "Identify and explain the feature of sole proprietorship highlighted in this case scenario.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identification: 'Lack of Business Continuity' / 'Dependence on Personal Skill' (1 Mark)",
                        "Explanation: The business enterprise lacks perpetual succession and is co-extensive with the proprietor's life and unique personal skill (1 Mark)",
                        "Impact: Death or incapacity terminates operations or damages goodwill irreparably (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Sole proprietorship lacks perpetual succession.",
                "High existential risk makes institutional debt financing difficult to secure."
            )
        ),

        // PAGE 05: Merits - Quick Decision Making & Confidentiality
        StudyPage(
            pageNumber = 5,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Merits: Agile Decision Making & Absolute Secrecy",
            subtitle = "Speed of Action and Complete Protection of Trade Secrets",
            topicDescriptionEnglish = "Two sterling merits of sole proprietorship are prompt decision-making free from administrative bureaucracy, and complete confidentiality of strategic information and business formulation.",
            topicDescriptionHinglish = "Sole proprietorship ke 2 sabse zabardast fayde hain: Pehla, 'Quick Decision'—kisi board meeting ya partner ki permission nahi chahiye, palak jhapakte faisla lo. Doosra, 'Chup-chaap Secrecy'—apna formula aur accounts kisi public ko dikhane ki zaroorat nahi.",
            macroMemoryTrick = "MACRO MNEMONIC: 'Q-S-D-F' -> (Q)uick Decisions, (S)ecrecy Absolute, (D)irect Incentive, (F)lexibility Complete.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Lord Rama's Swift Battle Strategy Against Khara & Dushana",
                loreOrContext = "In Dandakaranya, when 14,000 demons attacked, Lord Rama instantly instructed Lakshmana to safeguard Sita in the mountain cave and engaged the demonic army single-handedly without strategic debate.",
                asciiFlowchart = """
[🏹 Threat Detected: 14,000 Demons] 
       │ (Zero Deliberation Lag)
       ▼
[⚡ Immediate Command to Lakshmana] 
       │ (Total Swiftness of Action)
       ▼
[🎯 Decisive Vanquishing of Adversaries]
                """.trimIndent(),
                lessonQuote = "Where supreme command rests in one mind, opportunity is seized before doubt awakens."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Quick Decision Making",
                    category = "Merit",
                    englishText = "The proprietor enjoys complete freedom in decision-making. No consultation with partners, directors, or shareholders is required, enabling rapid exploitation of transient market opportunities.",
                    hinglishText = "Maalik ko kisi aur se voting ya debate nahi karni hoti. Agar kal subah discount offer nikalna hai ya supplier badalna hai, to 2 minute me decision final!",
                    asciiFlowchart = """
[💡 Market Opportunity] ──> [🧠 Solo Owner Approval] ──> [⚡ Instant Market Execution]
                    """.trimIndent(),
                    microMnemonic = "SWIFT-ACT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Hanuman Ji's Instant Sanjeevani Mountain Decision",
                        loreOrContext = "Unable to identify the exact herb on Dronagiri in the dead of night, Hanuman Ji made an instant executive decision to lift the entire mountain peak.",
                        asciiFlowchart = "[🏔️ Herb Unknown] ──> [⚡ Solo Instant Decision] ──> [💪 Whole Mountain Carried]",
                        lessonQuote = "Decisiveness in crisis turns potential disaster into glorious triumph."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Aman's Flash Trend Instagram Reel Merch Drop",
                        loreOrContext = "A meme trend blew up at 11 PM. Aman designed a graphic T-shirt, uploaded mockups to print-on-demand at 11:30 PM, and netted ₹60,000 by 4 AM.",
                        asciiFlowchart = "[🔥 Meme Viral at 11 PM] ──> [⚡ Aman Acts Solo] ──> [💰 ₹60k Sales by Morning]",
                        lessonQuote = "While large corporations schedule approval meetings, the agile solo hacker ships."
                    ),
                    caseQuestion = "Why is a sole proprietorship more capable of capturing flash discounts during festival sales compared to a public company?",
                    caseAnswer = "Because the proprietor takes instant purchase decisions without waiting for board approvals or tender formalities."
                ),
                SubPointItem(
                    pointTitle = "Confidentiality of Information (Trade Secrecy)",
                    category = "Merit",
                    englishText = "A sole proprietor is not legally mandated to publish annual financial accounts or audit statements to the general public. Operational formulations, client lists, and margins remain strictly secret.",
                    hinglishText = "Company ki tarah apne annual accounts newspaper ya ROC me jama nahi karne padte. Dukan ka secret formula, khareed daam, aur profit margin sirf maalik ke dil me band rehta hai.",
                    asciiFlowchart = """
[🤐 Proprietary Trade Secrets] ──> [🔒 Safe Inside Owner's Vault] ──> [🛡️ Zero Competitor Leaks]
                    """.trimIndent(),
                    microMnemonic = "VAULT-SEC",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Vibhishana's Strategic Vault of Lanka Secrets",
                        loreOrContext = "Vibhishana kept the confidential architectural vulnerabilities of Lanka's invincible gates strictly guarded until the opportune moment.",
                        asciiFlowchart = "[🏰 Lanka Defense Weakness] ──> [🔒 Guarded Knowledge] ──> [🎯 Decisive Victory]",
                        lessonQuote = "True strategic advantage lies in protected wisdom."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Chef Prateek's Secret Spice Mix for Viral Burger Stall",
                        loreOrContext = "Prateek blends his 14-spice sauce at his private home kitchen before bringing it to his street cart, never disclosing the ingredients to his hired counter boys.",
                        asciiFlowchart = "[🌶️ 14 Secret Spices] ──> [🏠 Home Blending] ──> [🍔 Uncopyable Viral Taste]",
                        lessonQuote = "Your secret sauce is your moat; never publish what makes you irreplaceable."
                    ),
                    caseQuestion = "State whether a sole proprietor must file audited accounts for public inspection under the Companies Act 2013.",
                    caseAnswer = "No. Sole proprietorships are exempt from public financial disclosure obligations."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 5: The Baker's Sourdough Culture Secrecy",
                    scenario = "Gourmet baker Sameer nurtures a 20-year-old sourdough yeast strain that gives his artisanal bread a distinctive flavor. A venture capitalist offered to invest ₹50 Lakhs if Sameer incorporates a public company and registers all recipe documentation.",
                    question = "What primary advantage of his current sole proprietorship form will Sameer surrender if he agrees to corporate disclosure?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the merit: Confidentiality / Secrecy of Trade Operations (1 Mark)",
                        "Explain that public companies must publish detailed registers and accounts accessible to rivals (1 Mark)",
                        "Conclusion: Sameer's exclusive proprietary recipe would risk losing its secret protection (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Speed in tactical execution beats cumbersome multi-tier corporate hierarchies.",
                "Absolute confidentiality protects competitive recipes, recipes, and supplier trade discounts."
            )
        ),

        // PAGE 06: Merits - Direct Incentive & Sense of Accomplishment
        StudyPage(
            pageNumber = 6,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Merits: Direct Incentive & Psychological Accomplishment",
            subtitle = "The Unfiltered Connection Between Sweat and Satisfaction",
            topicDescriptionEnglish = "Because the proprietor retains 100% of residual revenue, there is zero agency dilemma. Furthermore, successful enterprise creates immense psychological pride and personal fulfillment.",
            topicDescriptionHinglish = "Har extra ghanta kaam karne ka paisa seedha maalik ki jeb me jata hai—kisi lazy partner ko hissa nahi dena padta! Jab dukan successful hoti hai, to society me jo respect aur aatmasantosh milta hai, uska koi muqabla nahi.",
            macroMemoryTrick = "MACRO MNEMONIC: 'P-R-I-D-E' -> (P)ersonal Reward, (R)esidual Claimant, (I)ncentive Direct, (D)rive Unstoppable, (E)steem Supreme.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Squirrel's Dedicated Service in Ram Setu Construction",
                loreOrContext = "A tiny squirrel rolled in sand grains and dusted them between the massive boulders for Lord Rama. Blessed with Lord Rama's direct caress (the three stripes on its back), the squirrel experienced supreme personal accomplishment.",
                asciiFlowchart = """
[🐿️ Tiny Sand Grains Contributed] 
       │ (Pure Unmediated Devotion)
       ▼
[✨ Direct Divine Touch of Lord Rama] 
       │ (Supreme Psychological & Spiritual Fulfillment)
       ▼
[🌟 Eternal Three Stripes of Honor]
                """.trimIndent(),
                lessonQuote = "No honest contribution is too small when the effort flows directly from the heart."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Direct Incentive (No Agency Loss)",
                    category = "Merit",
                    englishText = "The direct link between effort and reward inspires maximum industry. There is no corporate free-rider problem where one partner works while another slacks off.",
                    hinglishText = "Business me jitna pasina bahaoge, utna meetha fal milega. Koi aalsi partner nahi hai jo bina kaam kiye aadhi kamayi le jaye. Direct incentive = Maximum hard work!",
                    asciiFlowchart = """
[🔥 Extra Working Hours] ──> [📈 Incremental Sales] ──> [💰 100% Surplus to Founder]
                    """.trimIndent(),
                    microMnemonic = "EFFORT=CASH",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Lord Lakshmana's Vigilant 14-Year Forest Guard",
                        loreOrContext = "Lakshmana foreswore sleep to guard Rama and Sita directly, finding supreme joy in unalloyed, undivided devotion.",
                        asciiFlowchart = "[🏹 Lakshmana's Night Vigil] ──> [🛡️ Complete Protection] ──> [❤️ Eternal Glory]",
                        lessonQuote = "When you work for your supreme ideal, tiredness dissolves."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Dev's Solo SaaS Boilerplate Project",
                        loreOrContext = "Dev coded a Next.js SaaS template. When it crossed $10,000 in monthly recurring revenue, he didn't need to distribute dividends to absentee angels.",
                        asciiFlowchart = "[💻 Solitary Weekend Sprints] ──> [🚀 Stripe Influx: $10k/mo] ──> [🏖️ Financial Autonomy]",
                        lessonQuote = "The purest hustle is when 100% of the upside compounds to your own ledger."
                    ),
                    caseQuestion = "Distinguish the incentive structure of a sole proprietor from that of a salaried corporate manager.",
                    caseAnswer = "A manager receives fixed remuneration regardless of extraordinary profits, whereas a proprietor captures 100% of residual surplus."
                ),
                SubPointItem(
                    pointTitle = "Sense of Accomplishment & Personal Pride",
                    category = "Merit",
                    englishText = "Guiding an enterprise from humble beginnings to commercial viability induces immense self-actualization, boosting confidence and community standing.",
                    hinglishText = "Jab ek vyakti zero se apna business khada karta hai aur customer uske brand ki tareef karte hain, to jo garv aur self-respect milti hai, wo kisi naukri me nahi mil sakti.",
                    asciiFlowchart = """
[🌱 Seed Capital & Sweat] ──> [🏢 Thriving Enterprise] ──> [🏆 Elevated Social Standing]
                    """.trimIndent(),
                    microMnemonic = "HIGH-PRIDE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Bharata's Faithful Custodianship of the Throne",
                        loreOrContext = "Bharata ruled Ayodhya from Nandigram as a selfless trustee, placing Rama's padukas on the throne, earning timeless universal reverence.",
                        asciiFlowchart = "[👡 Sacred Padukas Honored] ──> [⚖️ Flawless 14-Yr Stewardship] ──> [👑 Immortal Moral Renown]",
                        lessonQuote = "True accomplishment is measured by fidelity to righteousness."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Kavya's Handcrafted Candle Studio Featured in Vogue",
                        loreOrContext = "Kavya started pouring soy candles in her balcony. Seeing her brand in Vogue made her realize her creative vision had achieved global validation.",
                        asciiFlowchart = "[🕯️ Balcony Candle Pouring] ──> [📰 Vogue Feature] ──> [👑 Peerless Self-Actualization]",
                        lessonQuote = "Build something with your hands that commands respect in the marketplace."
                    ),
                    caseQuestion = "Why is the satisfaction derived from running a sole proprietorship considered higher than passive share investments?",
                    caseAnswer = "Because success is a direct testament to the owner's personal ingenuity, tenacity, and daily labor."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 6: Kunal's Shift from Corporate Banking to Specialty Cafe",
                    scenario = "Kunal quit his high-paying VP job at an MNC bank where he earned ₹35 Lakhs CTC to open a single specialty coffee kiosk 'Roast & Brew'. Despite earning ₹15 Lakhs in year one, he reports feeling ten times happier and deeply energized.",
                    question = "Explain the psychological merit of sole proprietorship experienced by Kunal.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the merit: Sense of Accomplishment and Autonomy (1 Mark)",
                        "Explain that personal ownership provides direct agency, freedom from corporate hierarchy, and validation of personal craftsmanship (1 Mark)",
                        "Contrast direct incentive with detached corporate wage employment (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Direct alignment of personal effort and revenue maximization minimizes moral hazard.",
                "Entrepreneurs draw deep intrinsic self-esteem from building independent sovereign ventures."
            )
        ),

        // PAGE 07: Limitations - Limited Resources & Unlimited Liability
        StudyPage(
            pageNumber = 7,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Limitations: Capital Ceiling & Personal Financial Peril",
            subtitle = "The Inherent Bottlenecks of Single-Pocket Financing",
            topicDescriptionEnglish = "A sole proprietorship encounters acute structural limitations: access to capital is confined to the personal wealth and borrowing capacity of one mortal person, while unlimited liability threatens total insolvency.",
            topicDescriptionHinglish = "Sole proprietorship ke 2 sabse bade dushman hain: Pehla, 'Limited Capital'—ek akela insaan kitna paisa laga lega? Bank bhi collateral bina bada loan nahi dete. Doosra, 'Unlimited Liability'—agar market crash hua to dukan ke sath ghar aur zameen bhi bik jayegi!",
            macroMemoryTrick = "MACRO MNEMONIC: 'L-I-M-I-T' -> (L)imited Capital, (I)nfinite Liability, (M)anagerial Shortfall, (I)nstability, (T)ermination Threat.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Sugriva's Helplessness in the Rishyamukha Exile",
                loreOrContext = "Exiled by Bali without royal treasury or standing army, Sugriva was confined to Rishyamukha mountain due to severely limited sovereign resources, until he formed a strategic alliance with Lord Rama.",
                asciiFlowchart = """
[👑 Sugriva Deprived of Treasury & Power]
       │ (Severe Solitary Resource Deficit)
       ▼
[🏔️ Confined to Rishyamukha Sanctuaries]
       │ (Inability to Challenge Bali Alone)
       ▼
[🤝 Urgent Need for an Allied Strategic Union with Lord Rama]
                """.trimIndent(),
                lessonQuote = "Even mighty kings cannot conquer cosmic challenges without pooling strategic resources."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Limited Capital Resources",
                    category = "Limitation",
                    englishText = "The financial base is strictly circumscribed by the proprietor's personal savings and creditworthiness. Commercial banks are reluctant to extend sizeable unsecured credit due to mortality and scale concerns.",
                    hinglishText = "Paisa hamesha kam padta hai. Dukan ko bada showroom ya factory banane ke liye karodo rupaye chahiye hote hain, jo akela insaan apni jeb ya rishtedaaro se arrange nahi kar sakta.",
                    asciiFlowchart = """
[Proprietor Savings: ₹5L] + [Bank Credit: ₹3L] ──> [Ceiling: ₹8L] ──> [❌ Cannot Scale to National Factory]
                    """.trimIndent(),
                    microMnemonic = "CASH-CRUNCH",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Sampati's Burned Wings and Resource Constraint",
                        loreOrContext = "Sampati had the celestial vision to spot Sita in Lanka, but lacked wings to fly across the ocean, requiring the united Vanara army to execute the leap.",
                        asciiFlowchart = "[🦅 Sampati's Vision] + [❌ Burned Wings] ──> [🤝 Required Vanara Army Support]",
                        lessonQuote = "Vision without capital and manpower cannot cross oceans alone."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Rhea's Sustainable Hemp Bags Brand Hit by Raw Material Min-Orders",
                        loreOrContext = "Rhea received an order for 25,000 bags from a German retail chain. The fabric mill demanded ₹20 Lakhs advance. Lacking capital and collateral, Rhea was forced to decline the deal.",
                        asciiFlowchart = "[🛍️ Massive Global Order] ──> [❌ ₹20L Advance Missing] ──> [💔 Contract Forfeited]",
                        lessonQuote = "Scale requires capital depth; bootstrap ceilings hit hard without institutional backing."
                    ),
                    caseQuestion = "Why cannot sole proprietorships take full advantage of economies of large-scale production?",
                    caseAnswer = "Because their limited capital resources prevent massive bulk purchases, automated machinery, and expansive warehouse networks."
                ),
                SubPointItem(
                    pointTitle = "Unlimited Liability (Catastrophic Exposure)",
                    category = "Limitation",
                    englishText = "Commercial risk extends to the kitchen stove. The lack of corporate veil exposes personal real estate, family inheritance, and future wages to legal attachment by commercial creditors.",
                    hinglishText = "Agar dukan par 50 lakh ka karza ho gaya aur dukan me sirf 20 lakh ka saaman hai, to bacha hua 30 lakh chukane ke liye court aapka ghar, gaadi aur sab kuch neelam kar degi!",
                    asciiFlowchart = """
[Deficit Liabilities] ──> [Breaches Business Assets] ──> [🚨 Liquidates Personal Family Assets]
                    """.trimIndent(),
                    microMnemonic = "HOUSE-GONE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Ravana's Reckless Empire-Wide Liability",
                        loreOrContext = "Ravana acted as an unchecked supreme proprietor of Lanka's destiny. His refusal to heed Vibhishana or Mandodari placed the life of every citizen and soldier on the line.",
                        asciiFlowchart = "[👑 Ravana's Unchecked Pride] ──> [🔥 Golden Lanka Burned] ──> [💀 Complete Dynastic Collapse]",
                        lessonQuote = "Unlimited ego with unlimited sovereign liability brings ruin to entire kingdoms."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Harsh's Crypto Margin Trading Sole Venture",
                        loreOrContext = "Harsh took personal loans to run a crypto prop-trading desk. When the exchange collapsed, lenders demanded ₹18 Lakhs, leading to the attachment of his ancestral ancestral flat.",
                        asciiFlowchart = "[📉 Market Flash Crash] ──> [🚨 ₹18L Default] ──> [🏠 Ancestral Home Encumbered]",
                        lessonQuote = "Never bet what you cannot afford to lose without legal separation of liability."
                    ),
                    caseQuestion = "What legal protection does a sole proprietor enjoy against bankruptcy debts under Indian law?",
                    caseAnswer = "None. The proprietor is personally liable up to the full extent of personal assets."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 7: The Supply Chain Default of Mehta Hardware",
                    scenario = "Mr. Mehta operated a sole proprietorship hardware shop. During a severe real estate recession, his builder clients defaulted on ₹40 Lakhs owed to him. Simultaneously, steel mills demanded ₹25 Lakhs payment. Mehta's shop inventory is worth only ₹10 Lakhs.",
                    question = "Explain the financial repercussions on Mr. Mehta's personal lifestyle and family assets.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the legal condition: Unlimited Liability of Sole Proprietorship (1 Mark)",
                        "Calculate net unpaid deficit: ₹25 Lakhs debt - ₹10 Lakhs business assets = ₹15 Lakhs deficit (1 Mark)",
                        "State that the court will order attachment of Mr. Mehta's personal house, car, or bank deposits to bridge the ₹15 Lakhs shortfall (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Capital limitation restricts growth, plant automation, and global competitiveness.",
                "Unlimited liability creates constant family financial insecurity."
            )
        ),

        // PAGE 08: Limitations - Limited Managerial Ability & Life Span
        StudyPage(
            pageNumber = 8,
            module = ModuleCategory.SOLE_PROPRIETORSHIP,
            title = "Limitations: Managerial Deficits & Unstable Life",
            subtitle = "The Myth of the Renaissance Man & Organizational Mortality",
            topicDescriptionEnglish = "Rarely does one individual master all commercial functions—procurement, marketing, accounts, and human relations. Combined with an unstable existence, this prevents sole proprietorships from becoming resilient, multi-generational institutions.",
            topicDescriptionHinglish = "Ek akela insaan har cheez me 'All-rounder' nahi ho sakta. Jo insaan accha salesman hai, zaroori nahi wo accha accountant ya tax expert bhi ho. Na wo top managers ko mehengi salary de sakta hai, aur na hi dukan lambe samay tak bina founder ke chal sakti hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-A-N-A-G-E' -> (M)anagerial Deficit, (A)ll-Rounder Myth, (N)o Specialization, (A)bsence of Longevity, (G)rowth Cap, (E)xhaustion.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Construction of the Cosmic Ram Setu by Specialized Vanaras",
                loreOrContext = "Building the 100-yojana ocean bridge required specialized engineering talents. Lord Rama deployed Nala and Nila (sons of Vishwakarma) as master architects while the entire Vanara force provided heavy logistic lifting.",
                asciiFlowchart = """
[🏹 Lord Rama's Sovereign Vision]
       │
       ├──> [📐 Nala & Nila: Architectural & Hydrodynamic Specialization]
       └──> [🐒 Vanara Host: Massive Physical Logistics]
       │
       ▼
[🌉 Ocean Spanned in 5 Days: The Power of Division of Labor!]
                """.trimIndent(),
                lessonQuote = "Monuments that conquer oceans are erected when diverse specialized masters combine their distinct crafts."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Limited Managerial Ability",
                    category = "Limitation",
                    englishText = "An individual rarely excels in purchasing, sales, finance, legal compliance, and strategic foresight simultaneously. Due to scarce funds, the proprietor cannot hire elite specialist executives.",
                    hinglishText = "Akela vyakti purchase, sales, accounting, tax, aur digital marketing sab akele perfect nahi kar sakta. Aur itna budget nahi hota ki IIM ya chartered accountant ko lakho ki salary par hire kar sake.",
                    asciiFlowchart = """
[👤 Single Owner] ──> [Diverted Across 7 Different Departments] ──> [📉 Sub-optimal Quality]
                    """.trimIndent(),
                    microMnemonic = "NO-SPECIAL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Sage Vashistha's Dedicated Judicial Guidance to Ikshvaku Dynasty",
                        loreOrContext = "Even Emperor Dasharatha and Lord Rama relied upon Royal Sage Vashistha for statecraft, astrology, and constitutional jurisprudence rather than deciding all royal rituals in isolation.",
                        asciiFlowchart = "[👑 Emperor] + [🧘 Sage Vashistha's Advisory Council] ──> [⚖️ Flawless Rajdharma]",
                        lessonQuote = "The wisest rulers surround themselves with specialized sages."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Sam's Viral TikTok Clothing Brand Crushed by GST & Tax Penalties",
                        loreOrContext = "Sam was brilliant at creating viral Reels for his oversized hoodie brand, but neglected GST reconciliations and inventory math, resulting in heavy tax penalties and locked bank accounts.",
                        asciiFlowchart = "[🔥 500k Followers on Reels] + [❌ Zero Accounting Knowledge] ──> [🚨 Huge GST Penalties]",
                        lessonQuote = "Marketing brings hype, but disciplined operations keep you in business."
                    ),
                    caseQuestion = "Why cannot sole proprietorships retain top managerial talent on competitive market terms?",
                    caseAnswer = "Because they lack deep capital reserves and cannot offer stock options (ESOPs) or expansive corporate career trajectories."
                ),
                SubPointItem(
                    pointTitle = "Uncertain Life and Succession Disruption",
                    category = "Limitation",
                    englishText = "The business is intrinsically linked to the proprietor's vitality. In the absence of a skilled heir willing to take over, decades of accrued customer goodwill can disintegrate overnight upon the founder's demise.",
                    hinglishText = "Maalik ki tabiyat kharab ya death hote hi dukan ka varchasva khatam ho sakta hai. Agar beta ya beti us dukan ko chalane me interested ya kabil nahi hain, to salo ki mehnat pal bhar me barbad ho jati hai.",
                    asciiFlowchart = """
[⭐ 40 Years of Master Craft Goodwill] ──> [⚰️ Founder Passes] ──> [🏚️ Brand Name Extinguished]
                    """.trimIndent(),
                    microMnemonic = "MORTAL-END",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Restoration of Kishkindha Under Sovereign Dharma",
                        loreOrContext = "When Bali fell, Kishkindha's dynasty was preserved only because Sugriva was formally crowned and Angada made Yuvaraja, instituting orderly succession.",
                        asciiFlowchart = "[👑 Bali Falls] ──> [🤝 Sugriva & Angada Joint Succession] ──> [🏛️ Realm Stabilized]",
                        lessonQuote = "A kingdom endures only through systematic transition of duty."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Master Tailor Masterji's Savile-Row-Style Delhi Atelier",
                        loreOrContext = "Masterji dressed top diplomats for 35 years. His son became a software engineer in Seattle. When Masterji retired, the legendary boutique closed forever.",
                        asciiFlowchart = "[✂️ 35 Years Diplomatic Tailoring] ──> [✈️ Heir Leaves for Tech] ──> [🚪 Shutter Down Forever]",
                        lessonQuote = "Without institutional continuity, personal mastery dies with the craftsman."
                    ),
                    caseQuestion = "State the fundamental reason why sole proprietorships struggle to survive across multiple generations.",
                    caseAnswer = "They lack perpetual succession and rely heavily on the mortal founder's singular acumen."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 8: The Comprehensive Assessment of Sole Trader Sharma",
                    scenario = "Mr. Sharma runs a successful neighborhood bookstore. He wants to digitize his catalog, open 5 branches across Mumbai, and build an AI recommendation engine. However, he is overwhelmed with daily stock counting and has zero tech background.",
                    question = "Advise Mr. Sharma: (a) Why his current organizational form is hindering his ambitious vision. (b) What form of business he should transition into.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "Identify Limitations: Limited Capital Resources and Limited Managerial/Technical Expertise (1.5 Marks)",
                        "Explain why sole proprietorship cannot absorb high-risk multi-branch tech ventures alone (1.5 Marks)",
                        "Recommendation: Form a Private Limited Company or Partnership with a tech-savvy co-founder to pool capital, tech skills, and share risk (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Sole proprietorship is best suited for small enterprises, personalized customer services, and low-capital localized retail.",
                "For capital-intensive expansion, transition to Partnership or Company is imperative."
            )
        )
    )
}
