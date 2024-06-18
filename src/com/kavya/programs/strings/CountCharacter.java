package com.kavya.programs.strings;

public class CountCharacter
{
    public static void main(String[] args)
    {
        String string = "amazing java";
        char c[]=string.toCharArray();
        char sameChar = 0;
        int count = 0;
        for(int i=0;i<string.length();i++)
        {
            for (int j=i+1;j<string.length();j++)
            {
                if(c[i]==c[j]) 
                {
                    sameChar=c[i];
                    count++;
                }
            }
        }
        System.out.println("Character is:"+sameChar);
        System.out.println("Count is:"+count);
    }
}
