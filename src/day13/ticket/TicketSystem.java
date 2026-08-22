package day13.ticket;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSystem {
	
	private int ticket = 1;
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void buy() throws InterruptedException{
		String threadName = Thread.currentThread().getName();
		
		if(!lock.tryLock(2, TimeUnit.SECONDS)) {
			System.out.printf("%s 發現系統繁忙中, 請稍後在試...%n",threadName);
			return;
		}
		
		try {
			if(ticket <=0) {
				System.out.printf("%s 沒看見票, 離開...%n",threadName);
				return;
			}
			System.out.printf("%s 看見有票, 準備購買...%n", threadName);
			
			Thread.sleep(100);
			
			ticket--;
			
			System.out.printf("%s 成功買到 1 張票!%n", threadName);
		} finally {
			lock.unlock();
		}
		
		
		/*lock.lock();
		
		try {
			if(ticket <=0) {
				System.out.printf("%s 沒看見票, 離開...%n",threadName);
				return;
			}
			System.out.printf("%s 看見有票, 準備購買...%n", threadName);
			
			Thread.sleep(100);
			
			ticket--;
			
			System.out.printf("%s 成功買到 1 張票!%n", threadName);
		} finally {
			lock.unlock();
		}
		*/
		
	}

}
