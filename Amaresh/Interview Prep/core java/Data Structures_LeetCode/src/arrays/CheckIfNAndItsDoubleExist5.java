package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfNAndItsDoubleExist5 {

	public static void main(String[] args) {
//		int[] arr = { 10, 2, 5, 3 };
//		int[] arr = {3,1,7,11};
		int arr[] = {-2,0,10,-19,4,6,-8};
//		int arr[] = {0,0};
		CheckIfNAndItsDoubleExist5 obj = new CheckIfNAndItsDoubleExist5();
		System.out.println(obj.checkIfExist(arr));
	}

	public boolean checkIfExist(int[] arr) {
		Map<Integer, Integer> map = new HashMap();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				int val = map.get(arr[i]);
				if(val > 1) {
					return true;
				}
			} else if((map.get(arr[i] * 2) != null)) {
				return true;
			} 
		}
		return false;
	}

}
