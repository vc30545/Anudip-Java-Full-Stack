package Basic;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int check = n;
		int sum =0;
		int i;
		for(i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n)
			System.out.println("Perfect Number "+sum);
		else
			System.out.println("Not a Perfect Number");
	}

}
