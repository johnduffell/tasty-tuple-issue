ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(name := "tasty-tuple-issue")

lazy val scala2 = (project in file("scala2"))
  .dependsOn(scala3)
  .settings(
    scalaVersion := "2.13.8",
    scalacOptions += "-Ytasty-reader"
  )

lazy val scala3 = (project in file("scala3"))
  .settings(
    scalaVersion := "3.1.3"
  )
