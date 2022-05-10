package ArrayPractice;

import java.util.Scanner;

public class ArrayCopyFrom1To2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Copy all elemnts in  arr1 to arr2");
		System.out.println("ENter a Size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[arr.length];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//for Copying arr1 to arr2
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		System.out.println("array 1 printing");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("Array Two Printing");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");
		}
		

	}

}
