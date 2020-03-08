
public class ReverseStringWithOutAPI {

	public static void main(String[] args) {
		String org="Shiva"; 
		String rev = "";
		StringBuffer sb= new StringBuffer("Shivag"); //with Api
		for(int i=org.length()-1;i>=0;i--) {
			
			rev=rev+org.charAt(i);					// with out Api
		}
		System.out.println(rev);
		System.out.println(sb.reverse().toString());
	}
}
