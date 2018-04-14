package testout;

import helper.Helper;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		Helper.swap(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

}
