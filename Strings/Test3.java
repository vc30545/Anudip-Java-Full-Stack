package Strings;

import java.util.Scanner;

public class Test3 {
	
	String Frequency(String str) {
		String re = "";
		String vishal="";
		for(int i=0;i<str.length();i++) {
			int sum=1;
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
				//sum++;
				i++;
				
			}
			vishal = vishal+str.charAt(i);
			
			//vishal =vishal+(str.charAt(i)+""+sum+"");
		}
		return vishal;
	}
	
	String Frequency2(String str) {
		String re = "";
		String vishal="";
		for(int i=0;i<str.length();i++) {
			int sum=1;
			while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
				sum++;
				i++;
				
			}
			vishal = vishal+str.charAt(i);
			//vishal =vishal+(str.charAt(i)+""+sum+"");
		}
		return vishal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = sc.next();
		System.out.println("Enter a 2nd String");
		String word2 = sc.next();
		Test3 ref = new Test3();
		ref.Frequency(word);
		
		System.out.println("Output of first String");
		System.out.println(ref.Frequency(word));
		System.out.println("Output Of Second String");
		System.out.println(ref.Frequency2(word2));
		
		if(ref.Frequency(word).equals(ref.Frequency2(word2))) {
			System.out.println("Matching");	
		}
		else {
			System.out.println("Not Matching");
		}
	}

}






//input1 : ANNDDA 
//Input 2: NAADND
//output: Matching
//Input1 : ANNDDA 
//Input 2: NAADNN
//output:not Matching






