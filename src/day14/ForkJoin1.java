package day14;

import java.util.List;

public class ForkJoin1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(3,1,4,2,5,9);
		int sum = nums.parallelStream()
				      .peek(n -> System.out.printf("%s 拿到原始 %d%n",Thread.currentThread().getName(),n))
				      .mapToInt(n -> n * n)
				      .peek(n -> System.out.printf("%s 拿到結果 %d%n",Thread.currentThread().getName(),n))
				      .sum();
		
		System.out.println(sum);
	}

	
	}


