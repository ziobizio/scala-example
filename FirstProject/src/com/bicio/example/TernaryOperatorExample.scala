package com.bicio.example

object TernaryOperatorExample extends App {
 
  override def main(args: Array[String]) {
    val cond = 0;
    val result = iff (cond==0) { "ciao" } { "bella" };
    print(s"$result");
}
  
  def iff[T](cond: => Boolean)(ifTrue: => T)(ifFalse: => T) : T = {
   if(cond) ifTrue else ifFalse;
  }
  
}