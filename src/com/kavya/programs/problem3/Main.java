package com.kavya.programs.problem3;

public class Main
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 6};
        int n = 6;
        MissingNumberFinder missingNumberFinder = new MissingNumberFinder();
        System.out.println(missingNumberFinder.findMissingNumber(array,n));
    }
}
