package Shiva.Collections;

import java.util.Comparator;

public class Mycomparator implements Comparator<Employee> {

	 

	@Override
	public int compare(Employee emp1, Employee emp2) {
		/*
		 * String s1=emp1.toString(); String s2=emp2.toString();
		 */
		 
		 
		// return s1.compareTo(s2);
		return emp1.getAge()-emp2.getAge();
	}

}
