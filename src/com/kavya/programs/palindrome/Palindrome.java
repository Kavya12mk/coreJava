package com.kavya.programs.palindrome;

public class Palindrome {
    public  static void checkPalindrome(String originalString)
    {
        String reversedString = "";
        for(int i=0;i<originalString.length();i++)
        {
            reversedString = originalString.charAt(i)+reversedString;
        }
        System.out.println(reversedString);
        if(originalString.equals(reversedString))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
