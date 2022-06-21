package ArrayTest;

public class FindLargeAndSmall {

	public static void main(String[] args) {
		int[] array = {34,7,89,12,2,56,99};
		int l= array[0];
		int s = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]> l) {
				l = array[i];
			}else if(array[i]<s) {
				s=array[i];
			}
		}
      System.out.println("large......."+l+" small........ "+s);
	}

}
