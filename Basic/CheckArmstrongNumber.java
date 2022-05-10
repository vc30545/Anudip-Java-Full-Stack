package Basic;
import java.util.*;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for checking Armstrong Or Not");
		int check  = sc.nextInt();
		int temp = check;
		sc.close();
		int arm=0;
		for(;check>0;check=check/10) {
			int rem = check%10;
			arm = arm + (rem*rem*rem);
		}
		if(temp==arm)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong");
		
	}

}
