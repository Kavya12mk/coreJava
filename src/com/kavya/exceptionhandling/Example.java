package com.kavya.exceptionhandling;

import java.util.Scanner;

public class Example
{
    public static void main(String[] args) {
        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numbers:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number1 / number2);
        } catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
