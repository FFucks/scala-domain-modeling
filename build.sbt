ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.7"

lazy val root = (project in file("."))
  .settings(
    name := "domain-modeling",
      libraryDependencies ++= Seq(
          "dev.zio" %% "zio" % "2.1.21",
          "org.typelevel" %% "cats-effect" % "3.5.4"
      )
  )
