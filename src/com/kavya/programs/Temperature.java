package com.kavya.programs;

import java.util.Scanner;

public class Temperature {
    public static void main(String args[]) {
        int temp, temp_C, temp_F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temp in Fahrenheit:");
        temp_F = scanner.nextInt();
        temp_C = ((temp_F - 32) * (5 / 9));
        System.out.println("The temperature in celsius is:" + temp_C);
        System.out.println("Enter the temperature in celsius:");
        temp_C = scanner.nextInt();
        temp_F = temp_C * (9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit is:" + temp_F);
        scanner.close();
    }
}