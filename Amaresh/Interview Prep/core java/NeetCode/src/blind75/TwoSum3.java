package blind75;

import java.util.HashMap;
import java.util.Map;

import common.ArrayUtils;

public class TwoSum3 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 1 };
		int target = 9;
		ArrayUtils.printArray(twoSum(nums, target));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				arr[0] = map.get(target - nums[i]);
				arr[1] = i;
			}
			map.put(nums[i], i);
		}
		
		return arr;
	}

}
