package com.kavya.recursion;

public class Fibonacci
{
    public int doFibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return doFibonacci(n-1)+doFibonacci(n-2);
        }
    }
}
