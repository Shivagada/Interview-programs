
public class SwapNumbers {
public static void main(String[] args) {
	
	int a=4;
	int b=5;
	int temp;
	
	temp=a;	//temp=4
	a=b;	//a==5
	b=temp;	//b=4
	System.out.println(a+" = "+b);
	a=a+b;	//a=9
	b=a-b;	//b=4
	a=a-b;	//a=5			
	
	System.out.println(a+" == "+b);
								
							//EXOR METHOD
	a=a^b;	//a=9				1 1->0  0 0 ->0  1 0 ->1 0 1 ->1
	b=a^b;	//b=4
	a=a^b;	//a=5	
	
	System.out.println(a+" === "+b);
}
}
