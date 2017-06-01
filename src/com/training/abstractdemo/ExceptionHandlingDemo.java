package com.training.abstractdemo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
try{
		try {

	
			int a = 10/0;
			

		} 
		catch(ArithmeticException e){
			System.out.println("cacth arith exception");
		}
		try{
			int b[] = new int[10];
			b[11] = 55;
					
		}
catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println("catch Array Exception");
	
		}
}
catch(Exception e){
	System.out.println("main Exception");
	
}
	}
}

