package com.company;

import java.util.Scanner;

public class PrimeAndPerfect {


    static int CheckPrimeOrNot(int n )
    {

        if(n<=1){
            return 0;
        }
        for(int i=0; i<n-1; i++ ){
            if(n%i==0) {
                return 0;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Starting range ");
        int a = sc.nextInt();
        System.out.println("Enter your Ending range ");
        int b = sc.nextInt();
        //PrimeAndPerfect v = new PrimeAndPerfect();
        if(CheckPrimeOrNot(b)==1){
            System.out.println("prime");
        }

        else{
            System.out.println("not prime");
        }






    }

}
