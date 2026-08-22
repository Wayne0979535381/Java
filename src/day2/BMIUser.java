package day2;

public class BMIUser {

	String name;
	double weight;
	double height;
	
	public BMIUser() {
	
	}
	private double calcBMI() {
	double bmi=weight/Math.pow(height/100,2);
	return bmi;
	}
public BMIUser(String name,double height,double weight) {
	this.name=name;
	this.height=height;
	this.weight=weight;
}

   public void printBMI() {
	double bmi=calcBMI();
	 System.out.println("bmi執行結果:");
	 System.out.printf("姓名:%s %n",name);
	 System.out.printf("身高:%.1f cm %n",height);
	 System.out.printf("身高:%.1f kg %n",weight);
	 System.out.printf("bmi:%.2f %n",bmi);
}
   }