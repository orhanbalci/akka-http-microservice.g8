name := $project_name$
version := $project_version$
scalaVersion := $scala_version$

resolvers += "akka" at "http://repo.akka.io/snapshots"
libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.4.14",
	"com.typesafe.akka" %% "akka-testkit" % "2.4.14",
	"org.scalatest" %% "scalatest" % "2.2.4"
)

