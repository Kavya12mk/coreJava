package com.kavya.programs.strings;

import java.util.Arrays;

public class SortingString
{
    public static String sortString(String string)
    {
        char sortString[]=string.toCharArray();
        Arrays.sort(sortString);
        return new String(sortString);
    }
    public static void main(String[] args) {
        String string = "Arts For Tech";
        System.out.println("Before Sorting string is:"+string);
        string=string.toLowerCase();

        String sortedString = sortString(string);
        System.out.println("Sorted String is:"+sortedString);
    }
}
