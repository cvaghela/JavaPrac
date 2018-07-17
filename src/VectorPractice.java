import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		
		Vector<Employee> empVector = new Vector<>();
		
		Employee  emp1 = new Employee("Chintan", 1);
		Employee  emp2 = new Employee("Vaghela", 2);
		
		empVector.add(0, emp2);
		empVector.add(1, emp1);
		
		System.out.println("PRINTING empVector");
		System.out.println(empVector);
		System.out.println();
		System.out.println("PRINTING FOREACH: empVector");
		
		for (Employee employee : empVector) {
			System.out.println(employee);
		}
		
		Vector<Comparable> v = new Vector<Comparable>();
		
		v.add("Chintan");
		v.add(1);
		v.add("Vaghela");
		v.add(2);
		v.add(2.003);
		v.add(true);
		
		System.out.println();
		System.out.println("PRINTING Vector 'v' of size " + v.size() + " elements.");
		System.out.println(v);
		
		if ((Boolean) v.get(5)) {
			
			System.out.println();
			System.out.println("The 6th element in vector v is a boolean Value");
		}

	}

}
