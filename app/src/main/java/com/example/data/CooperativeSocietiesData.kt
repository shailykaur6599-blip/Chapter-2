package com.example.data

import com.example.model.*

object CooperativeSocietiesData {
    val pages = listOf(
        // PAGE 31: Cooperative Societies - Genesis & Core Philosophy
        StudyPage(
            pageNumber = 31,
            module = ModuleCategory.COOPERATIVE,
            title = "Cooperative Societies: Genesis & The Ethos of Mutual Aid",
            subtitle = "Cooperative Societies Act, 1912 | 'Each for All and All for Each'",
            topicDescriptionEnglish = "A Cooperative Society is a voluntary association of persons who join together on the basis of equality for the promotion of their economic interests. It is governed by the Cooperative Societies Act, 1912 (or respective State Cooperative Acts) and operates under the noble motto: 'Each for all and all for each.'",
            topicDescriptionHinglish = "Cooperative Society aam logo ka ek ayesa sangathan hai jaha kamzor log aapas me milkar bade-bade corporate mafias aur middlemen (bicholiye) ke exploitation se bachne ke liye hath milate hain. Iska basic niyam hai: 'Ek sabke liye, aur sab ek ke liye' (Each for all and all for each). Profit kamana nahi, aapas me seva (service) karna iska main maksad hota hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-O-O-P' -> (C)ooperation Supreme, (O)ne Man One Vote, (O)pen Door Membership, (P)rofit Secondary to Service.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Collective Vanara Host Constructing the Cosmic Ram Setu",
                loreOrContext = "From mighty commanders to the smallest squirrels, millions of forest dwellers pooled their distinct physical energies voluntarily without commercial wages, driven by the supreme shared mission of dharma to bridge the impassable ocean.",
                asciiFlowchart = """
[🐒 Millions of Vanaras & Forest Dwellers]
       │ (Voluntary Democratic Cooperation)
       ▼
[🪨 Massive Boulders Inscribed with 'RAMA' Floated]
       │ ('Each for All and All for Each')
       ▼
[🌉 Impossible Ocean Spanned in 5 Days: The Supreme Cooperative Marvel!]
                """.trimIndent(),
                lessonQuote = "When humble souls unite under selfless cooperation, the deepest oceans become bridges of triumph."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Statutory Definition & Minimum Membership",
                    category = "Statutory Rule",
                    englishText = "Under the Cooperative Societies Act, 1912, at least 10 adult persons having common economic interests are required to apply for registration. Once registered, it becomes a distinct body corporate.",
                    hinglishText = "Cooperative society banane ke liye kam se kam 10 adult (18+ saal ke) log chahiye jinka aam taur par ek jaisa economic interest ho (jaise sabhi doodh bechne wale ya sabhi bunkar). Registration hote hi ye ek legal body ban jati hai.",
                    asciiFlowchart = """
[👥 Minimum 10 Adult Persons] ──> [📜 File with Registrar of Cooperatives] ──> [🏛️ Registered Body Corporate]
                    """.trimIndent(),
                    microMnemonic = "MIN-10-ADULTS",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Hermit Sages of Dandakaranya Uniting for Collective Protection",
                        loreOrContext = "The solitary rishis in the forest united their sacred hermitages, presenting a collective joint petition to Lord Rama to purge the wilderness of tormenting demons.",
                        asciiFlowchart = "[🧘 Solitary Forest Hermits] ──> [Collective Joint Petition] ──> [🏹 Lord Rama Pledges Protection]",
                        lessonQuote = "The vulnerable conquer tyranny when their voices merge into a single righteous demand."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Freelance Creators Cooperative Studio Space in Bengaluru",
                        loreOrContext = "15 freelance video editors pooled ₹10,000 monthly each to lease a high-end sound-proof studio with a collective 10Gbps fiber line, cutting individual costs by 80%.",
                        asciiFlowchart = "[🎨 15 Freelancers Pool Funds] ──> [🏢 Collective Pro Studio Leased] ──> [💸 80% Cost Slashed Each]",
                        lessonQuote = "Collective bargaining power beats individual bootstrapping every time."
                    ),
                    caseQuestion = "What is the minimum number of adult individuals required to form a cooperative society under the Cooperative Societies Act, 1912?",
                    caseAnswer = "Minimum 10 adult persons."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 31: The Exploited Weavers of Varanasi",
                    scenario = "50 master silk weavers in Varanasi were exploited by moneylenders who supplied raw silk yarn at 40% markup and bought finished sarees at distressed prices. The weavers decide to establish an independent commercial association to purchase yarn directly from southern mills.",
                    question = "Which organizational form would you recommend to the weavers? State the primary socio-economic objective of this form.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: Form a Producers' Cooperative Society under the Cooperative Societies Act (1.5 Marks)",
                        "Objective: Eliminate predatory middlemen/moneylenders, procure raw silk at wholesale rates, and secure fair returns for craftsmanship (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Governed by Cooperative Societies Act, 1912; requires minimum 10 adult members.",
                "Primary objective is mutual service and protection of economically vulnerable members, not profit maximization."
            )
        ),

        // PAGE 32: Features - Voluntary Membership & Legal Status
        StudyPage(
            pageNumber = 32,
            module = ModuleCategory.COOPERATIVE,
            title = "Features: Open Door Membership & Corporate Status",
            subtitle = "Freedom to Join and Exit vs. The Armor of Statutory Incorporation",
            topicDescriptionEnglish = "Membership is open to all regardless of religion, caste, or gender, with total freedom to join or exit upon giving notice. Crucially, registration is compulsory, conferring a separate legal entity with perpetual succession and common seal.",
            topicDescriptionHinglish = "Cooperative society ke 2 bade features: Pehla, 'Voluntary Membership'—koi bhi insaan bina kisi bhedbhav (jaati, dharam ya gender) ke member ban sakta hai aur jab chahe notice dekar bahar ja sakta hai. Doosra, 'Separate Legal Status'—registration compulsory hota hai, isliye society company ki tarah alag legal entity ban jati hai jo apne naam se property khareed sakti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'V-L-P' -> (V)oluntary Entry/Exit, (L)egal Incorporation, (P)erpetual Succession.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Open Sanctuary of Lord Rama's Allied Camp (Sharanagati)",
                loreOrContext = "Lord Rama's camp welcomed every being who sought righteousness—from royal Vanaras and forest bears to even Vibhishana fleeing the enemy ranks—practicing true open-door sanctuary without sectarian prejudice.",
                asciiFlowchart = """
[🏹 Lord Rama's Camp Sanctuary] 
       │ (Universal Open-Door Welcome to All Seekers of Dharma)
       ▼
[🤝 Vibhishana Arrives from Lanka Seeking Asylum] 
       │ (Immediate Embracement Without Suspicion or Exclusion)
       ▼
[👑 Inviolable Covenant of Sovereign Protection Established]
                """.trimIndent(),
                lessonQuote = "True greatness opens its doors wide to anyone who shares the sacred ideal."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Voluntary Membership (Open Door Policy)",
                    category = "Feature",
                    englishText = "Membership is purely voluntary. An individual can join whenever he desires and can leave at his discretion by giving prior notice. No discrimination based on caste, creed, or religion is permitted.",
                    hinglishText = "Entry aur Exit bilkul voluntary hai. Koi zabardasti kisi ko member nahi banata aur na hi rok sakta hai. Sabhi ke liye darwaze khule hain, chahe kisi bhi community ya background se ho.",
                    asciiFlowchart = """
[Citizen with Common Need] ──> [Voluntary Entry Notice] ──> [Member with Equal Rights] ──> [Exit at Will with Refund]
                    """.trimIndent(),
                    microMnemonic = "OPEN-DOOR",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Universal Vanara Gathering at Kishkindha",
                        loreOrContext = "Sugriva summoned monkey and bear clans from every mountain, forest, and cavern across Bharatavarsha, uniting diverse tribes under one common banner.",
                        asciiFlowchart = "[🏔️ Diverse Mountain Tribes] ──> [Voluntary Assembly] ──> [United Vanara Confederation]",
                        lessonQuote = "Voluntary alignment behind a noble cause creates boundless collective power."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Organic Rooftop Farming Cooperative in Pune",
                        loreOrContext = "Apartment residents can buy a ₹1,000 share to join the terrace gardening cooperative to get fresh pesticide-free vegetables, or exit whenever they relocate.",
                        asciiFlowchart = "[🌱 Buy ₹1k Share] ──> [Access Organic Veggies] ──> [Exit & Redeem Share on Moving]",
                        lessonQuote = "Frictionless entry and exit keep community initiatives vibrant and trusted."
                    ),
                    caseQuestion = "Can a cooperative housing society refuse membership to an individual solely on grounds of religion or caste?",
                    caseAnswer = "No. The principle of voluntary and open membership strictly prohibits discrimination based on caste, creed, or religion."
                ),
                SubPointItem(
                    pointTitle = "Compulsory Registration & Separate Legal Entity",
                    category = "Feature",
                    englishText = "Registration is compulsory. Upon registration, the society becomes a body corporate with perpetual succession, power to hold property in its own name, enter contracts, and sue or be sued.",
                    hinglishText = "Partnership me registration optional tha, par Cooperative Society me registration 100% COMPULSORY hai! Registration hote hi society ek independent kanooni vyakti (legal person) ban jati hai jo hamesha zinda rehti hai.",
                    asciiFlowchart = """
[Compulsory Registration] ──> [🏛️ Separate Legal Person] ──> [Perpetual Succession | Owns Land | Sues in Court]
                    """.trimIndent(),
                    microMnemonic = "LEGAL-BODY",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sacred Consecration of the Temple Guilds of Ayodhya",
                        loreOrContext = "Guilds of artisans and temple builders were formally registered with the royal royal treasurer, granting them perpetual royal seals and independent juridical personality.",
                        asciiFlowchart = "[🏛️ Royal Guild Charter] ──> [Endowed with Perpetual Seal] ──> [Immortal Guild Identity]",
                        lessonQuote = "Institutional charters grant permanence to human endeavors across centuries."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Amul Dairy (GCMMF) Contracting with Global Airlines",
                        loreOrContext = "Amul signs ₹50 Crore butter supply contracts with international airlines in its own corporate cooperative name, completely independent of its 3.6 million farmer members.",
                        asciiFlowchart = "[🧈 Amul Cooperative Entity] ──> [Signs ₹50Cr Supply Deal] ──> [Individual Farmers Shielded]",
                        lessonQuote = "Cooperative corporatization turns humble farmers into global commercial titans."
                    ),
                    caseQuestion = "What is the legal consequence of compulsory registration on a cooperative society's property rights?",
                    caseAnswer = "It can acquire, hold, and dispose of property in its own registered corporate name."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 32: The Exclusionary Housing Society Bye-Law",
                    scenario = "The management committee of 'Shanti Cooperative Housing Society' passed a resolution barring tenants of a particular dietary habit and bachelor status from buying society shares.",
                    question = "Examine the legal validity of this resolution with reference to the statutory features of cooperative societies.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the feature: Voluntary and Open Membership (1 Mark)",
                        "Explain the principle: A cooperative society cannot artificially restrict membership or discriminate based on arbitrary personal criteria (1 Mark)",
                        "Conclusion: The exclusionary resolution is ultra vires (void) and can be struck down by the Registrar of Cooperative Societies (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Membership is strictly open and voluntary without discriminatory barriers.",
                "Compulsory registration gives the cooperative a separate corporate personality and perpetual succession."
            )
        ),

        // PAGE 33: Features - Limited Liability, Control & Service Motive
        StudyPage(
            pageNumber = 33,
            module = ModuleCategory.COOPERATIVE,
            title = "Limited Liability, Democratic Control & Service Motive",
            subtitle = "The 'One Man, One Vote' Revolution and Supremacy of Welfare",
            topicDescriptionEnglish = "Three defining hallmarks of a cooperative society are: (1) Limited liability restricted to share capital; (2) Pure democratic control ('One man, one vote', regardless of shares owned); (3) Supremacy of the service motive over profit maximization.",
            topicDescriptionHinglish = "Cooperative society ke 3 sabse krantikari niyam: (1) Limited Liability—agar society doobi to members ki personal property safe hai; (2) 'One Man, One Vote'—chahe kisi ne 1 share khareeda ho ya 1,000 shares, sabke vote ki value sirf 'EK' hoti hai (paisa voting power nahi khareed sakta!); (3) Service Motive—pehla kaam members ki seva karna hai, profit kamana secondary hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'L-D-S' -> (L)imited Liability, (D)emocratic One-Man-One-Vote, (S)ervice Motive First.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Democratic Conclave of the Vanara War Council",
                loreOrContext = "Before initiating the southern leap, Angada convened an open circle where every scout warrior—regardless of seniority or size—was invited to speak, evaluate their jumping limits, and contribute wisdom freely.",
                asciiFlowchart = """
             [🐒 Democratic Vanara War Circle]
                             │
       ┌─────────────┬───────┴───────┬─────────────┐
       ▼             ▼               ▼             ▼
  [Angada: 100] [Nila: 30 Yojanas] [Gaya: 50] [Jambavan: Counselor]
                             │
                             ▼
              [⚖️ Pure Equality of Voice & Joint Deliberation]
                """.trimIndent(),
                lessonQuote = "True leadership measures the value of counsel by truth, not by material magnitude."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Democratic Control: 'One Man, One Vote'",
                    category = "Feature",
                    englishText = "Control is exercised democratically by an elected Managing Committee. Unlike joint-stock companies where voting power depends on capital invested, a cooperative adheres strictly to: 'One member, one vote'. Wealth cannot buy dominance.",
                    hinglishText = "Company me jiske paas zyada shares hote hain wo maalik ban baithta hai. Lekin Cooperative me sab barabar hain! 1 aadmi = 1 vote. Ameer vyakti lakh rupaye lagakar bhi doosre garib members par hukumat nahi chala sakta.",
                    asciiFlowchart = """
[Billionaire Member: 10,000 Shares] ──> [VOTING POWER: EXACTLY 1 VOTE]
[Small Farmer Member: 1 Share]       ──> [VOTING POWER: EXACTLY 1 VOTE]
                    """.trimIndent(),
                    microMnemonic = "1-MAN-1-VOTE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Equal Right to Offer Sacred Soil for Ram Setu",
                        loreOrContext = "The giant elephant-sized Vanaras carrying boulders and the humble squirrel carrying dust grains were welcomed with identical divine reverence by Lord Rama.",
                        asciiFlowchart = "[Giant Warrior Boulders] = [Squirrel Dust Grains] ──> [Both Blessed with Equal Divine Regard]",
                        lessonQuote = "In the eyes of supreme righteousness, every earnest offering carries identical weight."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Crypto DAO Governance vs. Cooperative Society Voting",
                        loreOrContext = "In token DAOs, 'whales' buy 60% of tokens and dictate governance. In a registered Cooperative, even the biggest capital contributor gets only one vote during annual general meetings.",
                        asciiFlowchart = "[Crypto DAO: Whale Dictatorship] vs [Cooperative: 1 Person = 1 Unbuyable Vote]",
                        lessonQuote = "Democratic equality prevents predatory capital from hijacking community welfare."
                    ),
                    caseQuestion = "Ramesh owns 400 shares in a Cooperative Society while Suresh owns only 2 shares. During the election of the Managing Committee, how many votes can Ramesh cast?",
                    caseAnswer = "Only one vote, as cooperative societies operate strictly under the principle of 'One man, one vote'."
                ),
                SubPointItem(
                    pointTitle = "Service Motive (Welfare over Profit Maximization)",
                    category = "Feature",
                    englishText = "The primary objective is mutual welfare and service to members, not the extraction of maximum profit. Any operational surplus is distributed partly as dividend (capped by statute, usually 12-15%) and credited to the common welfare reserve.",
                    hinglishText = "Iska pehla lakshya members ki madad karna hai. Agar saal ke aakhir me kuch bachat (surplus) bachti hai, to use members me unke business volume ke hisaab se baant diya jata hai aur baaki welfare fund me jama hota hai.",
                    asciiFlowchart = """
[Operational Surplus] ──> [Transfer to General Reserve Fund] ──> [Capped Dividend + Patronage Bonus to Members]
                    """.trimIndent(),
                    microMnemonic = "SERVICE-FIRST",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Ayodhya's Royal Granaries Opened During Famine",
                        loreOrContext = "In times of unseasonal drought in outlying provinces, royal storerooms distributed grain without demanding extortionate famine prices, prioritizing citizen life over state profit.",
                        asciiFlowchart = "[🌾 Royal Grain Stores Opened] ──> [Zero Exploitative Pricing] ──> [❤️ Citizen Welfare Preserved]",
                        lessonQuote = "The measure of righteous governance is the preservation of human life, not full treasury vaults."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Student Textbook & Laptop Cooperative Bank",
                        loreOrContext = "University students created a lending library cooperative that buys engineering textbooks in bulk and rents them for ₹50/semester, killing predatory textbook publisher margins.",
                        asciiFlowchart = "[📚 Bulk Textbook Buy] ──> [Rent at ₹50 Nominal Fee] ──> [🛡️ 500 Students Save ₹10,000 Each]",
                        lessonQuote = "Service-driven platforms solve real human pain where profit-driven models exploit it."
                    ),
                    caseQuestion = "What happens to the commercial surplus earned by a cooperative society at the close of the financial year?",
                    caseAnswer = "It is transferred to statutory reserve funds, utilized for community welfare, or distributed as capped dividend/patronage bonus."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 33: The Hostile Takeover Attempt at Green Farmers Coop",
                    scenario = "Mr. Singhania, a wealthy agro-industrialist, bought 45% of the total issued shares of 'Green Farmers Cooperative Society' through various proxies. At the AGM, he moved a resolution to fire the secretary and turn the cooperative into an organic export venture.",
                    question = "Can Mr. Singhania force this resolution through his 45% shareholding? Explain the voting mechanism.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the voting principle: Cooperative societies follow 'One Man, One Vote' regardless of shareholding (1 Mark)",
                        "Analyze voting impact: Mr. Singhania holds only one single personal vote, identical to a farmer holding 1 share (1 Mark)",
                        "Conclusion: No, he cannot force the resolution unless the majority of individual farmer members democratically vote in his favor (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Democratic equality ('One man, one vote') prevents wealth concentration and boardroom buyouts.",
                "Service to members is paramount; profit is secondary and strictly regulated."
            )
        ),

        // PAGE 34: Merits of Cooperative Societies
        StudyPage(
            pageNumber = 34,
            module = ModuleCategory.COOPERATIVE,
            title = "Merits: Equality, Stability, Economy & State Support",
            subtitle = "Why Cooperatives Empower the Weak Against Corporate Monopolies",
            topicDescriptionEnglish = "Cooperative societies offer six paramount merits: equality in voting status, limited liability, perpetual institutional stability, elimination of parasitic middlemen (economy in operations), generous government subsidies/tax exemptions, and effortless formation.",
            topicDescriptionHinglish = "Cooperative society ke 5 sabse solid fayde: (1) Equality in Voting—har member barabar hai; (2) Limited Liability—personal property safe hai; (3) Stable Life—kisi member ke marne ya chhodne se society band nahi hoti; (4) Economy in Operations—bicholiye (middlemen) khatam, saaman sasta milta hai; (5) Government Support—sarkaar subsidies, low interest loans aur tax discounts deti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'E-L-S-E-G' -> (E)quality in voting, (L)imited liability, (S)table life, (E)conomy in ops, (G)overnment patronage.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Universal Feast of Sugriva's Allied Vanara Legions",
                loreOrContext = "When the Vanara army marched south, honey forests (Madhuvan) and royal supply stations provided abundant sustenance to every soldier equally, banishing scarcity through coordinated collective logistics.",
                asciiFlowchart = """
[🍯 Vast Sustenance Forests of Kishkindha]
       │
       ▼ (Cooperative Logistics Coordination)
[🍌 Equal Distribution of Rations to Millions of Foot Soldiers]
       │
       ▼ (Zero Black-Marketing or Middlemen Parasitism)
[💪 High Morale & Supreme Physical Invincibility]
                """.trimIndent(),
                lessonQuote = "Equitable distribution of nourishment multiplies collective strength tenfold."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Economy in Operations (Elimination of Middlemen)",
                    category = "Merit",
                    englishText = "The cooperative procures goods directly from producers and sells directly to members, eliminating wholesalers, distributors, and speculative hoarders, significantly lowering retail costs.",
                    hinglishText = "Bicholiye (dalal aur middlemen) beech ka 30-40% profit kha jate the. Cooperative society seedha factory ya kisan se wholesale me saaman khareedti hai aur members ko cost price par deti hai. Sabko sasta saaman milta hai!",
                    asciiFlowchart = """
[Traditional Supply Chain: Producer ──> Wholesaler ──> Stockist ──> Retailer (40% Markup!) ──> Consumer]
                                      vs
[Cooperative Model: Producer ──> COOPERATIVE SOCIETY ──> Direct to Consumer (Low Cost & Zero Middlemen!)]
                    """.trimIndent(),
                    microMnemonic = "CUT-MIDDLEMEN",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Direct Communication Between Lord Rama and Nishadraj Guha",
                        loreOrContext = "Lord Rama dealt directly with boatman chief Guha without court chamberlains or royal intermediaries, creating an unbreakable bond of transparent mutual respect.",
                        asciiFlowchart = "[🏹 Lord Rama] <==== Direct Alliance ====> [🛶 Nishadraj Guha (Zero Intermediaries)]",
                        lessonQuote = "Eliminating intermediaries builds pure, transparent trust."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "D2C Coffee Farmers Cooperative in Coorg",
                        loreOrContext = "200 small tribal coffee growers bypassed corporate export houses and sell roasted single-origin beans directly to Mumbai cafes via Shopify, doubling their farm-gate prices.",
                        asciiFlowchart = "[☕ Coorg Tribal Farmers] ──> [Direct D2C Brand] ──> [💰 200% Income Increase]",
                        lessonQuote = "Cut out the exploitative middlemen and capture your rightful value."
                    ),
                    caseQuestion = "Explain how cooperative societies achieve 'economy in operations'.",
                    caseAnswer = "By purchasing directly in bulk from producers and selling directly to members, eliminating middlemen commissions and bad debt expenses."
                ),
                SubPointItem(
                    pointTitle = "Support from Government (State Patronage)",
                    category = "Merit",
                    englishText = "Because cooperatives embody social democracy, the state provides significant fiscal incentives: low corporate tax rates, subsidized agricultural loans, priority raw material quota allocations, and infrastructural grants.",
                    hinglishText = "Sarkaar cooperatives ko aam janta ka sahara maanti hai, isliye inko special treat karti hai: kam byaaj par loan, tax me chhoot, sasti bijli, aur priority ration/fertilizer quota milta hai!",
                    asciiFlowchart = """
[🏛️ State Policy Welfare Goals] ──> [Tax Concessions + Subsidized Credit + Free Audits] ──> [Cooperative Thrives]
                    """.trimIndent(),
                    microMnemonic = "GOVT-BOOST",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Royal Grants Given to Vedic Agricultural Guilds",
                        loreOrContext = "Emperor Dasharatha routinely remitted royal grain taxes during droughts and granted royal irrigation canal support to village agricultural assemblies.",
                        asciiFlowchart = "[👑 Sovereign Exemption] ──> [Canals & Grain Pledges] ──> [🌾 Flourishing Village Assemblies]",
                        lessonQuote = "Righteous rulers fertilize community enterprise with sovereign blessings."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "NABARD Subsidized Credit for Women's Milk Cooperative",
                        loreOrContext = "A women's dairy cooperative in Rajasthan received a 4% subsidized loan from NABARD to install solar bulk milk chillers, boosting milk shelf life by 48 hours.",
                        asciiFlowchart = "[🥛 Women's Milk Coop] ──> [🏛️ NABARD 4% Loan] ──> [☀️ Solar Milk Chillers Installed]",
                        lessonQuote = "Leverage institutional government support to scale grassroots community impact."
                    ),
                    caseQuestion = "State any two financial concessions typically granted by the government to cooperative societies in India.",
                    caseAnswer = "(1) Exemption or concession in income tax; (2) Subsidized low-interest institutional loans through NABARD/cooperative banks."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 34: The Fair Price Grain Procurement Triumph",
                    scenario = "In a remote block of Madhya Pradesh, grain merchants purchased wheat at ₹1,400/quintal against the government MSP of ₹2,125 by claiming lack of transport. 80 farmers formed 'Kisan Vikas Cooperative', hired two joint trucks, and sold wheat directly to the state procurement agency at full MSP.",
                    question = "Identify two merits of cooperative societies exemplified by Kisan Vikas Cooperative.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Merit 1: Elimination of Middlemen / Economy in Operations (1.5 Marks)",
                        "Identify Merit 2: Enhanced Bargaining Power and Direct Access to Government Support/MSP Schemes (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Elimination of middlemen commissions reduces costs and distributes surplus directly to members.",
                "Government patronage through tax exemptions and subsidized credit acts as a strong growth catalyst."
            )
        ),

        // PAGE 35: Limitations of Cooperative Societies
        StudyPage(
            pageNumber = 35,
            module = ModuleCategory.COOPERATIVE,
            title = "Limitations: Capital Deficits, Bureaucracy & Factions",
            subtitle = "When Democratic Politics and Administrative Sluggishness Cripple Ideals",
            topicDescriptionEnglish = "Cooperative societies face serious operational bottlenecks: limited financial resources due to economically modest members, amateur honorary management, lack of operational secrecy, excessive government regulatory interference, and bitter political factionalism.",
            topicDescriptionHinglish = "Cooperative society ki 5 badi kamzoriyan: (1) Limited Capital—members garib ya middle-class hote hain aur dividend bhi limited hota hai, isliye log zyada paisa nahi lagate; (2) Inefficient Management—unpaid honorary leaders baithe hote hain jinhe modern business ka gyaan nahi hota; (3) Secrecy ki kami—AGM me sab public karna padta hai; (4) Government ka dabav—audit, inspection aur sarkari afsaron ki interference; (5) Politics aur Gutarbaazi!",
            macroMemoryTrick = "MACRO MNEMONIC: 'L-I-G-H-T' -> (L)imited Capital, (I)nefficient Management, (G)overnment Meddling, (H)idden Factionalism, (T)ransparency Kills Secrecy.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Fatal Factionalism Inside the Fortified Walls of Lanka",
                loreOrContext = "When unrighteousness corrupted Lanka, ministers split into warring political cliques—sycophants flattering Ravana vs. righteous counselors like Vibhishana being banished—leading to internal decay and ruin.",
                asciiFlowchart = """
[🏰 The Imperial Assembly of Lanka]
       │
       ▼ (Ideological Split & Political Factionalism)
[Vibhishana's Righteous Warning] vs [Indrajit & Prahasta's Belligerent Hubris]
       │
       ▼ (Banishment of Truth & Internal Paralysis)
[💥 Complete Strategic & Moral Collapse from Within]
                """.trimIndent(),
                lessonQuote = "When factional politics replaces collective duty, the golden fortress crumbles."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Inefficiency in Management (Amateur Office Bearers)",
                    category = "Limitation",
                    englishText = "Cooperatives are managed by an honorary elected Managing Committee. Because they are unpaid and elected on political popularity rather than professional competence, management is often amateurish, lethargic, and technically deficient.",
                    hinglishText = "Managing committee ke log elections jeet kar aate hain, zaroori nahi ki unhe finance ya marketing aati ho. Aur kyunki unhe koi moti salary nahi milti (honorary service hoti hai), isliye wo serious hokar dhyan nahi dete. Professional executives hire karne ke paise nahi hote.",
                    asciiFlowchart = """
[Elected Popular Politician] ──> [Zero Supply Chain Expertise] ──> [Unpaid Role] ──> [📉 Lethargic & Amateur Decisions]
                    """.trimIndent(),
                    microMnemonic = "AMATEUR-MGMT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Demonic General Prahasta's Miscalculated Battle Plan",
                        loreOrContext = "Selected for sycophancy rather than strategic mastery, General Prahasta charged headlong into the Vanara vanguard without reconnaissance, suffering swift defeat.",
                        asciiFlowchart = "[Sycophantic General] ──> [Zero Strategic Foresight] ──> [Swift Battlefield Decimation]",
                        lessonQuote = "Bravery without strategic professional competence leads to ruin."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Urban Cooperative Bank Collapsing Under Non-Performing Loans",
                        loreOrContext = "Directors of an urban cooperative bank gave unsecured loans to their political friends and relatives without checking CIBIL scores, triggering an RBI audit freeze.",
                        asciiFlowchart = "[🗳️ Political Board Members] ──> [💸 Unsecured Loans to Cronies] ──> [🚨 RBI License Suspended]",
                        lessonQuote = "Professional risk management must never be subordinated to political popularity."
                    ),
                    caseQuestion = "Why are cooperative societies usually unable to attract top-tier professional executive managers?",
                    caseAnswer = "Because their financial resources are limited and statutory caps on surplus prevent them from offering competitive corporate compensation packages."
                ),
                SubPointItem(
                    pointTitle = "Excessive Government Control and Political Interference",
                    category = "Limitation",
                    englishText = "In exchange for subsidies, state governments impose rigorous oversight: mandatory audits by government registrars, submission of reports, and interference by the Registrar of Cooperative Societies, choking managerial initiative.",
                    hinglishText = "Sarkaar free me madad nahi karti! Madad ke badle sarkari babu (Registrar) bar-bar inspect karne aate hain, rules thopte hain, aur elections me local MLA/MP apna dabav banane lagte hain. Isse business ki freedom chhin jati hai.",
                    asciiFlowchart = """
[Govt Subsidies Accepted] ──> [Heavy Bureaucratic Filings] ──> [Local Political Meddling] ──> [🛑 Paralyzed Enterprise]
                    """.trimIndent(),
                    microMnemonic = "BABU-RAJ",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Meddling of Queen Kaikeyi's Royal Attendants",
                        loreOrContext = "Palace attendants and political whisperers manipulated royal court protocols, creating domestic turbulence that disrupted royal administration.",
                        asciiFlowchart = "[Whispering Palace Factions] ──> [Manipulated Decrees] ──> [Administrative Rupture]",
                        lessonQuote = "Unchecked political interference derails the most noble institutions."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Sugar Cooperative Society Hostage to State Cane Pricing Decrees",
                        loreOrContext = "A Maharashtra sugar cooperative was ordered by political ministers to buy cane at high prices while export quotas were delayed, driving the mill into ₹12 Crore losses.",
                        asciiFlowchart = "[🏛️ Political Cane Pricing Mandate] ──> [Export Quota Blocked] ──> [📉 Multi-Crore Losses]",
                        lessonQuote = "When politicians steer business decisions, commercial logic evaporates."
                    ),
                    caseQuestion = "State two ways in which state governments exercise regulatory control over cooperative societies.",
                    caseAnswer = "(1) Compulsory auditing by the Registrar of Cooperatives; (2) Approving bye-law amendments and inspecting books of accounts."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 35: The Paralysis at Janta Consumer Cooperative Store",
                    scenario = "Janta Consumer Cooperative Store, operating in a tier-2 town, was managed by an honorary committee of retired residents. Inventory piled up with expired goods due to manual ledger accounting, and political factions argued over hiring relatives as store clerks. Private supermarkets captured 70% of market share.",
                    question = "Identify two inherent limitations of cooperative societies illustrated in this scenario.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Limitation 1: Inefficiency in Management / Lack of Professional Expertise (1.5 Marks)",
                        "Identify Limitation 2: Internal Factionalism / Differences of Opinion and Nepotism (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Honorary, amateur management and political interference often offset democratic benefits.",
                "Limited capital and statutory caps on dividends limit investment in high-tech modernization."
            )
        ),

        // PAGE 36: Types of Cooperatives - Consumer & Producer Cooperatives
        StudyPage(
            pageNumber = 36,
            module = ModuleCategory.COOPERATIVE,
            title = "Types of Cooperatives: Consumers' vs. Producers' Societies",
            subtitle = "Shielding the Retail Consumer & Empowering the Small Artisan",
            topicDescriptionEnglish = "Consumers' Cooperatives protect retail buyers by eliminating wholesale middlemen and supplying pure, unadulterated essentials. Producers' Cooperatives empower small artisans and manufacturers by supplying raw materials and tooling to counter corporate syndicates.",
            topicDescriptionHinglish = "Consumers' Cooperative Society: Aam grahako (consumers) ke dwara banayi jaati hai taaki daal, chawal, tel jaisa saaman bina milaawat aur saste daam me mile (jaise Kendriya Bhandar). Producers' Cooperative Society: Chhote bunkaro, shilpkaro aur artisans dwara banayi jaati hai taaki sasta raw material mile aur unka banaya maal acchi keemat par bika sake.",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-O-N vs P-R-O' -> Consumer = Cheap Retail Essentials | Producer = Raw Materials & Tooling for Artisans.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Guild of Ayodhya Royal Weavers and Forest Provisions Depot",
                loreOrContext = "Ayodhya's royal weavers united in self-governing guilds to supply pure silk vestments for royal ceremonies, while municipal depots ensured every household received unadulterated grain rations during monsoons.",
                asciiFlowchart = """
[🧵 Master Silk Weavers Guild (Producers)] ──> Supplies Pure Robes to Royal Assembly
[🌾 Municipal Grain Bhandar (Consumers)]    ──> Distributes Unadulterated Grains to Citizens
                """.trimIndent(),
                lessonQuote = "Organized guilds shield both the creator at the loom and the citizen at the hearth."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Consumers' Cooperative Societies",
                    category = "Cooperative Type",
                    englishText = "Formed by retail consumers desiring good quality, unadulterated consumer goods at reasonable prices. The society purchases in bulk directly from manufacturers, eliminating middlemen markups, and distributes profits as dividends or bonus on purchases.",
                    hinglishText = "Ye grahako ki apni dukan hoti hai! Sabhi members paisa milate hain, factory se direct bulk me aata-daal-tel khareedte hain, aur members ko wholesale rate par bechte hain. Milaawat aur black-marketing ka zero khatra!",
                    asciiFlowchart = """
[Retail Consumers] ──> [Pool Capital] ──> [Bulk Purchase Direct from Mill] ──> [Sell at Fair Price to Members]
                    """.trimIndent(),
                    microMnemonic = "CONSUMER-SHIELD",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sustenance Stations Established for Pilgrims to Prayag",
                        loreOrContext = "Along the route to sage Bharadwaja's ashram at Prayag, local hermits maintained joint food dispensaries providing clean water and fruit to arriving pilgrims.",
                        asciiFlowchart = "[Pilgrim Travellers] ──> [Joint Food Dispensary] ──> [Pure Sustenance at Zero Exploitation]",
                        lessonQuote = "Serving the basic sustenance of the traveler is the highest civic merit."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "College Campus Healthy Snack & Protein Bar Cooperative",
                        loreOrContext = "Hostel students formed a consumers' cooperative, buying 1,000 peanut butter jars and whey protein boxes straight from the manufacturer at 40% discount off MRP.",
                        asciiFlowchart = "[🏋️ 200 Gym Hostellers] ──> [Direct Factory Whey Orders] ──> [💰 40% Saved off Retail MRP]",
                        lessonQuote = "Aggregate consumer demand to crush retail distribution markups."
                    ),
                    caseQuestion = "What basis is used by a Consumers' Cooperative Society to distribute profits among its members at year end?",
                    caseAnswer = "In proportion to the purchases made by each member during the year (Patronage Dividend)."
                ),
                SubPointItem(
                    pointTitle = "Producers' Cooperative Societies",
                    category = "Cooperative Type",
                    englishText = "Formed by small, financially weak producers and artisans to counter the dominance of industrial capitalists. The society supplies raw materials, modern tools, and machinery, and buys back finished output for centralized marketing.",
                    hinglishText = "Chhote-chhote karigar (jaise handloom weavers ya potter) akele me mehenga raw material khareedte the aur unka shoshan hota tha. Society sabke liye saste daam par dhaaga, machinery lati hai aur unka banaya maal bade market me bechti hai.",
                    asciiFlowchart = """
[Small Artisans] ──> [Society Supplies Bulk Raw Yarn & Tooling] ──> [Artisans Craft Goods] ──> [Society Markets Output Jointly]
                    """.trimIndent(),
                    microMnemonic = "PRODUCER-POWER",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Blacksmiths & Bow-Makers Guild Supporting Sovereign Armories",
                        loreOrContext = "Master metalsmiths across Dandakaranya united to forge divine steel arrowheads and indestructible bows for the forces defending the forest hermitages.",
                        asciiFlowchart = "[⚒️ United Metalsmith Guild] ──> [Procures Iron Ores] ──> [Forges Divine Unbreakable Arrows]",
                        lessonQuote = "United craftsmen forge weapons capable of altering the destiny of nations."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Kashmir Pashmina Weavers Cooperative Collective",
                        loreOrContext = "120 village women spinning pure Cashmere wool formed a cooperative, procured certified raw wool together, and sell authenticated shawls directly to luxury European buyers.",
                        asciiFlowchart = "[🧣 120 Pashmina Spinners] ──> [Direct Pure Cashmere Sourcing] ──> [💎 5x Higher Price to Artisans]",
                        lessonQuote = "Empower the authentic creator and bypass corporate fashion exploitation."
                    ),
                    caseQuestion = "Identify the two main functions performed by a Producers' Cooperative Society for its member artisans.",
                    caseAnswer = "(1) Procurement and supply of raw materials, tools, and machinery; (2) Collective marketing and sale of finished output."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 36: The Potters of Khurja Collective",
                    scenario = "40 individual ceramic potters in Khurja purchased raw clay and glaze from private dealers at high prices and had to fire their pots in inefficient charcoal kilns. They formed 'Khurja Ceramic Producers Cooperative', installed a modern shared gas tunnel kiln, and pooled raw clay orders.",
                    question = "Explain how this Producers' Cooperative helped the potters overcome their economic vulnerabilities.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the model: Producers' Cooperative Society (1 Mark)",
                        "Explain benefit 1: Bulk raw material procurement lowered clay and glaze procurement costs (1 Mark)",
                        "Explain benefit 2: Shared gas tunnel kiln provided modern industrial infrastructure which individual artisans could never afford alone (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Consumers' cooperatives eliminate middlemen retail profits to protect buyers.",
                "Producers' cooperatives supply inputs and shared tooling to empower small artisans against large industrial capitalists."
            )
        ),

        // PAGE 37: Types of Cooperatives - Marketing & Farmers Cooperatives
        StudyPage(
            pageNumber = 37,
            module = ModuleCategory.COOPERATIVE,
            title = "Types of Cooperatives: Marketing vs. Farmers' Societies",
            subtitle = "Collective Bargaining in Agricultural Trade and Crop Modernization",
            topicDescriptionEnglish = "Marketing Cooperatives pool the output of small producers to secure favorable prices, grading, warehousing, and transportation. Farmers' Cooperatives pool fragmented landholdings and resources to procure certified seeds, fertilizers, and modern tractor mechanization.",
            topicDescriptionHinglish = "Marketing Cooperative Society: Chhote kisano ya producers ka maal ek jagah ikattha karti hai, uski grading karti hai, warehouse me store karti hai aur jab market me daam accha hota hai tab bechti hai (jaise NAFED ya Amul). Farmers' Cooperative Society: Kisano ke chhote-chhote kheto ko milakar joint farming karwati hai, saste beej, khaad aur harvester provide karti hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-K-T vs F-A-R-M' -> Marketing = Warehousing & Fair Selling Price | Farmers = Joint Cultivation, Seeds & Tractors.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Strategic Collection and Storage of Medicinal Herbs on Mountain Slopes",
                loreOrContext = "When the battle peaked, scout parties methodically gathered, cataloged, and warehoused potent forest herbs in sacred mountain caves under Sushena's surgical supervision, ensuring zero spoilage and instant readiness.",
                asciiFlowchart = """
[🌿 Dispersed Mountain Medicinal Herbs]
       │
       ▼ (Systematic Collection, Grading & Protection)
[🏔️ Secure Mountain Caves Under Physician Sushena's Command]
       │
       ▼ (Instant Deployment When Crisis Struck the Battlefield)
[✨ Sanjeevani Administered ──> Supreme Life Restoration]
                """.trimIndent(),
                lessonQuote = "Prudent storage and collective coordination transform raw harvest into lifesaving power."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Marketing Cooperative Societies",
                    category = "Cooperative Type",
                    englishText = "Formed by small producers seeking to obtain the best market price for their goods. The society pools member output, performs grading, packaging, warehousing, and transportation, and holds stock until prices turn favorable.",
                    hinglishText = "Kisan akele bechne jata tha to mandi me aadhutiya use dabakar kam daam deta tha. Ab saare kisan apna anaaj ek sath society ko dete hain. Society use store karti hai, grade karti hai aur jab rates high hote hain tab bade corporate buyers ko bechti hai!",
                    asciiFlowchart = """
[Dispersed Small Farmers] ──> [Pool Harvest] ──> [Grading & Warehousing] ──> [Sell in Bulk at Peak Market Price!]
                    """.trimIndent(),
                    microMnemonic = "BULK-MARKET",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Imperial Grain Procurement Network of Kosala Kingdom",
                        loreOrContext = "Imperial granaries in Ayodhya accepted graded wheat from distant rural districts, paying guaranteed minimum value and preserving grain reserves in underground stone silos.",
                        asciiFlowchart = "[🌾 Graded Rural Wheat] ──> [Underground Stone Silos] ──> [Guaranteed Value to Farmers]",
                        lessonQuote = "Structured marketing networks insulate the grower from seasonal price collapse."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "MahaGrapes Cooperative Exporting Seedless Grapes to Europe",
                        loreOrContext = "16 farmer societies in Maharashtra pooled their grape vineyards into 'MahaGrapes', built cold storage facilities, and export European-compliant grapes at 3x local wholesale rates.",
                        asciiFlowchart = "[🍇 16 Grape Societies] ──> [MahaGrapes Cold Chain] ──> [✈️ Direct Export to UK Supermarkets]",
                        lessonQuote = "Aggregate supply, meet international standards, and capture global export margins."
                    ),
                    caseQuestion = "Why are small farmers unable to get fair prices when selling individually in wholesale agricultural mandis?",
                    caseAnswer = "Due to lack of storage facilities, urgent cash needs leading to distress sales, and weak bargaining power against cartels."
                ),
                SubPointItem(
                    pointTitle = "Farmers' Cooperative Societies",
                    category = "Cooperative Type",
                    englishText = "Formed by small farmers joining together to enjoy the economies of large-scale mechanized farming. Members pool fragmented plots of land and jointly procure certified seeds, chemical fertilizers, drip-irrigation, and combine harvesters.",
                    hinglishText = "India me kisano ke paas aadha-ekad khet hote hain jisme tractor chalana loss ka sauda hota hai. Farmers' society me sabhi kisan khet milakar joint kheti karte hain, society ka tractor aur harvester use karte hain, aur bachat sab me bat-ti hai.",
                    asciiFlowchart = """
[Fragmented 0.5-Acre Plots] ──> [Pooled into 100-Acre Contiguous Farm] ──> [Use Modern Tractors & Drip Systems] ──> [🌾 40% Yield Surge]
                    """.trimIndent(),
                    microMnemonic = "JOINT-FARM",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Community Irrigation Canals of Mithila's Fertile Valleys",
                        loreOrContext = "King Janaka ploughed the field himself alongside royal farmers, sharing collective irrigation canals drawn from Himalayan streams to ensure universal bumper harvests.",
                        asciiFlowchart = "[👑 King Janaka's Ploughing] ──> [Shared Himalayan Canals] ──> [🌾 Golden Harvests Across Mithila]",
                        lessonQuote = "When rulers and tillers unite in the soil, the earth yields divine prosperity."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Drone-Spraying & Smart Tractor Pooling Coop in Punjab",
                        loreOrContext = "50 wheat farmers pooled ₹20,000 each to buy an AI crop-monitoring drone and heavy laser-land levelers, slashing fertilizer wastage by 30%.",
                        asciiFlowchart = "[🚜 50 Farmers Pool Funds] ──> [Buy AI Drone & Laser Leveler] ──> [🌱 30% Fertilizer Saved]",
                        lessonQuote = "Cooperative equipment pooling democratizes expensive agricultural deep-tech."
                    ),
                    caseQuestion = "What agricultural problem is directly solved by a Farmers' Cooperative Society in India?",
                    caseAnswer = "The problem of fragmented landholdings, low mechanization, and high costs of agricultural inputs."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 37: The Tomato Distress Sales of Kolar",
                    scenario = "Tomato growers in Kolar were forced to dump tomatoes on highways at ₹2/kg because cold storages were owned by private merchants who charged ₹10/crate/day. The farmers formed 'Kolar Tomato Marketing Cooperative', leased a government cold room, and partnered with a ketchup brand.",
                    question = "Explain the dual advantages achieved by the farmers through their Marketing Cooperative.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Society: Marketing Cooperative Society (1 Mark)",
                        "Advantage 1: Elimination of distress sales through shared cold-storage holding capacity until prices recover (1 Mark)",
                        "Advantage 2: Collective direct supply contracts with industrial ketchup processors, securing guaranteed fair price (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Marketing cooperatives aggregate output, eliminate distress sales, and provide storage until prices peak.",
                "Farmers' cooperatives pool fragmented lands and agricultural machinery to achieve economies of large-scale farming."
            )
        ),

        // PAGE 38: Types of Cooperatives - Credit & Housing Cooperatives
        StudyPage(
            pageNumber = 38,
            module = ModuleCategory.COOPERATIVE,
            title = "Types of Cooperatives: Credit vs. Housing Societies",
            subtitle = "Demolishing Usurious Moneylenders and Constructing Affordable Shelter",
            topicDescriptionEnglish = "Credit Cooperative Societies pool community savings to extend affordable, low-interest loans, rescuing members from usurious moneylenders. Cooperative Housing Societies procure land and construct residential flats or plots for members on a non-profit basis.",
            topicDescriptionHinglish = "Credit Cooperative Society: Ye garib logo ko kabardaar aur soodkhor mahajano (moneylenders) ke chakravyuh se bachane ke liye banti hai. Members choti-choti bachat jama karte hain aur zaroorat padne par bahut kam byaaj par loan milta hai. Cooperative Housing Society: Shehro me flat ya zameen khareedna aam aadmi ke bas ka nahi hota, isliye log milkar society banate hain, sasti zameen khareedte hain aur cost-to-cost flats bana kar aapas me baant lete hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-R-E-D vs H-O-U-S-E' -> Credit = Cheap Loans, Defeats Usury | Housing = Affordable Land & Cost-to-Cost Flats.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Hermitage Shelters Built by Lakshmana at Panchavati",
                loreOrContext = "On the banks of the Godavari, Lakshmana designed and erected an exquisite hermitage of clay, bamboo, and thatched leaves, creating an impregnable, harmonious sanctuary for Lord Rama and Sita without commercial artisans.",
                asciiFlowchart = """
[🌿 River Godavari Bamboo, Reeds & Clay]
       │
       ▼ (Dedicated Non-Profit Self-Built Architecture)
[🏡 Impregnable Sacred Hermitage (Panchavati)]
       │
       ▼ (Peaceful, Affordable, Weatherproof Sanctuary for the Sovereign Exiles)
[🛡️ Complete Domestic Security Achieved Through Pure Cooperative Craft]
                """.trimIndent(),
                lessonQuote = "Shelter built with hands united in love provides greater peace than golden palaces."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Credit Cooperative Societies (Rural & Urban PACS)",
                    category = "Cooperative Type",
                    englishText = "Formed to provide financial assistance to members by pooling their small savings and providing loans at reasonable, non-usurious interest rates. They liberate rural poor from hereditary debt traps set by local moneylenders.",
                    hinglishText = "Gaon me sahukar aur mahajan 36% se 50% saal ka byaaj maangte the. Credit society me sabhi members 100-500 rupaye har mahine jama karte hain. Jab kisi ko beemari, beej khareedne ya shaadi ke liye loan chahiye hota hai, to 6-8% simple interest par aasan kiston me loan mil jata hai!",
                    asciiFlowchart = """
[100 Members Deposit ₹500/Month] ──> [Collective Pool of ₹50,000/Mo] ──> [Disburse Loans at 7% Interest] ──> [🛡️ Moneylender Defeated!]
                    """.trimIndent(),
                    microMnemonic = "KILL-USURY",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sage's Golden Emergency Reserve in Hermitages",
                        loreOrContext = "Vedic ashrams maintained communal reserves of medicinal oils, grains, and sacred cow herds, ready to assist destitute travelers and forest tribes without debt bonds.",
                        asciiFlowchart = "[Communal Ashram Reserve] ──> [Disbursed to Destitute Families] ──> [Zero Exploitative Debt]",
                        lessonQuote = "Community emergency reserves are the true insurance of a righteous society."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Gig-Worker (Swiggy & Zomato) Delivery Fleet Credit Union",
                        loreOrContext = "400 delivery riders formed a micro-credit society in Hyderabad, pooling ₹300 monthly to provide emergency ₹15,000 loans for bike repairs within 2 hours, bypassing shady instant-loan apps.",
                        asciiFlowchart = "[🛵 400 Delivery Riders] ──> [Pool ₹300/Mo] ──> [Instant ₹15k Emergency Bike Repair Loans at 3%]",
                        lessonQuote = "Collective credit unions protect working-class workers from predatory fintech payday sharks."
                    ),
                    caseQuestion = "Why are credit cooperative societies considered superior to traditional rural moneylenders in India?",
                    caseAnswer = "Because they charge low, reasonable rates of interest, adopt transparent accounting, and protect borrowers from land expropriation."
                ),
                SubPointItem(
                    pointTitle = "Cooperative Housing Societies",
                    category = "Cooperative Type",
                    englishText = "Formed to procure residential accommodation for members at lower costs by purchasing large tracts of land, developing infrastructure, constructing multi-story flats, or allotting plots on easy installment terms on a non-profit basis.",
                    hinglishText = "Private builders flats bechne me 40% margin aur commission kha jate hain. Housing cooperative society me middle-class log sath aate hain, bada land khareedte hain, contractor ko contract dekar cost-to-cost flats banwate hain aur aapas me baant lete hain!",
                    asciiFlowchart = """
[100 Flat Seekers Pool Funds] ──> [Direct Land Purchase] ──> [Construct at Cost Price] ──> [Save 35% vs Commercial Builders]
                    """.trimIndent(),
                    microMnemonic = "COST-HOMES",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Systematic Civic Planning of Ayodhya's Quarters",
                        loreOrContext = "Ayodhya was laid out by divine architect Vishwakarma with spacious lanes, equal housing quarters, and communal water tanks, ensuring every citizen possessed noble domestic shelter.",
                        asciiFlowchart = "[📐 Master Architectural Plan] ──> [Equitable Housing Plots] ──> [Universal High Standard of Living]",
                        lessonQuote = "Dignified shelter for every family is the foundation of enduring civic happiness."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Techies Purchasing Urban Land for Cooperative Apartment Tower",
                        loreOrContext = "50 software engineers in Hyderabad formed a cooperative housing society, purchased a 2-acre plot, and constructed apartments for ₹45 Lakhs each, whereas adjacent private builder flats were selling for ₹75 Lakhs.",
                        asciiFlowchart = "[💻 50 Techies Pool ₹25Cr] ──> [Build Cost-to-Cost Apartments] ──> [💰 ₹30 Lakhs Saved Per Family]",
                        lessonQuote = "Disintermediate the real estate mafia through collective cooperative development."
                    ),
                    caseQuestion = "In what two ways does a Cooperative Housing Society provide residential benefits to its members?",
                    caseAnswer = "(1) By purchasing land and developing plots for sale on easy installments; (2) By constructing flats directly and allotting them on cost-to-cost terms."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 38: The Payday Loan Liberation of Auto Drivers",
                    scenario = "120 auto-rickshaw drivers in Pune paid ₹100 daily interest on ₹2,000 informal borrowings from local money sharks to replace punctured tires. They established 'Rikshawala Mitra Credit Cooperative', contributing ₹200 weekly savings, and extended credit at 1% monthly interest.",
                    question = "Identify the form of cooperative society formed and state its two core functions.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Society: Credit Cooperative Society (1 Mark)",
                        "Function 1: Encourage thrifty regular savings among low-income members (1 Mark)",
                        "Function 2: Provide quick, low-interest emergency loans to liberate members from predatory moneylenders (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Credit cooperatives defeat usurious moneylenders and cultivate thrift.",
                "Housing cooperatives eliminate builder speculative margins to deliver affordable shelter."
            )
        ),

        // PAGE 39: Formation & Registration Process of Cooperative Society
        StudyPage(
            pageNumber = 39,
            module = ModuleCategory.COOPERATIVE,
            title = "Formation & Registration of a Cooperative Society",
            subtitle = "From Promoter Assembly to the Registrar's Official Charter",
            topicDescriptionEnglish = "A cooperative society is incorporated under the Cooperative Societies Act, 1912 (or State Act). It requires minimum 10 adult persons, adoption of model bye-laws, an initial General Body Meeting, and formal registration with the Registrar of Cooperative Societies.",
            topicDescriptionHinglish = "Cooperative society banana 5 clear steps ka process hai: (1) Kam se kam 10 adult members ikatthe hon; (2) Bye-laws (samaj ke niyam aur rules) taiyar karo; (3) Pehli General Meeting bulakar office-bearers chuno; (4) Registrar of Cooperative Societies ke paas application, bye-laws aur fees submit karo; (5) Registrar verify karke 'Certificate of Registration' issue karega.",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-B-M-R-C' -> (M)inimum 10 adults, (B)ye-laws drafted, (M)eeting of Promoters, (R)egistrar filing, (C)ertificate issued.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Assembly for Consecration of Royal Treaties",
                loreOrContext = "When sacred alliances were formulated in Aryavarta, elders drew up charter scrolls, gathered signatures of clan leaders before the sacrificial fire, and entered the parchment in the imperial archives.",
                asciiFlowchart = """
[📜 Sacred Parchment Scroll Inscribed]
       │
       ▼ (Verification by Royal Ministers & Clan Chiefs)
[🔥 Signatures Affixed Before Agni (Sacred Fire)]
       │
       ▼ (Registered in Imperial Archives of the Realm)
[🏛️ Inviolate Statutory Status Accorded by Sovereign Decree]
                """.trimIndent(),
                lessonQuote = "When covenants are inscribed with integrity and recorded before the law, they endure eternally."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Statutory Documentation for Registration",
                    category = "Registration Process",
                    englishText = "The application must be submitted to the Registrar accompanied by: (1) Application form signed by at least 10 members; (2) Four copies of proposed Bye-laws; (3) List of members and their share capital commitments; (4) Minutes of the inaugural meeting.",
                    hinglishText = "Application form ke sath ye 4 cheezein jama karni hoti hain: (1) Kam se kam 10 members ke verified sign; (2) Society ke Bye-laws ki 4 copies; (3) Sabhi members ke naam, address aur unhone kitne shares khareede; (4) Pehli preliminary meeting ke proceedings/minutes.",
                    asciiFlowchart = """
[10+ Signed Application] + [4 Copies of Bye-Laws] + [Share Capital List] ──> [Registrar Scrutiny] ──> [📜 Official Certificate Issued]
                    """.trimIndent(),
                    microMnemonic = "DOCS-FOR-REG",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Consecration Scroll of the Vanara Alliance",
                        loreOrContext = "Sugriva's ministers documented the military troop contributions of every Vanara province on birch bark scrolls for Lord Rama's review.",
                        asciiFlowchart = "[📜 Birch Bark Rolls Inscribed] ──> [Presented to Lord Rama] ──> [Allied Legion Enrolled]",
                        lessonQuote = "Precise documentation turns disparate tribes into an organized imperial host."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Digital State Cooperative Portal Registration for Solar Rooftop Society",
                        loreOrContext = "Residents submitted Aadhaar e-signed bye-laws on the state Sahakar portal, paid the ₹2,500 challan, and received their digital registration number within 21 days.",
                        asciiFlowchart = "[💻 State Sahakar Portal] ──> [Upload 10 Member E-Signs] ──> [📥 Digital Registration Certificate]",
                        lessonQuote = "Modern digital filing makes statutory incorporation transparent and swift."
                    ),
                    caseQuestion = "How many copies of proposed bye-laws are required to be submitted along with the registration application of a cooperative society?",
                    caseAnswer = "Generally, four copies of the proposed bye-laws must be submitted to the Registrar."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 39: The Defective Bye-Laws Rejection",
                    scenario = "An association of 12 poultry farmers submitted an application to register a Marketing Cooperative. In their proposed bye-laws, they stipulated: 'Any member holding over 100 shares will be entitled to 5 votes in the AGM.' The Registrar rejected the application.",
                    question = "Was the Registrar legally justified in rejecting the application? Explain the statutory ground.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: Yes, the Registrar was legally justified in rejecting the registration (1 Mark)",
                        "State the statutory mandate: The Cooperative Societies Act mandates the democratic principle of 'One Man, One Vote' (1 Mark)",
                        "Conclusion: The clause granting multiple votes based on shareholding violates the core statutory principle of cooperative democracy (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Requires minimum 10 adult persons and submission of 4 copies of bye-laws.",
                "Registration confers full legal status, perpetual succession, and statutory limited liability."
            )
        ),

        // PAGE 40: Governance & Management Structure of Cooperatives
        StudyPage(
            pageNumber = 40,
            module = ModuleCategory.COOPERATIVE,
            title = "Governance: The General Body & Managing Committee",
            subtitle = "Sovereign Democratic Powers vs. Day-to-Day Operational Stewardship",
            topicDescriptionEnglish = "Governance is dual-tiered: (1) The General Body comprising all members is the supreme sovereign organ; (2) The Managing Committee elected by the General Body on 'One man, one vote' carries out executive management.",
            topicDescriptionHinglish = "Cooperative society ki governance 2 hisso me chalti hai: (1) General Body—isme society ka har ek member hota hai, ye sabse badi supreme authority hoti hai jo saal me kam se kam ek baar AGM (Annual General Meeting) me milti hai; (2) Managing Committee—General Body ke members apne me se 7 se 15 logo ko vote dekar chunte hain jo rozana dukan aur business ko chalate hain.",
            macroMemoryTrick = "MACRO MNEMONIC: 'G-B vs M-C' -> General Body = Supreme Sovereign All Members | Managing Committee = Elected Day-to-Day Executive.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Imperial Sabha (General Assembly) of Ayodhya",
                loreOrContext = "When major constitutional decisions arose, Emperor Dasharatha convened the Mahasabha consisting of city guild leaders, rural chieftains, sages, and warriors, submitting royal proposals for universal collective acclaim.",
                asciiFlowchart = """
             [🏛️ Imperial Mahasabha (General Body)]
                             │ (All Guild Heads, Chieftains & Citizens)
                             ▼
[Council of 8 Chief Ministers (Managing Committee under Sumantra)]
                             │ (Executive Day-to-Day Administration)
                             ▼
              [⚖️ Flawless Democratic Imperial Governance]
                """.trimIndent(),
                lessonQuote = "Supreme authority resides in the collective assembly; executive stewardship serves at its pleasure."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Powers of the General Body vs. Managing Committee",
                    category = "Governance Structure",
                    englishText = "The General Body has the ultimate power to amend bye-laws, approve annual financial statements, declare dividends, and elect the Managing Committee. The Managing Committee manages daily purchases, bank accounts, and employee appointments.",
                    hinglishText = "General Body sabse bada maalik hai: wo niyam badal sakti hai, munafa kitna batega wo decide karti hai, aur managing committee ko chun-ti ya hata sakti hai. Managing committee dukan ka daily stock khareedna, staff rakhna aur bank account operate karna sambhalti hai.",
                    asciiFlowchart = """
[General Body (ALL Members)] ──> [Elects ──>] [Managing Committee (7 to 15 Members)] ──> [Runs Daily Operations]
            ▲                                                                                    │
            └────────────── Reports Annually at AGM & Submits Audited Accounts ──────────────────┘
                    """.trimIndent(),
                    microMnemonic = "SUPREME-VS-EXEC",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Vanara Supreme Assembly Electing Scout Expedition Chiefs",
                        loreOrContext = "Sugriva assembled all Vanaras, but appointed specialized commanders (Angada, Hanuman, Nila) as the executive committee for the southern search mission.",
                        asciiFlowchart = "[Vast Vanara Host] ──> [Executive Chiefs Chosen] ──> [Southern Expedition Launched]",
                        lessonQuote = "Universal assemblies authorize; focused executive councils execute."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Housing Society AGM Overruling Managing Committee on EV Chargers",
                        loreOrContext = "The managing committee of an apartment complex rejected EV chargers. At the Annual General Meeting, 85 flat owners voted in favor, overruling the committee and mandating EV installation.",
                        asciiFlowchart = "[Managing Committee Says NO] ──> [AGM Members Vote YES: 85-15] ──> [Committee Bound to Comply]",
                        lessonQuote = "The collective body always holds ultimate sovereign power over its elected officers."
                    ),
                    caseQuestion = "Can the Managing Committee of a cooperative society unilaterally amend the society's registered bye-laws without calling a General Body meeting?",
                    caseAnswer = "No. Bye-laws can only be amended by a special resolution passed by the General Body of all members."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 40: The Secret Investment by the Managing Committee",
                    scenario = "The President and Treasurer of an Urban Credit Cooperative invested ₹25 Lakhs of surplus funds in high-risk private corporate bonds without presenting the proposal to the General Body at the AGM. The corporate firm defaulted, wiping out the money.",
                    question = "Explain the breach of governance committed by the committee members and their personal liability.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the breach: Unauthorized investment of surplus without General Body approval or compliance with statutory investment guidelines (1.5 Marks)",
                        "Personal Liability: The President and Treasurer exceeded their executive powers (ultra vires) and are personally liable to make good the loss to the society (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "The General Body of all members is the supreme sovereign policy-making organ.",
                "The Managing Committee is the democratically elected executive organ accountable to the General Body."
            )
        ),

        // PAGE 41: Multi-State Cooperatives & Modern Amul Case Study
        StudyPage(
            pageNumber = 41,
            module = ModuleCategory.COOPERATIVE,
            title = "Multi-State Cooperatives & The Amul White Revolution",
            subtitle = "Scaling Grassroots Producer Power into a Global Commercial Juggernaut",
            topicDescriptionEnglish = "Under the Multi-State Cooperative Societies Act, 2002, societies whose objectives extend beyond one state can operate nationally. Amul (GCMMF) exemplifies the zenith of cooperative architecture, uniting 3.6 million dairy farmers across Gujarat into an internationally revered commercial enterprise.",
            topicDescriptionHinglish = "Agar cooperative society ka kaam ek se zyada states me faila ho, to wo 'Multi-State Cooperative Societies Act, 2002' ke andar aati hai. Iska sabse vishalkay aur superhit example hai AMUL (The Taste of India)! Amul ne dikha diya ki kisan aur gaon ki mahilaye milkar multinational corporations (Nestle, Danone) ko bhi commercial race me pichhad sakti hain!",
            macroMemoryTrick = "MACRO MNEMONIC: 'A-M-U-L' -> (A)nand Milk Union, (M)ulti-State Scale, (U)nited 3.6M Farmers, (L)argest Dairy Cooperative.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Universal Ocean Crossing: The Ultimate Cooperative Scale",
                loreOrContext = "When millions of humble forest creatures from thousands of different provinces harmonized under sovereign dharmic leadership, they achieved what all the wealth of Lanka could not fathom.",
                asciiFlowchart = """
[🌱 Millions of Humble Forest Dwellers Across Aryavarta]
       │ (Pooled Diverse Strengths Voluntarily)
       ▼
[🌉 100-Yojana Cosmic Ocean Bridge Engineered in 5 Days]
       │
       ▼ (Overthrowing Invincible Sovereign Oppression)
[🌟 Triumph of Righteous Democratic Unity Over Imperial Arrogance]
                """.trimIndent(),
                lessonQuote = "When humble producers unite, their collective footprint reshapes the history of civilization."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Amul Model (3-Tier Cooperative Architecture)",
                    category = "Case Study Architecture",
                    englishText = "Amul operates on a 3-tier structure: (1) Village Dairy Cooperative Societies at village level (milk collection and quality testing); (2) District Cooperative Milk Producers' Union at district level (processing and chilling); (3) State Milk Marketing Federation (GCMMF) at state level (nationwide branding, marketing, and supply-chain logistics).",
                    hinglishText = "Amul ka 3-Tier Model: Tier 1: Gaon me 'Village Cooperative Society'—jaha har kisan subah-shaam doodh deta hai aur turant cash milta hai. Tier 2: Zila level par 'District Milk Union'—jaha doodh chill aur process hota hai. Tier 3: State level par 'GCMMF (Amul)'—jo poore desh aur duniya me Amul brand ki marketing karta hai!",
                    asciiFlowchart = """
[Village Level: 18,600 Village Societies] ──> Milk Collection & Instant Payment
                     │
                     ▼
[District Level: 18 District Milk Unions] ──> Chilling & Industrial Processing Plants
                     │
                     ▼
[State/National Level: GCMMF (AMUL)]      ──> Global Brand, Cold Chains & Multi-Billion Distribution
                    """.trimIndent(),
                    microMnemonic = "3-TIER-AMUL",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The 3-Tier Strategic Scouting of the Four Quarters",
                        loreOrContext = "Sugriva organized the search for Sita across 3 tiers: local scout squads at the base, provincial legion commanders directing territories, and supreme command under Rama on Suvela.",
                        asciiFlowchart = "[Local Vanara Scouts] ──> [Provincial Commanders] ──> [Supreme Command Summit]",
                        lessonQuote = "Structured hierarchy backed by local empowerment conquers impossible terrain."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "D2C Artisanal Coffee Multi-State Cooperative",
                        loreOrContext = "1,000 coffee growers across Karnataka, Kerala, and Tamil Nadu united under the Multi-State Cooperative Act to create 'Malabar Roast', eliminating export cartel cuts.",
                        asciiFlowchart = "[3 States Coffee Growers] ──> [Multi-State Cooperative Entity] ──> [Direct D2C Brand Bypasses Cartels]",
                        lessonQuote = "Scale your cooperative architecture across state lines to capture true national distribution."
                    ),
                    caseQuestion = "Name the three tiers in the organizational structure of the Amul cooperative dairy model.",
                    caseAnswer = "(1) Village Dairy Cooperative Society; (2) District Cooperative Milk Producers' Union; (3) State Milk Marketing Federation (GCMMF)."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 41: The Amul Value Distribution Mechanism",
                    scenario = "In multinational private dairies, only 30-35% of the consumer rupee paid for a pouch of milk reaches the dairy farmer, with 65% absorbed by corporate marketing and shareholders. In Amul's cooperative model, 80-82% of every consumer rupee is returned directly to the village farmer.",
                    question = "Explain how the cooperative ethos of Amul delivers superior socio-economic justice to rural producers.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Explain Service Motive vs Corporate Profit: Amul operates to maximize farmer return, not absentee shareholder dividends (1.5 Marks)",
                        "Analyze Elimination of Middlemen: The integrated 3-tier cooperative cold chain eliminates private intermediaries, returning 80%+ of consumer price directly to farmers (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Multi-state cooperatives operate across state borders under the Multi-State Cooperative Societies Act, 2002.",
                "Amul's 3-tier architecture returns over 80% of consumer expenditure straight to rural grassroots farmers."
            )
        ),

        // PAGE 42: Cooperative Societies Master Review & Distinction Matrix
        StudyPage(
            pageNumber = 42,
            module = ModuleCategory.COOPERATIVE,
            title = "Cooperative Societies Master Review & Distinction Matrix",
            subtitle = "Cooperative Society vs. Partnership vs. Sole Proprietorship",
            topicDescriptionEnglish = "A comprehensive multi-dimensional matrix contrasting Cooperative Societies with Partnership and Sole Proprietorship across legislation, membership, motive, voting rights, liability, and distribution of surplus.",
            topicDescriptionHinglish = "Master Revision Sheet: Cooperative Society, Partnership, aur Sole Proprietorship ke beech ka complete 6-point comparison. Board exam me 6 marks ka direct difference aane par ye matrix full marks dilwayegi!",
            macroMemoryTrick = "MACRO MNEMONIC: 'L-M-V-L-S-M' -> (L)aw, (M)embership, (V)oting, (L)iability, (S)urplus, (M)otive.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Synthesis of Governance in the Sovereign Realm of Ayodhya",
                loreOrContext = "In Lord Rama's ideal statecraft, the sole sovereign command (Rama), the dedicated fraternal alliance (Lakshmana & Bharata), and the vast democratic guild assemblies (Cooperative Panchayats) worked in divine resonance.",
                asciiFlowchart = """
             [🌟 The Integrated Dharmic Commonwealth of Ayodhya]
                                     │
       ┌─────────────────────────────┼─────────────────────────────┐
       ▼                             ▼                             ▼
[SOLE SOVEREIGN]            [FRATERNAL ALLIANCE]          [DEMOCRATIC GUILDS]
(Lord Rama's Direct Word)   (Rama-Lakshmana Pact)        (Citizens & Vanara Host)
(Unchallenged Swift Action) (Shared Mutual Duty)          (Universal Welfare & Service)
                """.trimIndent(),
                lessonQuote = "The ideal commonwealth harmonizes swift sovereign wisdom with fraternal pacts and democratic community service."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Distinction Matrix: Sole Prop vs. Partnership vs. Cooperative",
                    category = "Master Distinction",
                    englishText = "1. Statute: None vs 1932 Act vs 1912 Act. 2. Members: 1 vs 2-50 vs Min 10 (no max). 3. Voting: N/A vs Agreement vs 'One man, one vote'. 4. Liability: Unlimited vs Joint & Several Unlimited vs Limited to share capital. 5. Motive: Profit vs Profit vs Mutual Service. 6. Continuity: Unstable vs Unstable vs Perpetual.",
                    hinglishText = "1. Kanoon: Koi nahi vs 1932 Act vs 1912 Act. 2. Members: 1 vs 2-50 vs Min 10 (Max NO LIMIT). 3. Voting: N/A vs Contract vs '1 Man 1 Vote'. 4. Liability: Unlimited vs Unlimited vs Limited. 5. Motive: Profit vs Profit vs Seva/Service. 6. Continuity: Mortal vs Fragile vs Perpetual (Zinda rehti hai).",
                    asciiFlowchart = """
[BASIS]        [SOLE PROPRIETOR]     [PARTNERSHIP]         [COOPERATIVE SOCIETY]
Governing Act: None                  Partnership Act 1932  Cooperative Societies Act 1912
Min Members:   1                     2                     10 Adults
Max Members:   1                     50                    No Upper Limit
Voting Rights: Owner Decides         As per Agreement      Strictly 'One Man, One Vote'
Liability:     Unlimited             Joint Unlimited       Strictly Limited to Shares
Primary Motive:Profit Maximization   Profit Maximization   Mutual Service and Welfare
Continuity:    Ends on Death         Unstable              Perpetual Succession (Forever)
                    """.trimIndent(),
                    microMnemonic = "MASTER-COOP-TABLE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Evolution from Solitary Exile to Allied Triumph",
                        loreOrContext = "Lord Rama walked alone into the forest (Sole), allied with Sugriva by sacred fire (Partnership), and mobilized millions of Vanaras in collective brotherhood (Cooperative).",
                        asciiFlowchart = "[Solitary Exile: Sole] ──> [Sugriva Alliance: Partner] ──> [Vanara Setu Host: Cooperative]",
                        lessonQuote = "Destiny expands from solitary austerity to fraternal alliance and ultimately to universal collective empowerment."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Evolution: Freelance Coder -> Software Agency -> Open-Source Cooperative",
                        loreOrContext = "Dev started coding alone (Sole Prop), founded a 3-person dev shop (Partnership), and scaled to an open-source software cooperative owned equally by 200 global contributors.",
                        asciiFlowchart = "[Solo Freelancer] ──> [3-Partner Dev Shop] ──> [200-Member Global Dev Cooperative]",
                        lessonQuote = "Scale transitions individual hustle into fraternal enterprise, and ultimately into perpetual community institutions."
                    ),
                    caseQuestion = "Which form of business organization is governed strictly by the democratic rule of 'One man, one vote'?",
                    caseAnswer = "Cooperative Society, governed under the Cooperative Societies Act, 1912."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 42: Comprehensive Form Selection for Artisans",
                    scenario = "A cluster of 15 terracotta toy sculptors in Bengal wish to organize their enterprise. They have limited individual capital and fear losing their personal huts if the business fails. They also demand equal democratic voice regardless of how many toys each sculptor crafts.",
                    question = "Evaluate whether they should form a Sole Proprietorship, Partnership, or Cooperative Society. Justify with 3 points.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: Form a Producers' Cooperative Society (1 Mark)",
                        "Justification 1 (Liability): Personal huts are protected because member liability is strictly limited to their share capital (1 Mark)",
                        "Justification 2 (Democratic Voice): Every sculptor receives exactly one vote ('One man, one vote') ensuring equality (1 Mark)",
                        "Justification 3 (Economies of Scale & Government Support): Access to government raw clay subsidies and elimination of merchant markups (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Cooperative societies stand as the democratic vanguard protecting the economically weak.",
                "Compulsory registration, limited liability, and 'One man, one vote' distinguish cooperatives from all other unincorporated commercial forms."
            )
        )
    )
}
