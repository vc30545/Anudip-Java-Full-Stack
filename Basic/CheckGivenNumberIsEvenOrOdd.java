package Basic;
import java.util.*;
public class CheckGivenNumberIsEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  Number For checking Even Or Odd" );
		int n = sc.nextInt();
		sc.close();
		if(n%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}

}
