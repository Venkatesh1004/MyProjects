package com.training.abstractdemo;

public class ExceptionPropogationDemo {

	public static void m1() {
		int a = 10 / 0;
        System.out.println("inside m1");
	}
	public static void m2() throws ArithmeticException{
		System.out.println("inside m2");
		m1();
		/*try{
		m1();
		}
		catch(Exception e){
			System.out.println("Exception caught");
		}*/
	}
	
	public static void main(String[] args) throws ArithmeticException
	{
		ExceptionPropogationDemo.m2();
		System.out.println("normal flow of the program");
	}

}
