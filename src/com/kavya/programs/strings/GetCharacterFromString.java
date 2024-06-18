package com.kavya.programs.strings;

class GetCharacterFromString
{
    static char getCharacter(String string, int index)
    {
        return string.charAt(index);
    }
    public static void main(String[] args)
    {
        String string = "Arts For Tech";
        int index =5;
        char ch=getCharacter(string,index);
        System.out.println(ch);
    }
}
