package com.kavya.programs.countcurrency;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []currencyArray = {1,2,5,10,20,50,100,200,500};
        System.out.println("enter amount:");
        int amount = scanner.nextInt();

        CountCurrency countCurrency = new CountCurrency();
        System.out.println("min number of notes:"+countCurrency.countCurrency(currencyArray,amount));
    }
}
