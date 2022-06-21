package StringTest;

public class LongestSubstringDistinctChar {

	public static void main(String[] args) {
		System.out.println("longest length"+lengthOfLongestSubstringKDistinct("abbcddef", 4));

	}

	 public static int lengthOfLongestSubstringKDistinct(String S, int K) {
	        int[] charCount = new int[256];
	        char[] chS = S.toCharArray();
	        int distinctNum = 0, leftIndex = 0, maxLen = 0;
	        for (int rightIndex = 0; rightIndex < chS.length; rightIndex++) {
	            if (charCount[chS[rightIndex]]++ == 0) distinctNum++;
	            if (distinctNum > K) {
	                while (--charCount[chS[leftIndex++]] > 0);
	                distinctNum--;
	            }
	            maxLen = Math.max(maxLen, rightIndex - leftIndex + 1);
	        }
	        return maxLen;
	    }
}
