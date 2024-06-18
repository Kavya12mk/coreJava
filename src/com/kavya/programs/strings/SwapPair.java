package com.kavya.programs.strings;

public class SwapPair
{
    public static String swapPair(String string)
    {
        if (string==null||string.isEmpty())
        {
            return string;
        }

        char ch[]=string.toCharArray();

        for (int i=0;i<string.length()-1;i+=2)
        {
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        return new String(ch);
    }

    public static void main(String[] args)
    {
        String string = "java";
        System.out.println("Before swapping:"+string);
        String swappedString = swapPair(string);
        System.out.println("After swapping:"+swappedString);

    }
}
