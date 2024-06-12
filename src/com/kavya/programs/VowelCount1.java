package com.kavya.programs;

import java.util.Scanner;

public class VowelCount1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("String entered is:" + str);
        int vowel_count = 0, consonant_count = 0;
        char c[] = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u' || c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U') {
                vowel_count += 1;
            } else {
                consonant_count += 1;
            }
        }
        System.out.println("Vowel count is:" + vowel_count);
        System.out.println("constant count is:" + consonant_count);
    }
}