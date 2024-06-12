package com.kavya.programs.methods;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();
        Calculator calculator = new Calculator();
        int result = calculator.doAddition(number1, number2);
        int mulResult = calculator.doMultiplication(number1, number2);
        System.out.println("The sum is:"+result);
        System.out.println("The produt is:"+mulResult);
    }
}
