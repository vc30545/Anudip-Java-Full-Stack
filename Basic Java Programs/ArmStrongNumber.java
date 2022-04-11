package com.company;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter Any No to check NO Is Armstrong");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int c= n;
        int arm =0 ;
        while(n>0){
            int rem = n%10;
            arm = arm + (rem*rem*rem);
            n=n/10;
        }
        if(c==arm)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
