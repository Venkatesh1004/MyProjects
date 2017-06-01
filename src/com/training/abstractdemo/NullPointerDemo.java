package com.training.abstractdemo;

public class NullPointerDemo {

	public static void main(String[] args) {
		String s  = null;
		try{
		System.out.println(s.equals(1));
		}
		catch(NullPointerException e){
			System.out.println("Exception is handled");
		}
		finally{
			System.out.println("this block will always execute");
		}
		System.out.println("normal flow of code");
	}
}
