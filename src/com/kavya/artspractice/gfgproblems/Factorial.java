package com.kavya.artspractice.gfgproblems;

public class Factorial
{

    public static void factorial(int number)
    {
        int fact=1;
        if(number==1||number==0)
        {
            System.out.println(fact);
        }
        else
        {
            for (int i=1;i<=number;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }

    public static void main(String[] args)
    {
       int number=5 ;
       Factorial.factorial(number);
    }
}
