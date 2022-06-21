package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 
		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
		List<Integer> listInt = Arrays.asList(arr);	
		listInt.stream().collect(Collectors.toSet()).forEach(System.out::println);
		listInt.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

}
