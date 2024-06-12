package com.kavya.artspractice;

public class MinValue
{
    public static void main(String[] args) {
        int []array={7,9,4,11};
        int minValue=array[0];
        for (int i=0;i< array.length;i++)
        {
            if(array[i]<minValue)
            {
                minValue=array[i];
            }
        }
        System.out.println("Lowest Value:"+minValue);
    }
}
