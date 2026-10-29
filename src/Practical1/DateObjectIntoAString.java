package Practical1;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateObjectIntoAString {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		Date currentDate=new Date(); 
		SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy"); 
		String formatedDate = formatter.format(currentDate); 
		System.out.println("Current Date: "+currentDate); 
		System.out.println("Formatted Date: "+formatedDate);
	}
}
