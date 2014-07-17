/*
 * Sonar Scalastyle Plugin
 * Copyright (C) 2014 All contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.ncredinburgh.sonar.scalastyle

import com.ncredinburgh.sonar.scalastyle.core.ScalaLanguage
import org.scalatest.{Matchers, FlatSpec}

import scala.collection.JavaConverters._

/**
 * Created by hc185053 on 12/06/2014.
 */
class ScalastylePluginSpec  extends FlatSpec with Matchers {

  val testee = new ScalastylePlugin

  "a scalastyle plugin" should "provide a scalastyle sensor" in {
    assert (testee.getExtensions.asScala.exists(_ == classOf[ScalastyleSensor]))
  }

  it should "provide a scalastyle repository" in {
    assert (testee.getExtensions.asScala.exists(_ == classOf[ScalastyleRepository]))
  }

  it should "provide a scala language" in {
    assert (testee.getExtensions.asScala.exists(_ == classOf[ScalaLanguage]))
  }
}