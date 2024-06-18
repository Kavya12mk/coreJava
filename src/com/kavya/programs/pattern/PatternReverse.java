package com.kavya.programs.pattern;

import java.util.Scanner;

public class PatternReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
