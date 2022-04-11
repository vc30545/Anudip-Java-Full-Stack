package com.company;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter No for reversing");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem= 0;
        for(int i=0; n>0; i++){
            rem = n % 10;
            System.out.println(rem);
            n = n/10;
        }
    }
}
