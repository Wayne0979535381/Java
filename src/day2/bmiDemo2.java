package day2;

public class bmiDemo2 {
	  public static void main(String[] args) {
		  String name ="小明";
				  double weight =60.0;
				  double height =170.0;
				  
				  
				  double bmi =calcBMI(weight, height);
				  printBMI(name,height,weight,bmi);
				  
				
					  String name2 ="小英";
							  double weight2 =45.5;
							  double height2 =160.0;
							  
							  
							  double bmi2 =calcBMI(weight, height);
							  printBMI(name2,height2,weight2,bmi2);
							  
				  
	  }
 private static double calcBMI(double w, double h) {
	 double bmi =w /Math.pow(h/100,2);
	 return bmi;
	 
}
 private static void printBMI(String name,double h, double w,double bmi) {
	 System.out.println("bmi執行結果:");
	 System.out.printf("姓名:%s %n",name);
	 System.out.printf("身高:%.1f cm %n",h);
	 System.out.printf("身高:%.1f kg %n",w);
	 System.out.printf("bmi:%.2f %n",bmi);
}
 }

