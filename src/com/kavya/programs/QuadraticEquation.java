package com.kavya.programs;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,x,result;
        System.out.println("Enter values:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        x = scanner.nextInt();
        scanner.close();
        result = a*(x^2)+(b*x)+c;
        System.out.println("The result is:"+result);
        if(result==0)
        {
            System.out.println("Quadratic");
        }
        else
        {
            System.out.println("Not Quadratic");
        }

        scanner.close();

    }
}