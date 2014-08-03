import com.typesafe.sbt.SbtNativePackager._
import NativePackagerKeys._

name := "scalaesh"

version := "1.0"

scalaVersion := "2.10.3"

exportJars := true

libraryDependencies ++= Seq (
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
  "org.jboss.aesh" % "aesh" % "0.56",
  "org.jboss.aesh" % "aesh-extensions" % "0.56"
)

packageArchetype.java_application
