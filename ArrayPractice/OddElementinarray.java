package ArrayPractice;

import java.util.Scanner;

public class OddElementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size");
		int x  = sc.nextInt();
		int n[]= new int[x];
		System.out.println("Enter the elements");
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n.length;i=i+2) {
			System.out.println(n[i]+ " "+i);
		}
		System.out.println("odd Number");
		for(int i=0;i<n.length;i++) {
			if(n[i]%2==1) 
				System.out.println(n[i]);
		}
	}

}
