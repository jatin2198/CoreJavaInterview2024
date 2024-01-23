package practice;

import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class StreamInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,10,32);
		
		//list.stream().filter(i->i%2==0).forEach(i->System.out.println("Even= "+i));	
		/*
		 * list.stream().filter(item->item.toString().substring(0, 1).contains("1"))
		 * .forEach(i->System.out.println("Numbers begins with 1 = "+i));
		 */
		
		/*
		 * list.stream().filter(item->Collections.frequency(list,
		 * item)>1).collect(Collectors.toSet())
		 * .forEach(i->System.out.println("Duplicate elements= "+i));
		 * 
		 * list.stream().filter(item->Collections.frequency(list,
		 * item)==1).collect(Collectors.toSet())
		 * .forEach(i->System.out.println("Non Duplicate elements= "+i));
		 */
	
		/* System.out.println("First elemt= "+ list.stream().findFirst().get()); */
	
		/* System.out.println("Total number of elements= "+list.stream().count()); */
	
	//list.stream().max(Integer::compare).ifPresent(System.out::println);
	//list.stream().max((o1, o2) ->o1.compareTo(o2) ).ifPresent(System.out::println);
	
	/*
	 * String input = "JavvaJ Jarticles are Awesome"; List<Integer>
	 * list=input.replaceAll(" ", "").chars().boxed().toList();
	 * 
	 * list.stream().filter(i->Collections.frequency(list, i)>1)
	 * .map(item->Character.toString(item)).findFirst().ifPresent(System.out::print)
	 * ; ;
	 */
		// List<Integer> myList = Arrays.asList(10,8,49,25,98,32,15);
		 
		// myList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		/*
		 * Set<Boolean> set =myList.stream().map(item->{
		 * if(Collections.frequency(myList, item)>=2) { return true;
		 * 
		 * } return false; }).collect(Collectors.toSet());
		 */
	
	//System.out.println(set.contains(true)? "Value presnt twice":"No value present twice");
	
		  List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> map=new HashMap<String, Long>();  
		/*
		 * for(String std:names) { int count=0; for(String str:names) {
		 * 
		 * if(std.equals(str)) { count++; }
		 * 
		 * 
		 * } map.put(std, count); // System.out.println(std+"= "+count); }
		 * 
		 * System.out.println(map);
		 */
	
		/*
		 * map=names.stream().
		 * collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 * System.out.println(map);
		 */
		String s = "string data to count each character";
	map=s.replaceAll(" ", "").chars().boxed().toList().stream().map(item->Character.toString(item))
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	}

}
