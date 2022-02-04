package com.example.mylibrary;


public class Series {
    public static void nSum(int n){
        int i =0;
        int sum =0;
        while (i<=n){
            sum+= i;
            System.out.println(sum);
            i++;
        }
    }
    public static void factorial(int n){
        int i =0;
        int fact=1;
        while (i<=n){
            if (i==0){
                System.out.println(i);
                i++;
            }
            else {
                fact = fact * i;
                System.out.println(fact);
                i++;
            }
        }
    }
    public static void fibonacci(int n){
        int i =0;
        int num1=0;
        int num2=1;
        while (i<=n){
            System.out.println(num1);
            int num3 = num1+num2;
            num1 =num2;
            num2 = num3;
            i++;
        }
    }

}
