package Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String rev = "";
		int l = str.length();
		for(int i =l-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
