package AssignmentQuestionLab1502;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int lcm=sc.nextInt();
		int ratio_num1=sc.nextInt();
		int ratio_num2=sc.nextInt();
		sc.close();
		
		int num1= (ratio_num1*lcm)/(ratio_num1*ratio_num2);
		int num2= (ratio_num2*lcm)/(ratio_num1*ratio_num2);
		
		if(num1<num2) {
			System.out.println("Smaller number is : "+num1);
		}
		else {
			System.out.println("Smaller number is : "+num2);
		}

	}

}
