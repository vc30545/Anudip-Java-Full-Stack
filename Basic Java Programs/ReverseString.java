package com.company;

public class ReverseString {
    public static void main(String[] args) {
        String  a = "Vishal";
        String b = "";
        int c= a.length();
        int i;
        for(i=c-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println(b);

    }
}
