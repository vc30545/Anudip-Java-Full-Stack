package ArrayPractice;

import java.util.Scanner;

public class MaximumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Maximum Element");
		System.out.println("ENter a Size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int max = Integer.MIN_VALUE;
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
