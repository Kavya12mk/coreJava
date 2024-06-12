package com.kavya.programs.leapyear;

public class LeapYear {
    public static void checkLeapYear(int year)
    {
        if((year%400==0)||(year%4==0)&&(year%100!=0))
        {
            System.out.println(year +" is Leap Year");
        }
        else
        {
            System.out.println(year +" is not a Leap Year");
        }
    }
}
