package com.kavya.programs.pattern;

import java.util.Scanner;

public class PatternCount
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int count=1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <i; j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}
