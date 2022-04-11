package com.company;

public class DoWhileUsingMethod {
    static int DoWhile(int n) {
        int i = 10;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= n);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(DoWhileUsingMethod.DoWhile(50));
    }
}
