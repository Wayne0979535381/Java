package day4.drink;

import day4.drink.Drink;
import day4.drink.DrinkMenu;
import day4.drink.OrderItem;

public class TestSplitDemo {
	public static void main(String[]args) {
		
		String input="1,3x2,5x3,7x4,2x5";
		String[]inputArray=input.split(",");
		
		for(String item :inputArray) {
			item=item.trim();
			System.out.printf("item:%s%n",item);
			
			int number=0;
			int quantity=0;
			if(item.contains("x")) {
				String[]array=item.split("x");
				number=Integer.parseInt(array[0]);
				quantity=Integer.parseInt(array[1]);
				
			}else {
				number=Integer.parseInt(item);
				quantity=1;
				
				
			}
			System.out.printf("%d號x%d杯%n",number,quantity);
			
			Drink drink=DrinkMenu.findByNumber(number);
			
			if (drink==null) {
				System.out.println("查無商品\n");
				continue;
			}
			OrderItem oItem=new OrderItem(drink, quantity);
			
			
			System.out.printf("品名:%s 單價:%d 數量:%d 小計:%d%n", 
			  		  oItem.getDrink().getName(),
			  		  oItem.getDrink().getPrice(),
			  		  oItem.getQuantity(),
			  		  oItem.getTotalPrice());
			System.out.println();
		}
	}

}
