package com.kavya.artspractice;

public class ReverseString
{
    public static void main(String[] args) {
        String originalString = "madam";
        String reversedString="";
        System.out.println("Original String:"+originalString);
        for (int i=originalString.length()-1;i>=0;i--)
        {
            reversedString= reversedString+originalString.charAt(i);
        }
        System.out.println("Reversed String:"+reversedString);
        if(originalString.equals(reversedString))
        {
            System.out.println("Palindrome string");
        }
        else
            {
            System.out.println("Not a palindrome string");
        }
    }
}
