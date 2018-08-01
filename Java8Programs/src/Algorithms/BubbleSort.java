package Algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };

		int n = input.length;
		System.out.println("Array Length : " + n);
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (input[j - 1] > input[j]) {
					// swap elements
					temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println("Sorted array Using Bubble Sort : ");
		for (int k = 0; k < n; k++) {
			System.out.print(input[k] + ", ");
		}
	}
}