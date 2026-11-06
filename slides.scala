//> using dep "taggy:taggy:1.0.1,url=https://github.com/bjornregnell/taggy/releases/download/v1.0.1/taggy_3-1.0.1.jar"
//> using scala 3

//  run this command in terminal to create slidesSwedish in target 
//  scala-cli run .

import taggy.*

def and = "\\&"
def nl = "~\\\\{}"

def wikipediaAI_sv = "https://sv.wikipedia.org/wiki/Artificiell_intelligens"
def wikipediaAI_en = "https://en.wikipedia.org/wiki/Artificial_intelligence"
def bjornImgPath = "../img/br.jpg"

@main def run = 
  slidesSwedish.toPdf(out = "agentic-future-sv")
  slidesEnglish.toPdf(out = "agentic-future-en")

def slidesSwedish = document("Vår agentiska framtid?", author = "Björn Regnell"):
  frame("Vem är jag?"):
    image(file = bjornImgPath, width = 0.2)
    itemize:
      p("Björn Regnell, professor i programvarusystem")
      p("Institutionen för datavetenskap, LTH, Lunds universitet https://cs.lth.se/bjorn-regnell/")
      p("Forskning: kravhantering, programvarukvalitet")
      p(s"Undervisning: programmering, kravhantering")
      p("Medlem i kommittén för programmeringsspråket Scala: https://docs.scala-lang.org/sips/process-specification.html#the-sip-committee")

  frame("Tack!"):
    textSize(10,10) 
    itemize:
      p(s"Denna presentation: https://github.com/bjornregnell/AI-inside/")

def slidesEnglish = document("Our agentic Future?", author = "Björn Regnell"):
  frame("Who am I?"):
    image(file = bjornImgPath, width = 0.2)
    itemize:
      p("Björn Regnell, professor in Software Engineering")
      p("Department of Computer Science, LTH, Lund University https://cs.lth.se/bjorn-regnell/")
      p("Research: Requirements Engineering, Software Quality")
      p(s"Teaching: Programming, Requirements Engineering")
      p("Member of the committee for the Scala programming language: https://docs.scala-lang.org/sips/process-specification.html#the-sip-committee")

  frame("Thank you!"):
    textSize(10,10)
    itemize:
      p(s"This presentation: https://github.com/bjornregnell/AI-inside/")