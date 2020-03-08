package Multithreading;





  class Display{
		
		synchronized void m1() {
			
			for(int i=0;i<10;i++) 
			{
				
				System.out.println("good morning::::" );
				
				try {
					Thread.sleep(2000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				}
			
			}
		
  }
	
	  class MyThread extends Thread{
		
		
		Display d;
		
		String name;
		public MyThread(Display d, String name) {
			 
			this.d = d;
			this.name = name;
		}

	 
	
	public void run() {
		d.m1();
		System.out.println(name);

	}
		
	}


public class Sysnchronizedmethod2 {
 
	public static void main(String[] args) {
		
		Display d=new Display();
  		
		MyThread t1=new MyThread(d, "shiva");
		MyThread t2=new MyThread(d, "shivbbbbbbbbbbbbbb");
		MyThread t3=new MyThread(d, "shivaccccccccccccccccccccc");

		t1.start();
		t2.start();
		t3.start();
		
	 	}
}