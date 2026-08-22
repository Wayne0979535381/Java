package day4.movie;

public class FilmCatalog {
	
	
	private static final Movie TEAMS=new Movie("復仇指聯盟4","2hr30m");
	private static final Movie GIRLS=new Movie("陽光女子合唱團","2hr10m");
	
	private static final Hall[] HALLS= {
		new Hall(TEAMS,"A","iMax"),
		new Hall(TEAMS,"B","3D"),
		new Hall(GIRLS,"C","普通")
	};
	private static final Seat[] SEATS = {
			new Seat(HALLS[0], 1, 250), //0: A廳(放映復仇者聯盟4) 1排 $250元
			new Seat(HALLS[0], 2, 240), //1: A廳(放映復仇者聯盟4) 2排 $240元
			new Seat(HALLS[1], 3, 220), //2: B廳(放映復仇者聯盟4) 3排 $220元
			new Seat(HALLS[2], 2, 260), //3: C廳(陽光女子合唱團) 2排 $260元
	};
	public static Seat findByIndex(int index) {
		return SEATS[index];
	}
	
	public static String[] getAvailableSeats() {
		String[] list = new String[SEATS.length];
		for(int i=0;i<SEATS.length;i++) {
			list[i] = SEATS[i].displayName();
		}
		return list;
	}

}


