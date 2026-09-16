package com.example.data

import com.example.model.*

object CompanyFormationData {
    val pages = listOf(
        // PAGE 53: Promotion Stage - Genesis, Role & Functions of a Promoter
        StudyPage(
            pageNumber = 53,
            module = ModuleCategory.FORMATION,
            title = "Promotion Stage: The Vision, Role & Functions of Promoters",
            subtitle = "Companies Act 2013 Section 2(69) | Conception to Commercial Reality",
            topicDescriptionEnglish = "Promotion is the first stage in company formation. A Promoter conceives the business idea, analyzes commercial feasibility, mobilizes resources, and undertakes all foundational steps necessary to bring the company into legal existence.",
            topicDescriptionHinglish = "Company banana hawa me nahi hota, iski shuruat 'Promotion' se hoti hai! Jo vyakti ya group business ka idea sochta hai, feasibility check karta hai, saare legal kaagaz taiyar karta hai aur company ko janam dilwata hai, use 'Promoter' kehte hain (Companies Act Section 2(69)). Bina promoter ke koi bhi company zameen par nahi utar sakti!",
            macroMemoryTrick = "MACRO MNEMONIC: 'I-F-N-S-P-D' -> (I)dea conception, (F)easibility study, (N)ame approval, (S)ignatories fixed, (P)rofessionals hired, (D)ocuments drafted.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Jambavan Awakening the Infinite Potential of Lord Hanuman",
                loreOrContext = "When the Vanaras stood paralyzed on the ocean shore, venerable elder Jambavan stepped forth as the supreme catalyst/promoter, reminding Hanuman of his celestial heritage, stirring his dormant divine energy, and initiating the cosmic flight.",
                asciiFlowchart = """
[🌊 Paralyzed Vanara Host at the Impassable Ocean Brink]
       │
       ▼ (Jambavan Acts as Supreme Catalyst / Promoter)
[🐻 Jambavan Reminds Hanuman of His Divine Strength & Cosmic Mission]
       │
       ▼ (Potential Awakened & Strategic Mission Initiated)
[🚀 Lord Hanuman Expands into Cosmic Form for the Great Leap!]
                """.trimIndent(),
                lessonQuote = "The great promoter awakens latent cosmic energy and channels it into monumental execution."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Six Key Functions of a Promoter",
                    category = "Promoter Functions",
                    englishText = "1. Identification of business opportunity; 2. Feasibility Studies (Technical, Financial, Economic); 3. Name Approval (SPICe+ Part A); 4. Selecting Signatories to MOA; 5. Appointing Professionals (Bankers, Auditors, Solicitors); 6. Drafting Statutory Documents (MOA, AOA).",
                    hinglishText = "Promoter ke 6 bade kaam: 1. Business idea sochna; 2. Feasibility check karna (Technical: kya technology available hai? Financial: kya paisa milega? Economic: kya profit hoga?); 3. Company ka naam approve karwana; 4. MOA par sign karne walo ko tay karna; 5. Bankers, CA aur legal experts ko appoint karna; 6. MOA aur AOA draft karna.",
                    asciiFlowchart = """
[1. Idea Discovery] ──> [2. Feasibility: Tech/Finance/Econ] ──> [3. Name Approval] ──> [4. MOA Signatories] ──> [5. Hire CA/Lawyers] ──> [6. Draft MOA/AOA]
                    """.trimIndent(),
                    microMnemonic = "6-PROMOTER-STEPS",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Sugriva's Methodical Feasibility Reconnaissance of Kishkindha",
                        loreOrContext = "Before mobilizing his forces, Sugriva mapped geographical terrain, audited forest granaries, and selected veteran commanders to lead the regional vanguards.",
                        asciiFlowchart = "[Auditing Grain Stores] ──> [Mapping Mountain Passes] ──> [Deploying Seasoned Marshals]",
                        lessonQuote = "Meticulous preparation turns grand vision into certain triumph."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Startup Founder Validating Idea Before Pitch Deck",
                        loreOrContext = "Before incorporating, the founder built a Figma prototype, surveyed 500 college students (economic feasibility), secured a cloud server credit (technical feasibility), and hired a CS for name registration.",
                        asciiFlowchart = "[Figma MVP Survey] ──> [Cloud Server Credits Secured] ──> [Company Name Reserved on MCA Portal]",
                        lessonQuote = "Thorough pre-incorporation validation prevents millions in wasteful burn."
                    ),
                    caseQuestion = "Name the three types of feasibility studies conducted by a promoter before launching an enterprise.",
                    caseAnswer = "(1) Technical Feasibility; (2) Financial Feasibility; (3) Economic/Commercial Feasibility."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 53: The Failed Monorail Feasibility",
                    scenario = "Mr. Mehra conceived a business idea to operate private solar monorails connecting Delhi to Jaipur. He hired engineers and discovered: (1) Technical feasibility was sound; (2) Financial requirement was ₹50,000 Crores, which no bank or investor was willing to commit. Mr. Mehra shelved the project.",
                    question = "Explain which feasibility dimension failed and analyze why the promoter was prudent in aborting the launch.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify the failed dimension: Financial Feasibility (1 Mark)",
                        "Explain Concept: Financial feasibility tests whether the required capital can be raised on commercially viable terms from investors or financial institutions (1 Mark)",
                        "Promoter Prudence: A promoter must not recklessly proceed with incorporation if capital viability fails, avoiding catastrophic bankruptcy (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Promoters conceive ideas and execute technical, financial, and economic feasibility checks.",
                "Promoter functions bridge the conceptual idea to legal incorporation."
            )
        ),

        // PAGE 54: Legal Status of Promoter & Pre-Incorporation Contracts
        StudyPage(
            pageNumber = 54,
            module = ModuleCategory.FORMATION,
            title = "Legal Status of Promoters & Pre-Incorporation Contracts",
            subtitle = "Fiduciary Duty of Utmost Good Faith & The Kelner v. Baxter Rule",
            topicDescriptionEnglish = "A promoter stands in a 'Fiduciary Capacity' (relationship of utmost trust and good faith) towards the unformed company. He cannot make secret profits. Pre-incorporation contracts entered by promoters before the company's birth are personally binding on the promoter unless ratified under the Specific Relief Act.",
            topicDescriptionHinglish = "Promoter ka legal status kya hai? Na wo company ka agent hai (kyunki company abhi paida hi nahi hui), na wo trustee hai. Wo 'Fiduciary Relationship' (vishwas aur imandari ka rishta) me hota hai! Wo chupke se koi 'Secret Profit' nahi kama sakta. Aur company banne se pehle jo contracts promoter sign karta hai ('Pre-incorporation contracts'), unke liye promoter khud PERSONALLY LIABLE hota hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'F-I-D-U-C-I-A-R-Y' -> (F)aith absolute, (I)ndividual liability on early deals, (D)isclose all profits, (U)tmost good faith, (C)annot make secret gains.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Hanuman's Fiduciary Integrity in Lanka (Zero Selfish Motive)",
                loreOrContext = "Lord Hanuman entered the treasure vaults and opulent palaces of Ravana with divine detachment. Though having power to take golden ornaments or demand sovereign crowns, his mind remained 100% focused on his fiduciary duty to Lord Rama and Sita.",
                asciiFlowchart = """
[🏰 Vast Golden Palaces & Infinite Treasures of Lanka]
       │
       ▼ (Encountered by Solitary Champion Lord Hanuman)
[💎 Absolute Sensory Detachment & Pure Fiduciary Devotion to Lord Rama]
       │ (Zero Personal Appropriation / Zero Secret Gain)
       ▼
[✨ Flawless Execution of the Sacred Mission with Pristine Honor]
                """.trimIndent(),
                lessonQuote = "The highest fiduciary honor accepts zero personal gain while executing a sacred trust."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Fiduciary Duty & Prohibition of Secret Profits",
                    category = "Promoter Fiduciary Law",
                    englishText = "A promoter must make full and fair disclosure of any personal interest in property sold to the company. If a promoter makes a secret profit without disclosing it to an independent board or shareholders, the company can rescind the contract or recover the secret profit.",
                    hinglishText = "Promoter company ko apna koi personal plot ya property bech sakta hai, lekin use saaf-saaf batana padega ki usne wo plot kitne me khareeda tha. Agar usne bina bataye beech me 50 Lakhs ka secret profit kamaya, to company banne ke baad wo 50 Lakhs wapas chheen legi!",
                    asciiFlowchart = """
[Promoter Buys Land for ₹1 Cr] ──> [Sells to New Company for ₹1.5 Cr WITHOUT Disclosure] ──> [⚡ ILLEGAL SECRET PROFIT: Company Sues & Recovers ₹50L!]
                    """.trimIndent(),
                    microMnemonic = "NO-SECRET-PROFIT",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Prince Bharata's Transparent Treasury Audit at Nandigram",
                        loreOrContext = "Prince Bharata maintained meticulous accounting of every sovereign coin entering Ayodhya's treasury, presenting audited accounts to Rama upon his return without a single penny missing.",
                        asciiFlowchart = "[Meticulous Treasury Registers] ──> [Zero Personal Diversion] ──> [Pristine Accounting Surrendered to Rama]",
                        lessonQuote = "Righteous stewards present unblemished ledgers to the true sovereign."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Founder Selling Personal IP to His Own Funded Startup",
                        loreOrContext = "A startup founder transferred his AI patent to the newly incorporated company. The board and investors reviewed independent third-party valuation reports to ensure complete transparent disclosure.",
                        asciiFlowchart = "[Patent Transferred to Startup] ──> [Independent 3rd-Party Valuation] ──> [Full Disclosure to Investors]",
                        lessonQuote = "Transparency with investors builds bulletproof corporate governance from day one."
                    ),
                    caseQuestion = "What legal remedy does a company have if a promoter makes a secret profit during the purchase of property for the company?",
                    caseAnswer = "The company can either rescind the contract or affirm the purchase and recover the secret profit from the promoter."
                ),
                SubPointItem(
                    pointTitle = "Pre-Incorporation Contracts (Kelner v Baxter Doctrine)",
                    category = "Promoter Liability",
                    englishText = "Contracts entered into by promoters on behalf of a proposed company before its legal incorporation are called 'Pre-incorporation contracts'. Because a non-existent company cannot have agents, promoters are personally liable on these contracts unless novated under the Specific Relief Act, 1963.",
                    hinglishText = "Company banne se pehle promoter ne agar office lease par le liya ya machinery ka order de diya, to use 'Pre-incorporation contract' kehte hain. Agar kal company register nahi hui ya company ne contract accept karne se mana kar diya, to promoter ko apni pocket se pura paisa bharna padega!",
                    asciiFlowchart = """
[Promoter Signs Lease for Proposed Company] ──> [Company Incorporation Fails] ──> [🚨 Landlord Sues PROMOTER PERSONALLY for Rent!]
                    """.trimIndent(),
                    microMnemonic = "PROMOTER-PAYS-EARLY",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Emperor Dasharatha's Sacred Boons Given in the Celestial War",
                        loreOrContext = "Dasharatha gave his personal sovereign word to Kaikeyi years before Rama's birth; when the time came, he bore the personal agony of his prior commitment.",
                        asciiFlowchart = "[Personal Sovereign Promise Given] ──> [Bears Agony of Fulfilling Vow Personally]",
                        lessonQuote = "A righteous man stands personally bound by covenants made before glory arrived."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Founder Signing Office Lease in Indiranagar Before Incorporation",
                        loreOrContext = "Karan signed a 3-year office lease 'on behalf of Alpha AI Pvt. Ltd.' before the company was registered. When his co-founder backed out, the landlord legally held Karan personally liable for the ₹12 Lakhs lease lock-in.",
                        asciiFlowchart = "[Lease Signed Pre-Incorporation] ──> [Co-Founder Quits] ──> [Founder Personally Liable for ₹12 Lakhs]",
                        lessonQuote = "Never sign enterprise obligations until the incorporated legal shield is active."
                    ),
                    caseQuestion = "Why cannot a company ratify a pre-incorporation contract under traditional common law?",
                    caseAnswer = "Because the company did not exist at the time the contract was entered into, and an agent cannot act for a non-existent principal."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 54: The Secret Commission on the Factory Plot",
                    scenario = "Mr. Batra, acting as promoter for Apex Cement Ltd., negotiated the purchase of limestone land from a farmer for ₹80 Lakhs. He billed the land to Apex Cement Ltd. for ₹1.10 Crores, pocketing ₹30 Lakhs without mentioning it in the prospectus or disclosing it to the independent directors.",
                    question = "Examine the legality of Mr. Batra's action and state the rights of Apex Cement Ltd. against him.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Legality: Mr. Batra's action is illegal; as a promoter, he stands in a fiduciary relationship and is prohibited from making secret profits (1 Mark)",
                        "Remedy 1: Apex Cement Ltd. can rescind (cancel) the contract and return the land, demanding refund of ₹1.10 Crores (1 Mark)",
                        "Remedy 2: The company can retain the land and sue Mr. Batra to recover the undisclosed secret profit of ₹30 Lakhs (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Promoters occupy a fiduciary position demanding utmost good faith and total disclosure.",
                "Promoters bear personal liability on pre-incorporation contracts unless formally novated."
            )
        ),

        // PAGE 55: Incorporation Stage & SPICe+ Integrated Digital Registration
        StudyPage(
            pageNumber = 55,
            module = ModuleCategory.FORMATION,
            title = "Incorporation Stage: SPICe+ Digital Portal & Legal Delivery",
            subtitle = "From Application to the Birth of Corporate Personality",
            topicDescriptionEnglish = "Incorporation is the statutory birth of the company. In India, it is executed via the Ministry of Corporate Affairs (MCA) SPICe+ (INC-32) integrated web form, combining name reservation, incorporation, PAN, TAN, EPFO, ESIC, and bank account opening in a single unified filing.",
            topicDescriptionHinglish = "Incorporation company ki kanooni birth (janam) hoti hai! Aaj ke digital India me MCA ke 'SPICe+' (Simplified Proforma for Incorporating Company Electronically Plus) portal par 1 single web form bhara jata hai. Isme company registration, PAN, TAN, PF, ESI, GST aur bank account sab ek sath 3-4 dino me ban kar ghar aa jata hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'S-P-I-C-E' -> (S)implified (P)roforma for (I)ncorporating (C)ompany (E)lectronically.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Consecration (Abhisheka) of Prince Sugriva as King of Kishkindha",
                loreOrContext = "Upon Vali's departure, the great sages, royal ministers, and Vanara elders gathered on the mountain summit, chanting Vedic mantras and pouring sacred waters from golden jars to formally inaugurate Sugriva's legal sovereign reign.",
                asciiFlowchart = """
[🏔️ Golden Mountain Summit of Kishkindha]
       │
       ▼ (Sacred Vedic Invocations & Pouring of Consecrated Waters)
[👑 The Royal Abhisheka (Ceremonial & Legal Investiture)]
       │ (Formal Bestowal of Sovereign Scepter, Crown & Royal Authority)
       ▼
[🌟 Sugriva Becomes the De Jure & De Facto Sovereign of the Realm]
                """.trimIndent(),
                lessonQuote = "Lawful consecration transforms aspiring leadership into legitimate sovereign authority."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "SPICe+ Architecture (Part A & Part B)",
                    category = "MCA Digital Process",
                    englishText = "SPICe+ is divided into two parts: Part A for Name Reservation (up to 2 proposed names); Part B for comprehensive incorporation services including MOA (e-MOA INC-33), AOA (e-AOA INC-34), DIN allotment, PAN, TAN, and EPFO/ESIC registrations.",
                    hinglishText = "SPICe+ do hisso me banta hai: Part A: Sirf company ka naam reserve karne ke liye. Part B: Asli form jisme MOA, AOA, Directors ka DIN number, PAN, TAN, GST aur EPFO/ESI registration ek sath apply hota hai.",
                    asciiFlowchart = """
[SPICe+ Part A: Name Reservation] ──> [SPICe+ Part B: e-MOA + e-AOA + DIN + PAN + TAN + Bank A/c] ──> [ROC Approval] ──> [📜 Certificate Issued]
                    """.trimIndent(),
                    microMnemonic = "SPICE-A-AND-B",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Dual Registration of Sovereign Alliances",
                        loreOrContext = "Alliances were first proclaimed by royal emissaries (Name/Intent reservation) and then sealed with royal gifts, fire oaths, and parchment scrolls before ministers (Full statutory investiture).",
                        asciiFlowchart = "[Emissary Proclamation] ──> [Fire Oaths & Charters Sealed] ──> [Binding Sovereign Treaty]",
                        lessonQuote = "Orderly protocol ensures that mighty alliances stand on unassailable legal foundations."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Getting a Startup Incorporated in 72 Hours on MCA V3 Portal",
                        loreOrContext = "A deeptech startup uploaded Aadhaar DSCs, digital MOA/AOA, and had their 21-digit CIN, PAN card, and HDFC current account active within 3 working days.",
                        asciiFlowchart = "[Upload DSC & e-MOA] ──> [Automated MCA V3 Processing] ──> [⚡ CIN, PAN & Bank Active in 72 Hrs]",
                        lessonQuote = "Government tech infrastructure has compressed months of red tape into 72 hours of frictionless software."
                    ),
                    caseQuestion = "Expand the acronym SPICe+ in the context of company incorporation in India.",
                    caseAnswer = "Simplified Proforma for Incorporating Company Electronically Plus."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 55: The Rejected Undesirable Name",
                    scenario = "Promoters applied for the name 'Prime Minister Artificial Intelligence Solutions Ltd.' in SPICe+ Part A. The Registrar of Companies (ROC) rejected the name application.",
                    question = "State the legal ground on which the ROC rejected this proposed corporate name.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Legal Ground: Violation of the Emblems and Names (Prevention of Improper Use) Act, 1950 and Rule 8 of Companies (Incorporation) Rules (1.5 Marks)",
                        "Explanation: A company cannot adopt a name suggesting patronage of the Central Government, State Government, or Prime Minister unless prior written sanction is obtained (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "SPICe+ is an integrated web form streamlining 10 statutory services into a single digital application.",
                "Corporate names suggesting government patronage or identical to existing trademarks are strictly rejected."
            )
        ),

        // PAGE 56: Certificate of Incorporation & Corporate Identity Number (CIN)
        StudyPage(
            pageNumber = 56,
            module = ModuleCategory.FORMATION,
            title = "Certificate of Incorporation & The Conclusiveness Doctrine",
            subtitle = "The Unchallengeable Birth Certificate & 21-Digit CIN Code",
            topicDescriptionEnglish = "Upon verification of all statutory documents, the ROC issues the Certificate of Incorporation (Form INC-11) bearing a 21-digit Corporate Identity Number (CIN). Under the landmark 'Conclusiveness Doctrine', this certificate is conclusive evidence that all statutory requirements of registration have been satisfied.",
            topicDescriptionHinglish = "ROC jab saare documents verify kar leta hai, to wo 'Certificate of Incorporation' issue karta hai. Is par 21-digit ka unique 'Corporate Identity Number' (CIN) likha hota hai. Kanoon ka sabse bada niyam: Certificate of Incorporation 'CONCLUSIVE EVIDENCE' hai—iska matlab agar registration me koi choti galti ya fraud bhi reh gaya ho, tab bhi company ka astitva ab court me challenge nahi kiya ja sakta; company officially zinda ho chuki hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-I-N-21' -> Corporate Identity Number (21 alphanumeric characters) | Conclusive Evidence of Birth.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Consecration Inscription of Ayodhya's Royal Dynasty",
                loreOrContext = "When royal princes were consecrated in the sacred temple records of Sage Vashistha, the royal horoscope was etched upon copper plates. Once consecrated, no demon or rival king could ever contest their sovereign legitimacy.",
                asciiFlowchart = """
[📜 Sacred Consecration Etched on Copper Plates by Sage Vashistha]
       │
       ▼ (Conclusive, Irrevocable Sovereign Legitimacy Bestowed)
[✨ Universal Recognition Across Sages, Devas & Imperial Guilds]
       │
       ▼ (Immune to Future Court Inquests or Procedural Doubts)
[👑 Unshakable Legitimacy Established for All Generations]
                """.trimIndent(),
                lessonQuote = "Once the seal of sacred authority is affixed, procedural doubts dissolve into cosmic certainty."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Conclusiveness of the Certificate of Incorporation",
                    category = "Statutory Precedent",
                    englishText = "The Certificate of Incorporation is conclusive proof that all preliminary formalities have been observed. In Moosa Goolam Ariff v. Ebrahim Goolam Ariff, an MOA was signed by two adults and five guardians on behalf of minors. Despite this irregularity, the Privy Council held that the certificate was conclusive and the company's legal existence could not be challenged.",
                    hinglishText = "Famous Moosa Goolam case me MOA par minors ke sign the jo kanoon ke khilaf tha. Fir bhi court ne kaha: Ek baar agar ROC ne Certificate of Incorporation stamp karke de diya, to baat khatam! Ab koi ye nahi keh sakta ki company illegal hai. Certificate is conclusive evidence of legal existence.",
                    asciiFlowchart = """
[Defective MOA Signature / Procedural Flaw] ──> [ROC Issues Certificate of Incorporation] ──> [⚖️ Legal Existence CANNOT Be Challenged in Court!]
                    """.trimIndent(),
                    microMnemonic = "CONCLUSIVE-BIRTH",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Inviolable Boon Conferred by Lord Brahma",
                        loreOrContext = "Once Lord Brahma granted a celestial boon, even the Trinity respected its conclusive reality, working within its bounds rather than declaring the boon invalid.",
                        asciiFlowchart = "[Boon Conferred by Cosmic Creator] ──> [Becomes Inviolable Universal Fact] ──> [All Realms Respect Its Reality]",
                        lessonQuote = "Sovereign decrees once sealed cannot be undone by technical arguments."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Decoding the 21-Digit Corporate Identity Number (CIN)",
                        loreOrContext = "Example CIN: U72200DL2024PTC123456 -> U (Unlisted), 72200 (IT Industry Code), DL (Delhi State), 2024 (Year of Incorporation), PTC (Private Limited Company), 123456 (ROC Serial Number).",
                        asciiFlowchart = "[U] [72200] [DL] [2024] [PTC] [123456] ──> [Complete DNA of the Corporate Entity Decoded]",
                        lessonQuote = "Understand corporate metadata to instantly verify institutional legitimacy."
                    ),
                    caseQuestion = "Can the legal existence of a company be questioned in a court of law after the issuance of the Certificate of Incorporation?",
                    caseAnswer = "No. The Certificate of Incorporation is conclusive evidence that all statutory requirements have been fully complied with."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 56: The Forged Signature on the MOA",
                    scenario = "All seven signatures on the Memorandum of Association of a public company were forged by a single promoter. The ROC, unaware of the forgery, issued the Certificate of Incorporation. Later, when the forgery was discovered, an aggrieved shareholder sued to have the company declared non-existent.",
                    question = "Will the court cancel the legal existence of the company? Cite the relevant legal doctrine.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: No, the court will NOT declare the company non-existent (1 Mark)",
                        "Cite the Doctrine: Conclusiveness of the Certificate of Incorporation (Moosa Goolam Ariff precedent) (1 Mark)",
                        "Explain Legal Remedy: The company's corporate personality remains valid; however, the fraudulent promoter can be criminally prosecuted and punished for forgery and fraud under Section 447 (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "The Certificate of Incorporation provides absolute, conclusive evidence of statutory legal birth.",
                "The 21-digit CIN encodes listing status, industry classification, state, incorporation year, and company type."
            )
        ),

        // PAGE 57: Capital Subscription Stage & SEBI Approval
        StudyPage(
            pageNumber = 57,
            module = ModuleCategory.FORMATION,
            title = "Capital Subscription Stage: Public Offers & SEBI Oversight",
            subtitle = "Navigating SEBI Regulations, Prospectus Issuance & Merchant Bankers",
            topicDescriptionEnglish = "A public company planning to raise capital from the public must complete the Capital Subscription Stage. This involves securing SEBI approval (ensuring full and fair investor disclosure), appointing SEBI-registered merchant bankers, and publishing a formal Prospectus.",
            topicDescriptionHinglish = "Agar Public Limited Company ko aam janta (public) se croro rupaye ikattha karne hain, to use 'Capital Subscription Stage' se guzarna padta hai. Isme SEBI (Securities and Exchange Board of India) se approval lena hota hai. SEBI check karta hai ki company janta ke sath koi jhooth ya scam to nahi kar rahi. Uske baad Merchant Bankers aur Underwriters appoint hote hain aur Prospectus release hota hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'S-P-U-B' -> (S)EBI clearance, (P)rospectus filing, (U)nderwriters hired, (B)rokers appointed.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Imperial Treasury Proclamation for the Grand Ashvamedha Yajna",
                loreOrContext = "Before initiating the great imperial sacrifice, Emperor Dasharatha sent royal treasurers to invite tribute, audit provincial accounts, and announce guaranteed royal protection across Aryavarta with complete transparency.",
                asciiFlowchart = """
[👑 Imperial Royal Proclamation of Ashvamedha Yajna]
       │
       ▼ (Verification of Public Treasury & Provincial Wealth)
[📜 Sages, Treasurers & Architects Audit All Public Commitments]
       │ (Absolute Fiscal Integrity & Universal Public Trust)
       ▼
[✨ Royal Sacrificial Fire Consecrated Amid Universal Public Acclaim]
                """.trimIndent(),
                lessonQuote = "Public enterprises demand the highest standards of transparent fiscal integrity."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "SEBI Clearance & Full Disclosure Philosophy",
                    category = "Capital Subscription",
                    englishText = "Under SEBI (Issue of Capital and Disclosure Requirements) Regulations, SEBI does not guarantee the financial success of the company, but mandates 'full, true, and fair disclosure' of all material risk factors, litigations, and promoter backgrounds in the Draft Red Herring Prospectus (DRHP).",
                    hinglishText = "SEBI ye guarantee nahi deta ki company profit kamayegi! SEBI bas ye ensure karta hai ki company sach bol rahi hai. Agar promoter par koi criminal case hai ya factory par karza hai, to wo Prospectus me saaf-saaf likha hona chahiye taaki investor soch-samajhkar paisa lagaye.",
                    asciiFlowchart = """
[File DRHP with SEBI] ──> [SEBI Scrutinizes Risk Disclosures] ──> [Modifications Incorporated] ──> [Public IPO Cleared]
                    """.trimIndent(),
                    microMnemonic = "FULL-DISCLOSURE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Vibhishana's Transparent Disclosure to Lord Rama",
                        loreOrContext = "When Vibhishana sought refuge, he concealed nothing: he truthfully disclosed Lanka's garrison strength, secret gates, weapon caches, and demon army numbers without deceit.",
                        asciiFlowchart = "[Full Military Disclosure] ──> [Zero Concealment of Risk] ──> [Righteous Alliance Consecrated]",
                        lessonQuote = "Complete transparency establishes indestructible trust."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Reading the 'Risk Factors' Section of an IPO Prospectus",
                        loreOrContext = "In Mamaearth's IPO prospectus, SEBI mandated disclosing that 70% of sales came from third-party contract manufacturers, enabling retail investors on YouTube to evaluate operational vulnerabilities.",
                        asciiFlowchart = "[DRHP Risk Factors Section] ──> [Discloses Contract Manufacturing Vulnerability] ──> [Informed Retail Decision]",
                        lessonQuote = "Never invest in an IPO without reading the 'Risk Factors' chapter in the DRHP."
                    ),
                    caseQuestion = "Does SEBI guarantee the financial profitability of an IPO when it grants clearance to a draft prospectus?",
                    caseAnswer = "No. SEBI only ensures that adequate, true, and fair disclosures of all material facts and risk factors are made to investors."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 57: The Concealed Pollution Notice",
                    scenario = "Green Bio-Tech Ltd. filed a prospectus for a ₹100 Crore IPO. It intentionally concealed a closure notice received from the State Pollution Control Board for discharging chemical effluents. A whistleblower leaked the notice to SEBI during the 21-day public comment window.",
                    question = "What regulatory action will SEBI take against Green Bio-Tech Ltd. and its merchant bankers?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "SEBI Action: SEBI will immediately halt the IPO process and issue a show-cause notice (1 Mark)",
                        "Violation: Concealment of material risk factors violates SEBI (ICDR) Regulations requiring full, true, and fair disclosure (1 Mark)",
                        "Penalties: Heavy monetary fines, debadging/suspension of merchant bankers, and potential ban on promoters from accessing capital markets (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Public capital mobilization requires rigorous SEBI clearance and comprehensive risk factor disclosures.",
                "SEBI mandates absolute transparency without guaranteeing commercial investment returns."
            )
        ),

        // PAGE 58: Minimum Subscription (90% Rule) & Underwriting
        StudyPage(
            pageNumber = 58,
            module = ModuleCategory.FORMATION,
            title = "Minimum Subscription (The 90% Rule) & Underwriting",
            subtitle = "Companies Act Section 39(1) | Shielding Investors from Under-Capitalized Ventures",
            topicDescriptionEnglish = "Under Section 39(1) of the Companies Act, 2013 and SEBI regulations, a public company must receive at least 90% of the issued capital within 30 days of opening the issue. If the company fails to reach 90% minimum subscription, the entire subscription amount must be refunded within 15 days.",
            topicDescriptionHinglish = "CBSE Exam ka sabse important statutory rule: 'Minimum Subscription (90% Rule)'. Agar company ne 100 Crore ke shares issue kiye, to kam se kam 90 Crore (90%) ke liye public ki applications aani hi chahiye 30 dino ke andar! Agar 89 Crore bhi aaye, to IPO cancel ho jayega aur agle 15 dino me logo ka sara paisa 100% wapas lautaana padega. Is khatre se bachne ke liye company 'Underwriters' (Bima karne wale brokers) ko appoint karti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: '90-30-15' -> 90% minimum subscription | Within 30 days | Refund in 15 days if failed.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Strategic Bridge Construction Threshold of Nila and Vishwakarma's Lineage",
                loreOrContext = "Before declaring the ocean crossed, Commander Nila insisted on an unbroken contiguous foundation of stone blocks spanning the entire 100-yojana gulf; a 90% bridge meant instant drowning and catastrophe.",
                asciiFlowchart = """
[🌊 100-Yojana Cosmic Ocean Chasm]
       │
       ▼ (Strict Operational Threshold: Must Achieve Full Minimum Feasibility)
[🪨 Continuous Stones Spanning From Shore to Shore (Zero Gap Allowed!)]
       │ (Failure to Bridge the Final Span = Total Catastrophe)
       ▼
[🌉 Complete Invincible Highway Consecrated for the Imperial March!]
                """.trimIndent(),
                lessonQuote = "In great undertakings, achieving the critical threshold is the difference between triumph and abyss."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The 90% Minimum Subscription Mandate",
                    category = "Statutory Threshold",
                    englishText = "The 90% rule protects investors from trapped capital in an under-funded company that would lack resources to acquire plants or commence operations. If the 90% threshold is not reached within 30 days, all application money must be refunded within 15 days; delay beyond 15 days attracts 15% p.a. interest.",
                    hinglishText = "Kanoon nahi chahta ki aadhi-adhoori capital wali company dukan shuru kare aur baad me band ho jaye. Isliye 90% rule compulsory hai. Agar 15 din ke andar refund nahi kiya, to directors ko 15% saal ka byaaj apni pocket se jodkar refund karna padega!",
                    asciiFlowchart = """
[Issue Opens: Target ₹100 Cr] ──> [Applications Received < ₹90 Cr in 30 Days] ──> [⚡ IPO FAILED!] ──> [Refund 100% Funds in 15 Days (or pay 15% interest!)]
                    """.trimIndent(),
                    microMnemonic = "90-PERCENT-RULE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Uncompromised Standard of the Sovereign Bow Stringing",
                        loreOrContext = "In King Janaka's court, lifting the bow partially was worthless; only stringing the divine Pinaka completely satisfied the sovereign threshold to claim Sita's hand.",
                        asciiFlowchart = "[Partial Lifting = Total Failure] ──> [Full Stringing Satisfies Threshold] ──> [Divine Marriage Consecrated]",
                        lessonQuote = "Near-success is total failure when absolute thresholds are demanded."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Crowdfunding Campaign Failing at 88% on Kickstarter",
                        loreOrContext = "A gaming studio targeted $100,000 on an all-or-nothing platform. They raised $88,000. Under the algorithm, zero funds were disbursed to the studio and 100% of money was refunded to backers.",
                        asciiFlowchart = "[Raised $88,000 of $100,000 Goal] ──> [All-or-Nothing Rule Triggers] ──> [100% Automatically Refunded to Backers]",
                        lessonQuote = "Threshold rules protect the public from funding under-capitalized projects destined to stall."
                    ),
                    caseQuestion = "What is the minimum subscription percentage required for a public issue under SEBI regulations?",
                    caseAnswer = "90% of the issued amount."
                ),
                SubPointItem(
                    pointTitle = "Underwriting of Shares: The Ultimate Safety Net",
                    category = "Financial Risk Mitigation",
                    englishText = "To avert the catastrophic risk of falling short of the 90% minimum subscription, companies appoint Underwriters (financial institutions, investment banks). Underwriters enter an agreement guaranteeing that if the public does not subscribe to the 90% threshold, they will personally purchase the unsubscribed shortfall in exchange for an Underwriting Commission.",
                    hinglishText = "Company risk nahi leti! Wo ICICI Securities ya Kotak Mahindra jaise bade investment banks ko 'Underwriter' banati hai. Underwriter kehta hai: 'Aap IPO nikalo. Agar public ne 90% nahi khareeda, to bacha hua sara stock hum apni pocket se khareedenge!' Iske badle unhe 'Underwriting Commission' milta hai.",
                    asciiFlowchart = """
[Public Subscribes 75%] ──> [15% Shortfall to Reach 90%] ──> [🏦 Underwriters Purchase 15% Shortfall Instantly!] ──> [✅ IPO Successfully Saved!]
                    """.trimIndent(),
                    microMnemonic = "UNDERWRITE-SHIELD",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Lord Shiva's Divine Grace Absorbing the Descending Celestial Ganga",
                        loreOrContext = "When heavenly Ganga plummeted with destructive velocity toward earth, Lord Shiva locked her torrents in his sacred matted locks, acting as the ultimate cosmic buffer protecting the mortal world.",
                        asciiFlowchart = "[Torrential Ganga Plummets] ──> [Shiva's Matted Locks Cushion Impact] ──> [Gentle Lifegiving Stream to Earth]",
                        lessonQuote = "A powerful buffer absorbs catastrophic shocks, transforming peril into enduring prosperity."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Investment Bankers Underwriting Tech IPOs on Dalal Street",
                        loreOrContext = "When a SaaS IPO faced weak retail demand during a market crash, global syndicate banks stepped in and bought the remaining 12% allocation, saving the listing from aborting.",
                        asciiFlowchart = "[Retail Market Panic] ──> [Syndicate Banks Buy Unsubscribed Block] ──> [Stock Lists Successfully on NSE]",
                        lessonQuote = "Underwriters act as the institutional backstop of the global capital markets."
                    ),
                    caseQuestion = "Explain the role of 'Underwriters' in the capital subscription stage of a public company.",
                    caseAnswer = "Underwriters guarantee the subscription of the issue by committing to purchase any unsubscribed shares up to the minimum subscription limit in return for an underwriting commission."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 58: The Shortfall at Surya Solar Ltd.",
                    scenario = "Surya Solar Ltd. issued 10,00,000 equity shares of ₹10 each (Total issue: ₹1 Crore). By the 30th day, it received applications for only 8,20,000 shares (₹82 Lakhs). The promoters decided to allot shares to the 8,20,000 applicants and commence business with the funds received.",
                    question = "Evaluate whether the promoters can legally allot these shares. State the immediate legal duty of Surya Solar Ltd.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Legality: No, the promoters CANNOT legally allot the shares (1 Mark)",
                        "State the statutory rule: The company achieved only 82% subscription, failing the statutory 90% minimum subscription requirement under Section 39(1) of the Companies Act (1 Mark)",
                        "Immediate Legal Duty: The company must immediately cancel the allotment and refund the entire ₹82 Lakhs application money to all applicants within 15 days (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Public companies must achieve at least 90% minimum subscription within 30 days or refund all funds within 15 days.",
                "Underwriters eliminate the risk of IPO failure by guaranteeing to absorb unsubscribed shortfalls."
            )
        ),

        // PAGE 59: Commencement of Business & Section 10A Declaration
        StudyPage(
            pageNumber = 59,
            module = ModuleCategory.FORMATION,
            title = "Commencement of Business: The Section 10A Mandate",
            subtitle = "From Statutory Incorporation to Commercial Operations",
            topicDescriptionEnglish = "Under Section 10A of the Companies Act, 2013, every company incorporated having share capital must file a formal 'Declaration of Commencement of Business' (Form INC-20A) within 180 days, confirming that subscribers have paid the value of shares and registered office is physically verified.",
            topicDescriptionHinglish = "Company ka certificate mil gaya, lekin commercial dukan turant chalu nahi ho sakti jab tak Section 10A ka form na bhara jaye! Incorporation ke 180 dino ke andar company ke director ko ROC ko form INC-20A me declaration dena padta hai ki: (1) Sabhi promoters ne apne hisse ke share ka paisa bank me jama kar diya hai; (2) Company ka registered office physically verify ho chuka hai. Iske bina business chalu karna illegal hai!",
            macroMemoryTrick = "MACRO MNEMONIC: '1-0-A-180' -> Section 10A | Within 180 days | Bank capital deposited | Form INC-20A.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Formal Consecration of the Royal War Camp Before the Southern March",
                loreOrContext = "Before stepping out of Kishkindha, royal astrologers fixed the auspicious Vijay Muhurta, priests sanctified the divine chariot and quivers, and commanders verified that every legion had received full rations and armor before the war horns blew.",
                asciiFlowchart = """
[👑 The Strategic Assembly at Mt. Prasravana]
       │
       ▼ (Verification of Troop Equipment, Rations & Consecrated Quivers)
[🏹 Auspicious Vijay Muhurta Verified by Imperial Astrologers]
       │ (Zero Soldier Marches Without Complete Certification of Readiness)
       ▼
[🎺 Golden War Horns Resound: The Victorious Southern March Commences!]
                """.trimIndent(),
                lessonQuote = "The victorious march begins only when every statutory preparation is certified complete."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Two Mandatory Conditions of Section 10A (Form INC-20A)",
                    category = "Statutory Mandate",
                    englishText = "A company cannot commence business or exercise borrowing powers unless: (1) A director files a declaration within 180 days of incorporation confirming that every subscriber has paid the value of shares agreed to be taken; (2) The company has filed verification of its registered office (Form INC-22).",
                    hinglishText = "Section 10A ki do shartein: (1) Director sign karke dega ki MOA par sign karne wale sabhi promoters ne apne shares ka paisa company ke bank account me deposit kar diya hai; (2) Registered office ka physical proof (INC-22) upload ho chuka hai. Agar 180 din me ye nahi kiya, to ROC company ka naam strike off (delete) kar sakta hai!",
                    asciiFlowchart = """
[Incorporation Certificate Received] ──> [Subscribers Deposit Share Money in Bank] ──> [File Form INC-20A within 180 Days] ──> [🚀 Lawfully Commence Business!]
                    """.trimIndent(),
                    microMnemonic = "180-DAYS-INC20A",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Verification of the Armory Before the Siege of Lanka",
                        loreOrContext = "Before laying siege to Lanka's outer moat, Sugriva personally inspected the siege engines, boulder levers, and tree logs to verify total combat readiness.",
                        asciiFlowchart = "[Inspection of Siege Engines] ──> [All Readiness Certified] ──> [Siege Officially Commences]",
                        lessonQuote = "Victory belongs to leaders who verify the ground reality before sounding the trumpet."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Filing INC-20A Bank Statement for Seed Funding Wire",
                        loreOrContext = "The founders opened an ICICI current account, wired their ₹1,00,000 initial capital, downloaded the bank statement, and had their CS upload Form INC-20A within 14 days of incorporation.",
                        asciiFlowchart = "[₹1 Lakh Deposited in Bank] ──> [Upload Bank Proof via Form INC-20A] ──> [MCA Clears Commencement of Business]",
                        lessonQuote = "Fast-track your statutory compliance filings so investor wires can enter without regulatory friction."
                    ),
                    caseQuestion = "Within how many days from the date of incorporation must a company file the declaration of commencement of business under Section 10A?",
                    caseAnswer = "Within 180 days from the date of incorporation."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 59: The Shell Company Crackdown",
                    scenario = "Zenith Logistics Ltd. was incorporated in January. Nine months (270 days) passed, but the company failed to open a bank account, subscribers deposited zero money, and no Form INC-20A was filed. The ROC issued a notice to strike off the company's name.",
                    question = "Evaluate the ROC's power to strike off the company's name under Section 10A of the Companies Act.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Legal Basis: Under Section 10A(3), failure to file declaration of commencement within 180 days empowers the ROC to initiate action (1 Mark)",
                        "Ground: The failure gives reasonable cause to believe that the company is not carrying on any business or operation (1 Mark)",
                        "Conclusion: The ROC is fully empowered by law to strike off the name of Zenith Logistics Ltd. from the Register of Companies (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Section 10A requires filing Form INC-20A within 180 days of incorporation.",
                "Subscribers must pay their share capital before the company can commence commercial operations or borrow funds."
            )
        ),

        // PAGE 60: Constitutional Document: Memorandum of Association (MOA)
        StudyPage(
            pageNumber = 60,
            module = ModuleCategory.FORMATION,
            title = "Memorandum of Association (MOA): The Supreme Charter",
            subtitle = "The External Constitution & The Six Fundamental Clauses",
            topicDescriptionEnglish = "The Memorandum of Association (MOA) is the supreme constitutional charter of a company. It defines the boundary of the company's powers and its relationship with the outside world. Any act performed outside the powers defined in the MOA is Ultra Vires and fundamentally void.",
            topicDescriptionHinglish = "Memorandum of Association (MOA) company ka 'Samvidhan' (Supreme Constitution) hota hai! Ye company ki kanooni boundary tay karta hai ki company kya kar sakti hai aur kya nahi. Agar company ne apne MOA se bahar jakar koi kaam kiya, to use 'Ultra Vires' (kanoon se bahar) kehte hain, aur wo contract 100% NULL AND VOID hota hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'N-O-L-C-A-R' -> (N)ame clause, (O)bject clause, (L)iability clause, (C)apital clause, (A)ssociation clause, (R)egistered office clause.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Lakshmana Rekha: The Inviolable Boundary of Protection",
                loreOrContext = "Before pursuing the wounded deer, Lakshmana drew a glowing boundary line around the forest cottage with his bow. Inside the line, total celestial protection reigned; crossing outside that defined boundary resulted in mortal peril and catastrophic sorrow.",
                asciiFlowchart = """
[🏹 Lakshmana Draws the Inviolable Sacred Line with His Divine Bow]
       │
       ▼ (Absolute Celestial Protection Within Defined Statutory Boundaries)
[🏡 The Sanctified Hermitage (Intra Vires: Valid, Safe & Inviolable)]
       │
       ▼ (Crossing Outside the Statutory Line: Ultra Vires!)
[⚡ Boundless Catastrophe, Illusion & Tragic Abduction by the Predator]
                """.trimIndent(),
                lessonQuote = "Transgressing the boundary of lawful protection invites inevitable ruin."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Six Fundamental Clauses of MOA",
                    category = "Constitutional Clauses",
                    englishText = "1. Name Clause (company name with Ltd./Pvt. Ltd.); 2. Registered Office / Situation Clause (state of domicile); 3. Object Clause (main and ancillary commercial objects); 4. Liability Clause (limited to unpaid shares/guarantee); 5. Capital Clause (authorized share capital); 6. Association / Subscription Clause (signatories pledging shares).",
                    hinglishText = "MOA ke 6 mandatory clauses: 1. Name Clause (company ka approved naam); 2. Situation/Registered Office Clause (kis state me head office hoga); 3. Object Clause (company kya business karegi); 4. Liability Clause (shareholders ki liability limited hai); 5. Capital Clause (company total kitna capital raise kar sakti hai); 6. Association Clause (promoters ke sign aur shares ki sankhya).",
                    asciiFlowchart = """
[1. Name] + [2. Registered Office State] + [3. Object Clause] + [4. Liability Limit] + [5. Authorized Capital] + [6. Subscription Signatures]
                    """.trimIndent(),
                    microMnemonic = "6-MOA-CLAUSES",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Unalterable Royal Decree of King Raghu",
                        loreOrContext = "The historic charter of the Raghu dynasty was etched in stone: 'Ragukul reet sada chali aayi, praan jaayi par vachan na jaayi'—an absolute constitutional principle governing the solar lineage.",
                        asciiFlowchart = "[Stone Inscribed Sovereign Charter] ──> [Unalterable Generational Code] ──> [Guiding Every King's Conduct]",
                        lessonQuote = "The supreme charter defines the character of the institution across all generations."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Fintech App Prohibited from Real Estate Construction",
                        loreOrContext = "A payment gateway company had ₹100 Crores surplus. The CEO wanted to build luxury beach villas in Goa. The legal counsel blocked it: 'Real estate construction is not in our MOA Object Clause; doing so would be Ultra Vires!'",
                        asciiFlowchart = "[Fintech MOA Objects: Software Only] ──> [CEO Tries to Build Luxury Villas] ──> [🚨 Ultra Vires: Blocked by Legal Counsel]",
                        lessonQuote = "Never deploy corporate capital outside the statutory objects defined in your MOA."
                    ),
                    caseQuestion = "State the significance of the Object Clause in the Memorandum of Association.",
                    caseAnswer = "It defines the operational boundary and scope of activities the company is legally authorized to undertake; acts beyond it are void ultra vires."
                ),
                SubPointItem(
                    pointTitle = "The Doctrine of Ultra Vires (Ashbury Railway Carriage Case)",
                    category = "Company Law Doctrine",
                    englishText = "The term 'Ultra Vires' means 'beyond the powers'. Any transaction outside the scope of the Object Clause is ultra vires the company, completely null and void ab initio, and cannot be ratified even if 100% of shareholders vote in favor (Ashbury Railway Carriage and Iron Co v Riche).",
                    hinglishText = "Ultra Vires ka matlab: Aukaat se bahar! Agar company ke Object Clause me likha hai 'Computer banana' aur company ne 'Film production' ka contract sign kar liya, to wo contract shuru se radd (void) maana jayega. Chahe saare 100% shareholders milkar bhi use accept karna chahein, tab bhi kanoon use valid nahi maan sakta!",
                    asciiFlowchart = """
[Object Clause: Computer Manufacturing] ──> [Signs Contract for Movie Production] ──> [⚡ ULTRA VIRES: 100% VOID AB INITIO! Cannot Be Ratified!]
                    """.trimIndent(),
                    microMnemonic = "BEYOND-POWERS-VOID",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Ravana Transgressing the Sacred Sovereign Code of Kings",
                        loreOrContext = "When Ravana abducted Sita through deception, he acted ultra vires to the sacred Rajadharma (code of kings), rendering his entire sovereign court morally illegitimate and doomed to destruction.",
                        asciiFlowchart = "[Transgressing Rajadharma Code] ──> [Act Rendered Ultra Vires to Dharma] ──> [Inevitable Destruction of the Realm]",
                        lessonQuote = "Acts committed beyond the boundary of sacred law are void of honor and invite doom."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Crypto Trading Contract Declared Void for an Agro-Chemical Company",
                        loreOrContext = "An agrochemical company signed a ₹10 Crore Bitcoin derivative contract. The court struck down the bank's recovery claim, ruling the derivative contract ultra vires the company's chemical manufacturing MOA.",
                        asciiFlowchart = "[Agrochemical MOA] ──> [Enters ₹10 Cr Bitcoin Trade] ──> [Court Strikes Down Contract as Ultra Vires]",
                        lessonQuote = "Contracts signed outside corporate MOA objects have zero legal enforceability in court."
                    ),
                    caseQuestion = "Can an ultra vires contract entered into by a company be ratified by a unanimous vote of all its shareholders?",
                    caseAnswer = "No. An act ultra vires the company is null and void ab initio and cannot be validated even by unanimous consent of all shareholders."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 60: The Ultra Vires Railway Financing",
                    scenario = "The Object Clause of Sterling Engineering Ltd. authorized it 'to manufacture and sell railway carriages and rolling stock.' The directors entered into a multi-million-pound contract to finance the construction of a railway line in Belgium. All shareholders unanimously passed a resolution approving the contract at an EGM.",
                    question = "Analyze the legal validity of the railway financing contract with reference to the Doctrine of Ultra Vires.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Legal Principle: The contract is Ultra Vires the company based on the landmark Ashbury Railway Carriage Co. v. Riche precedent (1 Mark)",
                        "Analysis: Financing a railway line is distinct from manufacturing carriages and is outside the Object Clause (1 Mark)",
                        "Conclusion: The contract is void ab initio; unanimous shareholder ratification cannot cure an act that is ultra vires the company's charter (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "The MOA is the supreme constitutional charter defining the external boundary of company powers.",
                "Any act exceeding the Object Clause is ultra vires, void ab initio, and incapable of ratification."
            )
        ),

        // PAGE 61: Articles of Association (AOA) & Constructive Notice vs. Indoor Management
        StudyPage(
            pageNumber = 61,
            module = ModuleCategory.FORMATION,
            title = "Articles of Association (AOA) & The Royal British Bank Rule",
            subtitle = "Internal Bye-Laws, Constructive Notice & The Doctrine of Indoor Management",
            topicDescriptionEnglish = "The Articles of Association (AOA) contains the internal regulations and bye-laws governing management, directors' powers, and shareholder meetings. While the 'Doctrine of Constructive Notice' presumes the public knows the MOA and AOA, the 'Doctrine of Indoor Management' (Turquand's Rule) protects outsiders from internal procedural irregularities.",
            topicDescriptionHinglish = "Articles of Association (AOA) company ke internal niyam (house rules) hote hain—director kaise appoint hoga, meeting kaise hogi, shares kaise transfer honge. Kanoon ke 2 sabse famous doctrines: (1) Doctrine of Constructive Notice—ye maana jata hai ki bahar wale insaan ne MOA aur AOA padh rakha hai; (2) Doctrine of Indoor Management (Turquand's Rule)—bahar wale ko ye check karne ki zaroorat nahi hai ki company ke andar board resolution sahi tarike se pass hua tha ya nahi; wo presume kar sakta hai ki andar sab theek chal raha hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'A-O-A-T' -> (A)rticles are internal rules, (O)utsiders protected by (A)ssuming compliance under (T)urquand's rule.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Protocol of the Royal Envoy Entering the Golden Court",
                loreOrContext = "When Angada entered Ravana's durbar as an official envoy, he was entitled under international diplomatic code to assume the monarch held legitimate court authority, without being required to audit private palace bedchamber intrigues.",
                asciiFlowchart = """
[🕊️ Prince Angada Steps Forward as Consecrated Sovereign Emissary]
       │
       ▼ (Diplomatic Protection Under Universal Sovereign Protocol)
[🏛️ Entitled to Presume the Imperial Court Complies with Sacred Internal Etiquette]
       │ (Indoor Management: Outsider Need Not Audit Palace Bedchamber Conspiracies)
       ▼
[⚖️ Sacred Inviolability of the Emissary Demanded Before the Entire Assembly]
                """.trimIndent(),
                lessonQuote = "The stranger dealing in good faith is protected by the visible authority of the palace."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Doctrine of Constructive Notice vs. Doctrine of Indoor Management",
                    category = "Company Jurisprudence",
                    englishText = "Constructive Notice protects the company: Outsiders are presumed to have read registered public documents (MOA/AOA). Indoor Management (Turquand's Rule) protects outsiders: Persons dealing with the company in good faith are entitled to assume that internal regulations and resolutions have been properly complied with.",
                    hinglishText = "Constructive Notice company ko bachata hai (bahar wala ye nahi keh sakta ki mujhe MOA ke rules nahi pata the). Indoor Management bahar wale innocent insaan ko bachata hai (usne contract sign kiya, use kya pata ki board meeting me 3 director hone chahiye the par sirf 2 baithe the! Wo internal galti ke liye zimmedar nahi hai).",
                    asciiFlowchart = """
[DOCTRINE OF CONSTRUCTIVE NOTICE (Protects Company)]
Outsiders are legally presumed to have read the public MOA & AOA!
                    vs
[DOCTRINE OF INDOOR MANAGEMENT (Protects Outsiders / Turquand's Rule)]
Outsiders are NOT bound to investigate whether internal company board resolutions were properly passed!
                    """.trimIndent(),
                    microMnemonic = "INDOOR-TURQUAND",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sacred Guest (Atithi) Hospitality Protocols of Ayodhya",
                        loreOrContext = "A wandering traveler arriving at Ayodhya's gates was received with honor, entitled to assume the city gates were guarded in accordance with sacred royal bye-laws.",
                        asciiFlowchart = "[Arriving Sacred Guest] ──> [Assumes Royal Protocols Flawlessly Followed] ──> [Received with Honor]",
                        lessonQuote = "A noble house honors those who deal with it in upright trust."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Bank Lending ₹5 Crores Against Board Resolution Signed by MD",
                        loreOrContext = "HDFC Bank lent ₹5 Crores to a firm after the MD produced a signed Board Resolution. Even though the company secretary forgot to record the vote in the minutes book, the bank's loan remained valid under Indoor Management.",
                        asciiFlowchart = "[Bank Relies on Signed Board Resolution] ──> [Internal Minute Entry Missed] ──> [Bank Protected Under Turquand's Rule]",
                        lessonQuote = "Outsiders dealing in good faith are insulated from internal corporate administrative lapses."
                    ),
                    caseQuestion = "In which landmark British legal case was the 'Doctrine of Indoor Management' established?",
                    caseAnswer = "Royal British Bank v. Turquand (1856)."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 61: The Unauthorized Debenture Issue",
                    scenario = "The Articles of Association of a manufacturing company authorized the directors to borrow up to ₹50 Lakhs on bond, with the proviso that borrowing beyond ₹50 Lakhs required a resolution of shareholders in a General Meeting. The directors borrowed ₹80 Lakhs from Mr. Sharma without passing the shareholder resolution. The company defaulted and claimed the bond was void.",
                    question = "Can Mr. Sharma recover the ₹80 Lakhs from the company? Justify using relevant company law doctrines.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: Yes, Mr. Sharma is entitled to recover the entire ₹80 Lakhs from the company (1 Mark)",
                        "Cite the Doctrine: Doctrine of Indoor Management established in Royal British Bank v. Turquand (1 Mark)",
                        "Explanation: Mr. Sharma, having checked the AOA, knew the directors had conditional power to borrow; he was entitled to presume that the internal shareholder resolution had been duly passed (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "AOA sets out the internal bye-laws and regulations governing management and meetings.",
                "The Doctrine of Indoor Management protects innocent third parties from internal procedural irregularities."
            )
        ),

        // PAGE 62: Distinction: MOA vs. AOA & Prospectus Essentials
        StudyPage(
            pageNumber = 62,
            module = ModuleCategory.FORMATION,
            title = "MOA vs. AOA Distinction & Prospectus Essentials",
            subtitle = "Charter vs. Bye-Laws & The Invitation to the Public",
            topicDescriptionEnglish = "A rigorous comparative distinction between the Memorandum of Association (MOA) and Articles of Association (AOA) across seven legal dimensions, coupled with the core legal essentials of a Prospectus, Shelf Prospectus, and Red Herring Prospectus.",
            topicDescriptionHinglish = "CBSE Board Exam ka grand-slam question: 'MOA aur AOA ke beech me kya antar hai?' Aur sath me Prospectus ke essentials. Ye table yaad kar li to company formation chapter se full marks aana tay hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-R-S-U-A-D' -> (C)harter vs Bye-laws, (R)elationship external vs internal, (S)upreme vs subordinate, (U)ltra vires consequences, (A)lteration procedure, (D)efinition.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Sacred Vedic Scriptures (Shruti) vs. Daily Royal Codes (Smriti)",
                loreOrContext = "Compare the eternal cosmic Vedic commandments (Shruti - the unalterable supreme MOA charter of righteousness) with the adaptive civic and royal administrative codes (Smriti - the operational internal AOA guidelines governing daily conduct in Ayodhya).",
                asciiFlowchart = """
[📜 ETERNAL SHRUTI: Sacred Vedas (The MOA)] ──> Supreme Cosmic Charter / Unalterable Core
                     │
                     ▼ (Subordinate to & Guided By)
[📜 ADAPTIVE SMRITI: Civic Bye-Laws (The AOA)] ──> Daily Royal Administration & Conduct
                """.trimIndent(),
                lessonQuote = "Eternal principles form the unshakeable foundation; adaptable rules guide daily action."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Master Distinction Matrix: MOA vs. AOA",
                    category = "Master Distinction",
                    englishText = "1. Nature: Fundamental Charter vs Internal Regulations. 2. Scope: Defines external boundary vs Governs internal management. 3. Status: Supreme constitutional document vs Subordinate to MOA. 4. Ultra Vires: Acts ultra vires MOA are void ab initio and cannot be ratified vs Acts ultra vires AOA can be ratified by shareholders. 5. Alteration: Requires special resolution + government approval vs Requires special resolution only.",
                    hinglishText = "1. Swaroop: Supreme Charter vs Internal Rules. 2. Scope: Bahar ki boundary vs Andar ka management. 3. Status: Sabse upar (Supreme) vs MOA ka ghulam (Subordinate). 4. Galti (Ultra Vires): MOA ke bahar ka kaam kabhi ratify nahi ho sakta vs AOA ke bahar ka kaam shareholders resolution pass karke theek kar sakte hain. 5. Badlaav (Alteration): Sarkari permission chahiye vs Sirf special resolution kafi hai.",
                    asciiFlowchart = """
[BASIS]             [MEMORANDUM OF ASSOCIATION (MOA)]      [ARTICLES OF ASSOCIATION (AOA)]
1. Definition       Fundamental Charter of the Company     Internal Rules & Bye-laws
2. Scope / Realm    Defines external objectives & bounds   Governs internal relationship of members
3. Hierarchy        Supreme Document (Governed by Act)     Subordinate to MOA (Must comply with MOA)
4. Ultra Vires Acts 100% Void ab initio; Cannot be cured   Can be easily ratified by shareholders
5. Alteration       Strict; requires Central Govt/NCLT     Relatively simple; Special Resolution
6. Compulsory       Mandatory for all companies            Mandatory, but Table F can be adopted
                    """.trimIndent(),
                    microMnemonic = "MOA-VS-AOA-TABLE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sovereign Constitution vs. The Camp Watch Protocol",
                        loreOrContext = "The royal solar code of Suryavansh was unchangeable (MOA); the timing of the midnight campfire watch in the forest could be altered daily by Lakshmana (AOA).",
                        asciiFlowchart = "[Suryavansh Honor = Unalterable MOA] vs [Campfire Watch Routine = Adaptable AOA]",
                        lessonQuote = "Anchor your soul in unyielding principles, but keep operational methods nimble."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Startup Cap-Table Voting Agreements Embedded in AOA",
                        loreOrContext = "The venture capital firm insisted on embedding its liquidation preference and board observer seats directly into the company's amended Articles of Association (AOA).",
                        asciiFlowchart = "[VC Liquidation Preference] ──> [Inscribed in Amended AOA] ──> [Legally Enforceable Governance Rule]",
                        lessonQuote = "Your AOA is the real power document that decides who steers the corporate ship."
                    ),
                    caseQuestion = "State the fundamental consequence if a company enters into a contract that is ultra vires its Articles of Association, but within its Memorandum of Association.",
                    caseAnswer = "The contract is not void; it is merely an internal irregularity and can be legally ratified and validated by a resolution of shareholders."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 62: Comprehensive Formation Evaluator",
                    scenario = "Sun Pharma Chemicals Ltd. is drafting its incorporation documents. The directors want to know: (a) Can they include a clause in the Articles of Association that gives them power to engage in banking business when the Memorandum restricts them strictly to chemical production? (b) What type of prospectus must they file if they plan multiple bond issues over the next 12 months?",
                    question = "Answer both questions with precise statutory reasoning.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "(a) No, they cannot. The Articles of Association is strictly subordinate to the Memorandum. Any clause in the AOA that contradicts or expands beyond the MOA is null and void (2 Marks)",
                        "(b) They should file a 'Shelf Prospectus' under Section 31 of the Companies Act, which allows a company to make multiple issues of securities over a validity period of up to one year without issuing a fresh prospectus each time (2 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "MOA defines external boundaries and is supreme; AOA defines internal governance and is subordinate.",
                "Ultra vires MOA is irredeemably void; ultra vires AOA can be cured by shareholder ratification."
            )
        )
    )
}
