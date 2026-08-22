package day12;

public class TestCalc3 {
	
	public static void main(String[] args) {
		Calc ca = MathUtil::add;
		System.out.println(ca.compute(20.5, 10));
		ca.copyright();
		
		Calc.welcome();
	}

}
