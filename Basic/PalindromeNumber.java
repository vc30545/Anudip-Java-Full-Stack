package Basic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pal = n;
		int rev = 0;
		for(int i=0; n>0;i++) {
			int rem = n %10;
			rev = rev*10+rem;
			n = n/10;
		}

		if(rev==pal)
			System.out.println(pal+" Palindrome "+rev);
		else
			System.out.println(pal+" Not Palindrome "+rev);
	}

}
