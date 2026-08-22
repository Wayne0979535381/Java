package day4.movie;

public class SeatOrder {
	private Seat seat;
	private int quantity;
	public SeatOrder(Seat seat, int quantity) {
		super();
		this.seat = seat;
		this.quantity = quantity;
	}
	public Seat getSeat() {
		return seat;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public  int getTotalPrice() {
		return seat.getPrice()*quantity;
		
	}

}
