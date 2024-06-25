package com.kavya.programs.pattern;

import java.util.Scanner;

public class AlphaPattern
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = 'A';
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + " ");
                character++;
            }
            System.out.println();
        }
    }
}
