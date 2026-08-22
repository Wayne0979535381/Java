package day2;

public class ChickenShopDemo {
	
	
	public static void main(String[]args) {
		ChickenOrder[]chickenOrder= {
				new ChickenOrder("原味",80,5),
				new ChickenOrder("辣味",85,8),
				new ChickenOrder("檸檬",90,3),
		
	};
		
		System.out.println("印出所有訂單");
		
		ChickenOrder.printAll(chickenOrder);
		System.out.println("=====================");
		
		// 統計營收
		System.out.println("營收統計");
		System.out.printf("今日總營收: $%,.1f%n", ChickenOrder.getStoreTotal(chickenOrder));
		System.out.printf("平均訂單: $%,.1f%n", ChickenOrder.getAverageOrder(chickenOrder));
	
	
	    ChickenOrder topOrder=chickenOrder[0];
	    for (int i=1;i<chickenOrder.length;i++) {
	    	if (chickenOrder[i].getTotal()>topOrder.getTotal()) {
	    		topOrder=chickenOrder[i];
	    		
	    	}
	    }
	
	System.out.printf("冠軍訂單的金額$%.1%n",topOrder.getTotal());
	
	
	
	
	
	}
	
	
	
	
	
	
}



