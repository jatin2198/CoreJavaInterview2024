package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "cde";

		String b = "cdf";
		Map<Character, Integer> count = new HashMap<>();
		for (char letter : a.toCharArray()) {
		      count.put(letter, count.getOrDefault(letter, 0) + 1);
		    }

		    for (char letter : b.toCharArray()) {
		      count.put(letter, count.getOrDefault(letter, 0) - 1);
		    }

		    int deletions = 0;

		    for (int value : count.values()) {
		      deletions += Math.abs(value); 
		    }
		    
		    System.out.println(deletions);

	}

}
