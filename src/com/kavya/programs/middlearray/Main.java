package com.kavya.programs.middlearray;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        MiddleArray middleArray = new MiddleArray();
        System.out.println("enter the size of an array:");
        int size = scanner.nextInt();
        System.out.println("enter the array elements:");
        int myArray[] = new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("enter the element no "+i);
            myArray[i]=scanner.nextInt();
        }
        System.out.println("My array elements are:");
        for (int i=0;i< myArray.length;i++)
        {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(middleArray.findMiddleArray(myArray, myArray.length)));
    }
}
