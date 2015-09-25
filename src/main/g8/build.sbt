name := "$name$"

version := "$version$"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.0.0",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "io.argonaut" %% "argonaut" % "6.1-M4",
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test"
)

