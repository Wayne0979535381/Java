package day9;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo1 {
	public static void main(String[] args) {
		
		
		Set set1=new HashSet();
		set1.add(100);set1.add(2);set1.add(30);set1.add(1);
		
		Set set2=new LinkedHashSet();
		set2.add(100);set2.add(2);set2.add(30);set2.add(1);
		
		Set set3=new TreeSet();
		set3.add(100);set3.add(2);set3.add(30);set3.add(1);
		
		System.out.println("將 [100] [2] [30] [1] 這四個元素依序放到Set集合中");
		System.out.println("HashSet(無序集合) =>"+ set1);
		System.out.println("LinkHashSet(有序集合) =>"+ set2);
		System.out.println("TreeSet(排序集合) =>"+ set3);
	}

}
