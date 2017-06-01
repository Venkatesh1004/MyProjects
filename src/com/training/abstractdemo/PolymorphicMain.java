package com.training.abstractdemo;

public class PolymorphicMain {

	public void m2() {
		System.out.println("inside m2");
		this.m2();
	}

	public static void main(String[] args) {

		PolymorphicDemo pol = new PolymorphicDemo();
		pol.m1();

	}

}
