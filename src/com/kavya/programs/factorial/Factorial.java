package com.kavya.programs.factorial;

public class Factorial {
    public static void doFactorial(int number)
    {
        int fact=1;
        if(number==0||number==1)
        {
            System.out.println("The com.kavya.programs.factorial of "+number+" is:"+fact);
        }
            for(int i=1;i<=number;i++)
            {
                fact=fact*i;
            }
            System.out.println("The fatorial of "+number+" is:"+fact);
        }
    }


