package com.kavya.programs.problem3;

public class MissingNumberFinder {

        public int findMissingNumber(int[] array, int n)
        {

            int expectedSum = n * (n + 1) / 2;
            for (int i=0;i<array.length;i++)
            {
                expectedSum = expectedSum - array[i];
            }

            return expectedSum;
        }
}
