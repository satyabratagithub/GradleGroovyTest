package com.groovy


class Greetings{
	void message(def name){
		println "Good Morning $name"
	} 
}

class HelloWorld {
	//private HelloWorld() {}
	static void main(args){
 
//	static String Hello(String str) {
// 
//		println("Hello " + str)
// 
//		return str
//	}
		args=['ab','cd','ef','gh']
		println "hello $args" //$args
	
		for (i in 0..9) {
			println ("Hello $i" )
		}
		def n='satya'
		Greetings greet= new Greetings()
		println greet.message(n);
	   
		
		//println {assert 'B'..'E' == ['B', 'C', 'D', 'E']}
	}
}