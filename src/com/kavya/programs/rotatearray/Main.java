package com.kavya.programs.rotatearray;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int steps = 2;

        RotateArray rotateArray = new RotateArray();
        System.out.println(Arrays.toString(rotateArray.rotateArray(array,steps)));

    }
}
