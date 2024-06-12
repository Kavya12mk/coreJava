package com.kavya.programs.palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string:");
        String originalString = scanner.next();
        scanner.close();
        Palindrome.checkPalindrome(originalString);
    }
}
