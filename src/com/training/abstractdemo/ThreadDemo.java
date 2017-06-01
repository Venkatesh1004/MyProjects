package com.training.abstractdemo;

public class ThreadDemo {

	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.start();;
		for (int i = 0; i <= 1000; i++) {
			System.out.println("the first thread is:" + i);
		}
	}
}

	class Demo extends Thread {
		public void run() {
			/* System.out.println("inside thread method"); */
			for (int i = 0; i <= 1000; i++) {
				System.out.println("thread 2 started from :" + i);
			}
		}
	}


