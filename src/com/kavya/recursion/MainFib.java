package com.kavya.recursion;

import java.util.Scanner;

public class MainFib
{
    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        System.out.println("The fibonacci of number is:"+fibonacci.doFibonacci(number));
        for(int i=0;i<number;i++)
        {
            System.out.print(fibonacci.doFibonacci(i)+" ");
        }
    }
}
