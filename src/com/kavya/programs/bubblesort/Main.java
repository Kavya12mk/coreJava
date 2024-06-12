package com.kavya.programs.bubblesort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int [] array = {1,8,34,2,9};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sortingAsc(array)));
        System.out.println(Arrays.toString(bubbleSort.sortingDesc(array)));
    }
}
