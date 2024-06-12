package com.kavya.artspractice.gfgproblems;

public class SimpleInterest
{
    public static void calculateSimpleInterest(int principal,int rate,int time)
    {
        int result=(principal*rate*time)/100;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int p=10000,t=5,r=5;
        SimpleInterest.calculateSimpleInterest(p,r,t);
    }
}
