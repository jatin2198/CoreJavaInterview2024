package java_interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestingAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		 
		 //AA-2
		 Map<String ,Long> map=new HashMap<>();
		 
			/*
			 * for(String str:names) { int count=0; for(String std:names) {
			 * if(str.equals(std)) { count++;
			 * 
			 * map.put(str, count); } } }
			 * 
			 * System.out.println(map);
			 */
	map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	
	
	
	}

}
