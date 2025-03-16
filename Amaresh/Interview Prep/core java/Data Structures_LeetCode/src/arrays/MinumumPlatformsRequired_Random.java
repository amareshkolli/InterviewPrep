package arrays;

import java.util.PriorityQueue;

public class MinumumPlatformsRequired_Random {

	public static void main(String[] args) {
		int[] arrivalTimes = { 900, 940, 950, 1100, 1500, 1800 };
		int[] departureTimes = { 910, 1200, 1120, 1130, 1900, 2000 };
		System.out.println(MinumumPlatformsRequired_Random.findMinimumPlatforms(arrivalTimes, departureTimes));

	}

	public static int findMinimumPlatforms(int[] arr, int[] dep) {
		if (arr.length == 0) {
			return 0;
		}

		int de = 0;
		int count = 1;
		for (int ar = 1; ar < arr.length; ar++) {
			if (arr[ar] <= dep[de]) {
				count++;
			} else {
				de++;
			}
		}
		return count;
		// PriorityQueue<Integer> platformQueue = new PriorityQueue<>();
		// int maxPlatforms = 0;
		//
		// for (int i = 0; i < arr.length; i++) {
		// while (!platformQueue.isEmpty() && platformQueue.peek() <= arr[i]) {
		// platformQueue.poll();
		// }
		// platformQueue.add(dep[i]);
		// maxPlatforms = Math.max(maxPlatforms, platformQueue.size());
		// }
		// return maxPlatforms;

	}

}
