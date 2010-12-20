package scala.util.parsing.input

import java.lang.Character
import java.lang.Integer

trait LayoutToken 
object LayoutToken { 
  case object VSemi extends LayoutToken {
    override def toString = "virtual semicolon"
  }
  case object VBrace extends LayoutToken {
    override def toString = "virtual right brace"
  }
  case class Other(char: Char) extends LayoutToken { 
    override def toString = 
      if (Character.isLetterOrDigit(char) && char < 128)
        "'" + char + "'"
      else if (char == ' ')
        "whitespace" 
      else 
         "'\\" + Integer.toOctalString(char) + "'"
  }
}

