package com.kavya.programs.simpleshapehierarchy;

public class Rectangle extends Shape
{
    int length,width;

    public Rectangle(String color)
    {
        super(color);
        //this.length = length;
        //this.width = width;
        //System.out.println(length*width);
    }
    public int areaOfRectangle(int length,int width)
    {
        return length*width;
    }
}
