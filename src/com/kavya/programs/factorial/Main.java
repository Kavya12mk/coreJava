package com.kavya.programs.factorial;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        scanner.close();
        Factorial.doFactorial(number);
    }
}
