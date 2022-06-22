package Lab1606;

import java.util.Scanner;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Element");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int count=0;
		for(int i=0;i<size;i++) {
			//count =0;
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(count);
		int newarr[] = new int[size-count];
		int k=0;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size-1;j++) {
				if(arr[i]==arr[j]) {
					
				}
				else {
					newarr[k++]=arr[i];
				}
			}
		}
		
		for(int i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
		
		
	}

}
