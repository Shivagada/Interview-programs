package Shiva.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List {
	public static void main(String[] args) {
	     
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee(101,25,"shiva",98575487));
		al.add(new Employee(1011,28,"raju",98575487));
		al.add(new Employee(104,34,"nani",98575487));
		al.add(new Employee(103,15,"abhi",98575487));
		al.add(new Employee(105,28,"babu",98575487));
		al.add(new Employee(102,34,"chanti",98575487));
		
		// REVERSE
		System.out.println("========== REVERSE ========");
		  Collections.reverse(al); for(Employee ser:al) System.out.println(ser);
		 
		
		    //trediyiional
		  System.out.println("=============");
		  Collections.sort(al, new Mycomparator());
		  
		  for(Employee ser:al) {
			  System.out.println(ser);
		 
		  }
		/*
		 * L E Collections.sort(al, (o1,o2) ->o1.getName().compareTo(o2.getName()));
		 * for(Employee ser:al) System.out.println(ser);
		 * 
		 */
		  System.out.println("==========");
			  al.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(
			  Employee::getAge)).forEach(System.out::println);
			  System.out.println("===============================");
			  al.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(
			  Employee::getName)).forEach(System.out::println);
			 
	 
}
}