import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

name := "scalaesh"

version := "0.57-SNAPSHOT"

scalaVersion := "2.11.0"

exportJars := true

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq (
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.jboss.aesh" % "aesh" % "0.57-SNAPSHOT",
  "org.jboss.aesh" % "aesh-extensions" % "0.57-SNAPSHOT"
)

packageArchetype.java_application

maintainer := "aesh team"

packageSummary := "Scala wrapper for aesh"

packageDescription := """Scala wrapper for aesh and aesh-extensions"""

rpmRelease := "1"

rpmVendor := "aesh"

rpmGroup := Some("aeshell/aesh")

rpmUrl := Some("http://github.com/aeshell/scalaesh")

rpmLicense := Some("Apache License, Version 2.0")
