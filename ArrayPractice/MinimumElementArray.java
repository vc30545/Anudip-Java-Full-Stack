package ArrayPractice;

import java.util.Scanner;

public class MinimumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter a Elements");
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min = a[i];
			}
		}
		System.out.println("Smallest element is"+min);
		
	}
}
