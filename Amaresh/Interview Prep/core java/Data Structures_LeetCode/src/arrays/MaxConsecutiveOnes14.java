package arrays;

public class MaxConsecutiveOnes14 {

	public static void main(String[] args) {
		MaxConsecutiveOnes14 obj = new MaxConsecutiveOnes14();
//		int[] arr = { 1, 1, 0, 1, 1, 1 };
		int[] arr = {1,0,1,1,0,1};
		System.out.println(obj.findMaxConsecutiveOnes(arr));
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int window = 0;
		
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] == 1) {
				window++;
			} else {
				count = Math.max(count, window);
				window = 0;
			}
		}
		return Math.max(count, window);
		// for (int j = 1; j < nums.length; j++) {
		// if (nums[i] == 1) {
		// if (nums[i] != nums[j]) {
		// window = j - i;
		// count = Math.max(window, count);
		// i = j;
		// window = 1;
		// } else {
		// window++;
		// }
		// } else {
		// i++;
		// }
		// }
		// return window > 1 ? Math.max(window, count) : count;
	}

}
