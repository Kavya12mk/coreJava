package com.kavya.programs.multiplicationtable;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        scanner.close();
        MultiplicationTable.doTables(number);
    }
}
