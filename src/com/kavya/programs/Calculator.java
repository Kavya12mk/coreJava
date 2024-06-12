package com.kavya.programs;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number1,number2,addition,subtraction,product,division;
        System.out.println("Enter values:");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        addition = number1+number2;
        subtraction = number1-number2;
        product = number1*number2;
        division = number1/number2;
        System.out.println("Sum:"+addition);
        System.out.println("Sub:"+subtraction);
        System.out.println("Mul:"+product);
        System.out.println("div:"+division);
        scanner.close();
    }
}

