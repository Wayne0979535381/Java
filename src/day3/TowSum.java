package day3;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class TowSum {
	
	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target=13;
		int[] result=new int[2];
		int lens=nums.length;
		
		System.out.println("印出初始資料");
		System.out.printf("nums=%s%n",Arrays.toString(nums));
		System.out.printf("result=%s%n",Arrays.toString(result));
		
		outer:
		for(int i=0;i<(lens-1);i++) {
			inner:
			for(int k=i+1;k<lens;k++) {
				int sum=nums[i]+nums[k];
			System.out.printf("nums[%d][%d]=%d%n",i,k,sum);
			
			if(sum==target) {
				result[0]=i;
				result[1]=k;
				break outer;
				
			}
			
			}
		}
		
		System.out.println("\n印出結果資料");
		System.out.printf("target=%d%n",target);
		System.out.printf("result=%s%n",Arrays.toString(result));
		
	
		
		
		
	}
	

}
