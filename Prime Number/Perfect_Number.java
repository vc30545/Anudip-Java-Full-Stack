package com.company;

import java.util.Scanner;

public class Perfect_Number {

    static int IsPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (n == sum)
            return 1;
        else
            return 0;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        if (Perfect_Number.IsPerfect(n) == 1) {
            System.out.println("Perfect");
        } else
            System.out.println("NOt perfect ");

    }







    }

