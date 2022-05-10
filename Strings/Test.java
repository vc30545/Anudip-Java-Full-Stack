package Strings;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AAAACCKKK
		//aaa3cc2aa2
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			int sum=1;
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
				sum++;
				i++;
			}
//			
////		
			
			
			
//			for(int j=0;j+1<str.length();j++) {
//				if(str.charAt(i)==str.charAt(j+1)){
//					sum++;
//				}
//			}
		
			
			
			System.out.print(str.charAt(i)+" "+sum+" ");
		}
		//System.out.println();
		
		
//		char[] ch = str.toCharArray();
//		//int sum =0;
//		for(int i=0;i<ch.length;i++) {
//			int sum=0;
//			for(int j=0;j<ch.length;j++)
//			if(ch[i]==ch[j]){
//				sum++;
//				//System.out.print(ch[i]+" "+sum+" ");
//			}
//			System.out.print(ch[i]+" "+sum+" ");
//			System.out.println();
//		}
//		System.out.println();
		
	}

}
// 