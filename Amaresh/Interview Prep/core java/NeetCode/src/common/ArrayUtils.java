package common;

public class ArrayUtils {
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
	}
	
	public static void printArray(int[] arr, int len) {
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i]);
			if(i < len - 1) {
				System.out.print(", ");
			}
		}
	}

}
