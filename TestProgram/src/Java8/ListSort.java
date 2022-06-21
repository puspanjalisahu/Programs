package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("bea");
		list.add("abf");
		list .add("stt");
		list.add("hrd");
		list.add("avc");
		
		list.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println("#####"+e));
		
		list.stream().filter(e ->e.startsWith("a")).sorted().collect(Collectors.toList()).forEach(e->System.out.println("#####"+e));
		
		

	}

}
