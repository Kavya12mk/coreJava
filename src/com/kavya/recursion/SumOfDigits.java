package com.kavya.recursion;

public class SumOfDigits
{
    public int sumOfDigits(int n)
    {
        if(n==0)
        {
            return n;
        }
        else
        {
            return (n%10) + sumOfDigits(n/10);
        }
    }
}
