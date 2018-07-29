package Java8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorJava8 {

	public static void main(String args[]) {

		List<String> names1 = new ArrayList<String>();
		names1.add("Sushma ");
		names1.add("Arohi ");
		names1.add("Karthi ");

		List<String> names2 = new ArrayList<String>();
		names2.add("Sushma ");
		names2.add("Arohi ");
		names2.add("Karthi ");

		ComparatorJava8 tester = new ComparatorJava8();
		System.out.println("Sort using Java 7 syntax: ");
		Collections.sort(names1);

		System.out.println("my sort " + names1);

		// tester.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("Sort using Java 8 syntax: ");

		tester.sortUsingJava8(names2);
		System.out.println(names2);
	}

	// sort using java 7
	/*
	 * private void sortUsingJava7(List<String> names) { Collections.sort(names, new
	 * Comparator<String>() {
	 * 
	 * @Override public int compare(String s1, String s2) { return s1.compareTo(s2);
	 * } }); }
	 */

	// sort using java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}
}