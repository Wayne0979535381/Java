package day5.parking;

import java.util.Scanner;

import day5parking.Bike;
import day5parking.Car;
import day5parking.ParkingLot;

public class TestParkingLot {
	
	public static void main(String[]args) {
		ParkingLot lot=new ParkingLot(10);
		lot.showParkingLot();
		
		Car car2=new Car(2,"1234-AB");
		Car car=new Car(4,"1111-CC");
		Bike bike=new Bike (false,"5678-XY");
		
		
		lot.parking(car2,2);
		lot.parking(car,2);
		lot.parking(bike,1);
		lot.showParkingLot();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("請輸入車牌號");
		String plateNumber=scanner.next();
		
		lot.removeCar(plateNumber);
		lot.showParkingLot();
		
		scanner.close();
		
		
		
	}

}
