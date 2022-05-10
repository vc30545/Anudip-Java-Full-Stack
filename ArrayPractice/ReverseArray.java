package ArrayPractice;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Reverse the array");
		System.out.println("ENter a Size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Reverse the array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
	}

}
