package day13.breakfast.normal;

import java.util.concurrent.TimeUnit;

public class OrderJob implements Job{
	
	public void work() {
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.printf("[%s]廚房做餐中: %d%n",threadName,i);
			
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
