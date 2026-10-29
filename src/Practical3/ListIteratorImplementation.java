package Practical3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorImplementation {

		public static void main(String[] args) {
			System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
			List<String> theList = new ArrayList<String>();
			theList.add("Apple");
			theList.add("Banana");
			theList.add("Orange");
			theList.add("Pineapple");
			theList.add("Grapes");
			System.out.println("List of items");
			ListIterator<String> iterator = theList.listIterator();
			while(iterator.hasNext()) {
				System.out.print(iterator.next()+" ");
			}
			System.out.println("\n\nReversing the List");
			while(iterator.hasPrevious()) {
				System.out.print(iterator.previous()+" ");
			}
			
		}

}
