package com.kavya.programs;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check whether even or odd:");
        int number = scanner.nextInt();
        scanner.close();
        String result = (number%2)==0?"Even":"Odd";
        System.out.println("The number is :"+result);
    }
}
