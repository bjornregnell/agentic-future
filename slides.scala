//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala 3

//  run this command in terminal to create slidesSwedish in target 
//  scala-cli run .

import taggy.*

def and = "\\&"
def nl = "~\\\\{}"

def titleSv = "Vår agentiska framtid?"
def titleEn = "Our agentic Future?"

def wikipediaAI_sv = "https://sv.wikipedia.org/wiki/Artificiell_intelligens"
def wikipediaAI_en = "https://en.wikipedia.org/wiki/Artificial_intelligence"
def bjornHomepage = "https://cs.lth.se/bjorn-regnell/"
def bjornImgPath = "../img/br.jpg"
def sipCommittee = "https://docs.scala-lang.org/sips/process-specification.html#the-sip-committee"
def thisPresentation = "https://github.com/bjornregnell/agentic-future/"

@main def run = 
  slidesSwedish.toPdf(out = "agentic-future-sv")
  slidesEnglish.toPdf(out = "agentic-future-en")

def slidesSwedish = document(titleSv, author = "Björn Regnell"):
  frame("Vem är jag?"):
    image(file = bjornImgPath, width = 0.2)
    itemize:
      p("Björn Regnell, professor i programvarusystem")
      p(s"Institutionen för datavetenskap, LTH, Lunds universitet $bjornHomepage")
      p("Forskning: kravhantering, programvarukvalitet, agentisk programvaruteknik")
      p(s"Undervisning: programmering, kravhantering")
      p(s"Medlem i kommittén för programmeringsspråket Scala: $sipCommittee")

  frame("Tack!"):
    textSize(10,10) 
    itemize:
      p(s"Denna presentation: $thisPresentation")

def slidesEnglish = document(titleEn, author = "Björn Regnell"):
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