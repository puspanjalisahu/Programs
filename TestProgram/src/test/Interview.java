package test;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
	    int []ar = {2,3,4,5};
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		
		//list = Arrays.asList(ar);
		
        IntSummaryStatistics s = list.stream().filter( i -> i%2 !=0).collect(Collectors.summarizingInt(e ->e*e));
        
        System.out.println("Val"+s.getSum());
	}

}
