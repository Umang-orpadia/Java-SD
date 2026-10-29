package Practical1;

public class InsertingStringAtPerticularPosition {

	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		String originalString="Hello World";
		int position=6;
		StringBuilder sb=new StringBuilder(originalString);
		sb.insert(position, "Beautiful ");
		System.out.println("Result String: "+sb.toString());
		}
}
