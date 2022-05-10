package Strings;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.next();
		System.out.println("Enter a 2nd String");
		String word2 = sc.next();
		int n=word.length();
		for(int i=0;i<n;i++) {
			if(word.charAt(i)==word2.charAt(i)) {
				System.out.println("Matching");
				return;
			}
		}
		System.out.println("not matching");
	}

}
//ANNDDA
//NAADND

//Input1 : ANNDDA 
//Input 2: NAADNN
