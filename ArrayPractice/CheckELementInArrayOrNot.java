package ArrayPractice;

import java.util.Scanner;

public class CheckELementInArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the number for checking");
		int check = sc.nextInt();
	
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(check == arr[i]) {
				System.out.println("Number is Found   "+ i+" at Position");
			}
		}

	}

}
