package com.kavya.programs.sortingarrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] array = {2, 1, 0, 2, 1, 0, 1, 0};

        Sorting sorting = new Sorting();
        System.out.println(Arrays.toString(sorting.sortedArray(array)));
    }
}
