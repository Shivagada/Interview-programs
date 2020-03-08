import java.util.Scanner;

public class PrimeNnmber {

	public static void main(String[] args) {

		System.out.println("enter num");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp = 0;
		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				temp = temp + 1;

			}
		}
		if (temp == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		s.close();

	}

}
