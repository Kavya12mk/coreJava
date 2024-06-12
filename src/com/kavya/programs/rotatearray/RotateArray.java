package com.kavya.programs.rotatearray;

public class RotateArray
{
    public int[] rotateArray(int[] array, int steps)
    {
        for (int i=0; i<steps;i++)
        {
            int j, last;
            last = array[array.length-1];
            for (j=array.length-1;j>0;j--)
            {
                array[j]=array[j-1];
            }
            array[0]=last;
        }
        return array;
    }
}
