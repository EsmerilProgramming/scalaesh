/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aesh

import org.jboss.aesh.console._
import org.jboss.aesh.console.command.registry._
import org.jboss.aesh.console.settings._
import org.jboss.aesh.extensions.cat._
import org.jboss.aesh.extensions.cd._
import org.jboss.aesh.extensions.clear._
import org.jboss.aesh.extensions.echo._
import org.jboss.aesh.extensions.harlem.aesh.Harlem
import org.jboss.aesh.extensions.less.aesh.Less
import org.jboss.aesh.extensions.ls._
import org.jboss.aesh.extensions.matrix._
import org.jboss.aesh.extensions.mkdir._
import org.jboss.aesh.extensions.more.aesh.More
import org.jboss.aesh.extensions.pwd._
import org.jboss.aesh.extensions.rm._
import org.jboss.aesh.extensions.touch._


/**
 * simple aesh scala wrapper.
 * @author <a href="mailto:00hf11@gmail.com">Helio Frota</a>
 */
object ScalaeshApp extends App {

  val sb = new SettingsBuilder();
  sb.readInputrc(false);
  sb.logging(true);

  val acr = new AeshCommandRegistryBuilder();
  acr.commands(classOf[Cd], classOf[Ls], classOf[Mkdir], classOf[Pwd],
    classOf[Rm], classOf[Touch],classOf[Cat], classOf[Clear], classOf[Echo],
    classOf[Less], classOf[More],classOf[Harlem], classOf[Matrix]);

  val acb = new AeshConsoleBuilder()
  acb.commandRegistry(acr.create);
  acb.settings(sb.create);
  acb.prompt(new Prompt("[scalaesh@~]$ "));
  acb.create().start();

}
