import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPrediacate {
	public static void main(String[] args) {

		Function<Student, String> f = s -> {

			int mar = s.getMarks();
			
			 
			//String grade = "";

			if (mar >=80) {
				return "a";
			} else if (mar >= 70) {

				return "b";
			} else if (mar > 60) {
				return "c";
			} else if (mar >= 50) {
				return "d";
			} 
			
			
			else {
				return " fail'";
			}
		};

		Predicate<Student> p1= s ->s.getMarks()>=35;
		Predicate<Student> p2=s->s.getMarks()<=34; 

		Student[] s = { (new Student("shiva", 54)),

				(new Student("shiva", 52)), 
				(new Student("shiva", 65)) ,
				(new Student("shiva", 85)),
				(new Student("shiva", 75)),
				(new Student("shiva", 10)),
				(new Student("shiva", 21)),
		};
		
		for(Student s1:s) {
			//System.out.println(s1);
			
			
			  if(p1.test(s1)) {
			  
			  System.out.println("Name" +"===" +s1.getName()); 
			  System.out.println("marks" +"===" +s1.getMarks()); 
			  System.out.println(("grade" +"===" +f.apply(s1)));
			  System.out.println("=== " + "=======" + "=========");
			  
			  }
			 
			if(p2.test(s1)){
					
				 
				  System.out.println("Name" +"===" +s1.getName()); 
				  System.out.println("marks" +"===" +s1.getMarks());
				   System.out.println("fail");
				   System.out.println("=== " + "=======" + "=========");
			}
			
		}

	}
}
