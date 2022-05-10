package Polymorphism;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.println(" enter driver details name and lno ...");
		String DrivName = sc.next();
		
		int LicenceNumber = sc.nextInt();
		
		Car ctype =  new CarFactory().getCar();
		Driver d = new Driver(DrivName,LicenceNumber);
		sc.close();
		
		if(ctype!=null) {
			d.drive(ctype);
			
			ctype.display();
			
			
		}
		else {
			System.out.println("Sorry Car not availabel!!!");
		}
		
		
		}

}
