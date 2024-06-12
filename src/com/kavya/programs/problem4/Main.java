package com.kavya.programs.problem4;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int array[]={1,3,2,1,4,3};
        Unique unique = new Unique();
        System.out.println(Arrays.toString(unique.removeDuplicates(array)));
    }
}
