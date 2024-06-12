package com.kavya.programs.polymorhism;

public class Main
{
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println("sum of one parameter:"+sum.doSum(10));
        System.out.println("sum of 3 parameters:"+sum.doSum(10,10,10));
        System.out.println("sum of 2 parameters:"+sum.doSum(10,10));
    }
}
