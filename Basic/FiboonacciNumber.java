package Basic;
import java.util.*;

public class FiboonacciNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Range of Fibbonacci Number" );
		int range = sc.nextInt();
		int a = 0 ;
		int b = 1;
		System.out.print(a+" "+b);
		sc.close();
		for(int i =1;i<=range;i++) {
			int c = a+b;
			a = b;
			b=c;
			System.out.print(" "+c);
		}
	}

}
