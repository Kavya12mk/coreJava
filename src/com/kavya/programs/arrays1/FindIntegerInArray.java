package com.kavya.programs.arrays1;

public class FindIntegerInArray
{
    public static void main(String[] args) {
        float marks[]={65.8f,75.2f,65.9f,72.9f};
        float num=65.7f;
        boolean isPresent=false;
        for (float element:marks)
        {
            if(num==element)
            {
                isPresent=true;
                break;
            }
        }
        if(isPresent)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
