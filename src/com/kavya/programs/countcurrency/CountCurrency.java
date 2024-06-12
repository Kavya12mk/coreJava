package com.kavya.programs.countcurrency;

public class CountCurrency
{
    public int countCurrency(int [] currencyArray, int amount)
    {
        int count = 0;
        for(int i=currencyArray.length-1;i>=0;i--)
        {
            if(amount>=currencyArray[i])
            {
                count = count + (amount/currencyArray[i]);
                amount = amount % currencyArray[i];
            }
        }
        return count;
    }
}
