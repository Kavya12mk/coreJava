package com.kavya.methods;

public class Factorial
{
    public int giveFactorial(int number)
    {
        int fact=1;
        if (number == 1 || number == 0)
        {
            System.out.println(fact);
        }
        else
            {
                for (int i = 1; i <= number; i++)
                {
                    fact = fact * i;
                }
            }
        return fact;
    }
}
