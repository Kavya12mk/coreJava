package com.kavya.programs.arrays1;

public class AdditionOfMatrices
{
    public static void main(String[] args) {
        int matrix1[][]={{1,2,3},{4,5,6}};
        int matrix2[][]={{3,4,5},{3,2,1}};
        int resultMatrix[][]={{0,0,0},{0,0,0}};

        for (int i=0;i< matrix1.length;i++)
        {
            for (int j=0;j<matrix1[i].length;j++)
            {
                System.out.format("Stepping value of i=%d and j=%d\n",i,j);
                resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        for (int i=0;i< matrix1.length;i++)
        {
            for (int j=0;j<matrix1[i].length;j++)
            {
                System.out.print(resultMatrix[i][j]+" ");
                //resultMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
            System.out.println(" ");
        }
    }
}
