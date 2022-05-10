package Strings;

import java.util.Scanner;

public class PalinDifferMethod {
	
	static int CheckPalinString(String str) {
		int l = str.length();
		for(int i=0; i<l/2; i++) {
			if(str.charAt(i)!=str.charAt(l-1-i)) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		if(CheckPalinString(str)==1) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
