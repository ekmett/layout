package scala.util.parsing.input

case class LayoutPosition(underlying: Position, layoutStack: List[LayoutContext], bol: Boolean) extends Position {
  def line: Int = underlying.line
  def column: Int = underlying.column
  protected def lineContents: String = ""
  override def longString: String = underlying.longString
  override def toString: String = underlying.toString
  override def <(that: Position): Boolean = that match { 
    case LayoutPosition(underlying2, _, _) => underlying < underlying2
    case _ => underlying.line < that.line ||
              underlying.line == that.line && underlying.column < that.column
  } 
}

