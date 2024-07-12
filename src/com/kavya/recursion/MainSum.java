package com.kavya.recursion;

import java.util.Scanner;

public class MainSum
{
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        System.out.println("Sum of digits is:"+sumOfDigits.sumOfDigits(number));
    }
}
