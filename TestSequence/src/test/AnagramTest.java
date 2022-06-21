package test;

public class AnagramTest {

	public static void main(String[] args) {
		
		String s1 = "aabb";
		String s2= "abca";

		System.out.println("Anagram"+checkString(s1,s2));
		

	}

	private static boolean checkString(String s1, String s2) {
		if(s1 == null || s2==null || s1.length()!=s2.length()) {
			return false;
		}
		
		String[] arr = s1.split("");
		
		for(int i=0;i<arr.length;i++) {
			if(!s2.contains(arr[i])) {
				return false;
			}
		}
		
		
		return true;
		
	}

}
