package day6;

public class Employee {
	
	public int getSalary() {
		return 45000;
	}

}

class Manager extends Employee{
	
	public int getBudget() {
		return 10_0000;
	}

	@Override
	public int getSalary() {
		return 80_0000;
	}
	
	
}

class Boss extends Manager{
	
	public int getStock() {
		return 500_0000;
	}

	@Override
	public int getBudget() {
		return 200_0000;
	}

	@Override
	public int getSalary() {
		return 1;
	}
	
	
}

