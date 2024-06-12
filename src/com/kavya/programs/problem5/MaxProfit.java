package com.kavya.programs.problem5;

public class MaxProfit {
    public int findMaxProfit(int array[]) {
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (maxProfit < array[j] - array[i]) {
                    maxProfit = array[j] - array[i];
                }
            }

        }
        return maxProfit;
    }
}

