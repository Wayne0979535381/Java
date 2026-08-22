package day9;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import day9.entity.Student;

public class SetDemo6 {
	public static void main(String[] args) {
		// 集合單一元素: String, Integer ...
		// 集合複合元素: 自訂物件
		Set<Student> students = new HashSet<>();
		students.add(new Student("Alice", 85, 2, 20));
		students.add(new Student("Bob", 92, 1, 22));
		students.add(new Student("Cindy", 78, 2, 19));
		students.add(new Student("David", 88, 1, 21));
		students.add(new Student("Eva", 95, 2, 23));
		students.add(new Student("Frank", 67, 1, 20));
		students.add(new Student("Grace", 73, 2, 22));
		students.add(new Student("Henry", 81, 1, 24));
		students.add(new Student("Ivy", 90, 2, 21));
		students.add(new Student("Jack", 76, 1, 19));
		
		System.out.println("個數:" + students.size());
		
		
		
		for(Student student : students) {
			System.out.println(student);
		}
		
		students.forEach(student -> {
			System.out.println(student.toString());
		});
		
		students.forEach(System.out::println);
		
		
		students.forEach(student -> {
			System.out.println(student.getScore());
		});
		
		
		int sum = students.stream()
				          .mapToInt(student -> student.getScore())
				          .sum();
		System.out.println("總分:"+sum);
		
		double avg = students.stream()
				             .mapToInt(student ->student.getScore())
				             .average()
				             .orElse(0);
		System.out.println("平均:"+avg);
		
		
		int max = students.stream()
				          .mapToInt(student -> student.getScore())
				          .max()
				          .orElse(0);
		System.out.println("最高:"+max);
		
		
		int min = students.stream()
		          .mapToInt(student -> student.getScore())
		          .min()
		          .orElse(0);
        System.out.println("最低:"+min);
        
        
        Student highStudent = students.stream()
        		                      .max(Comparator.comparing(Student::getScore))
        		                      .orElse(null);
        System.out.println("最高分學生:"+highStudent);
                                        
				             
        Student lowStudent = students.stream()
                                     .min(Comparator.comparing(Student::getScore))
                                     .orElse(null);
        System.out.println("最低分學生:"+lowStudent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}