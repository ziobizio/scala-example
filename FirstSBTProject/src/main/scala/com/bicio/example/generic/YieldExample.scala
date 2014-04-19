package com.bicio.example.generic

class MyFirstYield[T] {

  def filters(collection: Seq[T], filter: (T) => Boolean): List[T] = {
    if (collection.isEmpty) Nil
    else if (filter(collection.head)) collection.head :: filters(collection.tail, filter)
    else filters(collection.tail, filter)
  }

  def scream = {
    for (i <- 0 until 10 if i % 2 == 0) yield i
  }

  def foo =
    for (i <- 0 until 10 if i % 2 == 0) yield i
  foo foreach {
    case i => print("bella: " + s"($i)")
  }

}

object Yield extends App {

  override def main(args: Array[String]) {
    val yielInt = new MyFirstYield[Int]
    val filterInt = yielInt.filters(List(3, 6, 9), x => x % 3 == 0);
    filterInt.foreach(x => print(x))

    yielInt.foo

  }
}