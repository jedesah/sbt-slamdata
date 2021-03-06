package slamdata

import sbt._, Keys._

object CommonDependencies {
  // RC2 conflicts with http4s 0.14.1a, but we're evicting to it anyway
  val argonautVersion       = "6.2-RC2"
  val doobieVersion         = "0.3.0"
  // TODO: Upgrade to `0.15.2a` (or above) once we can figure out a fix for:
  // https://github.com/quasar-analytics/quasar/issues/1852
  // Although this issue will be closed by the current commit that downgrades it,
  // it's still an issue that needs to be considered for anyone attempting to upgrade
  val http4sVersion         = "0.14.1a"
  val monocleVersion        = "1.4.0"
  val refinedVersion        = "0.8.0"
  val scalacheckVersion     = "1.13.4"
  val scalazVersion         = "7.2.9"
  val scalazSpecs2Version   = "0.5.0"
  val scalazStreamVersion   = "0.8.6a"
  val shapelessVersion      = "2.3.1"
  val simulacrumVersion     = "0.10.0"
  val slamdataPredefVersion = "0.0.2"
  val slscVersion           = "0.6"
  val specs2Version         = "3.8.7"

  object argonaut {
    val argonaut            = "io.argonaut"                %% "argonaut"                  % argonautVersion
    val monocle             = "io.argonaut"                %% "argonaut-monocle"          % argonautVersion
    val scalaz              = "io.argonaut"                %% "argonaut-scalaz"           % argonautVersion
  }

  object doobie {
    val core                = "org.tpolecat"               %% "doobie-core"               % doobieVersion
    val h2                  = "org.tpolecat"               %% "doobie-contrib-h2"         % doobieVersion
    val hikari              = "org.tpolecat"               %% "doobie-contrib-hikari"     % doobieVersion
    val postgres            = "org.tpolecat"               %% "doobie-contrib-postgresql" % doobieVersion
    val specs2              = "org.tpolecat"               %% "doobie-contrib-specs2"     % doobieVersion
  }

  object http4s {
    // TODO: Switch to `http4s-argonaut` once http4s can be upgraded (see above)
    val argonaut62          = "org.http4s"                 %% "http4s-argonaut62"         % http4sVersion
    val blazeClient         = "org.http4s"                 %% "http4s-blaze-client"       % http4sVersion
    val blazeServer         = "org.http4s"                 %% "http4s-blaze-server"       % http4sVersion
    val core                = "org.http4s"                 %% "http4s-core"               % http4sVersion
    val dsl                 = "org.http4s"                 %% "http4s-dsl"                % http4sVersion
  }

  object scalacheck {
    val scalacheck          = "org.scalacheck"             %% "scalacheck"                % scalacheckVersion
  }

  object scalaz {
    val concurrent          = "org.scalaz"                 %% "scalaz-concurrent"         % scalazVersion
    val core                = "org.scalaz"                 %% "scalaz-core"               % scalazVersion
    val iteratee            = "org.scalaz"                 %% "scalaz-iteratee"           % scalazVersion
    val scalacheckBinding   = "org.scalaz"                 %% "scalaz-scalacheck-binding" % (scalazVersion + "-scalacheck-1.13")

  }

  object scalazStream {
    val scalazStream        = "org.scalaz.stream"          %% "scalaz-stream"             % scalazStreamVersion
  }

  object shapeless {
    val shapeless           = "com.chuusai"                %% "shapeless"                 % shapelessVersion
  }

  object simulacrum {
    val simulacrum          = "com.github.mpilquist"       %% "simulacrum"                % simulacrumVersion
  }

  object slamdata {
    val predef              = "com.slamdata"               %% "slamdata-predef"           % slamdataPredefVersion
  }

  object specs2 {
    val core                = "org.specs2"                 %% "specs2-core"               % specs2Version
    val scalacheck          = "org.specs2"                 %% "specs2-scalacheck"         % specs2Version
  }

  object monocle {
    val core                = "com.github.julien-truffaut" %% "monocle-core"              % monocleVersion
    val law                 = "com.github.julien-truffaut" %% "monocle-law"               % monocleVersion
    val `macro`             = "com.github.julien-truffaut" %% "monocle-macro"             % monocleVersion

  }

  object refined {
    val refined             = "eu.timepit"                 %% "refined"                   % refinedVersion
    val scalacheck          = "eu.timepit"                 %% "refined-scalacheck"        % refinedVersion
  }

  object typelevel {
    val scalazSpecs2        = "org.typelevel"              %% "scalaz-specs2"             % scalazSpecs2Version
    val shapelessScalacheck = "org.typelevel"              %% "shapeless-scalacheck"      % slscVersion
  }

}
