package com.company;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int i;int fact =1;
        System.out.println("Enter any No");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is"+fact);

    }
}
