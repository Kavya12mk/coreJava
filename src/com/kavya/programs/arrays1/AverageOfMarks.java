package com.kavya.programs.arrays1;

public class AverageOfMarks
{
    public static void main(String[] args) {
        float marks[]={52.6f,75.6f,95.2f,74.1f,69.5f};
        float sum=0;
        for (float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("The average value is:"+(sum/marks.length));
    }
}
