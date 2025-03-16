package arrays;

public class FindNumbersWithEvenNumberOfDigits15 {

	public static void main(String[] args) {
		FindNumbersWithEvenNumberOfDigits15 obj = new FindNumbersWithEvenNumberOfDigits15();
		int[] arr = { 12, 345, 2, 6, 7896 };
		System.out.println(obj.findNumbers(arr));
	}

	public int findNumbers(int[] nums) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int j = nums[i];
			int loops = 0;
			while (j > 0) {
				j = j / 10;
				loops++;
			}
			if (loops % 2 == 0) {
				count++;
			}
		}

		return count;
	}

}
