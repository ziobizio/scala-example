package com.bicio.example

class FunctionExample {

  var fun = new Function[Int, Int] {
    def apply(x:Int): Int = x*2
  }

  def twice(x: Int) = apply(x, fun);
  def apply(x: Int, fx: Int => Int) = fx.apply(x);
}

object Fun extends App {
  
  override def main(args: Array[String]) {
    print(new FunctionExample twice 3);
  }
}