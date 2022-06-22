package Lab1606;

import java.util.Scanner;

public class CountVowelsOccurInString {
	//Write a code to find total no of vowel in a string.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int count = 0;
		int i=0;
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') 
			{
				count +=1;
				System.out.print(str.charAt(i) +" ");
			}
		}
		System.out.println("\n Total no of vowel in a string : "+count);

	}

}
