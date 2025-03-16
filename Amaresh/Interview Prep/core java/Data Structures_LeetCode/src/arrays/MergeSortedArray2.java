package arrays;

public class MergeSortedArray2 {

	public static void main(String[] args) {
		
		int[] nums1 = {4,5,0,0,0};
		int m = 2, n = 3;
		int[] nums2 = {1,3,6};
		MergeSortedArray2 obj = new MergeSortedArray2();
		
		obj.merge(nums1, m, nums2, n);
	}
	
	 public void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		 if(nums2 == null || nums2.length == 0) {
			 return;
		 }
		 
		 
		int k = nums1.length - 1;
		
		while(m > 0 && n > 0 ) {
			if(nums1[m - 1] > nums2[n - 1]) {
				nums1[k--] = nums1[m - 1];
				m--;
			} else {
				nums1[k--] = nums2[n - 1];
				n--;
			}
		}
		while(n > 0) {
			nums1[k--] = nums2[n-1];
			n--;
		}
		
	 }
	
	

	private static void merge1(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;
		
		while(i < m && j < n) {
			int temp;
			if(nums1[i] > nums2[j]) {
				temp = nums1[i];
				nums1[i] = nums2[j];
				nums2[j] = temp;
				j++;
			}
			i++;
		}
		
		ArrayUtils.printArray(nums1);
		System.out.println();
		ArrayUtils.printArray(nums2);
		System.out.println();
		
		j = 0;
		for(int k = m; k < nums1.length; k++) {
			nums1[k] = nums2[j++];
		}
		ArrayUtils.printArray(nums1);
	}

}
