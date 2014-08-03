/*
 * Copyright 2014 EsmerilProgramming
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.esmerilprogramming.scalaesh

import org.jboss.aesh.console._
import org.jboss.aesh.console.command.registry._
import org.jboss.aesh.console.settings._
import org.jboss.aesh.extensions.harlem.aesh.Harlem
import org.jboss.aesh.extensions.pwd._
import org.jboss.aesh.extensions.mkdir._
import org.jboss.aesh.extensions.rm._
import org.jboss.aesh.extensions.echo._
import org.jboss.aesh.extensions.matrix._
import org.jboss.aesh.extensions.cat._
import org.jboss.aesh.extensions.touch._
import org.jboss.aesh.extensions.cd._
import org.jboss.aesh.extensions.ls._
import org.jboss.aesh.extensions.clear._

import org.jboss.aesh.terminal.{Color, TerminalColor, TerminalString, TestTerminal}


/**
 * simple aesh scala wrapper.
 * @author <a href="mailto:00hf11@gmail.com">Helio Frota</a>
 */
object ScalaeshApp extends App {

  val sb = new SettingsBuilder();
  sb.readInputrc(false);
  sb.logging(true);

  val acr = new AeshCommandRegistryBuilder();
  acr.command(new Pwd());
  acr.command(new Clear());
  acr.command(new Harlem());
  acr.command(new Cat());
  acr.command(new Touch());
  acr.command(new Cd());
  acr.command(new Ls());
  acr.command(new Matrix());
  acr.command(new Mkdir());
  acr.command(new Echo());
  acr.command(new Rm());

  val acb = new AeshConsoleBuilder()
  acb.commandRegistry(acr.create());
  acb.settings(sb.create());
  acb.prompt(new Prompt("[scalaesh@localhost]$ "));
  acb.create().start();

}
