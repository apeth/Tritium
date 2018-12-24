import Dependencies._

lazy val root = (project in file(".")).enablePlugins(PlayScala).
  settings(
    inThisBuild(List(
      organization := "com.andrewpeth",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Tritium",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += guice,
    libraryDependencies ++= Seq(
      "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % "test"),
    coverageExcludedPackages := "<empty>;Reverse.*;router\\.*")
