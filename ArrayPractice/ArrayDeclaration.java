package ArrayPractice;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		//For taking input
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//for showing output
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
