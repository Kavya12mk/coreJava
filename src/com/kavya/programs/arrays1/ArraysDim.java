package com.kavya.programs.arrays1;

import java.util.Scanner;

public class ArraysDim
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("enter the size of an array");
        size=scanner.nextInt();
        System.out.println("enter one dimesional array elements:");
        int array[] = new int[size];
        for (int i =0; i<size;i++)
        {
            System.out.println("enter the element of no " +i);
            array[i]=scanner.nextInt();
        }
        System.out.println("The one dimensional array is:");
        for (int i =0; i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

        int row,col;
        System.out.println("enter the row:");
        row = scanner.nextInt();
        System.out.println("enter the column:");
        col = scanner.nextInt();
        System.out.println("enter the 2d array elements:");
        int array1[][] = new int[row][col];
        for (int i =0; i<row;i++)
        {
            for (int j=0;j<col;j++) {
                System.out.println("enter the element of no " + i+" "+j);
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The 2D dimensional array is:");
        for (int i =0; i< row;i++)
        {
            for (int j=0;j< col;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
