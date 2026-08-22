package day2;

public class BMIDemo1 {

     public static void main(String[] args) {
		//計算某人的bmi資料
    	 //需要該員的身高體重
    	 //bmi攻式=體重kg/(身高m)2
    	 String name ="小明";
    			 double weight =60.0;
    			 double height =170.0;
    			 double bmi=(weight)/Math.pow(height/100.0,2);
    			 
    			 System.out.println("bmi執行結果:");
    			 System.out.printf("姓名:%s %n",name);
    			 System.out.printf("身高:%.1f cm %n",height);
    			 System.out.printf("身高:%.1f kg %n",weight);
    			 System.out.printf("bmi:%.2f %n",bmi);
	}



}
