package com.kavya.programs.inheritance;

public class Main
{
    public static void main(String[] args) {
        Zomato zomato = new Zomato();
        zomato.getMenuOfZomato();
        zomato.giveMessage();
        System.out.println("Payment bill:"+zomato.getBillDetails());
        System.out.println("Order No:"+zomato.getRandomOrderNo());
    }
}
