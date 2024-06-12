package com.kavya.programs;

import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int i,fact=1;
        scanner.close();
        if(number==0 & number==1)
        {
            System.out.println(fact);
        }
        else
        {
            for(i=1;i<=number;i++)
            {
                fact*=i;
            }
        }
        System.out.println("The com.kavya.programs.factorial of number"+number+"is:"+fact);
    }
}
