package Basic;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range upto....");
		int range = sc.nextInt();
		sc.close();
		for(int i=2; i<=range;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
