import java.util.Scanner;
public class StringConcatinator {

	public static void main(String[] args)
	{
		System.out.println("Umang 153");
		Scanner sp = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter String to Concatenate(Type 'exit' to stop)");
		while(true) {
			String data = sp.nextLine();
			if(data.equalsIgnoreCase("exit")) {
				break;
			}
			sb.append(data).append(" ");
		}
		System.out.println("Concatenated String = "+sb.toString());
		sp.close();
	}
}
