package arrays;

public class DuplicateZeros1 {

	public static void main(String[] args) {
//		int arr[] = { 1, 0, 2, 3, 0, 4, 5, 0 };
//		int arr[] = {0,4,1,0,0,8,0,0,3};
		int arr[] = {0,0,0,0,0,0,0,0,0};
		DuplicateZeros1 obj = new DuplicateZeros1();
		obj.duplicateZeros(arr);
		ArrayUtils.printArray(arr);

	}
	
	public void duplicateZeros(int[] arr) {
		int validZerosCount = 0;
		int n = arr.length - 1;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				validZerosCount++;
				n--;
			}
		}
		
		if(validZerosCount == arr.length || arr.length == 1) {
			return;
		}
		
		System.out.println("valid zeros :"+validZerosCount);
		 
		for(int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i  - validZerosCount];
			if(arr[i-validZerosCount] == 0) {
				arr[i - 1] = 0;
				validZerosCount--;
				i--;
			}
			if(validZerosCount == 0) {
				break;
			}
			ArrayUtils.printArray(arr);
			System.out.println();
		}  
		
	}

//	public void duplicateZeros(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			if (arr[i] == 0) {
//				shiftArrayValue(arr, i + 1, 1);
//				arr[i + 1] = 0;
//				i = i + 1;
//			}
//			ArrayUtils.printArray(arr);
//			System.out.println();
//		}
//	}
//
//	private void shiftArrayValue(int[] arr, int index, int increment) {
//		for (int i = arr.length - 1; i > index; i--) {
//			arr[i] = arr[i - 1];
//		}
//	}

}
