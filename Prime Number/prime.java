package com.company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
//        System.out.println("enter your number");
//        int temp =0 ;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=2;i<n-1; i++){
//            if(n%i==0){
//                temp =temp +1;
//            }
//        }
//        if(temp==0){
//            System.out.println("number is prime");
//        }
//        else{
//            System.out.println("Not a Prime");
//        }

        /*
        int n =2;
        boolean Prime =true;
        for(int i =2; i<n;i++){
            if(n%i==0){
                Prime= false;
                break;
            }
        }
        System.out.println(Prime);


         */

//        if(Prime == true){
//            System.out.println("Prime Number");
//        }
//        else{
//            System.out.println("Not a Prime");
//        }





        // 1 to 100 prime number
        //boolean Prime = true;
        for(int i=0;i<=100;i++){
            boolean Prime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    Prime = false;
                }
            }
            if(Prime){
                System.out.print(i +" ");
            }
        }

    }
}
