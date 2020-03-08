package Multithreading;

import Multithreading.A.MyThread1;

class A {

	synchronized void m1() {
		for (int i = 1; i < 10; i++) {

			String thread_name = Thread.currentThread().getName();
			System.out.println(thread_name);
			System.out.println("=======================");
		}

	}

	class MyThread1 extends Thread {
		A a;

		public MyThread1(A a) {

			this.a = a;
		}

		public void run() {
			a.m1();
		}
	}
}

class MyThread2 extends Thread {
	A a;

	public MyThread2(A a) {

		this.a = a;
	}

	public void run() {
		a.m1();
	}
}

class MyThread3 extends Thread {
	A a;

	public MyThread3(A a) {

		this.a = a;
	}

	public void run() {
		a.m1();
	}
}

class MyThread4 extends Thread {
	A a;

	public MyThread4(A a) {

		this.a = a;
	}

	public void run() {
		a.m1();
	}
}

public class Synchronizedmethod1 {
	public static void main(String[] args) {

		A a = new A();

		MyThread1 mt1 =a.new MyThread1(a);

		MyThread2 mt2 = new MyThread2(a);
		MyThread3 mt3 = new MyThread3(a);
		MyThread4 mt4 = new MyThread4(a);

		mt1.setName("aaaa");
		mt2.setName("bbbbb");
		mt3.setName("ccccc");
		mt4.setName("dddddd");

		mt1.start();
		mt2.start();
		mt3.start();

		mt4.start();

	}

}
