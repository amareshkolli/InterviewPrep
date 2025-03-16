package blind75;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3 };
		System.out.println(hasDuplicate(arr));
	}

	public static boolean hasDuplicate(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				return true;
			} else {
				map.put(arr[i], arr[i]);
			}
		}
		return false;
	}

}
