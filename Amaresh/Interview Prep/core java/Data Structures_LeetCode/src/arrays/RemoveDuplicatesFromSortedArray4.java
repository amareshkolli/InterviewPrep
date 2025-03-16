package arrays;

public class RemoveDuplicatesFromSortedArray4 {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
//		int[] nums = {1,1,1,2,4};
//		int[] nums = {0,0,1,1,1,2,2,3,3,4};
//		int[] nums = {1,1,2,3};
		RemoveDuplicatesFromSortedArray4 obj = new RemoveDuplicatesFromSortedArray4();
		System.out.println(obj.removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
		  if (nums == null) {
		      return 0;
		  }
		  
		  int i = 1;
		  for (int j = 1; j < nums.length; j++) {
		      // If the current element we're reading is *different* to the previous
		      // element...
		      if (nums[j] != nums[j - 1]) {
		          // Copy it into the next position at the front, tracked by writePointer.
		          nums[i] = nums[j];
		          // And we need to now increment writePointer, because the next element
		          // should be written one space over.
		          i++;
		      }
		  }
		  
		  // This turns out to be the correct length value.
		  return i;
		
	}
	
	

	public int removeDuplicates1(int[] nums) {
		
		int i = 0; int j = 1;
		
		if(nums == null) {
			return 0;
		} else if(nums.length == 1) {
			return 1;
		}
		
		while(j < nums.length) {
			if(nums[i] == nums[j]) {
				while(nums[i] == nums[j]) {
					j++;
					if(j >= nums.length) {
						return i + 1;
					}
				}
				nums[i + 1] = nums[j];
				i++; 
			} else {
				i++; j++;
			}
			
		}
		return i + 1;
	}
}
