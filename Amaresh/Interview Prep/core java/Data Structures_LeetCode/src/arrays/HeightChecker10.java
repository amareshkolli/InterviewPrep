package arrays;

import java.util.Arrays;

public class HeightChecker10 {

	public static void main(String[] args) {
		HeightChecker10 obj = new HeightChecker10();
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		System.out.println(obj.heightChecker(heights));
	}

	public int heightChecker(int[] heights) {

		int[] copy = heights.clone();

		Arrays.sort(copy);
		int diffIndexes = 0;

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != copy[i]) {
				diffIndexes++;
			}
		}
		return diffIndexes;
	}

}
