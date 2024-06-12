package com.kavya.programs.areaperimeterofrectangle;

public class AreaPerimeter {
    public static void performArea(int length, int breadth)
    {
        int area = length*breadth;
        System.out.println("Area of rectangle:"+area);
    }
    public static void performPerimeter(int length,int breadth)
    {
        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangle:"+perimeter);
    }
}
