package day3;

import java.util.Arrays;

public class BubbleSort {
	public static void main (String[]args) {
		int[]nums= {5,3,8,4,2};
		int lens=nums.length;
		System.out.printf("原始陣列:%s%n",Arrays.toString(nums));
		
		for(int r=0;r<nums.length-1;r++) {
		for (int i=0;i<lens-1-r;i++) {
			
			if(nums[i] >nums[i+1]) {
				int tmp=nums[i];
				nums[i] =nums[i+1];
				nums[i+1]=tmp;
				
				
				
			}
			
			System.out.printf("過程陣列:%s%n",Arrays.toString(nums));
			
		}
		}
	}
}

				
	
		
  	