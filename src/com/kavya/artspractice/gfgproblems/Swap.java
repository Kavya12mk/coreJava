package com.kavya.artspractice.gfgproblems;

public class Swap
{
    public static void swapUsingThirdVariable(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a:"+a+" and value of b:"+b);
    }

    public static void swapWithoutUsingThirdVariable(int a,int b)
    {
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("value of a:"+a+" and value of b:"+b);
    }

    public static void main(String[] args)
    {
        Swap.swapUsingThirdVariable(5,10);
        Swap.swapWithoutUsingThirdVariable(6,10);

    }
}
