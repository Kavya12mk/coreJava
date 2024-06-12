package com.kavya.programs.leapyear;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        scanner.close();
        LeapYear.checkLeapYear(year);
    }
}
