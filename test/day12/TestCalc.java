package day12;

public class TestCalc {
	public static void main(String[] args) {
		
		
		Calc calc1= new Calc() {
			
			@Override
			public double compute(double x, double y) {

				return  x+y;
			}
		};
		
		System.out.println(calc1.compute(20.5,10));
		
		
		Calc calc2 = (double x,double y) ->x+y;
		System.out.println(calc2.compute(20.5, 10));
		
		
		Calc calc3 = (x,y) -> x+y;
		System.out.println(calc3.compute(20.5,10));
		
		Calc calc4 = (double x,double y) ->{
			double result = x+y;
			return result;
		};
		System.out.println(calc4.compute(20.5, 10));
		
		
		
	}

}
