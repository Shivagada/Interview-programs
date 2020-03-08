//Sequence of numbers in which 1 appears twice as the first two numbers, 
//and every subsequent number is the sum of two preceding numbers: 1, 1, 2, 3, 5, 8, 13 ... and so on

 
public class FiboonacciSeries {
	
	public static void main(String[] args) {
		int k=0,a=1,b=1;
		
		System.out.println("VALE OFF K===="+a);
		System.out.println("VALE OFF K===="+b);
		while(k<50) {
			k=a+b;
			
			System.out.println("VALE OF K===="+k);
			a=b;
			b=k;
		}
	}

}
