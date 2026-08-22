package day10.entity;

import java.util.List;

public class Order {
	   private Integer orderId;
	   private List<Drink>drinks;
	   
	   public Order() {
		   
	   }
	   
	   
	   public Order(Integer orderId, List<Drink> drinks) {
		this.orderId = orderId;
		this.drinks = drinks;
	   }
	   
	   public Integer getOrderId() {
		return orderId;
		}

	   public void setOrderId(Integer orderId) {
		   this.orderId = orderId;
	   }

	   public List<Drink> getDrinks() {
		   return drinks;
	   }

	   public void setDrinks(List<Drink> drinks) {
		   this.drinks = drinks;
	   }

	   @Override
	   public String toString() {
		return "Order [orderId=" + orderId + ", drinks=" + drinks + "]";
	   }
	   
	   
	   

}
