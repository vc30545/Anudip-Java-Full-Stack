package Strings;

import java.util.Scanner;

public class Test2 {
	
	String Frequency(String str) {
		for(int i=0;i<str.length();i++) {
			int sum=1;
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
				sum++;
				i++;
			}
			System.out.print(str.charAt(i)+""+sum+"");
		}
		return "Vishal";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.next();
		Test2 ref = new Test2();
		ref.Frequency(word);
	}

}
