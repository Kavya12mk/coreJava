package com.kavya.programs.binarysearch;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("Enter the size of array:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i=0;i< arr.length;i++)
        {
            System.out.println("Enter array element no "+i);
            arr[i] = scanner.nextInt();

        }
        System.out.println("The original array is :");
        for (int i = 0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter element to search:");
        int key = scanner.nextInt();
        int position = binarySearch.giveIndex(arr,key,0, (arr.length-1));
        if (position == -1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("element found at position:"+(position+1));
        }
    }
}
