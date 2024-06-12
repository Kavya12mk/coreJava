package com.kavya.programs.primenumber;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        scanner.close();
        PrimeNumber.checkPrime(number);
    }
}
