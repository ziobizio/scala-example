package com.bicio.example


object FixLenghtString {

	def apply(aString: String): String = aString;
	def unapply(aString: String): Option[String] = {
			if(aString.length() > 0) Some(aString) else None
	}
}


object ObjectExtractorExample extends App {

	override def main(args: Array[String]) {
		val x = FixLenghtString("bella");
		x match { case FixLenghtString(str) => println(str) }
	}
}