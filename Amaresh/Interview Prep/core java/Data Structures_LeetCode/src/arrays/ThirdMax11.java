package arrays;

public class ThirdMax11 {

	public static void main(String[] args) {
		ThirdMax11 obj = new ThirdMax11();
		int nums[] = { 1, 2, 2, 5, 3, 5 };
		System.out.println(obj.thirdMax(nums));
	}

	public int thirdMax(int[] nums) {
		 long firstMax = Long.MIN_VALUE, secondMax = Long.MIN_VALUE, thirdMax = Long.MIN_VALUE;
	      
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > firstMax) {
					thirdMax = secondMax;
					secondMax = firstMax;
					firstMax = nums[i];
				} else if (nums[i] < firstMax && nums[i] > secondMax) {
					thirdMax = secondMax;
					secondMax = nums[i];
				} else if (nums[i] < secondMax && nums[i] > thirdMax) {
					thirdMax = nums[i];
				}
			}
	        
	         if (thirdMax == Long.MIN_VALUE) {
	            int ans = (int) firstMax;
	            return ans;
	        }
	        
	        int ans = (int) thirdMax;
	        return ans;

	}

}
