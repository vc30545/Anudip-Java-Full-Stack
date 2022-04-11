package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            for(int j = i; j<=i; j++){
                if(i>1 &&  i<=n-1){
                    System.out.println("*   *");
                }
                else{
                    System.out.println("*****");
                }
            }
        }
        System.out.println("");
    }
}
