package scala.util.parsing.input

sealed trait LayoutContext
case class  IndentedLayout(depth: Int) extends LayoutContext
case object BracedLayout extends LayoutContext
