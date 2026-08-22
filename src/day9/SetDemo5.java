package day9;

import java.util.Iterator;
import java.util.Set;

public class SetDemo5 {
	public static void main(String[] args) {
		
		Set set1= Set.of(100,73,80);
		System.out.println(set1);
		
		for(Object data : set1) {
			System.out.println(data);
		}
		int sum1 = 0;
		for(Object data : set1) {
			Integer d1 = (Integer)data;
			int     d2 = d1.intValue();
			sum1 += d2;
		}
		System.out.println("總和: " + sum1);
		
		
		Set<Integer> set2 =Set.of(100,73,80);
		int sum2 = 0;
		for (Integer data : set2) {
			sum2 += data;
			
		}
		System.out.println("總和: " + sum2);
		
		
		Set<Integer> set3 = Set.of(100,73,80);
		int sum3 = set3.stream()
		               .mapToInt(Integer::intValue)
		               //.mapToInt(x -> x)
		               //.mapToInt(x -> x.intValue())
		               .sum();
		System.out.println("總和: " + sum3);
	}   

}
