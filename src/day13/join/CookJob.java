package day13.join;

public class CookJob implements Runnable{

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.printf("[%s]廚房開始做餐%n",threadName);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("[%s]廚房完成餐點%n",threadName);
		
	}
	
	

}
