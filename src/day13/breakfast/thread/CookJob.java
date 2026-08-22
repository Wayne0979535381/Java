package day13.breakfast.thread;

import java.util.concurrent.TimeUnit;

public class CookJob extends Thread{
	
	@Override
	public void run() {
		work();
	}
	
	private void name() {
		
	} void work() {
		String threadName = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.printf("[%s]櫃台接單中: %d%n",threadName,i);
			
			try {
				TimeUnit.SECONDS.sleep(3);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
