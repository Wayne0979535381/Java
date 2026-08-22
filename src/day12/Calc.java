package day12;


@FunctionalInterface
public interface Calc {
	double compute(double x,double y);
	String toString();
	
	default void copyright() {
		System.out.println("版權所有");
	}
	
	static void welcome() {
		System.out.println("歡迎使用");
	}
	

}
