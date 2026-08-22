package day13.breakfast.thread;

public class Main {
	
	public static void main(String[] args) {
	     Thread t1 = new OrderJob();
	     Thread t2 = new CookJob();
	     Thread t3 = new DrinkJob();
	     
	     t1.setName("order");
	     t2.setName("cook");
	     t3.setName("drink");
		
	     t1.start();
	     t2.start();
	     t3.start();
		
		
	}

}
