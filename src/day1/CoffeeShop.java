package day1;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//咖啡選擇
		System.out.println("請選擇咖啡");
		System.out.println("1. 熱咖啡");
		System.out.println("2. 冰咖啡");
		System.out.println("請輸入選項 => ");
		int choice = sc.nextInt();
		
		//容量選擇
		System.out.println("\n請選擇容量");
		System.out.println("1. 大");
		System.out.println("2. 中");
		System.out.println("3. 小");
		int size = sc.nextInt();
		
		//甜度
		System.out.println("\n請選擇甜度");
		System.out.println("1. 無糖");
		System.out.println("2. 微糖");
		System.out.println("3. 半糖");
		System.out.println("4. 全糖");
		int sugar = sc.nextInt();
		
		//冰量(熱咖啡跳過這一個選項)
		int ice = 0; //設定ice的初始值=0
		if (choice == 2) {
			System.out.println("\n請選擇冰量");
			System.out.println("1. 去冰");
			System.out.println("2. 微冰");
			System.out.println("3. 少冰");
			System.out.println("4. 正常冰");
			ice = sc.nextInt(); //變更ice的內容
		}
		
		//印出訂單
		System.out.println("\n==== 你的咖啡訂單 ====");
		switch (size) {
		case 1:
			System.out.print("大");
			break;
		case 2:
			System.out.print("中");
			break;
		case 3:
			System.out.print("小");
			break;
	}
		
		switch (choice) {
			case 1:
				System.out.println("熱咖啡");
				break;
			case 2:
				System.out.println("冰咖啡");
				break;
		}	
		
		switch (sugar) {
			case 1: 
				System.out.println("無糖");
				break;
			case 2: 
				System.out.println("微糖");
				break;
			case 3: 
				System.out.println("半糖");
				break;
			case 4: 
				System.out.println("全糖");
				break;
		}
		switch (ice) {
			case 1: 
				System.out.println("去冰");
				break;
			case 2: 
				System.out.println("微冰");
				break;
			case 3: 
				System.out.println("少冰");
				break;
			case 4: 
				System.out.println("正常冰");
				break;
		}
		
	}
	

}
