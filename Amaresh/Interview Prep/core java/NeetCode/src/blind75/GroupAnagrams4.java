package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams4 {

	public static void main(String[] args) {
//		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		String[] strs = {"bdddddddddd", "bbbbbbbbbbc"};
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<List<String>>();
		}

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		int[] count = new int[26];

		for (String str : strs) {

			char[] chars = str.toCharArray();
			Arrays.fill(count, 0);

			for (char c : chars) {
				count[c - 'a']++;
			}

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < count.length; i++) {
//				sb.append("#");
				sb.append(count[i]);
			}

			String key = sb.toString();

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(str);
		}

		return new ArrayList(map.values());
	}
}