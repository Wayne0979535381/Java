package day2;

import java.util.jar.Attributes.Name;

public class ScoreDemo2 {
	
	public static void main (String[] args) {

		String [] name = {"John","Mary","Alen","Jack","Rose"};
		int[] scores = {95,50,83,40,60};
		
		for (int i=0;i<name.length;i++) {
			System.out.printf("學員:%s 成績:%d%n ",name[i],scores[i]);
		}
		System.out.println("------------------");
		
		int sum =0;
		for(int i=0;i<scores.length;i++) {
		  sum =sum+scores[i];
		  
    }
	double avg =sum/(double)name.length;
	
	System.out.printf("總分:%d%n",sum);
	System.out.printf("平均:%.1f%n",avg);
	
}
}