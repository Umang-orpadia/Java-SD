package Practical2;

public class VowelCount {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		
		int vowelcount = 0;
		String inputString = "Umang";
		System.out.println(inputString);
		
		inputString = inputString.toLowerCase();
		for(int i =0;i<inputString.length();i++) {
			char currentCharacter = inputString.charAt(i);
			if(Character.isLetter(currentCharacter)&&isVowel(currentCharacter)) {
				vowelcount++;
			}
		}
		System.out.println("Vowel Count: "+vowelcount);
	}
	private static boolean isVowel(char c) {
		return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u';
	}
}
