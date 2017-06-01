package com.training.abstractdemo;

public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("inside main thread");
		Thread t1 = new Thread(new ThreadDem());
		t1.start();
		t1.setName("First Thread");
		t1.join();

		Thread t2 = new Thread(new ThreadDem());
		t2.start();
		t2.setName("Second Thread");
		t2.join();

		for (int i = 0; i <= 300; i++) {
			System.out.println("inside main thread" + i);
		}

	}
}

class ThreadDem implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i <= 500; i++) {
			System.out.println("inside run thread:" + Thread.currentThread() + i);
		}

	}

}
