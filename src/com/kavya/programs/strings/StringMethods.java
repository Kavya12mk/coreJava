package com.kavya.programs.strings;

public class StringMethods
{
    public static void main(String[] args)
    {
        String string = "Hello World";
        System.out.println(string.toLowerCase());

        System.out.println(string.replace(" ","_"));

        String letter = "Dear <|name|>, Thanks a lot.";
        System.out.println(letter.replace("<|name|>","Kavya"));

        String myLetter = "This  is a java program on string methods";
        System.out.println(myLetter.indexOf("  "));
        System.out.println(myLetter.indexOf("   "));

        String letter1 = "Dear Kavya, \n\tThis java course is nice.\nThanks";
        System.out.println(letter1);

    }
}
