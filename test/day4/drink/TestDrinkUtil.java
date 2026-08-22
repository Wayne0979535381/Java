package day4.drink;

import day4.drink.DrinkUtil;
import day4.drink.OrderItem;

public class TestDrinkUtil {
	public static void main(String[] args) {
		System.out.println("測試資料");
		System.out.println("=================");
		
		String input="1,2x3,5x2";
		
		OrderItem[]orderItems=DrinkUtil.parseOrder(input);
		
		DrinkUtil.printOrderItems(orderItems);
	}

}
