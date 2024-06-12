package com.kavya.programs.linearsearch;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int array[] = new int[]{2,7,9,10,8};
        int key = 8;
        for(int i = 0;i<array.length;i++)
        {
            if(key == array[i])
            {
                System.out.println("The key found at the position: "+i);
            }
        }
    }

}
