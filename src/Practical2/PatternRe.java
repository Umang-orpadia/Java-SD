package Practical2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRe {


	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		String patternString = "Umang";
		String inputString = "Hello World Umang";
		
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(inputString);
		System.out.println("Pattern Found at the Following position ~~~~");
		while(matcher.find()) {
			System.out.println("Start index: "+matcher.start()+",End index: "+matcher.end());
		}
	}
}
