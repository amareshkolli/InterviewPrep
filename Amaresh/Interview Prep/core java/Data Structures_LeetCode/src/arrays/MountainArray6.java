package arrays;

public class MountainArray6 {

	public static void main(String[] args) {
		 int[] arr = { 1, 2, 7, 5, 3 };
//		 int[] arr = { 3, 5, 5 };
//		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		MountainArray6 obj = new MountainArray6();
		System.out.println(obj.validMountainArray(arr));
	}

	public boolean validMountainArray(int[] arr) {

		if (arr == null || arr.length < 3) {
			return false;
		}

		int i = 0;
		int j = arr.length - 1;

		while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
			i = i + 1;
		}
		
		if(i == j) {
			return false;
		}

		while (arr[j] < arr[j - 1]) {
			j = j - 1;
		}

		if (i != j) {
			return false;
		}

		return true;

	}

}
