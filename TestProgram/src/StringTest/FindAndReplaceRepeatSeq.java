package StringTest;

public class FindAndReplaceRepeatSeq {

	public static void main(String[] args) {
		 
		 String str = "abcddefgefhhjkdefgefh";  
		 String input= str;
 		 while(!findAndReplaceSequence(str).isEmpty()) {
			 String seq= findAndReplaceSequence(str);
			 input = input.replace(seq, "*");
			 str=seq;
		 }
	       
	     System.out.println("Longest repeating sequence: "+input);  
	}
	
public static String findAndReplaceSequence(String str) {
	 String lrs="";  
     int n = str.length();  
     
     for(int i=0;i<n;i++) {
     	for(int j=i+1;j<n;j++) {
     		String x = lcs(str.substring(i, n),str.substring(j,n));
     		if(x.length()>lrs.length()) lrs =x;
     		
     	}
     	
     }
     return lrs;
}
	private static String lcs(String s, String t) {
		int n = Math.min(s.length(),t.length());  
     for(int i = 0; i < n; i++){  
         if(s.charAt(i) != t.charAt(i)){  
             return s.substring(0,i);  
         }  
     }  
     return s.substring(0,n);  
	}


}
