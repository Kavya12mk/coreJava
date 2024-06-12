package com.kavya.artspractice;

import java.util.Scanner;

class Solution {
        public int[] twoSum(int[] nums, int target) {

            int [] array = new int[0];
            for(int i=0;i<nums.length;i++)
            {
                for (int j=0; j<nums.length;j++)
                {
                    if(target==nums[i])
                    {
                        array = new int[]{i,j};
                    }
                }
            }
            return array;
        }


        static class Main{
            public static void main(String [] args)
            {
                Solution solution = new Solution();

                int [] array = {2,7,11,15};
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter target:");
                int target = scanner.nextInt();

                System.out.println(solution.twoSum(array,target));

            }

        }

    }
