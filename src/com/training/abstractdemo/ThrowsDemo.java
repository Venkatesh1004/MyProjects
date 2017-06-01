package com.training.abstractdemo;

public class ThrowsDemo {
	
	public void method() throws ArithmeticException{
		
		throw new ArithmeticException("device error");
		
	}
}
class TestThrow{
	public static void main(String[] args) {
		
		ThrowsDemo obj = new ThrowsDemo();
		obj.method();
			
		
	}
}

	 
