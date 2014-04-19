package com.bicio.example.spark

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.util.Vector

object SparkQuickStart extends App {

  override def main(args: Array[String]) {
    val sc = new SparkContext(
      "local",
      "Simple App",
      "/Users/Ziobizio/Documents/spark",
      List("target/scala-2.10/first-sbt-project_2.10-1.0.jar")
      )
   
    val list = List(2);
    
  
    
    
    val file = sc.textFile("/Users/Ziobizio/list.txt", 2).cache();
    
    val wordCount = file.flatMap(line => line.split("/")).map(x => (x,1)).reduceByKey(_+_).collect();
    
    val start = System.currentTimeMillis()
    
    val parall = sc.parallelize(file.filter(line => line.length()>5).collect)
    
    //val parall = file.filter(line => line.length()>5).collect
    
    parall.reduce((x,y) => if (x.length() > y.length()) x else y)
    val stop =  System.currentTimeMillis()
    print(stop-start);
  }

}