package day10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListDemo4 {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);list1.add(2);list1.add(3);list1.add(4);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);list2.add(4);list2.add(5);list2.add(6);
		System.out.println(list2);
		
		
		List<Integer> intersection = new ArrayList<>(list1);
		intersection.retainAll(list2);
		System.out.println(intersection);
		
		List<Integer> difference = new ArrayList<>(list1);
		difference.removeAll(list2);
		System.out.println(difference);
		
		List<Integer> union = new ArrayList<>(list1);
		union.addAll(list2);
		System.out.println(union);
		
		Set<Integer> unionSet = new LinkedHashSet<>(list1);
		unionSet.addAll(list2);
		System.out.println(unionSet);
		
		
		List<Integer> symmetricDifference = new ArrayList<>(union);
		symmetricDifference.removeAll(intersection);
		System.out.println(symmetricDifference
				
				);
		
	}

}
