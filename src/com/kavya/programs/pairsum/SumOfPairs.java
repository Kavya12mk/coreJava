package com.kavya.programs.pairsum;

public class SumOfPairs
{
    public int[] sumOfPairs(int [] array, int key)
    {
        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if(array[i]+array[j]==key)
                {
                    System.out.println("("+array[i]+","+array[j]+")"+" ");
                }
            }
        }
        return array;
    }

}
