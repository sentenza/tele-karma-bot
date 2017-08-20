import Dependencies._


lazy val telekarma: Project =
  project
    .in(file("."))
    .settings(commonSettings)
    .settings(
      name := "TelekarmaBot",
      libraryDependencies ++= Seq(
        library.scalaTest,
        library.telegrambot
      )
    )

// *****************************************************************************
// Library dependencies
// *****************************************************************************

lazy val library =
  new {
    object Version {
      val scalaTest    = "3.0.3"
      val scalamock    = "3.6.0"
      val telegramBot  = "3.0.8"
    }

    val scalaMock       = "org.scalamock"               %% "scalamock-scalatest-support" % Version.scalamock
    val scalaTest       = "org.scalatest"               %% "scalatest"            % Version.scalaTest
    val telegrambot     = "info.mukel"                  %% "telegrambot4s"        % Version.telegramBot
}

// *****************************************************************************
// Settings
// *****************************************************************************

lazy val commonSettings =
  Seq(
    organization := "uk.me.torre",
    organizationName := "Sentenza",
    scalaVersion := "2.12.3",
    version := "0.1.0",
    crossScalaVersions := Seq(scalaVersion.value, "2.11.11"),
    startYear := Some(2017),
    licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    shellPrompt in ThisBuild := { state =>
      val project = Project.extract(state).currentRef.project
      s"[$project]> "
    }
  )
