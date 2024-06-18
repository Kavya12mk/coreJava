package com.kavya.programs.strings;

import java.util.Scanner;

public class LongestString
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int number=scanner.nextInt();

        String longestString="";
        for (int i=0;i<number;i++)
        {
            System.out.println("Enter string " +(i+1)+":");
            String string=scanner.next();
            if(string.length()>longestString.length())
            {
                longestString=string;
            }
        }
        System.out.println("Longest String:"+longestString);
        scanner.close();
    }
}
