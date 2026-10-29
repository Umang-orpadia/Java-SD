package Practical1;
import java.util.Arrays;
import java.util.Objects;

public class RemoveNullValuesFromArray {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		String[] originalArray = {"Apple", null, "Banana", null,"Orange", "Grapes", null};
		System.out.println("Array before removing nulls: ");
		for (String element : originalArray) {
		System.out.println(element);
		}
		// Stream pipeline: Filters out nulls and converts back to a String array	
		String[] notNullArray = (String[])Arrays.stream(originalArray).filter(Objects::nonNull).toArray(String[]::new);

		System.out.println("\nArray after removing nulls: ");
		for (String element : notNullArray) {
			System.out.println(element);
		}
}
}