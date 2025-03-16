package blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import common.ArrayUtils;

public class TopKFrequentElements5 {

	public static void main(String[] args) {
		TopKFrequentElements5 obj = new TopKFrequentElements5();
//		int[] nums = { 1, 1, 1, 2, 2, 3 };
//		int[] nums = {3, 2, 2, 1, 1, 1};
		int[] nums = {50, 20, 10, 20, 10, 50};
		int k = 2;
		ArrayUtils.printArray(obj.topKFrequent(nums, k));
	}

	public static int[] topKFrequent(int[] nums, int k) {

		if (nums == null || nums.length == 0) {
			return new int[] {};
		}

		if (nums.length == 1) {
			return new int[] { nums[0] };
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer val : nums) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		Map<Integer, List<Integer>> count = new HashMap<>();

		Set<Integer> keys = map.keySet();

		for (Integer key : keys) {
			if (count.containsKey(map.get(key))) {
				count.get(map.get(key)).add(key);
			} else {
				count.put(map.get(key), new ArrayList<>());
				count.get(map.get(key)).add(key);
			}
		}

		int[] result = new int[k];
		int counter = 0;
		for (int i = nums.length; i > 0; i--) {
			if (count.containsKey(i)) {
				List<Integer> list = count.get(i);
				for (int j = list.size() - 1; j >= 0; j--) {
					if (counter < k) {
						result[counter++] = list.get(j);
					}
				}
			}
		}
		return result;

		// int min = Integer.MAX_VALUE;
		// int max = Integer.MIN_VALUE;
		//
		// for (int i : nums) {
		// if (min > i) min = i;
		// if(i > max) max = i;
		// }
		//
		// int[] freq = new int[max - min + 1];
		// for (int i : nums)
		// freq[i - min]++;
		//
		// List<Integer>[] buckets = new List[nums.length + 1];
		//
		// int max_freq = 0;
		// for (int i = 0; i < freq.length; i++) {
		// if (freq[i] > 0) {
		// if (buckets[freq[i]] == null)
		// buckets[freq[i]] = new ArrayList<>();
		// buckets[freq[i]].add(i + min);
		//
		// max_freq = Math.max(freq[i], max_freq);
		// }
		// }
		//
		// int[] res = new int[k];
		// for (int i = max_freq, idx = 0; i > 0 && idx < k; i--)
		// if (buckets[i] != null)
		// for (int num : buckets[i]) {
		// if (idx == k) break;
		// res[idx++] = num;
		// }
		// return res;
	}

}
