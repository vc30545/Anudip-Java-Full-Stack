package ArrayPractice;

import java.util.Scanner;

public class CheckElementPresentOrNot2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the size of the array m and n: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Enter the checking Element");
		int check  =sc.nextInt();
		int arr[][]= new int[m][n];
		System.out.println("Enter the Array Elements");
		int i,j;
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int sum =0;
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				if(arr[i][j]==check) {
					sum+=1;
					System.out.println("Number is found at index"+i+" "+j);
				}
//				else {
//					System.out.println("Not  Present");
//				}
			}
		}
		System.out.println("Number Occur is "+sum+" Times in this array");
		
	}

}
