package Practical1;

public class SplitPara {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		String para = "Hello@World!From?Umang";
		String[] splitedArr= para.split("[!@?]");
		for(int i = 0;i<splitedArr.length;i++) {
			
			System.out.println(splitedArr[i]);
		}
	}
}
