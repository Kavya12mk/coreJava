package com.kavya.programs.targetsum;

public class TargetSum
{
    public int[] giveIndex(int array[], int target)
    {
       for(int i=0;i<array.length;i++)
       {
           for (int j=0; j<array.length;j++)
           {
               if(target==array[i])
               {
                   return new int[]{i,j};
               }
           }
       }
      throw new RuntimeException("Not found");
    }
}
