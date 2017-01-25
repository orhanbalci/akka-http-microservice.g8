name := $project_name$

version := $project_version$

scalaVersion := $scala_version$

resolvers += "akka" at "http://repo.akka.io/snapshots"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4",
	"com.typesafe.akka" %% "akka-http" % "10.0.2",
	"com.typesafe.akka" %% "akka-http-core" % "10.0.2",
    "de.heikoseeberger" %% "akka-http-circe" % "1.11.0", 
    "io.circe" %% "circe-core" % "0.6.1",
    "io.circe" %% "circe-generic" % "0.6.1",
    "io.circe" %% "circe-parser" % "0.6.1"
)

