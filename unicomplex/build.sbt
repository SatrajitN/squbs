import org.scalastyle.sbt.ScalastylePlugin._
import de.johoop.findbugs4sbt.FindBugs._

name := "unicomplex"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "org.scalatest" %% "scalatest" % "2.1.0" % "test->*",
  "com.typesafe.akka" %% "akka-actor" % "2.3.2",
  "com.typesafe.akka" %% "akka-agent" % "2.3.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.2" % "test",
  "io.spray" % "spray-can" % "1.3.1",
  "io.spray" % "spray-http" % "1.3.1",
  "io.spray" % "spray-routing" % "1.3.1",
  "io.spray" % "spray-testkit" % "1.3.1" % "test",
  "org.zeromq" % "jeromq" % "0.3.3"
)

findbugsSettings

org.scalastyle.sbt.ScalastylePlugin.Settings

(testOptions in Test) += Tests.Argument(TestFrameworks.ScalaTest, "-h", "report/unicomplex")

instrumentSettings

parallelExecution in ScoverageTest := false