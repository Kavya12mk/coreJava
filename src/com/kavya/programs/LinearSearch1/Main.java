package com.kavya.programs.LinearSearch1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinearSearch1 linearSearch1 = new LinearSearch1();
        System.out.println("enter the size of an array:");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i=0;i<size;i++)
        {
            System.out.println("enter the element of array " +i);
            array[i] = scanner.nextInt();
        }
        System.out.println("The original array is:");
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println("enter the key element to search:");
        int key = scanner.nextInt();
        int position = linearSearch1.giveIndexOfLinearSearch(array,key);
        if (position == -1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("element found at position: "+(position+1));
        }
    }
}
