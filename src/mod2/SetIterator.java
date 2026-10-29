package mod2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SetIterator {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		Set<String> itemSet = new HashSet<>();
		itemSet.add("Appple");
		itemSet.add("Banana");
		itemSet.add("Orange");
		itemSet.add("Mango");
		itemSet.add("Grapes");
		System.out.println("Elements in the Set(unordered):");
		Iterator<String> iterator = itemSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
		}
		System.out.println("\n\nElements in Reverse Direction : ");
		List<String> itemList = new ArrayList<>(itemSet);
		Collections.reverse(itemList);
		
		Iterator<String> reverseIterator = itemList.iterator();
		while(reverseIterator.hasNext()) {
			System.out.println(reverseIterator.next()+" ");
		}
	}
}
