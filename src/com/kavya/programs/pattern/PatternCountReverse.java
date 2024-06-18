package com.kavya.programs.pattern;

import java.util.Scanner;

public class PatternCountReverse
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int count=1;
        for (int i = 1; i <= number; i++) {
            for (int j = number; j >i; j--)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
