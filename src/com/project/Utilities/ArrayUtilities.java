package com.project.Utilities;

public class ArrayUtilities {

	public int[] getReversedarray(int[] array) {
		int length = array.length;
		int[] outputArray = new int[length];

		for (int i = length - 1; i >= 0; i--) {
			outputArray[(length - 1) - (i)] = array[i];

		}

		return outputArray;
	}

	public int getSumOfArray(int[] array) {
		int sum = 0;
		int length = array.length;

		// for (int i = 0; i <length; i++) {
		// sum += array[i];
		// sum = sum + array[i];
		// }

		for (int k : array) {
			sum = sum + k;
		}
		return sum;
	}

	public boolean printValue(int[] array, int value) {

		boolean isExists = false;
		for (int k : array) {
			if (value == k) {
				isExists = true;
			}

		}
		return isExists;
	}

	public int findIndex(int[] array, int value) {
		int l = array.length;

		for (int i = 0; i < l; i++) {
			if (value == array[i]) {
				return i;
			}

		}
		return -1;
	}

}
