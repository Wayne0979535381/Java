package day2;

public class ScoreDemo3 {
	
	public static void main (String[] args) {
		
		Student[] students= {
				new Student("John",95),
				new Student("Mary",50),
				new Student("Mary",83),
				new Student("Jack",40),
				new Student("Rose",60),
		};
		
		
		for (int i=0;i<students.length;i++) {
			students[i].printScore();
			
		}
		
		int sum=0;
		for (int i=0;i<students.length;i++) {
			sum=sum+students[i].getScore();
		}
		double avg =sum/(double)students.length;
		
		System.out.printf("總分:%d%n",sum);
		System.out.printf("平均:%.1f%n",avg);
	}

}
