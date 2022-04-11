package com.company;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Number");
//        int n = sc.nextInt();

        int i=10;
        int sum = 0;
        do {
            //System.out.println(i);
            sum = sum + i;
            i++;
        }while (i <= 20);
        System.out.println(sum);
    }
}
