name := "$name$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % "0.7.2",
  "org.scalacheck" %% "scalacheck" % "1.13.0" % "test"
)

