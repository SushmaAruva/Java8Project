package Palindrome;

import java.util.TreeSet;

public class Smallest {

	public static void main(String[] args) {

		String input = "233255345123234434";

		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1)) {
				tree.add(Integer.parseInt(input.substring(i, i + 2)));
			}
		}
		System.out.println("Smallest palindrome in " + input + " is : " + tree.first());
		System.out.println("Treeset values : " + tree);
	}
}
