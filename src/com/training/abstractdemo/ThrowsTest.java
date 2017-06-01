package com.training.abstractdemo;

import java.io.IOException;

public class ThrowsTest {

	public void method1() throws IOException{
		throw new IOException("throws IO Exception");
	}
public static void main(String[] args) throws IOException {
	ThrowsTest obj = new ThrowsTest();
	obj.method1();
	System.out.println("rest of the code");
	}
	

}

