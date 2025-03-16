package arrays;

public class MoveZeroes9 {

	public static void main(String[] args) {
		MoveZeroes9 obj = new MoveZeroes9();
//		 int[] arr = { 0, 1, 0, 3, 12 };
//		 int[] arr = {0};
//		int[] arr = { 1, 0, 5, 5 };
//		int[] arr = {0, 0 ,0 ,1, 0, 0};
//		int[] arr = {1,4,6,2,0,0,0,0};
		int[] arr = {1,0,2,0,7,0,2,0,4,0,3};
		obj.moveZeroes(arr);
		ArrayUtils.printArray(arr);
	}
	
	public void moveZeroes(int[] nums) {
		
		int i = 0;
		
		for(int num : nums) {
			if(num != 0) {
				nums[i++] = num;
			}
		}
		
		while(i < nums.length) {
			nums[i++] = 0;
		}
		
	}

	public void moveZeroes1(int[] nums) {
		int i = 0;
		int temp;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] == 0) {
				if (nums[j] != 0) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i++;
				}
			} else {
				i++;
			}
		}
	}

}
