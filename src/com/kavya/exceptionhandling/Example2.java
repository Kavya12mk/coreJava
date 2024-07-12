package com.kavya.exceptionhandling;

//Example of throws keyword

public class Example2
{
    public static void method() throws ArithmeticException
    {
        int result = 12/0;
    }
    public static void main(String[] args)
    {
        try {
            method();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
