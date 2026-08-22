package day2;

public class BMIDemo3 {
	
	public static void main (String[] args) {
		BMIUser user1=new BMIUser();
		 user1 .name ="小明";
		 user1 .weight =60.0;
		 user1 .height =170.0;
		 
		 user1.printBMI();
		 
		 
		 BMIUser user2=new BMIUser();
		 user2 .name ="小英";
		 user2 .weight =45.5;
		 user2 .height =160.0;
		 
		 user2.printBMI();
		 
		 
		 BMIUser user3=new BMIUser("小華",175.5,72);
				 user3.printBMI();
		 
	}
}