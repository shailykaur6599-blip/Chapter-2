package com.example.data

import com.example.model.*

object JointStockCompanyData {
    val pages = listOf(
        // PAGE 43: Joint Stock Company - Genesis & Legal Definition
        StudyPage(
            pageNumber = 43,
            module = ModuleCategory.COMPANY,
            title = "Joint Stock Company: The Corporate Colossus",
            subtitle = "Companies Act, 2013 Section 2(20) | The Architecture of Modern Capitalism",
            topicDescriptionEnglish = "A Joint Stock Company is an artificial person created by law, having a separate legal entity, perpetual succession, and a common seal. Governed by the Companies Act, 2013, capital is divided into transferable shares, and member liability is strictly limited.",
            topicDescriptionHinglish = "Joint Stock Company modern business ka sabse powerful aur vishal roop hai! Companies Act 2013 ke hisaab se ye ek 'Artificial Person' (kanooni vyakti) hai jise kanoon ne paida kiya hai. Iska astitva (existence) iske maalik (shareholders) se bilkul alag hota hai. Log aate hain aur chale jaate hain, lekin company hamesha zinda rehti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-O-M-P-A-N-Y' -> (C)reated by Law, (O)wnership Separate, (M)embers Limited Risk, (P)erpetual Life, (A)rtificial Person, (N)egotiable Shares, (Y)ields Huge Capital.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Golden Metropolis of Lanka: The Impenetrable Corporate Citadel",
                loreOrContext = "Forged by the divine cosmic architect Vishwakarma upon Mount Trikuta, Lanka stood as an autonomous, self-sustaining, fortified metropolis whose stone towers, treasuries, and sovereign laws existed independently of any mortal soldier.",
                asciiFlowchart = """
[🏛️ The Fortified Golden Citadel of Lanka]
       │ (Created Through Divine Architecture: Independent Juridical Identity)
       ▼
[💰 Imperial Vaults, Ocean Harbors & Iron Arsenals Managed by Royal Ministers]
       │ (Separation of Ownership & Institutional Command)
       ▼
[🛡️ Unshakable Fortification That Endured Centuries of Dynastic Rule]
                """.trimIndent(),
                lessonQuote = "Institutions engineered with deep structural permanence withstand the fiercest tides of mortal change."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Statutory Definition & The Landmark Salomon Doctrine",
                    category = "Statutory Rule",
                    englishText = "Section 2(20) of the Companies Act, 2013 defines: 'Company means a company incorporated under this Act or any previous company law.' The landmark House of Lords precedent in Salomon v. Salomon & Co. Ltd. (1897) established that a company is an entirely separate legal person from its subscribers.",
                    hinglishText = "Section 2(20) kehta hai ki company wo hai jo Companies Act ke andar register hui ho. Famous 'Salomon case' ne kanoon ki duniya hila di: Company aur usko banane wala vyakti kanoon ki nazar me do alag-alag log hain! Chahe 99% shares ek hi aadmi ke paas ho, fir bhi company ka karza uska personal karza nahi hota.",
                    asciiFlowchart = """
[Promoter / Founder (Human Being)] <==== LEGAL VEIL OF SEPARATION ====> [🏛️ THE COMPANY (Artificial Juridical Person)]
                    """.trimIndent(),
                    microMnemonic = "SALOMON-SEPARATION",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Sovereign Throne of Kosala Separate from the Person of the King",
                        loreOrContext = "When Dasharatha passed away, the Throne of Kosala remained sovereign and alive; the state treaties, treasury debts, and imperial laws belonged to the Crown, not the mortal flesh of the king.",
                        asciiFlowchart = "[Mortal King Passes] ──> [👑 The Sovereign Crown/Throne Endures Forever as Royal Entity]",
                        lessonQuote = "The crown is an immortal institution; kings are merely its temporary custodians."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Reliance Industries Ltd. vs. Mukesh Ambani as Legal Persons",
                        loreOrContext = "Mukesh Ambani owns approximately 50% shares of Reliance, but Reliance Industries owns the Jamnagar refinery, enters multi-billion dollar 5G contracts, and borrows from global banks in its own corporate name.",
                        asciiFlowchart = "[Mukesh Ambani (Shareholder)] <== Corporate Veil ==> [Reliance Industries Ltd. (Owns Jamnagar & Jio)]",
                        lessonQuote = "The corporate veil insulates personal private wealth from trillion-rupee corporate balance sheets."
                    ),
                    caseQuestion = "State the landmark British legal case that laid down the principle of the 'Separate Legal Entity' of a company.",
                    caseAnswer = "Salomon v. Salomon & Co. Ltd. (1897)."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 43: The Warehouse Fire at Apex Polymers Ltd.",
                    scenario = "Rohan owns 98% of the equity shares of Apex Polymers Ltd., a private company. A disastrous short circuit burned down the factory, resulting in ₹3 Crores of unpaid raw material debts to creditors. The company's bank balance is zero. Creditors filed a suit to attach Rohan's personal luxury villa and sports cars.",
                    question = "Can the creditors legally seize Rohan's personal assets? Explain the legal principle involved.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: No, creditors cannot attach Rohan's personal villa or sports cars (1 Mark)",
                        "State the legal doctrine: Separate Legal Entity established in Salomon v. Salomon & Co. Ltd. (1 Mark)",
                        "Explain application: The company is a distinct artificial person; the debts belong exclusively to Apex Polymers Ltd., and Rohan's liability as a shareholder is strictly limited to any unpaid amount on his shares (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "A company is a separate legal person created by law under the Companies Act, 2013.",
                "The corporate veil legally insulates shareholders' personal assets from corporate debts."
            )
        ),

        // PAGE 44: Core Features of Joint Stock Company
        StudyPage(
            pageNumber = 44,
            module = ModuleCategory.COMPANY,
            title = "Core Features: Artificial Person, Perpetual Life & Seal",
            subtitle = "The Immortality of the Corporation & The Corporate Signature",
            topicDescriptionEnglish = "Key characteristics of a joint-stock company include: (1) Artificial person status (clothes, eats, or walks not, but contracts and sues); (2) Perpetual succession ('Members may come and go, but the company continues forever'); (3) Common Seal (official signature of the body corporate).",
            topicDescriptionHinglish = "Company ke 3 sabse zabardast features: (1) Artificial Person—ye na chal sakti hai na saans le sakti hai, lekin kanoon ki nazar me contract kar sakti hai, bank account khol sakti hai aur court me case kar sakti hai; (2) Perpetual Succession—'Members may come, members may go, but the company goes on forever'—saare shareholders bhi ek sath accident me mar jayein, fir bhi company zinda rehti hai! (3) Common Seal—company ka official metal stamp/signature.",
            macroMemoryTrick = "MACRO MNEMONIC: 'A-P-C' -> (A)rtificial Person, (P)erpetual Succession, (C)ommon Seal.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Celestial Sovereign Seal of the Royal House of Raghu",
                loreOrContext = "Lord Rama's royal signet ring (Mudrika) bore the sacred emblem of the solar dynasty. When presented by Hanuman to Sita in the Ashok Vatika, that single indelible seal carried the full, indisputable sovereign authority of the entire kingdom.",
                asciiFlowchart = """
[💍 The Sacred Royal Signet Ring (Rama Mudrika)]
       │ (Presented to Mata Sita in Ashok Vatika)
       ▼
[✨ Indisputable Sovereign Verification & Authority of Kosala Realm]
       │ (Recognized Instantly Beyond Any Shadow of Doubt)
       ▼
[❤️ Tears of Reassurance & Total Acceptance of the Divine Emissary]
                """.trimIndent(),
                lessonQuote = "The authentic seal of sovereign authority commands instant universal reverence."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Perpetual Succession: Corporate Immortality",
                    category = "Core Feature",
                    englishText = "The life of a company is not linked to the mortal lifespans of its members. Even if all shareholders, directors, or founders die, become insolvent, or sell their shares, the company continues to exist until formally wound up under the Companies Act.",
                    hinglishText = "Company amar hoti hai! Agar company ke 100% shareholders plane crash me mar jayein, tab bhi company ko ek kharonch nahi aati. Unke shares unke legal heirs ko transfer ho jayenge aur company as it is chalti rahegi.",
                    asciiFlowchart = """
[🌪️ All Shareholders Perish / Exit / Go Bankrupt] ──> [⚖️ Company's Legal Life 100% Unaffected!] ──> [Shares Inherited by Heirs]
                    """.trimIndent(),
                    microMnemonic = "IMMORTAL-CORP",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Eternal Flow of Mother Sarayu and the Solar Dynasty",
                        loreOrContext = "Generations of emperors walked the earth and departed, yet the sacred river Sarayu and the immortal honor of Suryavansh flowed on uninterrupted across millennia.",
                        asciiFlowchart = "[Mortal Generations Depart] ──> [Sacred Sarayu Flows Unbroken] ──> [Suryavansh Honor Endures]",
                        lessonQuote = "Human lives are brief waves upon the immortal river of noble purpose."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Apple Inc. Flourishing After Steve Jobs' Demise",
                        loreOrContext = "When legendary visionary founder Steve Jobs passed away in 2011, Apple Inc. did not dissolve; Tim Cook took executive charge, and the company scaled to a $3 Trillion valuation.",
                        asciiFlowchart = "[Founder Passes Away (2011)] ──> [Apple Inc. Continues] ──> [Surges Past $3,000,000,000,000]",
                        lessonQuote = "Great corporations are institutional machines built to outlive even legendary founders."
                    ),
                    caseQuestion = "Quote the famous legal aphorism that illustrates the perpetual succession of a joint-stock company.",
                    caseAnswer = "'Members may come and members may go, but the company goes on forever.'"
                ),
                SubPointItem(
                    pointTitle = "Common Seal & The Companies (Amendment) Act, 2015",
                    category = "Core Feature",
                    englishText = "Being an artificial person, a company cannot sign physical documents with a pen. The Common Seal acts as its official physical signature. Under the Companies (Amendment) Act, 2015, the Common Seal was made OPTIONAL; documents can now be authenticated by two Directors or one Director and the Company Secretary.",
                    hinglishText = "Company ke hath nahi hote, isliye pehle har legal document par company ka metal stamp 'Common Seal' lagana compulsory tha. Lekin 2015 ke amendment ke baad Common Seal ko OPTIONAL kar diya gaya—ab 2 Directors ya 1 Director + Company Secretary sign kar dein to document valid maana jata hai.",
                    asciiFlowchart = """
[Document Authentication] ──> EITHER: [Metallic Common Seal Affixed] OR: [Signatures of 2 Directors / 1 Director + CS]
                    """.trimIndent(),
                    microMnemonic = "OPTIONAL-SEAL-2015",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Golden Seal Affixed to the Royal Ayodhya Royal Charters",
                        loreOrContext = "Royal decrees were stamped with molten gold seals depicting the bow and sun of Suryavansh, making the imperial scroll binding across all four corners of the world.",
                        asciiFlowchart = "[📜 Imperial Parchment] ──> [Molten Gold Sun-Emblem Stamped] ──> [Universal Imperial Force]",
                        lessonQuote = "The authentic signature of the state transforms parchment into sovereign decree."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Digital E-Signatures (DocuSign) Replacing Metallic Brass Seals",
                        loreOrContext = "Fintech unicorn Razorpay signs $50 Million enterprise loan agreements electronically using Class-3 digital signatures of two authorized directors, bypassing antique physical brass seals.",
                        asciiFlowchart = "[💻 Enterprise Contract] ──> [Digital Signatures of 2 Directors] ──> [✅ 100% Legally Binding]",
                        lessonQuote = "Digital agility modernizes statutory traditions without sacrificing corporate security."
                    ),
                    caseQuestion = "Is having a Common Seal still mandatory for an Indian company incorporated under the Companies Act, 2013?",
                    caseAnswer = "No. The Companies (Amendment) Act, 2015 made the Common Seal optional."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 44: The Tragedy of the Boardroom Flight",
                    scenario = "All seven shareholders and all three directors of Himalayan Mineral Waters Ltd. were traveling in a private charter aircraft that tragically crashed in the mountains with no survivors. A competitor announced: 'The company has died with its founders; their mineral spring lease is now open for grab.'",
                    question = "Analyze the legal validity of the competitor's claim using company law concepts.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: The competitor's claim is completely invalid and false in law (1 Mark)",
                        "State the doctrine: Perpetual Succession of a Joint Stock Company (1 Mark)",
                        "Explain outcome: The existence of the company is not terminated by the simultaneous death of all members; legal heirs inherit the shares and the company continues to own the mineral spring lease (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "A company possesses corporate immortality (perpetual succession) immune to member mortality.",
                "Since 2015, the Common Seal is optional, and documents can be legally executed by two directors or one director and the company secretary."
            )
        ),

        // PAGE 45: Separation of Ownership & Management & Limited Liability
        StudyPage(
            pageNumber = 45,
            module = ModuleCategory.COMPANY,
            title = "Ownership vs. Management & Limited Liability",
            subtitle = "Democratic Capital Pooling Managed by Fiduciary Trustees",
            topicDescriptionEnglish = "In a joint-stock company, there is a strict institutional separation between ownership (vested in millions of equity shareholders) and management (delegated to an elected Board of Directors). Concurrently, member liability is strictly limited to the unpaid nominal value of their shares.",
            topicDescriptionHinglish = "Company ka sabse bada balance: Ownership vs Management! Company ke asli maalik 'Shareholders' hote hain, lekin daily dukan chalana unke bas ki baat nahi hoti kyunki wo laakho ki sankhya me poore desh me faile hote hain. Isliye wo vote dekar 'Board of Directors' (professional experts) ko chunte hain jo company chalate hain. Aur sabse bada vardaan: Limited Liability—agar share poora paid-up hai, to shareholder se 1 naya paisa bhi nahi maanga ja sakta!",
            macroMemoryTrick = "MACRO MNEMONIC: 'O-M-L' -> (O)wners are Shareholders, (M)anagers are Directors, (L)iability strictly Limited.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Imperial Council of Ministers Governing Ayodhya under Sovereign Trust",
                loreOrContext = "When Lord Rama dwelt in the forest, the sovereign realm belonged to the divine line of Raghu (the true owners), while Prime Minister Sumantra and the eight council ministers steered imperial governance with flawless fiduciary fidelity.",
                asciiFlowchart = """
[🏹 Lord Rama & Royal Heirs (Sovereign Owners of the Realm)]
       │ (Entrusted Imperial Governance to Righteous Trustees)
       ▼
[👡 Council of 8 Ministers under Sage Vashistha & Sumantra (The Board of Directors)]
       │ (Day-to-Day Executive Administration & Treasury Governance)
       ▼
[⚖️ Sovereign Integrity of Ayodhya Preserved Flawlessly for 14 Years]
                """.trimIndent(),
                lessonQuote = "Righteous stewards govern another's treasure with greater vigilance than their own."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Separation of Ownership and Management (The Agency Model)",
                    category = "Corporate Governance",
                    englishText = "Equity shareholders are the legal owners of the company, but due to their vast numbers, geographical dispersion, and lack of technical skills, management is delegated to the Board of Directors elected at the Annual General Meeting.",
                    hinglishText = "Agar aapne Tata Motors ka 1 share khareeda, to aap Tata Motors ke hissedar (owner) ban gaye! Lekin kal subah aap factory jakar ye nahi bol sakte: 'Main car ka design change karunga!' Management Board of Directors aur professional executives (CEO, CFO) hi karenge.",
                    asciiFlowchart = """
[3,000,000 Equity Shareholders (OWNERS)] ──> [Elect in AGM ──>] [Board of Directors (GOVERNANCE)] ──> [Hires CEO/CXOs (MANAGEMENT)]
                    """.trimIndent(),
                    microMnemonic = "OWN-VS-MANAGE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "Prince Bharata Serving as Trustee-Regent, Not Sole Proprietor",
                        loreOrContext = "Prince Bharata never claimed personal ownership over Ayodhya. He lived as an ascetic in Nandigram, administering the empire purely as a fiduciary trustee for Lord Rama.",
                        asciiFlowchart = "[Ascetic Regent Bharata] ──> [Administers Imperial Statecraft] ──> [Holds Power Purely as Trustee]",
                        lessonQuote = "True leadership holds executive power as a sacred trust, never as private property."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "19-Year-Old Zerodha Trader Owning Zomato Shares",
                        loreOrContext = "Karan bought 100 shares of Zomato for ₹18,000 on his Zerodha app. He is an equity owner with voting rights via online postal ballots, but Deepinder Goyal and the Board run operations.",
                        asciiFlowchart = "[📱 100 Zomato Shares on Zerodha] ──> [Karan is Legal Owner] ──> [Deepinder Goyal & Board Steer Operations]",
                        lessonQuote = "Retail investors gain fractional ownership while elite executives execute strategy."
                    ),
                    caseQuestion = "Why cannot individual equity shareholders directly participate in the day-to-day operations of a public limited company?",
                    caseAnswer = "Because shareholders are vast in number, geographically dispersed, and lack specialized managerial competence; hence management is delegated to the Board of Directors."
                ),
                SubPointItem(
                    pointTitle = "Limited Liability of Shareholders",
                    category = "Core Feature",
                    englishText = "The liability of a member is limited strictly to the unpaid face value of shares held. If a shareholder has already paid ₹10 on a ₹10 face value share, his liability is ZERO. His personal private property cannot be touched by creditors under any circumstances.",
                    hinglishText = "Agar aapne ₹100 ka share khareeda aur ₹100 company ko de chuke ho (fully paid-up), to company chahe 10,000 Crore ke karze me doob kar nilaam ho jaye, court aapke ghar se 1 rupaya bhi nahi maang sakti! Aapka maximum loss sirf wahi ₹100 hai jo aapne share khareedte waqt lagaye the.",
                    asciiFlowchart = """
[Share Face Value: ₹10] ──> [Amount Paid: ₹10] ──> [UNPAID AMOUNT: ₹0] ──> [PERSONAL LIABILITY: STRICTLY ZERO!]
[Share Face Value: ₹10] ──> [Amount Paid: ₹7]  ──> [UNPAID AMOUNT: ₹3] ──> [MAXIMUM LIABILITY: ONLY ₹3 PER SHARE]
                    """.trimIndent(),
                    microMnemonic = "UNPAID-ONLY-RISK",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Shield of the Vanara Foot Soldiers in the Imperial Siege",
                        loreOrContext = "While commanders accepted sovereign strategic peril, the humble soldiers' personal clans in Kishkindha remained secure from royal debt obligations.",
                        asciiFlowchart = "[Soldier's Duty Discharged] ──> [Kinship Cave in Kishkindha Shielded from Imperial Debt]",
                        lessonQuote = "Righteous realms protect the private dwellings of those who rally to the standard."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Investing in Paytm IPO vs. Personal Bankruptcy",
                        loreOrContext = "A retail investor bought ₹50,000 worth of Paytm shares at IPO. Even when the stock dropped 70%, the investor's home, car, and bank savings were completely safe from Paytm's corporate liabilities.",
                        asciiFlowchart = "[📉 Stock Plunges 70%] ──> [Loss Capped at Capital Invested] ──> [🏡 Personal Assets 100% Untouched]",
                        lessonQuote = "Limited liability provides an absolute floor on downside risk in capital markets."
                    ),
                    caseQuestion = "Varun holds 500 shares of ₹10 each on which he has already paid ₹8 per share. What is the extent of his personal liability if the company goes into liquidation?",
                    caseAnswer = "₹1,000 only (500 shares × ₹2 unpaid amount per share)."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 45: The Liquidation of Zenith Steel Ltd.",
                    scenario = "Zenith Steel Ltd. went into liquidation with outstanding bank debts of ₹80 Crores. The company's assets realized ₹35 Crores. Shareholder Meena holds 2,000 shares of ₹100 each, on which she has already paid ₹100 per share. The liquidator sent a demand notice asking Meena to pay ₹50,000 to clear bank debts.",
                    question = "Is Meena legally obligated to pay the demand of ₹50,000? Justify with reference to company law.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: No, Meena is NOT legally obligated to pay anything to the liquidator (1 Mark)",
                        "State the legal rule: In a company limited by shares, the liability of a member is strictly confined to the unpaid amount on shares held (1 Mark)",
                        "Apply to facts: Since Meena's shares are fully paid-up (paid ₹100 on ₹100 face value), her remaining personal liability is ZERO (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Ownership and management are split between millions of shareholders and the elected Board of Directors.",
                "Shareholder liability is strictly capped at the unpaid face value of shares held."
            )
        ),

        // PAGE 46: Merits of Joint Stock Company
        StudyPage(
            pageNumber = 46,
            module = ModuleCategory.COMPANY,
            title = "Merits: Colossal Capital, Liquidity & Professionalism",
            subtitle = "Why the Joint Stock Company Dominates the Global Economy",
            topicDescriptionEnglish = "A joint-stock company offers five towering advantages: limited liability shielding investors, free transferability of shares providing instant liquidity, perpetual existence, unparalleled scope for capital expansion, and ability to employ specialized professional managers.",
            topicDescriptionHinglish = "Company banakar business karne ke 5 sabse solid fayde: (1) Limited Liability—shareholder ki personal property bilkul safe; (2) Transfer of Interest—stock exchange par 1 second me share becho aur cash pao (liquidity); (3) Perpetual Existence—hamesha zinda rehti hai; (4) Scope for Expansion—public se croro-arabo rupaye equity ke roop me raise kar sakte hain; (5) Professional Management—duniya ke top MBA, CA aur engineers ko high salary par hire kar sakte hain!",
            macroMemoryTrick = "MACRO MNEMONIC: 'L-T-P-S-P' -> (L)imited Liability, (T)ransferability of Shares, (P)erpetual Life, (S)cope for Expansion, (P)rofessional Management.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Mobilization of the Four Global Legions of Kishkindha",
                loreOrContext = "Sugriva deployed his royal staff to summon millions of warriors from across the Himalayas, Vindhyas, ocean shores, and sacred river basins, assembling an unmatched coalition with specialized division of labor.",
                asciiFlowchart = """
[👑 Sovereign Clarion Call of Kishkindha]
       │
       ▼ (Immense Pooling of Specialized Global Talent)
[Himalayan Bears under Jambavan] + [Vanara Marshals under Nila] + [Flying Scouts under Hanuman]
       │
       ▼ (Infinite Capacity to Execute Civilizational Projects)
[🌉 Unprecedented Mastery Over Land, Sky & Cosmic Oceans]
                """.trimIndent(),
                lessonQuote = "Colossal scale united with specialized expertise overcomes the most formidable fortifications."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Transfer of Interest (Instant Liquidity on Stock Exchanges)",
                    category = "Merit",
                    englishText = "In a public limited company, shares can be sold and transferred freely on the open stock market without requiring the consent of other shareholders or disturbing the company's operating capital.",
                    hinglishText = "Partnership me bina baaki partners ki permission ke aap apna hissa kisi ko nahi bech sakte the. Lekin public company me aap NSE/BSE par 1 click karke apne shares kisi ajnabee ko bech sakte ho aur turant cash nikal sakte ho!",
                    asciiFlowchart = """
[Investor Needs Cash] ──> [Taps 'Sell' on Broker App (NSE/BSE)] ──> [⚡ Sold in Milliseconds] ──> [Company Capital Remains 100% Intact!]
                    """.trimIndent(),
                    microMnemonic = "INSTANT-LIQUID",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Exchange of Royal Pledges in the Presence of the Sacred Fire",
                        loreOrContext = "Princes freely pledged friendship and mutual sovereign aid before the consecrated Agni, transferring loyalty without disturbing dynastic continuity.",
                        asciiFlowchart = "[Sacred Agni Witness] ──> [Sovereign Pacts Exchanged] ──> [Dynasties Cooperate Seamlessly]",
                        lessonQuote = "Clear mechanisms of exchange ensure enduring trust without institutional disruption."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Selling ₹10,000 TCS Shares on Groww in 30 Seconds",
                        loreOrContext = "Riya needed money for a medical emergency. She sold 3 shares of TCS on the Groww app at 10:15 AM; the trade executed instantly at market price without affecting TCS's software operations.",
                        asciiFlowchart = "[📱 Sell 3 TCS Shares] ──> [Executed in 30 Seconds] ──> [TCS Operations Continue Unaffected]",
                        lessonQuote = "Public capital markets provide effortless liquidity to investors without destabilizing enterprise assets."
                    ),
                    caseQuestion = "Why is the investment in shares of a public limited company considered highly liquid?",
                    caseAnswer = "Because shares of a public company are freely transferable on stock exchanges and can be converted into cash at any time."
                ),
                SubPointItem(
                    pointTitle = "Scope for Expansion & Professional Management",
                    category = "Merit",
                    englishText = "A public company can raise billions of dollars by issuing shares and bonds to the global public and institutions. With massive capital resources, it can hire world-class specialized CEOs, data scientists, and international supply chain leaders.",
                    hinglishText = "Chhote business ke paas paisa nahi hota isliye wo sab kuch khud karne ki koshish karte hain. Company IPO laakar hazaron crore raise kar sakti hai aur IIT/IIM ke top geniuses, marketing heads aur legal experts ko crorepati packages par hire karke global brand bana sakti hai!",
                    asciiFlowchart = """
[IPO: Issue Shares to 500,000 Citizens] ──> [Raise ₹5,000 Crores] ──> [Hire World-Class CXOs & Build Megafactories] ──> [Global Hegemony]
                    """.trimIndent(),
                    microMnemonic = "MEGA-SCALE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Architecture of Ayodhya Built by the Divine Engineer",
                        loreOrContext = "Ayodhya enlisted master architects, astronomers, and divine engineers to construct moats, ballistic catapults (Shataghnis), and towering battlements, combining immense wealth with supreme professional craft.",
                        asciiFlowchart = "[Imperial Royal Wealth] ──> [Enlists Master Craftsmen & Architects] ──> [Impregnable Cosmic Citadel]",
                        lessonQuote = "Great wealth achieves lasting glory when it enlists the highest professional wisdom."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Zomato Acquiring Blinkit to Conquer Quick Commerce",
                        loreOrContext = "Using its public market equity valuation and multi-thousand-crore treasury, Zomato acquired Blinkit for ₹4,447 Crores, scaling 10-minute grocery delivery across 30 cities.",
                        asciiFlowchart = "[Public Market Valuation] ──> [Acquires Blinkit for ₹4,447 Cr] ──> [Dominates 10-Min Quick Commerce]",
                        lessonQuote = "Public corporate capital turns ambitious strategic acquisitions into reality."
                    ),
                    caseQuestion = "How does the corporate form enable an enterprise to employ top-tier professional talent?",
                    caseAnswer = "Due to vast capital resources, high operational scale, and the ability to offer lucrative compensation packages, bonuses, and ESOPs."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 46: The Transition of Bharat Electronics",
                    scenario = "Bharat Electronics operated as a partnership firm manufacturing lithium batteries. The partners needed ₹500 Crores to build a gigafactory and desired to hire Japanese battery automation specialists. Banks refused to lend ₹500 Crores against their personal guarantees.",
                    question = "Advise the partners on how converting into a Public Limited Company solves both their problems.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Capital Expansion Solution: A Public Limited Company has no upper limit on members and can raise ₹500 Crores through an Initial Public Offer (IPO) from public and institutional investors (1.5 Marks)",
                        "Professional Management Solution: Vast equity capital enables the company to offer market-beating salaries and stock options (ESOPs) to recruit top global Japanese specialists (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Transferability of shares provides instant retail liquidity without bleeding company reserves.",
                "Unmatched capital generation capacity powers global expansion and world-class professional management."
            )
        ),

        // PAGE 47: Limitations of Joint Stock Company
        StudyPage(
            pageNumber = 47,
            module = ModuleCategory.COMPANY,
            title = "Limitations: Bureaucracy, Disclosure & Oligarchy",
            subtitle = "When Regulations, Delays, and Distance Sever Owners from Enterprise",
            topicDescriptionEnglish = "A joint-stock company suffers from heavy limitations: complex, lengthy and expensive formation, lack of operational secrecy due to compulsory public disclosures, bureaucratic delays in decision-making, and oligarchic management dominated by a handful of directors.",
            topicDescriptionHinglish = "Company banane ke 5 bade nuksaan: (1) Complex Formation—hazaaron kanooni documents, fees aur months ka time lagta hai; (2) Secrecy ki kami—balance sheet, profit-loss sab website aur ROC par public karna padta hai; (3) Delay in Decisions—har decision ke liye Board meeting, notices aur resolutions pass karne padte hain; (4) Oligarchic Management—laakho shareholders bas naam ke maalik hote hain, asli control 4-5 directors hi chalate hain!",
            macroMemoryTrick = "MACRO MNEMONIC: 'C-L-I-P-O' -> (C)omplex Formation, (L)ack of Secrecy, (I)mpersonal Touch, (P)rocedural Delays, (O)ligarchic Control.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Paralyzing Pretentiousness of the Golden Mirage (Maricha's Illusion)",
                loreOrContext = "When false exterior glitter lured attention away from direct vigilance, the security hermitage was momentarily severed from its core guardians, allowing danger to strike.",
                asciiFlowchart = """
[🦌 Alluring Golden Mirage of Maricha]
       │
       ▼ (Distance, Distraction & Procedural Severance)
[Direct Protective Vigilance Momentarily Separated from the Core Sanctuary]
       │
       ▼ (Perilous Window Exploited by Treachery)
[💔 The Tragic Abduction in the Forest Wilderness]
                """.trimIndent(),
                lessonQuote = "When excessive distance separates the protector from the sanctuary, vulnerability is born."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Lack of Secrecy & Regulatory Overkill",
                    category = "Limitation",
                    englishText = "Under the Companies Act and SEBI regulations, public companies must publish audited quarterly financial results, disclose major contracts, director salaries, and litigation, making it impossible to maintain commercial confidentiality.",
                    hinglishText = "Sole proprietor ki tarah company apne raaz chhupa nahi sakti! Har 3 mahine me profit-loss, kin-kin deals me kitna paisa laga, aur director ko kitni salary mili—ye sab newspaper aur Stock Exchange par batana compulsory hota hai. Competitors aapki saari strategy jaan jaate hain.",
                    asciiFlowchart = """
[Quarterly Earnings Call] ──> [Disclose All Revenue, Margins & Strategic Plans] ──> [❌ Zero Secrecy / Competitors Track Every Move!]
                    """.trimIndent(),
                    microMnemonic = "ZERO-SECRECY",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Open Counsel of Ravana's Imperial War Room",
                        loreOrContext = "Ravana debated war plans openly before dozens of courtiers, enabling spies and defectors to relay operational tactics directly to the Allied camp.",
                        asciiFlowchart = "[Open War Debate Before Courtiers] ──> [Tactics Leaked] ──> [Strategic Surprise Annihilated]",
                        lessonQuote = "A council that leaks its operational secrets has already half lost the war."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Startup Valuation Multiples Disclosed on MCA Portal",
                        loreOrContext = "When an edtech startup registered as a private limited company filed its annual financial statements, tech journalists downloaded them from the MCA portal and published their ₹200 Crore cash burn rate.",
                        asciiFlowchart = "[MCA Public ROC Filings] ──> [Tech Media Downloads Balance Sheet] ──> [🗞️ ₹200 Cr Cash Burn Made Public]",
                        lessonQuote = "Corporate compliance leaves no place to hide your operational shortcomings."
                    ),
                    caseQuestion = "Why is it virtually impossible for a Public Limited Company to maintain absolute business secrecy regarding its financial performance?",
                    caseAnswer = "Because company law and SEBI mandate compulsory public disclosure and publication of audited annual and quarterly accounts and material events."
                ),
                SubPointItem(
                    pointTitle = "Oligarchic Management (Concentration of Power)",
                    category = "Limitation",
                    englishText = "Although nominally democratic, in practice a company is governed as an oligarchy. Small retail shareholders are indifferent, hold insignificant fractional voting power, and cannot attend AGMs; thus, a small clique of senior directors and promoter families exercise unchallenged control.",
                    hinglishText = "Kaagaz par company democratic lagti hai, par sach me 4-5 powerful log (Directors aur Promoters) hi saari power chalate hain. Aam shareholder jiske paas 10-50 shares hain, wo AGM me ja bhi nahi pata. Isse choti si toli (oligarchy) company par raaj karti hai.",
                    asciiFlowchart = """
[3,000,000 Passive Retail Investors] ──> (Too Dispersed to Coordinate) ──> [🔥 5 Senior Promoter Directors Exercise 100% Practical Rule]
                    """.trimIndent(),
                    microMnemonic = "CLIQUE-RULE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Absolute Dictatorship of Ravana Over the Lanka Conclave",
                        loreOrContext = "Though Lanka had a grand assembly of elders, Ravana overruled ministers, silenced dissent, and governed solely through autocratic family dominion.",
                        asciiFlowchart = "[Grand Assembly Assembled] ──> [Dissent Silenced] ──> [Autocratic Oligarchy Prevails]",
                        lessonQuote = "The outer trappings of an assembly cannot mask autocratic concentration of power."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Dual-Class Voting Shares (Super-Voting Shares)",
                        loreOrContext = "Tech founders hold Class-B shares with 10x voting rights each, ensuring that even if public retail investors hold 80% of the economic equity, the founders control 70% of board votes.",
                        asciiFlowchart = "[Founder Holds 20% Equity] + [10x Super-Voting Shares] ──> [Controls 70% of Board Votes Unchallenged]",
                        lessonQuote = "Sophisticated capital structures frequently subordinate democratic voting to oligarchic control."
                    ),
                    caseQuestion = "Explain the term 'Oligarchic Management' in the context of a joint-stock company.",
                    caseAnswer = "It refers to the governance reality where actual control is concentrated in the hands of a small group of directors, rendering the nominal democratic power of dispersed retail shareholders ineffective."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 47: The Frustrated Retail Shareholder",
                    scenario = "Mr. Anand, who owns 100 shares in a public blue-chip company, traveled 800 km to attend the AGM to protest against a 40% salary hike proposed for the Managing Director. In the meeting, the resolution was declared passed in seconds via institutional block votes and proxies held by the chairman.",
                    question = "Identify and explain the limitation of the company form of organization highlighted in this case.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Identify Limitation: Oligarchic Management / Domination of Promoters over Dispersed Retail Investors (1 Mark)",
                        "Explain Concept: Despite theoretical democracy, voting power in a company is proportional to shareholding (capital), not 'one man, one vote' (1 Mark)",
                        "Apply to facts: Large institutional blocks and promoter proxies dwarf individual retail investors like Mr. Anand, making retail dissent practically futile (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Mandatory quarterly financial filings eliminate commercial secrecy.",
                "Dispersed shareholding results in practical oligarchic control by promoter directors."
            )
        ),

        // PAGE 48: Types of Companies - Private vs. Public vs. OPC
        StudyPage(
            pageNumber = 48,
            module = ModuleCategory.COMPANY,
            title = "Types of Companies: Private vs. Public vs. OPC",
            subtitle = "The Three Pillars of Corporate Organization under Companies Act, 2013",
            topicDescriptionEnglish = "The Companies Act, 2013 classifies companies into three primary categories: Private Limited Company (Section 2(68)), Public Limited Company (Section 2(71)), and One Person Company (OPC - Section 2(62)), each tailored for specific operational scales and governance standards.",
            topicDescriptionHinglish = "Companies Act 2013 ke tehat 3 tarah ki main companies hoti hain: (1) Private Limited Company—chhoti aur medium family/startup companies (min 2, max 200 members); (2) Public Limited Company—badi corporate giants (min 7, max NO LIMIT) jo stock market par aati hain; (3) One Person Company (OPC)—single founder/solopreneur ke liye corporate armor!",
            macroMemoryTrick = "MACRO MNEMONIC: 'P-P-O' -> Private (2-200), Public (7-Unlimited), OPC (Solo Founder 1 Person).",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Three Imperial Formations of the Allied Host at Suvela",
                loreOrContext = "Lord Rama organized his forces into three distinct operational formations: the close inner personal vanguard (Private guard under Lakshmana), the vast open cosmic army (Public host under Sugriva), and solitary strategic reconnaissance champions (Solitary emissary Hanuman).",
                asciiFlowchart = """
             [🏹 Sovereign Imperial Command of Lord Rama]
                             │
       ┌─────────────────────┼─────────────────────┐
       ▼                     ▼                     ▼
[CLOSE INNER VANGUARD]  [VAST PUBLIC HOST]    [SOLITARY RECONNAISSANCE]
(Private Circle: 2-200) (Millions: Unlimited) (Hanuman Alone: OPC)
(Trusted Intimate Core) (Infinite Expansion)  (Agile, Solitary Sovereign Power)
                """.trimIndent(),
                lessonQuote = "Righteous commanders adapt operational structures to the precise scale of the mission."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Private Limited Company [Section 2(68)]",
                    category = "Company Classification",
                    englishText = "A Private Company requires minimum 2 and maximum 200 members (excluding current and former employee-members). It restricts the right to transfer shares, prohibits any invitation to the public to subscribe for securities, and must suffix 'Private Limited' to its name.",
                    hinglishText = "Private Limited Company ke 3 basic niyam: (1) Minimum 2 members, Maximum 200 members; (2) Shares ko bahar kisi ajnabee ko bechne par pabandi hoti hai (Board ki permission chahiye); (3) Public se shares ya fixed deposits maangne par strict ban hota hai. Naam ke peeche 'Pvt. Ltd.' lagana mandatory hai.",
                    asciiFlowchart = """
[Min 2 to Max 200 Members] + [Restricted Share Transfer] + [No Public Subscription] ──> [🏛️ Private Limited Company (Pvt. Ltd.)]
                    """.trimIndent(),
                    microMnemonic = "PVT-2-TO-200",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Trusted Inner Circle of Ayodhya's Four Princes",
                        loreOrContext = "The four royal brothers and their inner confidants formed a tight-knit council of sovereign trust, closed to outside court intrigue.",
                        asciiFlowchart = "[4 Royal Brothers + Inner Sages] ──> [Restricted Council] ──> [Absolute Internal Trust]",
                        lessonQuote = "A close, bounded circle preserves pure operational unity and speed."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Bootstrap SaaS Startup Incorporating as Pvt. Ltd.",
                        loreOrContext = "Two tech founders in Bengaluru incorporated 'CloudScale Technologies Pvt. Ltd.', raised angel funds from 5 alumni, and restricted share transfers to prevent competitors from buying equity.",
                        asciiFlowchart = "[2 Tech Founders + 5 Angels] ──> [Share Transfer Restricted] ──> [Safe from Hostile Takeovers]",
                        lessonQuote = "Private limited structure protects early-stage cap-tables from hostile interference."
                    ),
                    caseQuestion = "What is the maximum statutory limit on the number of members in a Private Limited Company under the Companies Act, 2013?",
                    caseAnswer = "200 members (excluding present and past employee-members)."
                ),
                SubPointItem(
                    pointTitle = "Public Limited Company [Section 2(71)]",
                    category = "Company Classification",
                    englishText = "A Public Company requires minimum 7 members and has NO MAXIMUM LIMIT. Shares are freely transferable on stock exchanges. It can invite the public to subscribe to its shares and debentures, and must suffix 'Limited' (Ltd.) to its name.",
                    hinglishText = "Public Limited Company ke rules: (1) Kam se kam 7 members, maximum ki KOI LIMIT NAHI (crore log bhi member ban sakte hain); (2) Shares freely transferable hote hain; (3) Public se IPO ke zariye croro rupaye raise kar sakti hai. Naam ke peeche sirf 'Limited' (Ltd.) lagta hai.",
                    asciiFlowchart = """
[Min 7 Members | NO Max Limit] + [Freely Transferable Shares] + [Public Issues Allowed] ──> [🏛️ Public Limited Company (Ltd.)]
                    """.trimIndent(),
                    microMnemonic = "PUB-7-UNLIMITED",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Boundless Alliance of Kishkindha Open to All Species",
                        loreOrContext = "Sugriva's alliance had no numerical ceiling; millions of bears, monkeys, and forest tribes from all continents were embraced under the sovereign banner.",
                        asciiFlowchart = "[Millions of Forest Tribes Enrolled] ──> [Zero Numerical Ceiling] ──> [Universal Dharma Army]",
                        lessonQuote = "True civilizational movements know no numerical boundaries."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Tata Consultancy Services Ltd. (TCS) Public Shareholding",
                        loreOrContext = "TCS has over 2.5 million retail and institutional public shareholders across the globe, with shares trading dynamically every microsecond on the National Stock Exchange.",
                        asciiFlowchart = "[2,500,000+ Shareholders Globally] ──> [Freely Traded on NSE] ──> [₹14 Lakh Crore Valuation]",
                        lessonQuote = "Public limited architecture enables ordinary citizens to become co-owners of global empires."
                    ),
                    caseQuestion = "What is the minimum number of members required to incorporate a Public Limited Company?",
                    caseAnswer = "Minimum 7 members."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 48: The Membership Cap Dilemma at Nova Tech",
                    scenario = "Nova Tech Pvt. Ltd. has 195 members. It recently offered Employee Stock Option Plans (ESOPs) to 15 of its full-time software engineers who exercised their options and became shareholders. A rival firm claimed Nova Tech has violated the Companies Act by crossing the 200-member ceiling.",
                    question = "Evaluate whether Nova Tech Pvt. Ltd. has breached the statutory limit of 200 members.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "State the statutory exclusion: Under Section 2(68) of the Companies Act, 2013, present employees and former employees who became members while in employment are EXCLUDED from the 200 count (1.5 Marks)",
                        "Apply to facts: The 15 software engineers are full-time employees; hence they are excluded from the statutory ceiling calculation (1 Mark)",
                        "Conclusion: Total counted members remain 195; Nova Tech has NOT breached the 200-member limit (0.5 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Private Company: 2 to 200 members, restricted transfer, no public invitation.",
                "Public Company: Minimum 7 members, no upper limit, free transferability of shares, public invitation allowed."
            )
        ),

        // PAGE 49: One Person Company (OPC) & Privileges of Private Company
        StudyPage(
            pageNumber = 49,
            module = ModuleCategory.COMPANY,
            title = "One Person Company (OPC) & Private Company Privileges",
            subtitle = "Companies Act 2013 Section 2(62) | The Corporate Armor for Solopreneurs",
            topicDescriptionEnglish = "A One Person Company (OPC) is an innovative corporate vehicle where a single natural person incorporates a company with limited liability. Concurrently, private companies enjoy extensive statutory privileges and exemptions compared to public companies.",
            topicDescriptionHinglish = "One Person Company (OPC) 2013 ke kanoon ka sabse bada game-changer hai! Pehle akele vyakti ko Majbooran Sole Proprietorship chalani padti thi jisme Unlimited Liability ka khatra hota tha. Ab ek akela insaan bhi apni khud ki 'Company' khol sakta hai aur Limited Liability ka shield pa sakta hai! Isme bas 1 Nominee appoint karna mandatory hota hai.",
            macroMemoryTrick = "MACRO MNEMONIC: 'O-P-C-N' -> (O)ne Natural Person, (P)erpetual via Nominee, (C)orporate Limited Shield, (N)o Unlimited Risk.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Solitary Sovereign Mission of Lord Hanuman Across the Ocean",
                loreOrContext = "Endowed with supreme self-sufficiency, Lord Hanuman crossed the 100-yojana ocean alone, entered fortified Lanka single-handedly, delivered the sovereign ring, incinerated enemy pride, and returned victorious without a second commander.",
                asciiFlowchart = """
[🔥 Lord Hanuman: The Solitary Supreme Champion]
       │ (100% Focused, Agile & Self-Contained Execution)
       ▼
[🌊 Impassable 100-Yojana Ocean Leaped in a Single Bound]
       │ (Immune to External Confusion, Boardroom Delay, or Compromise)
       ▼
[🏛️ Enemy Fortress Incinerated & Victory Secured Single-Handedly!]
                """.trimIndent(),
                lessonQuote = "A single focused hero endowed with righteous conviction achieves what vast armies ponder in vain."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "One Person Company (OPC) Rules & Nominee Requirement",
                    category = "OPC Framework",
                    englishText = "Only a natural person who is an Indian citizen is eligible to incorporate an OPC. The memorandum must specify a NOMINEE who becomes the sole member in the event of the subscriber's death or permanent incapacity, ensuring perpetual succession.",
                    hinglishText = "OPC ke important rules: Sirf ek natural person (jeeta-jaagta Indian citizen) hi OPC bana sakta hai. Founder ko MOA me ek 'Nominee' ka naam likhna compulsory hota hai, taaki agar founder ki maut ho jaye, to nominee automatically maalik ban jaye aur company band na ho.",
                    asciiFlowchart = """
[Single Indian Citizen (Sole Member)] ──> [Mandatory Nominee Appointed] ──> [Death/Incapacity ──>] [Nominee Takes Helm Seamlessly]
                    """.trimIndent(),
                    microMnemonic = "SOLO-PLUS-NOMINEE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "King Harishchandra Appointing His Lineage Guardian",
                        loreOrContext = "When King Harishchandra faced sovereign trials, he ensured the sacred unbroken ancestral line was formally entrusted to a consecrated guardian.",
                        asciiFlowchart = "[Sovereign King] ──> [Designates Royal Custodian] ──> [Lineage Continuity Preserved]",
                        lessonQuote = "Foresight ensures that institutions outlive mortal crises through designated guardians."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "AI Prompt Engineer Incorporating an OPC for Consulting",
                        loreOrContext = "A 22-year-old AI consultant incorporated 'PromptMaster OPC Pvt. Ltd.', nominated his mother as statutory nominee, and signs enterprise B2B contracts with corporate legal protection.",
                        asciiFlowchart = "[Solo AI Architect] ──> [Incorporates OPC + Nominee] ──> [Signs ₹25L Corporate Enterprise Deals]",
                        lessonQuote = "Solopreneurs don't need co-founders to enjoy corporate legal shields."
                    ),
                    caseQuestion = "Why is it mandatory for the promoter of an OPC to nominate a person in the Memorandum of Association?",
                    caseAnswer = "To ensure perpetual succession so that the nominee automatically becomes the sole member upon the death or incapacity of the promoter."
                ),
                SubPointItem(
                    pointTitle = "Privileges & Exemptions of a Private Company over a Public Company",
                    category = "Statutory Comparison",
                    englishText = "Private companies enjoy multiple statutory exemptions: (1) Formed with only 2 members (vs 7 for public); (2) Requires only 2 directors (vs 3 for public); (3) Need not prepare or publish a prospectus; (4) Can commence business immediately upon incorporation without statutory waiting; (5) Exempt from rigid managerial remuneration ceilings.",
                    hinglishText = "Private Company ko sarkaar ne bahut si chhootein di hain: Sirf 2 log aur 2 directors chahiye, prospectus chapwane ka mehenga kharcha nahi karna padta, certificate of incorporation milte hi business shuru kar sakti hai, aur director ko salary dene par koi rigid sarkari ceiling nahi hoti!",
                    asciiFlowchart = """
[Private Company Privileges] ──> [Min 2 Members/Directors] + [No Prospectus] + [Instant Commencement] + [Flexible Director Salaries]
                    """.trimIndent(),
                    microMnemonic = "PVT-PRIVILEGES",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Confidential Strategic March of the Elite Vanguard",
                        loreOrContext = "The elite scout unit moved swift as wind, unfettered by the elaborate supply baggage, royal trumpets, and public protocols that accompanied the vast imperial main host.",
                        asciiFlowchart = "[Elite Agile Scout Vanguard] ──> [Zero Bureaucracy / Fast March] ──> [Reaches Ocean Shores Swiftly]",
                        lessonQuote = "Agile formations move swift as lightning because they are unburdened by cumbersome public ceremony."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Fintech Startup Fast-Tracking Launch as a Private Limited Entity",
                        loreOrContext = "A payment app incorporated as a private limited company and launched beta within 30 days without filing a public prospectus or holding costly public shareholder roadshows.",
                        asciiFlowchart = "[Pvt Ltd Incorporated] ──> [No Prospectus Required] ──> [Product Live in 30 Days]",
                        lessonQuote = "Private company exemptions enable startups to build, test, and iterate with extreme velocity."
                    ),
                    caseQuestion = "State any two privileges enjoyed by a Private Limited Company over a Public Limited Company.",
                    caseAnswer = "(1) Can be formed with only 2 members and 2 directors; (2) Not required to issue a prospectus to raise capital."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 49: The Freelancer Seeking Limited Liability",
                    scenario = "Sunil runs a high-end cyber security testing agency as a Sole Proprietor earning ₹60 Lakhs annually. A Fortune 500 client demands that Sunil sign a contract with a corporate entity, but Sunil does not want any business partner or co-founder to dilute his ownership.",
                    question = "Advise Sunil on the ideal corporate form under the Companies Act, 2013 and explain two key benefits.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: Form a One Person Company (OPC) under Section 2(62) of the Companies Act, 2013 (1 Mark)",
                        "Benefit 1: Retains 100% solitary ownership and complete managerial control without co-founder interference (1 Mark)",
                        "Benefit 2: Enjoys corporate identity and statutory limited liability, protecting his personal assets from commercial damages (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "An OPC enables a single entrepreneur to operate as a corporate body corporate with a mandatory nominee.",
                "Private limited companies enjoy substantial exemptions from procedural and capital regulations."
            )
        ),

        // PAGE 50: Private Limited vs. Public Limited Distinction Matrix
        StudyPage(
            pageNumber = 50,
            module = ModuleCategory.COMPANY,
            title = "Private vs. Public Company: The Master Distinction Matrix",
            subtitle = "The Classic 8-Mark Comparative Jurisprudence Guide",
            topicDescriptionEnglish = "A rigorous, definitive comparison contrasting Private Limited and Public Limited companies across membership, minimum directors, share transferability, public subscription, prospectus, name suffix, and commencement of business.",
            topicDescriptionHinglish = "CBSE Board Exam ka gold-standard 6-to-8 mark question: 'Private Limited Company aur Public Limited Company ke beech me kya antar hai?' Ye 7 core criteria aapko poore marks dilwayenge!",
            macroMemoryTrick = "MACRO MNEMONIC: 'M-D-T-P-P-N-C' -> (M)embers, (D)irectors, (T)ransfer of shares, (P)ublic invitation, (P)rospectus, (N)ame suffix, (C)ommencement.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Private Royal Hermitage vs. The Universal Imperial Assembly",
                loreOrContext = "Compare the secluded hermitage at Panchavati (exclusive, intimate sanctuary accessible only to the chosen few) with the vast open durbar of Ayodhya (unlimited citizens, public announcements, and open sovereign access).",
                asciiFlowchart = """
[🌿 Secluded Hermitage at Panchavati]           [🏛️ The Imperial Mahadurbar of Ayodhya]
(Private: Restricted, Intimate Core)            (Public: Open, Unlimited Host, Universal)
(Guarded by Strict Ingress Protocols)           (Proclamations Blazoned Across All Quarters)
                """.trimIndent(),
                lessonQuote = "Both sanctuaries serve dharma: one nurtures focused resolve, the other radiates sovereign majesty."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Distinction Matrix: Private Company vs. Public Company",
                    category = "Master Distinction",
                    englishText = "1. Minimum Members: 2 vs 7. 2. Maximum Members: 200 vs Unlimited. 3. Minimum Directors: 2 vs 3. 4. Transfer of Shares: Restricted by AOA vs Freely Transferable. 5. Public Invitation: Strictly Prohibited vs Permitted via Prospectus. 6. Name: Must suffix 'Pvt. Ltd.' vs Must suffix 'Ltd.'. 7. Index of Members: Optional if <50 vs Mandatory.",
                    hinglishText = "1. Min Members: 2 vs 7. 2. Max Members: 200 vs No Limit. 3. Min Directors: 2 vs 3. 4. Transfer: Restricted (AOA rokti hai) vs Freely Transferable (Stock market par becho). 5. Public se paisa: Strictly Ban vs Open Permission. 6. Naam: 'Pvt. Ltd.' vs 'Ltd.'. 7. Index of Members: Zaroori nahi vs Compulsory.",
                    asciiFlowchart = """
[BASIS]               [PRIVATE LIMITED COMPANY]           [PUBLIC LIMITED COMPANY]
1. Minimum Members    2                                   7
2. Maximum Members    200 (Excl. Employees)               NO MAXIMUM LIMIT
3. Minimum Directors  2                                   3
4. Share Transfer     Restricted by Articles (AOA)        Freely Transferable
5. Public Invitation  Strictly Prohibited                 Freely Permitted
6. Prospectus         Need not issue                      Mandatory to issue / file in lieu
7. Name Suffix        Must end with 'Pvt. Ltd.'           Must end with 'Ltd.'
                    """.trimIndent(),
                    microMnemonic = "PVT-VS-PUB-TABLE",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Hermitage Council vs. The Sovereign Coronation Conclave",
                        loreOrContext = "Rama consulted Lakshmana in private hermitages; Dasharatha invited thousands of kings, citizens, and sages to the public coronation assembly.",
                        asciiFlowchart = "[Private Hermitage Council: 2 Members] vs [Public Coronation Durbar: Unlimited Assembly]",
                        lessonQuote = "Intimate strategy precedes universal civilizational proclamation."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Swiggy Pvt. Ltd. (Unicorn) vs. Swiggy Ltd. (IPO Public Company)",
                        loreOrContext = "Swiggy operated as Bundl Technologies Pvt. Ltd. with restricted investor shares, then converted into Swiggy Ltd., issued a public prospectus, and raised ₹11,300 Crores in an IPO.",
                        asciiFlowchart = "[Swiggy Pvt. Ltd. (Cap at 200/Restricted)] ──> [Converts to Swiggy Ltd.] ──> [₹11,300 Cr Public Mega IPO]",
                        lessonQuote = "The journey from Private to Public is the standard rite of passage for global unicorns."
                    ),
                    caseQuestion = "Can a Private Limited Company invite the general public to invest in its equity shares?",
                    caseAnswer = "No. Section 2(68) of the Companies Act, 2013 strictly prohibits any invitation to the public to subscribe for securities of a private company."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 50: The Fast-Growing Startup Conversion",
                    scenario = "Zeta Robotics Pvt. Ltd. has 180 members and requires ₹200 Crores for a semiconductor fabrication facility. Venture capitalists suggest that Zeta invite 5,000 retail angel investors through a public online portal. The CFO objects, stating it would violate company law.",
                    question = "Why is the CFO correct, and what structural step must Zeta Robotics take to legally raise this capital?",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Explain the CFO's legal objection: As a Private Limited Company, Zeta is prohibited by Section 2(68) from inviting the public and has a member cap of 200 (1.5 Marks)",
                        "Prescribe the solution: Zeta Robotics must pass a special resolution, amend its Articles and Memorandum, and convert itself into a Public Limited Company (Zeta Robotics Ltd.) before issuing shares to the public (1.5 Marks)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Private companies prioritize privacy, member control, and operational ease (2 to 200 members).",
                "Public companies prioritize massive capital accumulation and stock market liquidity (7 to unlimited members)."
            )
        ),

        // PAGE 51: Corporate Veil: Piercing the Veil of Incorporation
        StudyPage(
            pageNumber = 51,
            module = ModuleCategory.COMPANY,
            title = "Corporate Veil: The Armor and When the Law Tears It Down",
            subtitle = "Salomon's Shield vs. Judicial Piercing for Fraud & Tax Evasion",
            topicDescriptionEnglish = "The 'Corporate Veil' separates the legal personality of the company from its shareholders. However, courts will 'lift' or 'pierce' the veil to look behind the facade when the corporate vehicle is abused for fraud, tax evasion, enemy character, or dodging legal obligations.",
            topicDescriptionHinglish = "Corporate Veil (Kanooni Parda): Salomon case ne company aur uske maalik ke beech ek kanooni parda khada kar diya tha taaki maalik ki personal property bachi rahe. LEKIN agar koi beimaan promoter is parde ka galat istemal karke fraud kare, black money chupaye ya tax evasion kare, to court is parde ko phaad deti hai ('Lifting of Corporate Veil') aur maalik ko pakad kar jail bhejti hai aur uski personal property bechti hai!",
            macroMemoryTrick = "MACRO MNEMONIC: 'P-I-E-R-C-E' -> (P)rotection ends when (I)ntent is fraud, (E)nemy character, (R)evenue/tax evasion, (C)loak of sham, (E)xecutives personally liable.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "Ravana's Ascetic Disguise Torn Asunder by Truth",
                loreOrContext = "Ravana donned the saffron robes and begging bowl of a holy ascetic (a false pious veil) to trick Sita outside the Lakshmana Rekha. Once his unrighteous identity was exposed, the sacred disguise evaporated, revealing the demonic predator.",
                asciiFlowchart = """
[🎭 Saffron Robes & Begging Bowl (False Ascetic Disguise / Veil)]
       │
       ▼ (Pierced by Unrighteous Demonic Intent)
[⚡ False Facade Torn Asunder ──> Predator Exposed in True Form]
       │
       ▼ (Righteous Retribution Rendered Inevitable by Sovereign Truth)
[🏹 Divine Infallible Arrow of Lord Rama Pierces the Heart of Deceit]
                """.trimIndent(),
                lessonQuote = "No pious disguise or legal cloak can permanently conceal fraudulent unrighteousness."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "Grounds for Piercing the Corporate Veil",
                    category = "Legal Doctrine",
                    englishText = "Courts will disregard corporate personality and hold individuals personally liable in recognized situations: (1) Protection of Revenue (tax evasion - Dinshaw Maneckjee Petit case); (2) Prevention of Fraud or improper conduct (Gilford Motor Co v Horne); (3) Determination of Enemy Character during war (Daimler Co Ltd v Continental Tyre & Rubber Co); (4) Sham companies created to evade statutory labor welfare bonus.",
                    hinglishText = "Court kab Corporate Veil ko phaadti hai? (1) Tax chori: Agar sirf tax bachane ke liye fake dummy companies banayi gayi hon; (2) Fraud: Logo ke sath thagi karne ke liye; (3) Yuddh (War) ke samay: Agar company ke peeche dushman desh ke log baithe hon; (4) Sham Company: Agar kanoon se bachne ke liye dikhawe ki company khadi ki ho.",
                    asciiFlowchart = """
[Sham Corporate Shell] <==== ⚡ JUDICIAL HAMMER (Lifting the Veil) ====> [Fraudulent Promoters Personally Jailed & Assets Attached!]
                    """.trimIndent(),
                    microMnemonic = "LIFT-VEIL-FOR-FRAUD",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Unmasking of Demon Maricha Behind the Golden Deer",
                        loreOrContext = "The radiant, jewel-horned deer was merely a deceptive magical illusion. When struck by Rama's piercing arrow, the deer form vanished, revealing the colossal demon Maricha gasping on the earth.",
                        asciiFlowchart = "[Radiant Golden Deer Facade] ──> [Rama's Truth-Arrow Strikes] ──> [Demon Maricha Revealed]",
                        lessonQuote = "The arrow of righteousness effortlessly dissolves deceptive illusions."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Enron, FTX, and Shell Company Scams in Modern Finance",
                        loreOrContext = "When Sam Bankman-Fried used Alameda Research and shell corporate entities to siphon FTX customer deposits, federal bankruptcy courts pierced all corporate shields and sentenced him to 25 years imprisonment.",
                        asciiFlowchart = "[Alameda & FTX Shell Companies] ──> [Bankruptcy Court Pierces Veil] ──> [Promoter Sentenced to Prison]",
                        lessonQuote = "Corporate shields crumble instantly when prosecutors prove intentional fraud."
                    ),
                    caseQuestion = "State the legal consequence when a court decides to 'pierce the corporate veil' of a company.",
                    caseAnswer = "The company and its members are treated as one, and the individuals behind the company are held personally liable for the debts and illegal acts."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 51: The Tax-Shelter Dummies of Sir Dinshaw",
                    scenario = "Mr. Khanna, a billionaire earning ₹10 Crores in stock dividends, formed 4 private dummy companies where he was the 99% shareholder. He transferred his dividend-bearing investments to these 4 companies. The companies did no commercial trade; they simply collected dividends and funneled the cash back to Mr. Khanna as 'pretend loans' to evade income taxes.",
                    question = "Explain whether the tax authorities can pierce the corporate veil of these 4 dummy companies.",
                    marks = 3,
                    stepByStepMarkingScheme = listOf(
                        "Ruling: Yes, the tax authorities and court can legally pierce the corporate veil (1 Mark)",
                        "Cite the legal doctrine: Lifting the Corporate Veil for Protection of Public Revenue (Sir Dinshaw Maneckjee Petit precedent) (1 Mark)",
                        "Explain outcome: The 4 companies are mere facades/cloaks created solely to evade tax liability; the dividend income will be treated as Mr. Khanna's direct personal taxable income (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "The corporate veil shields legitimate enterprise risk, not criminal deceit or tax fraud.",
                "Courts tear down the veil whenever the corporate form is used as a cloak for evasion, fraud, or enemy collaboration."
            )
        ),

        // PAGE 52: Joint Stock Company Master Review & The Grand Forms of Business Matrix
        StudyPage(
            pageNumber = 52,
            module = ModuleCategory.COMPANY,
            title = "Grand Matrix: All Five Forms of Business Organization",
            subtitle = "Sole Prop vs. HUF vs. Partnership vs. Cooperative vs. Joint Stock Company",
            topicDescriptionEnglish = "The definitive, comprehensive academic comparison synthesising all five forms of business organization across nine fundamental legal and commercial parameters. This master matrix represents the pinnacle of CBSE Class 11 Business Studies.",
            topicDescriptionHinglish = "CBSE Class 11 Business Studies ka Mahagranth! Saare 5 forms of business organization (Sole Proprietorship, HUF, Partnership, Cooperative Society, aur Joint Stock Company) ka ek single complete master comparison chart jo har exam me 100% full marks guarantee karta hai!",
            macroMemoryTrick = "MACRO MNEMONIC: '5-FORMS-9-CRITERIA' -> Formation, Members, Capital, Liability, Management, Continuity, Secrecy, Transfer, Motive.",
            ramayanaMasterVisualScene = VisualCharacterExample(
                title = "The Imperial Royal Rajasuya / Coronation Conclave of Ayodhya",
                loreOrContext = "At Lord Rama's supreme coronation, all modes of righteous association converged in harmonious splendor: solitary rishis (sole wisdom), patriarchal royal dynasties (HUF lineage), royal treaty confederates (partnerships), citizen panchayats (cooperatives), and the immortal Kosala crown (the perpetual corporation).",
                asciiFlowchart = """
                   [👑 The Sovereign Imperial Crown of Ayodhya]
                                        │
    ┌──────────────┬────────────────────┼───────────────────┬──────────────┐
    ▼              ▼                    ▼                   ▼              ▼
[Rishi Muni]  [Ikshvaku HUF]    [Sugriva Alliance]    [Guild Coops]  [Immortal Crown]
(Sole Prop)   (Ancestral Blood) (Treaty Partnership)  (Panchayats)   (Joint Stock Co)
                """.trimIndent(),
                lessonQuote = "The golden commonwealth thrives when every station of human association fulfills its appointed dharma."
            ),
            subPoints = listOf(
                SubPointItem(
                    pointTitle = "The Grand 5-Form Comparative Matrix",
                    category = "Master Distinction",
                    englishText = "The 5 forms evaluated across: Formation, Members, Capital, Liability, Control/Management, Continuity, Secrecy, Transfer of Interest, and Governing Statute.",
                    hinglishText = "Saare 5 forms ka complete comparative snapshot: Formation, Members ki sankhya, Capital raising capacity, Liability (Limited vs Unlimited), Management ka haq, Business ki umar/continuity, Secrecy, aur kanooni Act.",
                    asciiFlowchart = """
[CRITERIA]      [SOLE PROP]     [HUF]             [PARTNERSHIP]     [COOPERATIVE]        [JOINT STOCK CO]
1. Statute:     No specific act Hindu Law         1932 Act          1912 Act             Companies Act 2013
2. Min Members: 1               2                 2                 10 Adults            2 (Pvt) / 7 (Pub)
3. Max Members: 1               No Limit          50                No Limit             200 (Pvt) / Unlimited (Pub)
4. Liability:   Unlimited       Karta: Unlimited  All Unlimited     Limited to Shares    Limited to Unpaid Shares
                                Coparcener: Ltd   (Joint & Several)
5. Management:  Proprietor      Karta             All Partners      Managing Committee   Board of Directors
6. Continuity:  Unstable        Perpetual         Fragile           Perpetual            Perpetual (Forever)
7. Capital:     Extremely small Ancestral limited Limited to pool   Modest from members  COLOSSAL (Global Capital)
8. Transfer:    At owner's will Cannot transfer   Unanimous consent Transfer to society  Freely Transferable (Pub)
                    """.trimIndent(),
                    microMnemonic = "GRAND-5-MATRIX",
                    ramayanaLoreExample = VisualCharacterExample(
                        title = "The Evolution of Dharmic Alliances Across the Epic",
                        loreOrContext = "From solitary ascetics in Dandakaranya to the universal alliance at the southern shores, every scale of righteous organization was utilized to vanquish cosmic adharma.",
                        asciiFlowchart = "[Solitary Sage ──> Dynastic House ──> Sovereign Treaty ──> Democratic Host ──> Imperial Crown]",
                        lessonQuote = "Righteous purpose manifests across diverse vehicles according to the magnitude of the task."
                    ),
                    genZExample = VisualCharacterExample(
                        title = "Startup Journey: From Freelancer to Trillion-Dollar Public Tech Giant",
                        loreOrContext = "1 Coder (Sole) -> Adds 2 College Buddies (Partnership) -> Family Angel Funds (HUF/Pvt) -> Open Community Collective (Coop) -> Mega Tech IPO (Public Joint Stock Company).",
                        asciiFlowchart = "[Solo Coder] ──> [Partnership] ──> [Pvt Ltd Venture] ──> [Global Trillion-Dollar IPO]",
                        lessonQuote = "Understand the corporate ladder to pick the exact right entity for each chapter of growth."
                    ),
                    caseQuestion = "Which two forms of business organization provide perpetual succession and limited liability to all their equity members?",
                    caseAnswer = "(1) Joint Stock Company; (2) Cooperative Society."
                )
            ),
            topicCaseStudies = listOf(
                TopicCaseStudy(
                    caseTitle = "Case 52: Comprehensive Form Selection for High-Risk Innovation",
                    scenario = "Three aerospace engineers developed an autonomous drone system for defense surveillance. They require ₹40 Crores initial testing capital, expect multi-year trial cycles with catastrophic crash risks, and plan to raise funds from domestic venture funds and foreign aerospace majors.",
                    question = "Evaluate the five forms of business organization and choose the most suitable one for the engineers. Give three definitive reasons.",
                    marks = 4,
                    stepByStepMarkingScheme = listOf(
                        "Recommendation: Joint Stock Company (specifically a Private Limited Company initially, converting to Public Limited Company later) (1 Mark)",
                        "Reason 1 (Limited Liability): Crucial for high-risk aerospace testing where prototype crashes could result in catastrophic financial damages, protecting founders' private assets (1 Mark)",
                        "Reason 2 (Capital Mobilization): Ability to raise ₹40 Crores from venture capital funds and issue equity shares/convertible notes (1 Mark)",
                        "Reason 3 (Perpetual Succession & Separate Legal Entity): Defense procurement agencies only award high-value sovereign military defense contracts to incorporated corporate entities (1 Mark)"
                    )
                )
            ),
            revisionTakeaways = listOf(
                "Joint Stock Companies stand as the premier institutional vehicle for large-scale, high-risk, capital-intensive global enterprise.",
                "Mastering the Grand 5-Form Matrix guarantees absolute clarity and distinction across the entire CBSE business landscape."
            )
        )
    )
}
