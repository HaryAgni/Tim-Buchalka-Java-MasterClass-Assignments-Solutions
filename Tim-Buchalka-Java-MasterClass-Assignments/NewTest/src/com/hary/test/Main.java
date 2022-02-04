package com.hary.test;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(input());



        }
    public static int input() {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            return a;
        }
        catch (InputMismatchException e){
            return 0;

        }
    }
}
