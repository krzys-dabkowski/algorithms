package sorting;

import java.util.Arrays;

public class HeapSort {

	private static int[] a = { 13, 49, 12, 9, 22, 14, 17, 47, 9, 46, 80, 53,
			75, 1, 81, 63, 11, 69, 65, 91 };

	private static int N;

	void sort(int[] a) {
		heapify(a);
		// put max at the end
		for (int i = N - 1; i >= 0; i--) {
			System.out.println("max element: " + a[0]);
			switchElements(i, 0);
			N--;
			buildMaxHeap(a, 0);
		}

	}

	void heapify(int[] a) {
		for (int i = N / 2; i >= 0; i--) {
			buildMaxHeap(a, i);
		}
	}

	void buildMaxHeap(int[] a, int k) {

		int left = 2 * k;
		int right = 2 * k + 1;
		int max = k;

		if (left < N && a[left] > a[k]) {
			max = left;
		}
		if (right < N && a[right] > a[max]) {
			max = right;
		}

		if (max != k) {
			switchElements(k, max);
			buildMaxHeap(a, max);
		}

	}

	void switchElements(int k, int j) {
		int b = a[k];
		a[k] = a[j];
		a[j] = b;
	}

	public static void main(String[] args) {
		HeapSort sort = new HeapSort();
		N = a.length;
		System.out.println(Arrays.toString(a));
		sort.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
