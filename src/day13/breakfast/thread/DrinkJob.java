package day13.breakfast.thread;

import java.util.concurrent.TimeUnit;

public class DrinkJob extends Thread {
	
	@Override
	public void run() {
		work();
	}

	private void work() {
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.printf("[%s]飲料製作中: %d%n",threadName,i);
			
			try {
				TimeUnit.SECONDS.sleep(2);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
