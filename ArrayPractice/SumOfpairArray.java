package ArrayPractice;

import java.util.Scanner;

public class SumOfpairArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Find out Sum of pair");
		System.out.println("ENter a Size");
		int n = sc.nextInt();
		System.out.println("Enter the checking number of sum");
		int check = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]+arr[j]==check) {
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}

	}

}
