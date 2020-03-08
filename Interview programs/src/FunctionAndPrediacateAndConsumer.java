import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPrediacateAndConsumer {
	public static void main(String[] args) {

		Function<Student, String> f = s -> {

			int mar = s.getMarks();
			
			 
			String grade = "";

			if (mar > 80) {
				return "a";
			} else if (mar > 70) {

				return "b";
			} else if (mar > 60) {
				return "c";
			} else if (mar > 50) {
				return "d";
			} else if (mar >35){
				return "pass";
			}
			else {
				return " fail'";
			}
		};

		Predicate<Student> p1 = s ->s.getMarks()>=35;
		//Predicate<Student> p2 = s->s.getMarks()<34;
		
		Consumer<Student> c=sc->{
			 System.out.println("Name" +"===" +sc.getName());
			  System.out.println("marks" +"===" +sc.getMarks()); 
			  System.out.println(("grade" +"===" +f.apply(sc)));
			  System.out.println("=== "
			  		+ "======="
			  		+ "=========");
		};

		/*
		 * Student[] s = { (new Student("shiva", 54)),
		 * 
		 * (new Student("shiva", 52)), (new Student("shiva", 65)), (new Student("shiva",
		 * 85)), (new Student("shiva", 75)),
		 * 
		 * };
		 */
		List<Student> s=new ArrayList<Student>();
		  s.add( new Student("shiva", 54));
		  s.add( new Student("shiva", 74));
		  s.add( new Student("shiva", 87));
		  s.add( new Student("shiva", 53));
		  s.add( new Student("shiva", 95));
		  s.add( new Student("shiva", 47));
		  s.add( new Student("shiva", 65));
		  s.add( new Student("shiva", 11)); 
		
		for(Student s1:s) {
			 
			
			if(p1.test(s1)) {
				
				 c.accept(s1);
				 
			}
			 
				
				
			 
			
		}

	}
}
