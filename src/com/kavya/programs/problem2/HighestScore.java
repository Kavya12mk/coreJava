package com.kavya.programs.problem2;

public class HighestScore
{
    public int[] findHighestScore(int array[])
    {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++)
        {
            if(array[i]>firstHighest)
            {
                secondHighest = firstHighest;
                firstHighest = array[i];
            }
            else if(array[i]<firstHighest && array[i]>secondHighest)
            {
                secondHighest = array[i];
            }
        }
        return new int[]{firstHighest,secondHighest};
    }
}
