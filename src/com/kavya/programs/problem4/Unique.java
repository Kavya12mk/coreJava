package com.kavya.programs.problem4;

public class Unique
{
    public int[] removeDuplicates(int array[])
    {
        int j=0;
        int newArray[] = new int[array.length];
        for (int i=0;i<array.length;i++)
        {
            if(checkNewArray(array[i],newArray))
            {
                 newArray[j]=array[i];
                 j++;
            }
        }
        return newArray;
    }

    private boolean checkNewArray(int value, int[] newArray) {
        for (int i=0;i<newArray.length;i++) {
            if(newArray[i]==value)
            {
                return false;
            }
        }
        return true;
    }
}
