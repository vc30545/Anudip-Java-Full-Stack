package ArrayPractice;

import java.util.Scanner;

public class PeakElementOccur {

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
		for(int i=1;i<n.length-1;i++) {
			if((n[i]>n[i+1]) && (n[i]>n[i-1])){
				sum=sum +1;
				System.out.println("Peak Element"+n[i]);
			}
		}
		System.out.println("Peak Elment occur in"+sum);

	}

}
