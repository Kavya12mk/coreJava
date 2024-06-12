package com.kavya.programs.pairsum;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {2,4,6,8,10};
        System.out.println("enter target sum:");
        int key = scanner.nextInt();

        SumOfPairs sumOfPairs = new SumOfPairs();
        System.out.println(Arrays.toString(sumOfPairs.sumOfPairs(array,key)));
    }
}
