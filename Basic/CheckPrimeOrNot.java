package Basic;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Number");
		int check= sc.nextInt();
		boolean flag = true;
		if(check<=1) {
			flag = false;
		}
		for(int i=2;i<check;i++) {
			if(check%i==0) {
				flag = false;
			}
		}
		if(flag==true) {
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a Prime Number");

	}

}
