package com.kavya.programs.arrays1;

public class twoDMatrix
{
    public static void main(String[] args) {
        int array[][]={{1,2},{4,5,6},{4},{7,8,9}};

        System.out.println("Total array length:" +array.length);
        for (int i=0;i< array.length;i++)
        {
            System.out.println("max column in row "+i+" "+array[i].length);
        }
    }
}
