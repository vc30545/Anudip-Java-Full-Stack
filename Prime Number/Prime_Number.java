package com.company;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
//        int i ,temp = 0;
//        System.out.println("Enter your number");
//        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//        for (i=2;i<=n-1;i++){
//            if (n%i==0){
//                temp=temp + 1;
//            }
//        }
//        if(temp==0)//(temp>0)
//             {
//            System.out.println(" Prime Number");
//        }
//        else{
//            System.out.println(" not prime ");
//        }


//        int n,j,temp=0;
//        for(n=0;n<=100;n++)
//        {
//            for(j=2;j<=n-1;j++)
//            {
//                if(n%j==0)
//                {
//                    temp =temp+1;
//                }
//            }
//            if(temp>0){
//                temp=0;
//            }
//            else{
//                System.out.println(n);
//            }
//
//        }
//

        /*
        int i ,n , temp;
        temp=0;
        n= 4;
        for (i=2; i<n-1; i++){
            if (n%i==0){
                temp =temp +1;
            }
        }
        if (temp==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }


         */


        int i , j, temp=0;
        for(i=0;i<=100;i++){
            for (j=2;j<=i-2;j++){
                if (i%j==0){
                    temp=temp+1;
                }
            }
            if (temp==0){
                System.out.println(i);
            }
            else{
                temp=0;
            }

        }
    }
}
