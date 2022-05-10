package Basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number for Reversing");
		int n  = sc.nextInt();
		int temp = n;
		sc.close();
		for(int i =0;n>0;i++) {
			int rem = n%10;
			System.out.println(rem);
			n = n/10;
		}

	}

}
