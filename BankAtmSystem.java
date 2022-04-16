package com.company;

import java.util.Scanner;

public class BankAtmSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        boolean exit = false;
        do {


            System.out.println("Select your option");
            System.out.println("1.Credit \n 2.Debit \n 3.balanced \n 4. Exit");
            int Choice = sc.nextInt();
            int balanced = 100;

            switch(Choice){
                case 1: {
                    System.out.println("credit option selected");
                    System.out.println("enter the amount");
                    int credit = sc.nextInt();
                    if (credit <= 0) {
                        System.out.println("Enter amount must be greater than 0");
                    }
                    else{
                        balanced = credit + balanced;
                        System.out.println("Amount credited    : " + credit);
                        System.out.println("The Total Amount   is   :" + balanced);
                    }
                }
                break;

                case 2: {
                    System.out.println("debit Option selected");
                    System.out.println("enter the amount");
                    int debit = sc.nextInt();
                    if (balanced <= debit) {
                        System.out.println("Plz enter amount below the balanced amount");
                    }
                    else{
                        balanced = balanced - debit;
                        System.out.println("Your Debited Amount : " + debit);
                        System.out.println("The amount in Your Account is : " + balanced);
                    }
                }
                    break;
                case 3:{
                    System.out.println("Display");
                    System.out.println("The Total amount in Your Account is : "+balanced);
                }
                    break;

                case 4:
                    exit=true;
                    System.out.println("Thanks For the Using Our ATM");
                    break;
                default:
                    System.out.println("Wrong option selected");
            }

        } while (exit==false);

    }

}
