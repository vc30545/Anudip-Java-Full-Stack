package com.company;

import java.util.Scanner;

public class MethodPrime {

    static  int PrimeCheckMethod(int n)
    {
        if(n<=1){
            return 1;
        }
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                return 1;
            }
        }
        return 0;

    }





    static  int PrimeCheck(int n )
    {
        if(n<=1){
            return 1;
        }
        int temp = 0;
        for (int i=2;i<=n-1;i++){
            if (n%i==0){
                temp=temp + 1;
            }
        }
        if(temp==0)  //(temp>0)
             {
            return 0;
        }
        else{
            return  1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        if(PrimeCheckMethod(n)==0){
            System.out.println("Prime ");
        }
        else {
            System.out.println("Not Prime");
        }

    }
}
