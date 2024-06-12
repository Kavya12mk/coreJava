package com.kavya.programs.selectionsort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        SelectionSort selectionSort = new SelectionSort();
        int [] array = {10,1,8,2,6};
        System.out.println(Arrays.toString(selectionSort.sortingAsc(array)));

        System.out.println(Arrays.toString(selectionSort.sortingDesc(array)));
    }
}
