package day9;

import java.util.Set;

import day9.entity.Student;

public class SetDemo8 {
	public static void main(String[] args) {
		
		Set<Student>students=Set.of(
				new Student("Alice", 85, 2, 20),
			    new Student("Bob", 92, 1, 22),
			    new Student("Cindy", 78, 2, 19),
			    new Student("David", 88, 1, 21),
		        new Student("Eva", 95, 2, 23),
			    new Student("Frank", 67, 1, 20),
			    new Student("Grace", 73, 2, 22),
			    new Student("Henry", 81, 1, 24),
			    new Student("Ivy", 90, 2, 21),
			    new Student("Jack", 76, 1, 19)
			);
		
		
		
		
		        System.out.println("全部學生:");
				students.forEach(System.out::println);
		        System.out.println("---------------------------------------------");
		
		double avgOfMan = students.stream()
				                  // .peek(System.out::println)
		                          .filter(student ->student.getSex().equals(1))
		                          .peek(System.out::println)
		                          .mapToInt(student -> student.getScore())
		                          // .peek(System.out::println)
		                          .average()
		                          .orElse(0);
		           System.out.println("男生平均:"+avgOfMan);
		
		
		double avgOfWoman = students.stream()
                                    .filter(student ->student.getSex().equals(2))
                                    .mapToInt(Student:: getScore)
                                    .average()
                                    .orElse(0);
                   System.out.println("女生平均:"+avgOfWoman);
		
		
	}

}
