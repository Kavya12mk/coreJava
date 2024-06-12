package com.kavya.programs.problem7;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {1, 2, 3, 4, 5};
        int target = 3;
        ArrayContainsNumber arrayContainsNumber = new ArrayContainsNumber();
        System.out.println("Array: " + Arrays.toString(array1));
        System.out.println("Target: " + target);
        System.out.println("Contains: " + arrayContainsNumber.containsNumber(array1, target));
    }
}
