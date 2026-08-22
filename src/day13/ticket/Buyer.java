package day13.ticket;

public class Buyer implements Runnable {
	
	// 票務系統
	private TicketSystem ticketSystem;
	
	public Buyer(TicketSystem ticketSystem) {
		this.ticketSystem = ticketSystem;
	}

	@Override
	public void run() {
		try {
			// 買票
			ticketSystem.buy();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}