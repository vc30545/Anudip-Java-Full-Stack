package Polymorphism;
import java.util.Scanner;
public class CarFactory {

	
	
	Car getCar() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the car name : ");
		String  carname = sc.nextLine();
		sc.close();
		
		Engine e1=new Engine("TATA", 200);
		Engine e2=new Engine("MARUTI", 400);
		
		if(carname.equalsIgnoreCase("TataSumo")) {
			return new TataSumo("sedan",e1);
		}
		else if(carname.equalsIgnoreCase("Swift")) {
			return new Swift("hachback",e2);
		}
		else {
			return null;
		}
		
	}
	
	
}
