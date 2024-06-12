package com.kavya.programs.middlearray;

public class MiddleArray
{
        public int[] findMiddleArray(int array[], int length)
        {
            int newArray[]= new int[length-2];
            for (int i = 0;i< (length-2);i++)
            {
                newArray[i]=array[i+1];
            }
            return newArray;
        }
    }

