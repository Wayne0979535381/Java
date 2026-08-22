package day4.drink;

public class DrinkMenu {
	private  static final Drink[] MENU= {
			new Drink(1,"珍珠奶茶",60),
			new Drink(2,"甘蔗清茶",50),
			new Drink(3,"冬瓜茶",30),
			new Drink(4,"檸檬茶",35),
			new Drink(5,"鮮果茶",45),
			new Drink(6,"仙草茶",55),
			
	};
		
	public static Drink findByNumber(int number) {
		for (Drink drink:MENU) {
			if (drink.getNumber()==number) {
				return drink;
				
				
			}
		}
		return null;
	}
	
	public static String[] getFullMenu() {
		
		String[]fullMenu=new String [MENU.length];
		
		for (int i=0;i<MENU.length;i++) {
			Drink drink=MENU[i];
			fullMenu[i]=drink.getDisplayName();
			
		}		
					return fullMenu;
		
		
	}

}
