package sorting;

import helper.Helper;

import java.util.Arrays;

public class Quicksort_2 {

	private static int[] a = { 13, 49, 12, 9, 22, 14, 17, 47, 9, 46, 80, 53,
			75, 1, 81, 63, 11, 69, 65, 91 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		Quicksort_2 sort = new Quicksort_2();
		sort.quicksort(0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

	void quicksort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = a[high];

		while (i <= j) {
			while (a[i] < pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i <= j) {
				Helper.swap(a, i, j);
				i++;
				j--;
			}

			if (low < j) {
				quicksort(low, j);
			}
			if (high > i) {
				quicksort(i, high);
			}
		}
	}

}
