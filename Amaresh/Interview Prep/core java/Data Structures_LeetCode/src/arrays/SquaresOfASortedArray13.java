package arrays;

public class SquaresOfASortedArray13 {

	public static void main(String[] args) {
		SquaresOfASortedArray13 obj = new SquaresOfASortedArray13();
		int[] nums = { -4, -1, 0, 3, 10 };
//		int[] nums = { -4, -1 };
//		int[] nums = { 0 };
		ArrayUtils.printArray(obj.sortedSquares(nums));
	}

	public int[] sortedSquares(int[] nums) {
		int[] arr = new int[nums.length];
		
		int i = 0; 
		int j = nums.length - 1;
		int k = nums.length - 1;
		while(i <= j) {
			if(Math.abs(nums[i]) > Math.abs(nums[j])) {
				arr[k--] = nums[i++];
			} else {
				arr[k--] = nums[j--];
			}
		}
		
		for(k = 0; k < arr.length; k++) {
			arr[k] = arr[k] * arr[k];
		} 
		
		return arr;
	}

}
