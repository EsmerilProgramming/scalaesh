package org.esmerilprogramming.scalaesh

import java.io.File
import java.nio.file._

import org.jboss.aesh.cl._
import org.jboss.aesh.console._
import org.jboss.aesh.console.command._
import org.jboss.aesh.console.command.invocation._
import org.jboss.aesh.console.command.registry._
import org.jboss.aesh.console.settings._
import org.jboss.aesh.extensions.harlem.aesh._
import org.jboss.aesh.extensions.pwd._
import java.io._

import org.jboss.aesh.terminal.{Color, TerminalColor, TerminalString, TestTerminal}


/**
 * simple aesh scala wrapper.
 * author helio frota at gmail dot com.
 */
object ScalaeshApp extends App {

  val pos = new PipedOutputStream();
  val pis = new PipedInputStream(pos);
  val baos = new ByteArrayOutputStream();

  val sb = new SettingsBuilder()
    .terminal(new TestTerminal())
    .inputStream(pis)
    .outputStream(new PrintStream(baos))

  val registry = new AeshCommandRegistryBuilder()
    .command(new Harlem())
    .command(new Pwd())
    .create();

  val aeshConsole = new AeshConsoleBuilder()
    .commandRegistry(registry)
    .settings(sb.create())
    .prompt(new Prompt(new TerminalString("[scalaesh@metal]$ ",
    new TerminalColor(Color.GREEN, Color.DEFAULT, Color.Intensity.BRIGHT))))
    .create();

  aeshConsole.start();

}
