package com.hary.test;
// Factorial of a Number
public class Main {
    public static int factorial =1;
    public static int fact(int n){
        if (n<=1){
            return 1;
        }

        fact(n-1);
        factorial = factorial *n;
        return factorial;
    }

    public static void main(String[] args) {
        int n =5;
        int ans = fact(n);
        System.out.println(ans);
    }
}
