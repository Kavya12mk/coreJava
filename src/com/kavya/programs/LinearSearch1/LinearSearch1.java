package com.kavya.programs.LinearSearch1;

public class LinearSearch1 {
    public int giveIndexOfLinearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
            {
                return i;
            }
        }
        return -1;
    }
}
