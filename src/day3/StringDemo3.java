package day3;

public class StringDemo3 {
	public static void main(String[]args) {
		
		String name="John";
		System.out.printf("%s的長度=%d%n,name,name.length()");
		
		String menu="雞腿飯,排骨飯,蝦捲飯,牛肉炒飯,羊肉炒麵";
		System.out.printf("有排骨飯嗎 ? %b%n", menu.contains("排骨飯"));
		System.out.printf("有排骨飯嗎 ? %s%n", (menu.contains("排骨飯") ? "有" : "沒有"));
		
		// menu 有包含"豬腳飯"嗎 ?
		System.out.printf("有豬腳飯嗎 ? %b%n", menu.contains("豬腳飯"));
		System.out.printf("有豬腳飯嗎 ? %s%n", (menu.contains("豬腳飯") ? "有" : "沒有"));
		
		// menu 有包含"炒麵"嗎 ?
		System.out.printf("有炒麵嗎 ? %b%n", menu.contains("炒麵"));
		System.out.printf("有炒麵嗎 ? %s%n", (menu.contains("炒麵") ? "有" : "沒有"));
	}
	}


