package com.kavya.programs.arrays1;

public class MinimumElement
{
    public static void main(String[] args) {
        int array[]={2,8,31,9,1};
        int min=array[0];
        for(int element:array)
        {
            if(element<min)
            {
                min = element;
            }
        }
        System.out.println("The minimum element in an array:"+min);
    }
}
