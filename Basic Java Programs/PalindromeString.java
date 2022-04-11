package com.company;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("ENter a string to chcek Palindrome or not");
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        String org_str = pal;
        int a = pal.length();
        String rev=" ";
        int i;
        for(i=a-1;i>=0;i--){
            rev = rev +pal.charAt(i);
        }
        //System.out.println(rev);
        if(org_str.equals(rev)){
            System.out.println(rev+"Palindrome"+org_str);
        }
        else{
            System.out.println(rev+"Not a Palindrome"+org_str);
        }

    }
}
