package com.kavya.programs.binarysearch;

public class BinarySearch
{
    int mid;
    public int giveIndex(int arr[],int key, int low, int high)
    {
        while (low<=high)
        {
            mid = (low+high)/2;

            if(key==arr[mid])
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }

}
