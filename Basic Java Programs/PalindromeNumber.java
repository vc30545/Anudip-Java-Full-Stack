package com.company;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int r;
        int s=0 ;
        System.out.println("Enter No to check number is palindrome or not");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =n;
        while(n>0){
        //for(; n>0; n=n/10){
            r=n%10;
            s= s*10+r;
            n=n/10;
        }
        if(c==s){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }

    }

}
