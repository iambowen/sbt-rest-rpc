package iambowen.github.io

import sbt._
import Keys._

object Sbtrestrpc extends AutoPlugin{
  override lazy val buildSettings = Seq(
    commands ++= Seq(
      sample
    )
  )

  lazy val sample = Command.command("sampleCommand") { state =>
    println("Hello SBT World!")
    state
  }
}
