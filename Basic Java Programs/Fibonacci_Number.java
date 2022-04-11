package com.company;

public class Fibonacci_Number {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        int sum = 0;
        for(int i=1;i<=2;i++){
            int c = a+b;
            a=b;
            b=c;
            sum = sum +c;
            System.out.print(" "+c);
        }
        System.out.println();
        System.out.print("Sum Of Fibbonacci Series is: ");
        System.out.println(1+sum);

    }
}
