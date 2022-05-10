package Basic;
import java.util.*;

public class OddNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range upto....");
		int oddrange = sc.nextInt();
		int sum =0;
		sc.close();
		for(int i=1;i<=oddrange;i++){
			if(i%2!=0) {
				System.out.println(i);
				sum = sum+i;
			}
		}
		System.out.println("Sum of all Odd Number is : "sum);
	}
	
}
