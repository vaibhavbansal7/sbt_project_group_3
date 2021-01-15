name := "vaibhav_sbt_project"
version := "1.0"
scalaVersion := "2.12.12"

lazy val persistance = project.in(file("persistance")).settings(
    libraryDependencies ++= Seq("com.typesafe.slick" %% "slick" % "3.3.3",
                "mysql" % "mysql-connector-java" % "8.0.22",
                "org.scalatest" % "scalatest_2.12" % "3.2.1" % Test,
                "com.h2database" % "h2" % "1.4.200" % Test,
                "org.mockito" % "mockito-scala_2.12" % "1.16.15" % Test
     )
)

lazy val http = project.in(file("http")).settings(
    libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-http" % "10.2.2",
                "com.typesafe.akka" %% "akka-actor" % "2.6.10",
                "com.typesafe.akka" %% "akka-stream" % "2.6.10",
                "com.typesafe.akka" %% "akka-http-testkit" % "10.2.2" % Test,
                "com.typesafe.akka" %% "akka-actor-testkit-typed" % "2.6.10" % Test,
                "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.10" % Test
    )
)

lazy val root = project.in(file(".")).aggregate(persistance, http)
