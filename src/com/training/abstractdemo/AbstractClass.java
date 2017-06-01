package com.training.abstractdemo;


public abstract class AbstractClass {

	
public abstract void programme();{
		
	}
	public static void main(String args[]) {
		AbstractClass obj= new Practise();
		obj.programme();
		}
	
	}

	class Practise extends AbstractClass{

	public void programme(){
	System.out.println("working on code");
	}
	
	}
	

