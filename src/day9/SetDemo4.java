package day9;

import java.util.HashSet;
import java.util.Set;

public class SetDemo4 {
	
	public static void main(String[] args) {
		
		Set set1=new HashSet();
		set1.add(100);
		set1.add(73);
		set1.add(80);
		
		Set set2=Set.of(100,73,80);
		
		System.out.println("set1 :"+set1);
		System.out.println("set2 :"+set2);
		
		//---------------------------------
		System.out.println("-------------------");
		
		set1.add(95);
		set1.remove(100);
		System.out.println("set1 :"+set1);
		
		set2.add(95);
		set2.remove(100);
		System.out.println("set2 :"+set2);
		
	}

}
