package com.bicio.example

object UpperBoundTypeExample extends App {

  override def main(args: Array[String]) {
    val myBulb = new Neon with Switchable
    this isOn myBulb
    switchOn(myBulb);
    this isOn myBulb
  }
  
  def switchOn[T <: Switchable](lamp: T) = {
    lamp.switch(true);
  }
  
  def isOn[T <: Bulb](lamp: T) = {
    val isOn = lamp.isOn
    println(s"Lamp is: $isOn");
  }
  
}

trait Bulb {
  def isOn: Boolean
}

trait Switchable {
  def switch(turn: Boolean)
}

class Neon extends Bulb {
  
  var turn = false;
  
  override def isOn: Boolean = turn;
  
  def switch(turn: Boolean) = {
    this.turn = turn;
  }
  
}

