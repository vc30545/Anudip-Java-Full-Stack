package com.company;


import java.util.Scanner;

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
public class Pyramid {
    public static void main(String[] args) {
        System.out.println("pyramid");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

//First loop row
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                //For Space
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
