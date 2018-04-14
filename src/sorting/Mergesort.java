package sorting;

import java.util.Arrays;

public class Mergesort {

	private static int[] a = { 13, 49, 12, 9, 22, 14, 17, 47, 9, 46, 80, 53, 75, 1, 81, 63, 11, 69, 65, 91 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		Mergesort sort = new Mergesort();
		int[] b = sort.mergeSort(a);
		System.out.println(Arrays.toString(b));
	}

	int[] mergeSort(int[] a) {
		if (a.length <= 1) {
			return a;
		}

		int[] firstArray = new int[a.length / 2];
		int[] secondArray = new int[a.length - firstArray.length];

		System.arraycopy(a, 0, firstArray, 0, firstArray.length);
		System.arraycopy(a, firstArray.length, secondArray, 0, secondArray.length);

		mergeSort(firstArray);
		mergeSort(secondArray);

		merge(firstArray, secondArray, a);
		return a;
	}

	private void merge(int[] firstArray, int[] secondArray, int[] a) {
		int indexFirst = 0;
		int indexSecond = 0;
		int indexDest = 0;

		while (indexFirst < firstArray.length && indexSecond < secondArray.length) {
			int f = firstArray[indexFirst];
			int s = secondArray[indexSecond];
			if (f < s) {
				a[indexDest] = firstArray[indexFirst];
				indexDest++;
				indexFirst++;
			} else {
				a[indexDest] = secondArray[indexSecond];
				indexDest++;
				indexSecond++;
			}
		}

		System.arraycopy(firstArray, indexFirst, a, indexDest, firstArray.length - indexFirst);
		System.arraycopy(secondArray, indexSecond, a, indexDest, secondArray.length - indexSecond);

	}

	void mergeSortConstantSpace(int begIndex, int endIndex) {
		if (endIndex - begIndex <= 1) {
			return;
		}

		// split
		int middle = (endIndex - begIndex) / 2;

		mergeSortConstantSpace(begIndex, middle);
		mergeSortConstantSpace(middle + 1, endIndex);

		return;
	}

	private void mergeConstantTime(int begIndex, int middle, int endIndex) {

	}

}
