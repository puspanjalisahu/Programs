package StringTest;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public static void main(String[] args) {
		
		String s1 = "ABBC";
		String s2 = "BBAC";
		
		System.out.println("Anagram "+checkAnagram(s1,s2));

	}

	private static boolean checkAnagram(String s1, String s2) {
		
		if(s1==null || s2==null || (s1.length() !=s2.length())) {
			return false;
		}else {
			
			Map<Character,Integer> map = new HashMap<>();
			for(int i=0;i<s1.length();i++) {
				if(map.containsKey(s1.charAt(i))) {
					map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
				}else {
					map.put(s1.charAt(i), 1);
				}
			}
			
			for(int j =0;j<s2.length();j++) {
				
				if(!map.containsKey(s2.charAt(j))) {
					
					return false;
				}else {
					
					if(map.get(s2.charAt(j))==1) {
						map.remove(s2.charAt(j));
					}else {
						map.put(s2.charAt(j), map.get(s2.charAt(j))-1);
					}
					
				}
			}
			if(!map.isEmpty()) {
				return false;
			}
			return true;
		}
		
	}

}
