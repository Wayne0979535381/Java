package day14;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo2 {
	
	public static void main(String[] args) throws Exception {
		// 牛肉麵要端上桌
		// 1.牛肉選好
		// 2.麵條要煮好
		// 3.湯要盛好
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		Callable<String> task1 = () -> {
			Thread.sleep(3000);
			return "牛肉麵";
		};
		
		Callable<String> task2 = () -> {
			Thread.sleep(5000);
			return "蛋包飯";
		};
		
		Callable<String> task3 = () -> {
			Thread.sleep(1000);
			return "水餃";
		};
		
		List<Callable<String>> tasks = List.of(task1, task2, task3);
		
		System.out.println("午餐等待中...");
		
		String result = pool.invokeAny(tasks);
		
		System.out.printf("今日午餐: %s%n", result);
		
		pool.shutdown();
		
	}
	
}







