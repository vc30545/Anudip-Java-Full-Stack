package ArrayPractice;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Find out Duplicate elements");
		System.out.println("ENter a Size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					sum+=1;
					System.out.println(arr[i]);
				}
				
			}
		}
		System.out.println("Sum of The Number is "+sum);
	}

}
