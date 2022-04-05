package com.company;

import java.util.Scanner;

class Addition{
    static int a;
    static int b;
    static int c ;
    Addition(int s, int t){
        a=s;
        b=t;
    }
    Addition(Addition r) {
    }
    static int add(){
        int c=a+b;
        return c;
    }
}
public class CopyConst {
    public static void main(String[] args) {
        System.out.println("We are making program for Copy Constructor");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Two Number");
        int s = sc.nextInt();
        int t =sc.nextInt();
        Addition r = new Addition(5,10);
        Addition r1 = new Addition(r);
        System.out.println("The Addition of "+s+" + "+t + " is : " + r1.add());
    }
}
