package com.kavya.programs.bubblesort;

public class BubbleSort
{
    public int[] sortingAsc(int [] array)
    {
        int temp;
        for (int i=0;i<array.length;i++)
        {
            for (int j=1;j<(array.length-i);j++)
            {
                if(array[j-1]>array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int[] sortingDesc(int [] array)
    {
        int temp;
        for (int i=0;i<array.length;i++)
        {
            for (int j=1;j<array.length-i;j++)
            {
                if(array[j-1]<array[j])
                {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
