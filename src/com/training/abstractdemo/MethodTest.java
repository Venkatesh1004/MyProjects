package com.training.abstractdemo;

public class MethodTest{
	public static void main(String[] args) {

		System.out.println("inside main method");
		
		MethodTest mt = new MethodTest();
		mt.method();
		mt.add();
		mt.multiplication(4, 5);
		String s = mt.name("Ramya");
		System.out.println("The name of the programmer is :" + s);
		

	}
   // method with void//
	void method() {
		System.out.println("inside void method");

	}
   //method with int return type and no parameter//
	public int add() {
		int x = 10;
		int y=15;
	
	    System.out.println("inside int method");
	    return x+y;
	}
	
	//method with boolean return type and parameter//
	public boolean multiplication(int a, int b){
		System.out.println("inside boolean method");
		return true;
		
	}
	
	//method with String return type and storing the return value in main method//
	public String name(String a){
		System.out.println("inside method string ");
		return "Ramya";
		
	}

}
