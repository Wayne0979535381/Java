package day7.lab1;

import java.util.Iterator;

public class TestPayment {
	
	public static void main(String[]args) {
		Payment payment1=new CreditCard();
		 Payment payment2=new LinePay();
		 Payment payment3=new ApplePay();
		 
		 Payment[]payments= {payment1,payment2,payment3};
		 
		 for(Payment payment : payments) {
			 System.out.println("=====付款測試=====");
				payment.pay(10000);
				
			 System.out.println("=====退款測試=====");
				payment.refund(10000);
			 
				System.out.println(); 

       
		
		 }
		
	}
	
	
	
}
