package com.kavya.recursion;

public class Factorial
{
    public int doFactorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n * doFactorial(n-1);
        }
    }
}
