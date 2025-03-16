package blind75;

public class ValidAnagram2 {

	public static void main(String[] args) {
		String s = "racecar";
		String t = "carface";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		int arr[] = new int[126];

		if (s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			arr[c1]++;
			arr[c2]--;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
