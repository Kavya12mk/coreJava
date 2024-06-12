package com.kavya.programs;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        double area,radius,pi = 3.14;
        System.out.println("Enter value for radius:");
        radius = scanner.nextInt();
        scanner.close();
        area = pi*radius*radius;
        System.out.println("The area of circle:"+area);
    }
}
