package Shiva.Collections;

import Shiva.Collections.AA.MyThread1;
import Shiva.Collections.AA.MyThread2;
import Shiva.Collections.AA.MyThread3;
import Shiva.Collections.AA.MyThread4;

class AA {

	void m1() {
		System.out.println("before synchronizedBlock");
		System.out.println(Thread.currentThread().getClass());

		synchronized (this) {
			for (int i = 1; i < 5; i++) {
				System.out.println("IN SYNCHRONIZED BLOCK");
			}

		} // BLOCK
	}// M1

	class MyThread4 extends Thread {
		AA aa;

		public MyThread4(AA aa) {

			this.aa = aa;
		}

		public void run() {

			aa.m1();

		}

	}

	class MyThread1 extends Thread {
		AA aa;

		public MyThread1(AA aa) {

			this.aa = aa;
		}

		public void run() {

			aa.m1();

		}

	}

	class MyThread2 extends Thread {
		AA aa;

		public MyThread2(AA aa) {

			this.aa = aa;
		}

		public void run() {

			aa.m1();

		}

	}

	class MyThread3 extends Thread {
		AA aa;

		public MyThread3(AA aa) {

			this.aa = aa;
		}

		public void run() {

			aa.m1();

		}

	}
}

 public class SnchronizedBolck1 {
 AA aa=new AA();
 
 MyThread1 t1=aa.new MyThread1(aa);
 MyThread2 t2=aa.new MyThread2(aa);
 MyThread3 t3=aa.new MyThread3(aa);
 MyThread4 t4= aa.new MyThread4(aa);
  
 
}
