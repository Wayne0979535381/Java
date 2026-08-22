package day13.join;

public class Main2 {
	
	public static void main(String[] args) throws InterruptedException {
		Thread order1 = new Thread(new OrderJob(),"訂單 1");
		Thread cook1 = new Thread(new CookJob(),"做餐 1");
		
		Thread order2 = new Thread(new OrderJob(),"訂單 2");
		Thread cook2 = new Thread(new CookJob(),"做餐 2");
		
		Thread order3 = new Thread(new OrderJob(),"訂單 3");
		Thread cook3 = new Thread(new CookJob(),"做餐 3");
		
		order1.start();
		order1.join();
		cook1.start();
		cook1.join();
		
		order2.start();
		order2.join();
		cook2.start();
		cook2.join();
		
		order3.start();
		order3.join();
		cook3.start();
		
	}

}
