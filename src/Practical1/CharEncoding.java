package Practical1;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CharEncoding {


	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		Scanner sp= new Scanner(System.in);
		System.out.print("\nEnter The Name : ");
		String data=sp.nextLine();
		
		System.out.println("My name is : "+data);
		System.out.println("\n___________________ Encoding ___________________");
		sp.close();
		
		for(int i=0;i<data.length();i++) {
			int codePoint=data.codePointAt(i);
			
			System.out.println("Character:"+data.charAt(i)+"Its Unicode = "+codePoint);
		}
		byte[] utf8Data = data.getBytes(StandardCharsets.UTF_8);
		System.out.println("UTF-8 encoding of String :");
		for(byte b:utf8Data) {
			System.out.println("Byte : "+b);
		}
	}
}
