package day14;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 一家餐廳做外賣平台
 * 每秒鐘會近來幾百幾千張訂單
 * 每張訂單
 * 1.廚師處理
 * 2.製作餐點
 * 3.完成出餐
 * 
 * 系統必須
 * 1.同時處理多筆訂單
 * 2.不可以當機
 * 3.不可以吃光CPU
 * 4.不可以memory爆炸
 */

public class Restaurant {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=100;i++) {
			final int orderId =i;
		pool.submit(() ->{
			String tName = Thread.currentThread().getName();
			
			System.out.printf("%s 處理訂單: %d%n",tName,orderId);
			
			try {
				System.out.printf("%s 製作餐點: %d 的餐點中...%n",tName,orderId);
				Thread.sleep(new Random().nextInt(3000));
			}catch(Exception e) {
				
			}
			
			System.out.printf("%s 完成訂單: %d%n",tName,orderId);
			
		});
		}
		
		pool.shutdown();
		
		while(true) {
		boolean finished = pool.awaitTermination(10,TimeUnit.SECONDS);
		if(finished) {
			System.err.println("完成所有訂單, 餐廳打烊");
			break;
		}else {
			System.err.println("還有訂單未完成");
		}
		
		
		
	}

}
}
