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
