package com.kavya.programs.problem2;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int myArray[]={84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        HighestScore highestScore = new HighestScore();
        System.out.println(Arrays.toString(highestScore.findHighestScore(myArray)));

    }
}
