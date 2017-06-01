package com.training.abstractdemo;

public class MainClass {
	public static void main(String[] args) {
		FinalizeDemo obj = new FinalizeDemo();
		FinalizeDemo obj1 = new FinalizeDemo();
		obj = null;
		obj1 = null;
		System.gc();
		System.out.println("successfully executed");
	}

}
