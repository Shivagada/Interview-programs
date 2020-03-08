package SynBlock;

class AA {

	void m1() {
		System.out.println("before synchronizedBlock");
		System.out.println(Thread.currentThread().getName());

		synchronized (this) {
			for (int i = 1; i < 5; i++) {
				System.out.println("IN SYNCHRONIZED BLOCK");
				System.out.println(Thread.currentThread().getName());
			}

		} // BLOCK

		synchronized (Employee.class) {

			Employee e1 = new Employee(101, "shiva");
			Employee e2 = new Employee(102, "shiva");
			Employee e3 = new Employee(103, "shiva");
			Employee e4 = new Employee(104, "shiva");
			
			System.out.println(e1);	
			System.out.println("emp thread   ==="+Thread.currentThread().getName());
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e4);


		}
	}// M1
}// class

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

public class SnchronizedBolck1 {
	public static void main(String[] args) {

		AA aa = new AA();

		MyThread1 t1 = new MyThread1(aa);
		MyThread2 t2 = new MyThread2(aa);

		MyThread3 t3 = new MyThread3(aa);

		MyThread4 t4 = new MyThread4(aa);

		t1.setName("aaaaaaaaaaa");
		t2.setName("bbbbbbbbbbbbbbbb");
		t3.setName("ccccccccccccccccccccccc");
		t4.setName("ddddddddddddddddddddddddddddddd");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
