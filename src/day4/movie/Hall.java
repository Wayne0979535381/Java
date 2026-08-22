package day4.movie;

public class Hall {
	
	private Movie movie; 
	private String code;
	private String name;
	public Hall(Movie movie, String code, String name) {
		super();
		this.movie = movie;
		this.code = code;
		this.name = name;
	}
	public Movie getMovie() {
		return movie;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	
	

}
