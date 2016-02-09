name := "hello-akka"

version := "0.6.1"

scalaVersion := "2.11.6"

lazy val akkaVersion = "2.4.0"

resolvers in ThisBuild ++= Seq("Typesafe Maven Repository" at "http://repo.typesafe.com/typesafe/maven-releases/")

libraryDependencies ++= Seq(
  "org.mongodb.scala" %% "mongo-scala-driver" % "1.1.0",
  "org.reactivemongo" %% "reactivemongo" % "0.11.9",
  "org.mongodb" % "mongodb-driver-async" % "3.2.1",
  "org.mongodb" % "mongodb-driver-core" % "3.0.2",
  "org.mongodb" % "bson" % "2.5.1",
  "com.typesafe.play" % "play_2.11" % "2.3.5",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.novus" %% "salat" % "1.9.9",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "io.reactivex" %% "rxscala" % "0.26.0"
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

