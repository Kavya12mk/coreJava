package com.kavya.recursion;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        System.out.println("The factorial of number is:"+factorial.doFactorial(number));


    }
}
