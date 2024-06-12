package com.kavya.programs.sumofdigits;

public class SumOfDigits {
    public static void doSum(int number)
    {
        int sum = 0;
        for(int i=0;i<=number;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of digits are:"+sum);
    }
    public static void doAddDigits(int number1)
    {
        int count = 0;
        int digit;
        while(number1>0)
        {
            digit = number1%10;
            count = count+digit;
            number1 = number1/10;
        }
        System.out.println("Sum of digit:"+count);
    }
}
