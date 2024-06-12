package com.kavya.artspractice.gfgproblems;

import java.util.Arrays;

public class Fibonacci
{
    public static int fibonacci(int number)
    {
        int fib[]=new int[number+1];
        fib[0]=0;
        fib[1]=1;

        int sum=0;

        for (int i=2;i<=number;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
            if(i%2==0)
            {
                sum=sum+fib[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int number=4;
        System.out.println("sum is:"+Fibonacci.fibonacci(number));
    }
}
