package com.kavya.programs;

public class ShiftOperators {
    public static void main(String args[])
    {
        int number1 = 1;
        int number2 = 2048;
        System.out.println("The left shift for power of 2 from 0 to 10");
        for(int i = 0;i<10;i++)
        {
            System.out.println(number1<<i);
        }
        System.out.println("The right shift for power of 2 from 0 to 10");
        for(int i = 0;i<10;i++)
        {
            System.out.println(number2>>i);
        }
    }
}
