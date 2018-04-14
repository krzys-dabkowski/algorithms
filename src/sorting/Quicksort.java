package sorting;

import java.util.Arrays;

public class Quicksort {
	private static int[] a = { 13, 49, 12, 9, 22, 14, 17, 47, 9, 46, 80, 53, 75, 1, 81, 63, 11, 69, 65, 91 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		Quicksort sort = new Quicksort();
		sort.sort();
		System.out.println(Arrays.toString(a));
	}

	void sort() {
		quicksort(0, a.length - 1);
	}

	void quicksort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = high;// (low + high) / 2;
		int firsthigh = low;

		while (i < j) {
			while (a[i] < a[pivot]) {
				i++;
			}
			while (a[j] > a[pivot]) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quicksort(low, j);
		}
		if (high > i) {
			quicksort(i, high);
		}
	}

	void swap(int k, int j) {
		int temp = a[k];
		a[k] = a[j];
		a[j] = temp;
	}
}
