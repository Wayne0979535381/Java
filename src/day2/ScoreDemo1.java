package day2;

public class ScoreDemo1 {
	public static void main (String[] args) {
		
		String name1="John";
		String name2="Mary";
		String name3="Alen";
		String name4="Jack";
		String name5="Rose";
		


		
		int score1=95;
		int score2=50;
		int score3=83;
		int score4=40;
		int score5=60;
		
		System.out.printf("學員: %s 成績: %d%n", name1, score1);
		System.out.printf("學員: %s 成績: %d%n", name2, score2);
		System.out.printf("學員: %s 成績: %d%n", name3, score3);
		System.out.printf("學員: %s 成績: %d%n", name4, score4);
		System.out.printf("學員: %s 成績: %d%n", name5, score5);
		System.out.println("------------------");
		
		int sum1=score1+score2+score3+score4+score5;
		
		double avg1=sum1/5.0;
		System.out.printf("總分:%d%n",sum1);
		System.out.printf("總分:%d 平均:%.1fn",avg1);
	}

}
