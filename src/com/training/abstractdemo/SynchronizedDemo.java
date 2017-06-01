package com.training.abstractdemo;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Object o = new Object();
		Object o1 = new Object();

		Target tr = new Target(new TestSync(o, o1));

		Thread t = new Thread(tr);
		t.start();
		
		Targets trs = new Targets(new TestSync(o,o1));

		Thread t2 = new Thread(trs);
		t2.start();

		UnTarget un = new UnTarget(new TestUnTarget(o, o1));

		Thread t1 = new Thread(un);
		t1.start();

	}

}

class Target implements Runnable {
	TestSync obj;

	Target(TestSync Obj1) {

		obj = Obj1;

	}

	public void run() {
		obj.synchMethod();
		

	}

}

class Targets implements Runnable {
	TestSync obj;

	Targets(TestSync Obj1) {

		obj = Obj1;

	}

	public void run() {
		obj.m2();
		

	}

}

class UnTarget implements Runnable {
	TestUnTarget obj;

	UnTarget(TestUnTarget Obj) {
		obj = Obj;
	}

	@Override
	public void run() {
		obj.additionMethdo();

	}

}

class TestSync {
	int sum = 0;
	Object o;
	Object o1;

	TestSync(Object o2, Object o3) {
		o = o2;
		o1 = o3;
	}

	public void synchMethod() {
		synchronized (o) {
			for (int i = 0; i <= 500; i++) {
				sum = sum + i;
			}

			try {
				o.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the sum is" + Thread.currentThread() + sum);
			sum = 0;

		}
	}

	public void m2() {
		synchronized (o) {
			for (int i = 0; i <= 1000; i++) {
				sum = sum + i;
			}
			try {
				o.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the sum is" + Thread.currentThread() + sum);
			sum = 0;

		}

		/*
		 * synchronized (o1) {
		 * 
		 * }
		 */
	}

}

class TestUnTarget {
	int sum = 0;
	Object o;
	Object o1;

	TestUnTarget(Object o2, Object o3) {
		o = o2;
		o1 = o3;

	}

	public void additionMethdo() {
		synchronized (o) {
			for (int i = 0; i <= 300; i++) {
				sum = sum + i;
			}
			System.out.println("the sum is" + Thread.currentThread() + sum);
			sum = 0;
			o.notifyAll();
			/*
			 * synchronized (o) { for (int i = 0; i <= 500; i++) { sum = sum +
			 * i; } System.out.println("the sum is" + Thread.currentThread() +
			 * sum); sum = 0;
			 * 
			 * 
			 * 
			 * }
			 */
		}
	}
}