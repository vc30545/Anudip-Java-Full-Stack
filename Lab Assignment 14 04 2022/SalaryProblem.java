package AssignmentQuestionLab1404;

import java.util.Scanner;

//Write a java program to find out below problem, in a small company, the average salary of three employees is Rs10000 per week. 
//If one employee earns Rs11000 and other earns Rs5000, how much will the third employee earn?
public class SalaryProblem {
	
	static int thirdEmpSal(int n , int a , int b) {
		int x = a+b;
		x= n*3- x;
		return x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter avg Salary");
		int avgSal = sc.nextInt();
		System.out.println("Enter 1st employye Salary");
		int firstEmpSal = sc.nextInt();
		System.out.println("Enter 2nd employye Salary");
		int SecondEmpSal = sc.nextInt();
		SalaryProblem obj  = new SalaryProblem();
		System.out.println("Third Employee Salary is  : "+ obj.thirdEmpSal(avgSal, firstEmpSal, SecondEmpSal));
	}

}
//-----------------output-------------
/*
 Enter avg Salary
10000
Enter 1st employye Salary
11000
Enter 2nd employye Salary
6000
Third Employee Salary is  : 13000
*/
