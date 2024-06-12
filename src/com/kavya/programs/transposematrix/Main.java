package com.kavya.programs.transposematrix;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int [][]matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int row= matrix.length, col= matrix[0].length;
        int transposedmatrix[][] = new int[row][col];
        System.out.println("Original Matrix:");
        for (int i=0;i< matrix.length;i++)
        {
            for (int j=0;j< matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                transposedmatrix[i][j]=matrix[j][i];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i=0;i< transposedmatrix.length;i++)
        {
            for (int j=0;j< transposedmatrix.length;j++)
            {
                System.out.print(transposedmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
