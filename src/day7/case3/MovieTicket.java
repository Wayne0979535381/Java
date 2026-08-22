package day7.case3;

public class MovieTicket implements Ticket{
	
	private double price;
	private int qty; 
	public MovieTicket(double price,int qty) {
		this.price=price;
		this.qty=qty;
	}
	
	public int getQty() {
		return qty;
	}

	@Override
	public double book() {
		// TODO Auto-generated method stub
		return (price * qty)+calculateFee();
	}

	@Override
	public double refund() {
		// TODO Auto-generated method stub
		return (price * qty);
	}

	@Override
	public double calculateFee() {
		// TODO Auto-generated method stub
		return (price * qty)*0.01;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
