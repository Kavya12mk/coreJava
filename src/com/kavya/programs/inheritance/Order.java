package com.kavya.programs.inheritance;

import java.util.Random;

public class Order extends Payment
{
    Random random = new Random();
    int min = 10000;
    int max = 99999;

    public int getRandomOrderNo()
    {
        int randomNumber = random.nextInt(max-min+1)+min;
        return randomNumber;
    }
    public void giveMessage()
    {
        System.out.println("Your Order Done");
    }
}
