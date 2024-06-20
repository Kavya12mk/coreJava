package com.kavya.programs.strings;

public class Reverse
{
    public static void main(String[] args) {
        String string ="JAVA";
        String reversedString = " ";
        for(int i=string.length()-1;i>=0;i--)
        {
            char ch=string.charAt(i);
            reversedString=reversedString+ch;
            //System.out.print("reversed string is:"+string.charAt(i));
        }
        System.out.println("reversed string is:"+reversedString);
    }
}
