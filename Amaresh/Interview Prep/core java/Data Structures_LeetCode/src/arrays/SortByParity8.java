package arrays;

public class SortByParity8 {

	public static void main(String[] args) {
		SortByParity8 obj = new SortByParity8();
		int[] nums = {3,1,2,4};
//		int[] nums = {1, 1, 3, 4};
//		int[] nums = {2, 4, 3, 2, 6};
//		int[] nums = {0};
		ArrayUtils.printArray(obj.sortArrayByParity(nums));
	}
	
	public int[] sortArrayByParity(int[] nums) {
		int i = 0; 
		int temp;
		for(int j = 0; j < nums.length; j++) {
			if(nums[j] % 2 == 0) {
				temp = nums[i];
				nums[i++] = nums[j];
				nums[j] = temp;
			}
		}
		
		return nums;
	}

	public int[] sortArrayByParity1(int[] nums) {
		int i = 0;
		int temp;
		for(int j = 0; j < nums.length; j++) {
			if(nums[i] % 2 != 0) {
				if(nums[j] % 2 == 0) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i++;
				}
			} else {
				i++;
			}
		}
		return nums;
	}

}
