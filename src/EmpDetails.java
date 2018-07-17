import java.util.*;

public class EmpDetails {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee  emp1 = new Employee("Chintan", 1);
		Employee  emp2 = new Employee("Vaghela", 2);
		
		empList.add(emp1);
		empList.add(emp2);
		
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		Vector<Employee> v = new Vector<Employee>();
		
		v.addAll(0, empList);
		v.add(1, new Employee("Ajay", 3));
		
		System.out.println();
		System.out.println("Vector v BEFORE removing:" + v);
		
		v.remove(1);
		System.out.println();
		System.out.println("Vector v AFTER removing:" + v);
		
		HashMap<Integer, String> empHash = new HashMap<>();
		
		for (Employee employee : empList) {
			
			empHash.put(employee.getId(), employee.getName());
			System.out.println(employee.getName() + " " + employee.getId());
		}
		
		if (empHash.containsKey(2)) {
			
			String val = empHash.get(2);
			
			System.out.println("Value for key 2 is:- " + val);
			
		}
	}
}


















