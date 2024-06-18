package com.kavya.programs.strings;

public class ReplaceCharacter
{
       public static void main(String[] args)
       {
        String string="Arts For tech";
        int index = 9;
        char ch = 'T';

        System.out.println("Original String:"+string);
        string = string.substring(0,index)+ch+string.substring(index+1);

        System.out.println("Replaced String:"+string);


    }
}
