package com.company;

import java.util.Scanner;

class Add{
    static int a;
    static int b;
    static int c ;
    static  String str;
    Add(int s, String t){
        a=s;
        str=t;
    }
    Add(int aa , int bb, String cc) {
        a = aa;
        b= bb;
        str=cc;
    }
    void disp(){
        System.out.println("The " +a+ " and "+b+ "Number of  "+str+" is "+(a+b));
    }
}

public class ConstOverloading {
    public static void main(String[] args) {
            System.out.println("We are making program for Method Overloading");
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the Two Number and 1 name");
            int s = sc.nextInt();
            int t =sc.nextInt();
            String v =sc.next();
            String str = sc.nextLine();
            Add c1 = new Add(s,v);
            c1.disp();
            Add c2 = new Add(s,t,v);
            c2.disp();

    }


}
