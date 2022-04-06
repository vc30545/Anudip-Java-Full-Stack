package com.company;

import java.util.Scanner;

public class CheckInputNumberSameOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 3 diffrent numbers:");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        if((n1==n2) && (n2==n3) && (n1==n3)){

            System.out.println("All Numbers are equal");
        }
        else {
            if ((n1 == n2) || (n2 == n3)  || (n1 == n3)) {
                System.out.println("Neither different or equal");
            }
            else
                System.out.println("All Number Different ");
        }
    }
}
