package ArrayPractice;

import java.util.Scanner;

public class ArrayDeclaration2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];
		//For taking input
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		//for showing output
		for(int i=0;i<m;i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		

	}

}
