package Java8;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortListJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> out = new HashMap<>();
		out.put("asia", 100);
		out.put("antarctica", 50);
		out.put("africa", 400);
		out.put("north america", 300);

		System.out.println(out);

		Map<String, Integer> out1 = new TreeMap<>(out);

		System.out.println(out1);
		for (Map.Entry<String, Integer> s : out.entrySet()) {

		}

		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(out.entrySet());

		/*
		 * Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() { public
		 * int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		 * return (o1.getValue()).compareTo(o2.getValue()); } });
		 */

		// Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

		// Collections.sort(list, (s1, s2) -> (s1.getValue()).compareTo(s2.getValue()));
		list.sort((s1, s2) -> (s1.getValue()).compareTo(s2.getValue()));
		list.forEach((s1) -> System.out.println("Value " + s1.getValue()));
		// list.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v)); not
		// workg
		System.out.println(list);
	}

}
