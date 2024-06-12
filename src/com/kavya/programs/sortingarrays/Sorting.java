package com.kavya.programs.sortingarrays;

import java.util.Arrays;

public class Sorting
{
    public int[] sortedArray(int [] array)
    {
        int count1 =0;
        int count2 =0;
        int count3 =0;

        for (int i=0;i<array.length;i++)
        {
            if(array[i]==0)
            {
                count1++;
            }
            else if (array[i]==1)
            {
                count2++;
            }
            else
            {
                count3++;
            }
        }
        for (int i=0;i<count1;i++)
        {
            array[i]=0;
        }
        for (int i=count1;i<(count1+count2);i++)
        {
            array[i]=1;
        }
        for (int i=(count1+count2);i<array.length;i++)
        {
            array[i]=2;
        }
        return array;
    }
}
