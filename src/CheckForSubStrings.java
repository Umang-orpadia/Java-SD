
public class CheckForSubStrings {

	public static void main(String[] args) {
		String greeting = "Umang 153";
	
		System.out.println("Original String : "+greeting);
		String str1 = "Umang 153";

		String str2 = "Umang";
		
		if (str1.contains(str2)) {
			System.out.println("Using  Contains() : String 1 Contains String 2");
		}else {
			System.out.println("Using  Contains() : String 1 Does not Contains String 2");
		}
	}
}
