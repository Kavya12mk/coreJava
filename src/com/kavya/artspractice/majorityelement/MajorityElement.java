package com.kavya.artspractice.majorityelement;

public class MajorityElement
{
        public int majorityElement(int[] nums) {
            int count = 0;
            int i,majorityElement=0;
            for (i = 0; i < nums.length; i++) {
                if (count == 0)
                {
                    majorityElement = nums[i];
                }
                if (nums[i] == majorityElement)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
            count = 0;
            for (i = 0; i < nums.length; i++)
            {
                if (nums[i] == majorityElement)
                {
                    count++;
                }

                if (count > nums.length/2)
                {
                    return majorityElement;
                }
            }
            return -1;
        }
    }
