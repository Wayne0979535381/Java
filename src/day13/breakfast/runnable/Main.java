package day13.breakfast.runnable;

import day13.breakfast.normal.CookJob;
import day13.breakfast.normal.DrinkJob;
import day13.breakfast.normal.OrderJob;

public class Main {
	
	public static void main(String[] args) {
		
		Runnable r1 = new BreakfastRunnable(new OrderJob());
		Runnable r2 = new BreakfastRunnable(new CookJob());
		Runnable r3 = new BreakfastRunnable(new DrinkJob());
		
		Thread t1 = new Thread(r1, "櫃台員工");
		Thread t2= new Thread(r2, "熟食員工");
		Thread t3 = new Thread(r3, "飲料員工");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
