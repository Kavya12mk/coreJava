package com.kavya.programs.rotateclockwise;

import com.kavya.programs.countcurrency.CountCurrency;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int [] currencyArray = {1,2,5,10,20,50,100,200,500};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount:");
        int amount = scanner.nextInt();

        CountCurrency countCurrency = new CountCurrency();
        int count=countCurrency.countCurrency(currencyArray,amount);
        System.out.println("min notes:"+count);
    }
}
