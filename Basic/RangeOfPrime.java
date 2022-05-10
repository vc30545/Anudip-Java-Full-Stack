package Basic;

import java.util.Scanner;

public class RangeOfPrime {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a range a to z");
			int a = sc.nextInt();
			int z = sc.nextInt();
			int i=0;
			int j = 0;
			int sum = 0;
		
			for(i=a; i<=z; i++) {
				if(z<=1) {
					break;
				}
				for(j=2;j<=i;j++){
					if(i%j==0) {
						break;
					}
				}
				if(i==j) {
					sum+=j;
					System.out.println(j);
				}
			}
			System.out.println("Sum of The prime Number is : "+sum);
			
			
		}

}
