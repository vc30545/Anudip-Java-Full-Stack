package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter No to check number is Prime or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =0;


        if(n<=1) {
            temp = temp +1;

        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                temp = temp +1;
            }
        }

        if(temp == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
