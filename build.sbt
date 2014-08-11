import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

name := "scalaesh"

version := "1.0"

scalaVersion := "2.11.0"

exportJars := true

libraryDependencies ++= Seq (
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.jboss.aesh" % "aesh" % "0.56",
  "org.jboss.aesh" % "aesh-extensions" % "0.56"
)

packageArchetype.java_application

maintainer := "Helio Frota<00hf11@gmail.com>"

packageSummary := "Simple Wrapper for aesh"

packageDescription := """A simple wrapper for aesh and aesh-extensions"""

rpmRelease := "1"

rpmVendor := "EsmerilProgramming"

rpmGroup := Some("Esmeril/Programming")

rpmUrl := Some("http://github.com/EsmerilProgramming")

rpmLicense := Some("Eclipse Public License - v 1.0")

//rpmBrpJavaRepackJars := true
