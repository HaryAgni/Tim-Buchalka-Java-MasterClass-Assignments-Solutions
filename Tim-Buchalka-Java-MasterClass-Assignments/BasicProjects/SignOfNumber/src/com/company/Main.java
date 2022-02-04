package com.company;

public class Main {
    public static void main(String []args){
        checkNumber(-20);
    }

    public static void checkNumber(int num){
        if (num>0){
            System.out.println("Posiive");
        }
        else if (num<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
    }

}
