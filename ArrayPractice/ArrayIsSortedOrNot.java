package ArrayPractice;

import java.util.Scanner;

public class ArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("For checking the array is Sorted Or Not");
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		boolean flag = true;
		//For taking input
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//for showing output
		for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag = false;
				break;	
			}
			
		}
		if(flag==true) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}

}
// 1 2 3 4 5