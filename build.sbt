name := """my-xuggle-sample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.boofcv" % "xuggler" % "0.20",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

resolvers += "xuggle repo" at "http://xuggle.googlecode.com/svn/trunk/repo/share/java/"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

