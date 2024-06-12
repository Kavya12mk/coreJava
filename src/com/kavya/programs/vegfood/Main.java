package com.kavya.programs.vegfood;

public class Main {
    public static void main(String[] args) {
        MasalaDosa masalaDosa = new MasalaDosa();
        System.out.println(masalaDosa.calories());
        System.out.println(masalaDosa.typeOfFood());

        Idli idli = new Idli();
        System.out.println(idli.calories());
        System.out.println(idli.typeOfFood());
    }
}
