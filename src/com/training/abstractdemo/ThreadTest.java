package com.training.abstractdemo;

public class ThreadTest {

	public static void main(String[] args) throws Exception {
		FirstThread first = new FirstThread(new Test());
		Thread t = new Thread(first);
		t.start();

		Thread t1 = new Thread(first);
		t1.start();

	}

}

class FirstThread implements Runnable {
	Test obj;

	FirstThread(Test obj1) {
		obj = obj1;

	}

	@Override
	public void run() {
		obj.addMethod();
	}

}

class SecondThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

class Test {
	int sum = 0;

	public void addMethod() {

		for (int i = 1; i <= 5000; i++) {
			sum = sum + i;
		}

		System.out.println("the sum of the first 10 numbers is:" + sum);
        sum =0;
	}
}
