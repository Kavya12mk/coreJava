
package com.kavya.programs;

import java.util.Scanner;

public class VowelCount {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("String entered is:"+str);
        int vowel_count = 0,consonant_count=0;

        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                vowel_count+=1;
            }
            else
            {
                consonant_count+=1;
            }
        }
        System.out.println("Vowel count is:"+vowel_count);
        System.out.println("constant count is:"+consonant_count);
    }
}
