package Lab1606;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateArrayJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Element");
		int size = sc.nextInt();
		int arr[]= new int[size]; // 1 5 2 6 1 2 3 6 4 7
		//for  loop for storing element 
		System.out.println("Enter the elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//array sorted using Arrays.sort
		Arrays.sort(arr);
		
		//Taking new array for temp storing element
		int temp[] = new int[size];
		int dupele = 0;
		int j=0;
		for(int i=0;i<size-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]= arr[i]; //1  2 3 4 5 6
				j++;
			}
			
		}
		//for last element
		temp [j++] = arr[size-1];
		System.out.println(j);
		
		System.out.println("Old array");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
	
		System.out.println("\n After removing duplicate Element");
		for(int k=0; k<j; k++) {
			System.out.print(temp[k] + " ");
		}
		
	}

}
