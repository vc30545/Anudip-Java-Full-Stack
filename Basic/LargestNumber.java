package Basic;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a Three Element or Value or Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b & a>c) {
			System.out.println("The largest Number is"+a);
		}
		else if(b>c && b>a) {
			System.out.println("The Largest Number is "+b);
		}
		else if(c>a && c>b) {
			System.out.println("The Largest Number is " +c);
		}
		else
			System.out.println("All numbers are same");
		

	}

}
