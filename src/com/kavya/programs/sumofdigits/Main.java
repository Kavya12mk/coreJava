package com.kavya.programs.sumofdigits;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        scanner.close();
        SumOfDigits.doSum(number);
        SumOfDigits.doAddDigits(number);
    }
}
