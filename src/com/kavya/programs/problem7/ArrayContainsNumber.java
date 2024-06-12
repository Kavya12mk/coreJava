package com.kavya.programs.problem7;

public class ArrayContainsNumber
{
    public boolean containsNumber(int[] array, int target) {
        for (int i=0;i<array.length;i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

}
