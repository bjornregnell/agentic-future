//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala 3

//  run this command in terminal to create slidesSwedish in target 
//  scala-cli run .

import taggy.*

def outSv = "agentic-future-sv"
def outEn = "agentic-future-en"

def and = "\\&"
def nl = "~\\\\{}"

def titleSv = "Vår agentiska framtid?"
def titleEn = "Our agentic Future?"
def author = "Björn Regnell"

def wikipediaAI_sv = "https://sv.wikipedia.org/wiki/Artificiell_intelligens"
def wikipediaAI_en = "https://en.wikipedia.org/wiki/Artificial_intelligence"
def bjornHomepage = "https://cs.lth.se/bjorn-regnell/"
def bjornImgPath = "../img/br.jpg"
def sipCommittee = "https://docs.scala-lang.org/sips/process-specification.html#the-sip-committee"
def thisPresentation = "https://github.com/bjornregnell/agentic-future/"

@main def run = 
  slidesSwedish.toPdf(out = outSv)
  slidesEnglish.toPdf(out = outEn)

def slidesSwedish = document(titleSv, author = author):
  frame("Vem är jag?"):
    image(file = bjornImgPath, width = 0.2)
    itemize:
      p("Björn Regnell, professor i programvarusystem")
      p(s"Institutionen för datavetenskap, LTH, Lunds universitet $bjornHomepage")
      p("Forskning: kravhantering, programvarukvalitet, agentisk programvaruteknik")
      p(s"Undervisning: programmering, kravhantering")
      p(s"Medlem i kommittén för programmeringsspråket Scala: $sipCommittee")

  frame("Agenda"):
    itemize:
      p(s"Vad är en agent?")
      p(s"Vad innebär agentisk programvaruteknik?")
      p(s"Hur påverkas systemutvecklares arbetsuppgifter?")
      p(s"Hur påverkas arbetsmarknaden för systemutvecklare?")

  frame("Vad är en agent?"):
    p(s"En agent består av 3 delar: *modell+loop+rigg*")
    itemize:
      p(s"**Språkmodell**: `String => String` \\hfill{\\emph{t.ex. Opus}}")
      p(s"**Beslutsmodell**: `String => enum` \\hfill{\\emph{t.ex. Jev}}")
      p(s"**Agentloop**: agerar i verkliga världen för att uppnå mål")
      itemize:
        p("Prompt och kontexthantering: mål som ska uppfyllas")
        p("Tools: verktyg så agenten t.ex. kan editera och köra kod")
        p("Skills: förmågor genom specifika instruktioner")
        p("Loop: använd verktyg+förmågor för att *stegvis* uppnå målen")
      p(s"**Agentrigg**: säkerhetsåtgärder för att tygla agenter")
      itemize:
        p("övervakar och intervenerar vid riskfylld verktygsanvändning")
        p(s"kan avbryta loopen och be människan om lov $nl (kan ge konfirmeringströtthet)")
      p("*Exempel:*")
        itemize:
          p(s"https://claude.com/product/claude-code")
          p(s"https://openai.com/codex/")
          p(s"https://OpenCode.ai")
          p(s"https://Pi.dev")
          p(s"https://typesafe.ai/")

  frame("Vad innebär agentisk programvaruteknik?"):
    itemize:
      p(s"Ingen människa i loopen? *''vajbkodning''*")
      itemize:
        p("Ge en prompt som beskriver en hel app")
        p("Vänta tills agenterna är färdiga och kolla aldrig på koden")
        p("Exempel: https://lovable.dev/")
      p(s"Människor i loopen? *''Agentic Software Engineering (ASE)''*")
      itemize:
        p("En utvecklingsprocess där människa och agenter samverkar för ökad produktivitet och hållbar kvalitet över tid")
        p("Alla delar av programvaruutveckllingsprocessen påverkas")
        itemize:
          p("Kravhantering (mål, avsikten med produkten, *eng.* **intent**)")
          p("Design (arkitektur, teknikval)")
          p("Implementation (manuell kodning + agentisk kodgenerering)")
          p("Verifiering (granskningar, enhetstest, systemtest)")
          p("Validering (utvärdering mot kraven, *''evals''* kollar framgång)")
          p("Leverans (*continuous integration,continuous delivery*)")
          p("Drift (uppskalning, utskalning med hjälp av molninfrastruktur)")

  frame("Hur påverkas systemutvecklares arbetsuppgifter?"):
    itemize:
      p(s"Mer fokus på:$nl mål, krav, domänkunskap, arkitekturbeslut, framgångskriterier, uppföljning, granskning, hållbar kodbas$nl (snarare än själva programmeringen)")
      p(s"Entreprenörer och erfarna utvecklare gynnas (?)$nl De som gillar att skapa värde med kod blir kanske glada...")
      p(s"Kodkonstnärer och juniora utvecklare missgynnas (?)$nl De som gillar att vara kreativa och själv programmera vacker kod blir kanske ledsna...")
      p("Hundratals agenter igång över natten: stress och press att använda alla tokens till något vettigt, stress och press från chefer att leverera fler features")

  frame("Hur påverkas arbetsmarknaden för systemutvecklare?"):
    itemize:
      p(s"Vad händer om priset på kodning sjunker drastiskt?")

  frame("Är AI en bubbla?"):
    p("Jämför järnvägspaniken 1873 och dot-com-bubblan 1997.")
    p("Vad händer om AI-företagens aktier kraschar?")

  frame("ETSN15 Kravhantering"):
    p("Läs denna kurs och bli attraktiv på framtida arbetsmarknaden!")
    itemize:
      p("Ges valfri i åk 4, lp 3, 7.5 hp på A-nivå")
      p("Förkunskaper: en projektkurs inom programvaruutveckling, t.ex. EDAF45 pvg | ETSN05 puss")
      p("Valfri för C4-adv, C4-pvs, D4-se, E4, F4, F4-pv, I4, I4-pvs")
      p("Innehåll:"); itemize:
        p("Olika sorters krav och krav på olika nivåer")
        p("Olika metoder och tekniker för identifiering, specificering, validering, prioritering av krav")
        p(s"Kravhantering i agentisk utveckling; AI för krav; krav på AI")
        p("Praktiskt projekt")
      p("https://lunduniversity.github.io/krav/")
      p("https://kurser.lth.se/kursplaner/senaste/ETSN15.html")
      p("https://reqt.github.io/")
      p("https://genscalator.ai/")

  frame("Tack!"):
    textSize(10,10) 
    itemize:
      p(s"Denna presentation: $thisPresentation")

def slidesEnglish = document(titleEn, author = author):
  frame("Who am I?"):
    image(file = bjornImgPath, width = 0.2)
    itemize:
      p("Björn Regnell, professor in Software Engineering")
      p(s"Department of Computer Science, LTH, Lund University $bjornHomepage")
      p("Research: Requirements Engineering, Software Quality, Agentic Software Engineering")
      p(s"Teaching: Programming, Requirements Engineering")
      p(s"Member of the committee for the Scala programming language: $sipCommittee")

  frame("Thank you!"):
    textSize(10,10)
    itemize:
      p(s"This presentation: $thisPresentation")