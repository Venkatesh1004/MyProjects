package com.training.abstractdemo;

public class StaticTest {

	int x = 10;
	static int y = 5;

	public static void main(String[] args) {
		StaticTest obj = new StaticTest();
		obj.method1();

	}

	public void method1() {
		System.out.println("inside non static method");
		System.out.println(y); //calling static variable from non static method//
		StaticTest obj1 = new StaticTest();
		obj1.method2(); //calling static method from non static method vice-versa is not possible//
	}

	public static void method2() {
		System.out.println("inside static method");
		StaticTest.method4(); //calling static method from static method with class name//

	}

	public static void method4() {
		System.out.println("inside method4");
		/* System.out.println(x); */  //calling non static variables from static method is not possible//
	}
}
