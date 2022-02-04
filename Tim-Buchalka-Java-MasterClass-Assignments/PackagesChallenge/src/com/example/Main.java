package com.example;

public class Main {
    public static void nSum(int n){
        int i = 0;
        int sum = 0;
        while (i<=n){
            System.out.println(sum);
            sum = sum + i;
            i++;
        }
    }
    public static void factorial(int n){
        int i =1;
        int fact =1;
        while (i<=n){
            fact = fact *i;
            System.out.println(fact);
            i++;
        }
    }
    public static void fibonacci(int n){
         int i = 0;
         int series = 1;
         while (i<=n){
             if (i<2){
                 System.out.println(i);
                 i++;
             }
             else{
                 i++;
                 System.out.println(series);
                 series = (i-1)+(i-2);

             }
         }
    }

    public static void main(String[] args) {
        factorial(10);
        fibonacci(10);
    }
}
