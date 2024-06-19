package com.kavya.programs.arrays1;

public class Sum
{
    public static void main(String[] args)
    {
        float marks[]={40.5f,38.7f,65.6f,58.2f,61.7f};
        float sum =0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("The value of sum is:"+sum);
    }
}
