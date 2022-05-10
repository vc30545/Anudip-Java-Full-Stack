package ArrayPractice;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("For checking the array is Sorted Or Not");
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		//For taking input
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array is Sorted");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
