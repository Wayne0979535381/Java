package day4.movie;

public class TestSeatOrder {
	
	public static void main(String[] args) {
		System.out.println("測試資料");
		System.out.println("=================");
		
		Seat seat=FilmCatalog.findByIndex(0);
		System.out.println(seat.displayName());
		System.out.println();
		
		
		String[] list=FilmCatalog.getAvailableSeats();
		for(String item: list) {
			System.out.println(item);
		}
		


		
	}

}
