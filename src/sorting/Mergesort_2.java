package sorting;

import java.util.Arrays;

public class Mergesort_2 {

	private static int[] a = { 13, 49, 12, 9, 22, 14, 17, 47, 9, 46, 80, 53, 75, 1, 81, 63, 11, 69, 65, 91 };
	private static int[] helper = new int[a.length];

	//

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		Mergesort_2 sort = new Mergesort_2();
		sort.mergeSort(0, a.length - 1);
		System.out.println(Arrays.toString(a));
		// int[] c = sort.mergeSortConstantSpace(a, 0, a.length - 1);
	}

	void mergeSort(int beg, int end) {
		if (end - beg < 1) {
			return;
		}
		int middle = (beg + end) / 2;

		mergeSort(0, middle);
		mergeSort(middle + 1, end);

		merge(beg, end, middle);
	}

	void merge(int beg, int end, int middle) {
		System.out.println("merge " + beg + " " + end + " " + middle);
		int arraySize = middle - beg;
		// System.arraycopy(a, beg, helper, beg, end - beg);
		int i = beg;
		int j = middle + 1;
		int counter = beg;
		while (i <= middle - 1 && j <= end) {
			if (helper[i] < helper[j]) {
				a[counter] = helper[i];
				i++;
			} else {
				a[counter] = helper[j];
				j++;
			}
			counter++;
		}
		if (arraySize - counter > 0) {
			if (i < middle) {
				System.arraycopy(helper, i, a, beg + counter, arraySize - counter);
			} else {
				System.arraycopy(helper, j, a, beg + counter, arraySize - counter);
			}
		}
		System.out.println(Arrays.toString(a));

	}
}
