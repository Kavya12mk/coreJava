package com.kavya.programs.simpleshapehierarchy;

public class Circle extends Shape
{
    double pi;
    int radius;

    public Circle(String color) {
        super(color);
        //this.pi = pi;
        //this.radius = radius;
        //System.out.println(pi*radius*radius);
    }

    public double areaOfCircle(double pi,int radius)
    {
        return pi*radius*radius;
    }
}
