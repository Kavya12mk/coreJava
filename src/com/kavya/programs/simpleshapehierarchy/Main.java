package com.kavya.programs.simpleshapehierarchy;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double pi=3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values:");
        int radius = scanner.nextInt();
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        Circle circle = new Circle("orange");
        System.out.println(circle.areaOfCircle(pi,radius));

        //Circle circle = new Circle("orange",3.14,10);
        //System.out.println(circle.areaOfCircle(pi,radius));
        //Rectangle rectangle = new Rectangle("Pink",10,20);
        //System.out.println(rectangle.areaOfRectangle(length,width));

        Rectangle rectangle = new Rectangle("Yellow");
        System.out.println(rectangle.areaOfRectangle(length,width));
    }
}
