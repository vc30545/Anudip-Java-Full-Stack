package inheritance;
import java.util.*;
public class ThirdClass extends SecondClass {
	 int std  = 02522;
	 String place= "Thane";
	 void display () {
		 System.out.println("Std number is:"
		 		+ " "+std+ "Place "+place);
	 }
	 public static void main(String[] args) {
		ThirdClass v = new ThirdClass();
		v.display();
		v.dis();
		v.disp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 number");
		int s = sc.nextInt();
		int t = sc.nextInt();
		
		System.out.println("Addition of two number is : " +v.add(s,t));
		v.subtract(s,t);
		System.out.println(v.name);
		System.out.println(v.a);
		System.out.println(v.b);
		System.out.println(v.std);
		System.out.println(v.place);
	}

}
