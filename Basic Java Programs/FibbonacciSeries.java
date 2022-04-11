package com.company;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        System.out.print(a + " " + b);
        for(int i=1;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
