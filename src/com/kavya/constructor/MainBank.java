package com.kavya.constructor;

public class MainBank
{
    public static void main(String[] args)
    {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setAccountNumber("64618316");
        bankAccount.setOwnerName("Kavya");
        bankAccount.setBalance(25000);
        System.out.println(bankAccount.getAccountNumber()+" "+bankAccount.getOwnerName()+" "+bankAccount.getBalance());

        BankAccount bankAccount1=new BankAccount();
        bankAccount1.setAccountNumber("64618316");
        bankAccount1.setOwnerName("Kavya");
        bankAccount1.setBalance(-2);
        System.out.println(bankAccount1.getAccountNumber()+" "+bankAccount1.getOwnerName()+" "+bankAccount1.getBalance());

    }
}
