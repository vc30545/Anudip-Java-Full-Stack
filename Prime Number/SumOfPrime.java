package com.company;

import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Starting Range ");
        int n = sc.nextInt();
        System.out.println("Enter Your Ending Range ");
        int m = sc.nextInt();

        for(int i=n;i<=m;i++){
            boolean Prime = true;
            if(i<=1){
                Prime = false;
            }
            for(int j=2;j<i;j++){
                if(i%j==0){
                    Prime = false;
                }
            }
            if(Prime==true){
                System.out.print(i +" ");
                sum = sum +i;
            }
        }
        System.out.println();
        System.out.println("Sum of all Prime Number is " +sum);
    }
}
