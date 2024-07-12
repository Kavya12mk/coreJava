package com.kavya.exceptionhandling;

//Example of throw keyword

public class Example3
{
    public static void method()
    {
        throw new ArithmeticException("Divide by zero is not possible");
    }
    public static void main(String[] args)
    {
        method();
    }
}
