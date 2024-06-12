package com.kavya.programs.areaperimeterofrectangle;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        scanner.close();
        AreaPerimeter.performArea(length,breadth);
        AreaPerimeter.performPerimeter(length,breadth);
    }
}
