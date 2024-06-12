package com.kavya.programs.selectionsort;

public class SelectionSort
{
    public int[] sortingAsc(int array[])
    {
        int temp;
        for (int i=0;i<array.length;i++)
        {
            int min_Index = i;
            for (int j=i+1;j<array.length;j++)
            {
                if(array[j]>array[min_Index])
                {
                    min_Index=j;
                }
                temp = array[min_Index];
                array[min_Index] = array[i];
                array[i]=temp;
            }
        }
        return array;
    }
    public int[] sortingDesc(int array[])
    {
        int temp;
        for (int i=0;i<array.length;i++)
        {
            int max_Index = i;
            for (int j=i+1;j<array.length;j++)
            {
                if(array[j]>array[max_Index]);
                {
                    max_Index=j;
                }
                temp = array[max_Index];
                array[max_Index]=array[i];
                array[i]=temp;
            }
        }
        return array;
    }
}
