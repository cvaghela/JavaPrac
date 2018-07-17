import java.util.*;

public class GenericsWildCards {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(2, 3, 4);
		
		System.out.println("Total sum of intList is: " + (int)sum(intList));
		System.out.println();
		
		List<Double> doubleList = Arrays.asList(2.4, 3.3, 4.2);
		
		System.out.println("Total sum of doubleList is: " + sum(doubleList));
		System.out.println();
		
		List<Float> floatList = Arrays.asList(2.4f, 3.3f, 4.2f);
		
		System.out.println("Total sum of floatList is: " + sum(floatList));
	}

	private static double sum(List<? extends Number> List) {
		
		double sum = 0.0;
		for (Number i: List) {
			sum += i.doubleValue();
		}
		return sum;
	}
}
