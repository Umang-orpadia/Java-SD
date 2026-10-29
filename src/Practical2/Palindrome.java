package Practical2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String value = scanner.nextLine().toLowerCase().replaceAll("\\s", "");
		scanner.close();
		StringBuilder sb = new StringBuilder(value);
		String reversed = sb.reverse().toString();
		if(value.equals(reversed)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}
