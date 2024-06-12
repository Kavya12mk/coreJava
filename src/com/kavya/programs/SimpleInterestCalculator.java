package com.kavya.programs;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int principal,rate,time,simpleInterest;
        System.out.println("Enter the values for principal,rate, and time:");
        principal = scanner.nextInt();
        rate = scanner.nextInt();
        time = scanner.nextInt();
        scanner.close();
        simpleInterest = (principal*rate*time)/100;
        System.out.println("SimpleInterest:"+simpleInterest);
    }
}
