package com.kavya.exceptionhandling;

public class Example1
{
    public static void main(String[] args) {
        try{
            int result =36/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally
        {
            int result = 36/6;
            System.out.println(result);
        }
    }
}
