import sbt._

class layout(info: ProjectInfo) extends DefaultProject(info) {
  val scalaz = "com.googlecode.scalaz" %% "scalaz-core" % "5.1-SNAPSHOT"
}

