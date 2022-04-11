package com.company;

import java.util.Scanner;

public class While_loops_5 {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for( int i=1; i<=n; i++){
//            int a = 2* i ;
//            System.out.println(a);
//        }


//        int i = 1;
//        while( i<=n){
//            System.out.println(i);
//            i++;
//        }

//        int i =  0 ;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i <= 100);

        for (int i = n; i != 0; i--){
            System.out.println(i);
        }



    }





}
