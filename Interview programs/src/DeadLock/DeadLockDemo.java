package DeadLock;

class A {
	public synchronized void d1(B b) {

		System.out.println("Thread t1 starts executon");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}

		System.out.println("calling B classs last() in class A");

		b.last();
	}

	public  void last() {
		System.out.println("A class last()");
	}

}

class B {

	public synchronized void d2(A a) {
		System.out.println("thread t2 starts execution");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		System.out.println("callint A class last() in class B");

		a.last();
	}

	public synchronized void last() {
		System.out.println("B class last()");
	}
}

class MyThread extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {

		this.start();
		a.d1(b);
	}

	public void run() {

		b.d2(a);
	}
}

public class DeadLockDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();

		t.m1();
	}
}
