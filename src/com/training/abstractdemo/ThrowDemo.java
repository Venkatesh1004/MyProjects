package com.training.abstractdemo;

public class ThrowDemo {
	
	public static void vote(int age){
		if(age <18){
			throw new ArithmeticException("You are not allowed to vote");
			
				
			}
		else
		{
			System.out.println("you are allowed to vote");
		}
		
	}
	public static void main(String[] args) {
		ThrowDemo.vote(19);
		System.out.println("welcome");
	}
	
}
