package arrays;

public class ReplaceElementsWithGreatestOnRightSide7 {

	public static void main(String[] args) {
		int[] arr = { 17, 18, 5, 4, 6, 1 };

		ReplaceElementsWithGreatestOnRightSide7 obj = new ReplaceElementsWithGreatestOnRightSide7();
		ArrayUtils.printArray(obj.replaceElements(arr));

	}

	public int[] replaceElements(int[] arr) {

		int max = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] > max) {
				int temp = arr[i];
				arr[i] = max;
				max = temp;
			} else {
				arr[i] = max;
			}
		}

		return arr;
	}

	public int[] replaceElementsBruteForce(int[] arr) {
		if (arr == null) {
			return arr;
		}

		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				arr[i] = -1;
				return arr;
			}

			int highest = findHighestNumInArrayFromIndex(arr, i + 1);
			arr[i] = highest;
		}

		return arr;
	}

	private int findHighestNumInArrayFromIndex(int arr[], int pos) {
		int highest = Integer.MIN_VALUE;
		for (int i = pos; i < arr.length; i++) {
			if (arr[i] > highest) {
				highest = arr[i];
			}
		}
		return highest;
	}

}
