package com.kavya.artspractice.gfgproblems;

public class PascalTriangle
{
    public int factorial(int a)
    {
        if(a==0)
        {
            return 1;
        }
        return a*factorial(a-1);
    }

    public static void main(String[] args)
    {
        int a,b,k=4;
        PascalTriangle pascalTriangle=new PascalTriangle();
        for (a=0;a<=k;a++)
        {
            for (b=0;b<=k-a;b++)
            {
                System.out.print(" ");
            }
            for (b=0;b<=a;b++)
            {
                System.out.print(" "+pascalTriangle.factorial(a)/(pascalTriangle.factorial(a-b)* pascalTriangle.factorial(b)));
            }
            System.out.println();
        }

    }

}
