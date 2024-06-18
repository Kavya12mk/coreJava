package com.kavya.programs.strings;

public class ReverseString
{
    public static void main(String[] args) {
        String originalString = "Arts For tech";
        String reversedString = " ";
        char ch;
        System.out.println("Original String:"+originalString);

        for (int i=0;i<originalString.length();i++)
        {
            ch=originalString.charAt(i);
            reversedString=ch+reversedString;
        }
        System.out.println("Reversed String:"+reversedString);
    }
}
