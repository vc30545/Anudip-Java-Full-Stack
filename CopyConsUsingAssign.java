package com.company;
import java.util.Scanner;
class Subtract{
    static int a;
    static int b;
    static int c ;
    Subtract(int s, int t){
        a=s;
        b=t;
    }
    Subtract() {
    }
    static int add(){
        int c=a+b;
        return c;
    }
}
public class CopyConsUsingAssign {
    public static void main(String[] args) {
        System.out.println("We are making program for Copy Constructor using Assign Method");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Two Number");
        int s = sc.nextInt();
        int t =sc.nextInt();
        Subtract old = new Subtract(5,10);
        Subtract newnew = new Subtract();
        newnew.a=old.a;
        newnew.b=old.b;
        System.out.println("The Addition of "+s+" + "+t + " is : " + old.add());
        System.out.println("The Addition of "+s+" + "+t + " is : " + newnew.add());
    }
}
