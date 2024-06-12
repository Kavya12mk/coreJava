package com.kavya.programs;

import java.awt.*;
import java.util.Scanner;

public class Addition {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values:");
        int num1 = scan.nextInt();;
        int num2 = scan.nextInt();;
        int result = num1+num2;
        System.out.println("num1:"+num1);
        System.out.println("num2:"+num2);
        System.out.println("Addition of 2 no's :"+result);
        scan.close();
    }

}

