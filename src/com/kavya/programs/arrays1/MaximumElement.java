package com.kavya.programs.arrays1;

public class MaximumElement
{
    public static void main(String[] args) {
        int array[]={1,8,31,9,2};
        int max=0;
        for(int element:array)
        {
            if(element>max)
            {
                max = element;
            }
        }
        System.out.println("The maximum element in an array:"+max);
    }

}
