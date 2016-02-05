name := "$name$"

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.2.5",
  "org.scalaz" %% "scalaz-core" % "7.1.5",
  "io.argonaut" %% "argonaut" % "6.1-M4",
  "org.scalacheck" %% "scalacheck" % "1.13.0" % "test"
)

