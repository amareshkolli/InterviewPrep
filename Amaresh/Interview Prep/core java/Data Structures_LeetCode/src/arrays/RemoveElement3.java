package arrays;

public class RemoveElement3 {

	public static void main(String[] args) {

		 int nums[] = { 3, 2, 2, 3 };
//		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 }; // 0, 1, 3, 0, 4
		// int nums[] = { 3, 3 ,3};
		int val = 3;

		RemoveElement3 obj = new RemoveElement3();
		System.out.println(obj.removeElement(nums, val));
	}

	private int removeElement(int[] nums, int val) {
		if (nums == null) {
			return 1;
		}
		int i = 0;
		int temp;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				temp = nums[i];
				nums[i++] = nums[j];
				nums[j] = temp;
			}
		}
		ArrayUtils.printArray(nums);
		return i;
	}

	public int removeElement1(int[] nums, int val) {

		if (nums == null) {
			return 1;
		}

		if (nums.length == 1) {
			if (nums[0] == val) {
				return 0;
			}
			return 1;
		}

		boolean isValPresent = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				isValPresent = true;
				break;
			}
		}

		if (!isValPresent) {
			return nums.length;
		}

		int i = 0, j = 1;
		int temp = 0;

		while (j <= nums.length - 1) {
			if (nums[i] == val) {
				while (j <= nums.length - 1 && nums[j] == val) {
					j++;
					if (j > nums.length - 1) {
						return i;
					}
				}
				temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j++;
			} else {
				i++;
				j++;
			}
		}
		return i;
	}
}
