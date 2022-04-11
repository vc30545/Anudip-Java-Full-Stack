package com.company;

import java.util.Scanner;

public class PrimeRangeShow {
    public static void main(String[] args) {
        System.out.println("Enter No to range for ex. 1 -10");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int i,j;
        int temp=0;
        for(i=a; i<=n;i++)
        {
//            temp=0;

          if(n<=1)
          {
           break;
          }
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    break;

                }
            }
            if(i==j)
                System.out.println(j);

        }





    }
}
