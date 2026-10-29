package mod2;
import java.util.Set;
import java.util.TreeSet;

public class FullSetList {

	public static void main(String[] args) {

		System.out.println("~~~~~~~~~~~~~~~ Umang 153 ~~~~~~~~~~~~~~~~~~~~");
		Set<String> subjectSet1 = new TreeSet<String>();
		subjectSet1.add("C++");
		subjectSet1.add("Java");
		subjectSet1.add("SQL");
		subjectSet1.add("CSS");

		Set<String> subjectSet2 = new TreeSet<String>();
		subjectSet2.add("C");
		subjectSet2.add("Python");
		subjectSet2.add("Java");
		subjectSet2.add("CSS");
		System.out.println("Initial Set 1 (subjectSet1): ");
		for(String subject : subjectSet1) {
			System.out.println(subject);
		}
		subjectSet1.addAll(subjectSet2);
		System.out.println("\nAfter inserting items from subjectSet2 into subjectSet1");
		
		for(String subject : subjectSet1) {
			System.out.println(subject);
		}
		String removeSubject = "Python";
		boolean result = subjectSet1.contains(removeSubject);
		if(result) {
			subjectSet1.remove(removeSubject);
		
			System.out.println("\nAfter removing"+removeSubject+":");
		}else {
			System.out.println("\nItem"+removeSubject+"not found , can't remove.");
		}
		for(String subject : subjectSet1) {
			System.out.println(subject);
		}
		String searchSubject = "Java";
		if(subjectSet1.contains(searchSubject)) {
			System.out.println("\nItem "+searchSubject+" found in the set.");
			
		}else {
			System.out.println("\nItem "+searchSubject+" not foud in the set.");
		}
	}
}
