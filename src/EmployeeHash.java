import java.util.*;

public class EmployeeHash {

	public static void main(String[] args) {
		
		HashMap<Integer, String> empHash = new HashMap<>();
		
		empHash.put(10, "Chintan");
		empHash.put(30, "Ajay");
		empHash.put(20, "Vaghela");
		
		System.out.println("Size of map is:- " + empHash.size());
		
		if (empHash.containsKey(30)) {
			
			String val = empHash.get(30);
			
			System.out.println("Value for key 30 is:- " + val);
			
		}
	}
}
