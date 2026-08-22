package day10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<>();
		scores.add(80);
		scores.add(70);
		scores.add(80);
		scores.add(90);
		scores.add(0, 100);
		
		System.out.println(scores);
		System.out.println(scores.size());
		System.out.println(scores.get(0));
		
		
		//scores.remove(0);
		scores.remove(Integer.valueOf(100));
		
		System.out.println(scores);
		
		
		
	}

}
