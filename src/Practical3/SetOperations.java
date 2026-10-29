package Practical3;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");

        Set<String> setA = new HashSet<>();
        setA.add("Apple");
        setA.add("Banana");
        setA.add("Orange");
        setA.add("Mango");
        System.out.println("Set A after adding items: " + setA);

        Set<String> setB = new HashSet<>();
        setB.add("Pineapple");
        setB.add("Grapes");
        setB.add("Watermelon");
        System.out.println("Set B before union: " + setB);

        setA.addAll(setB);
        System.out.println("\nSet A after inserting items of Set B :");
        System.out.println(setA);

        String itemToRemove = "Banana";
        boolean isRemoved = setA.remove(itemToRemove);
        System.out.println("\nRemoving '" + itemToRemove + "' from Set A: " + (isRemoved ? "Success" : "Not Found"));
        System.out.println("Set A after removal: " + setA);

        String searchItem1 = "Mango";
        String searchItem2 = "Banana";

        System.out.println("\nSearching for items:");
        if (setA.contains(searchItem1)) {
            System.out.println("'" + searchItem1 + "' is present in the set.");
        } else {
            System.out.println("'" + searchItem1 + "' is NOT present in the set.");
        }

        if (setA.contains(searchItem2)) {
            System.out.println("'" + searchItem2 + "' is present in the set.");
        } else {
            System.out.println("'" + searchItem2 + "' is NOT present in the set.");
        }
    }
}
