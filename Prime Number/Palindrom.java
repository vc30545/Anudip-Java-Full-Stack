package com.company;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("enter a number to check number is palindrome or not : ");
        int n = v.nextInt();
        int r =0;
        int temp = n;
        for (; n>0 ; n= n/10){
            int remainder = n%10;
            r = r*10 + remainder;
        }
        if(temp==r){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
    }
}
