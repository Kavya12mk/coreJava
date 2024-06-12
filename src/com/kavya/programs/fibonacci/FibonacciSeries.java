package com.kavya.programs.fibonacci;

public class FibonacciSeries {
    public static void doFibonacci(int number)
    {
        int fib1=0,fib2=1;
        System.out.print(fib1+" "+fib2);
        for(int i=0;i<number;i++)
        {
            int fib3 = fib1+fib2;
            System.out.print(" "+fib3+" ");
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}
