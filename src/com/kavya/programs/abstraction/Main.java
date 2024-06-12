package com.kavya.programs.abstraction;

public class Main
{
    public static void main(String[] args) {
        HomeWork homeWork = new EnglishTeacher();
        System.out.println("English Teacher gave:"+homeWork.giveHomeWork());

        HomeWork homeWork1 = new HindiTeacher();
        System.out.println("Hindi Teacher gave:"+homeWork1.giveHomeWork());

        HomeWork homeWork2 = new MathTeacher();
        System.out.println("Math Teacher gave:"+homeWork2.giveHomeWork());

        HomeWork1 homeWork11 = new KannadaTeacher();
        System.out.println("Kannada Teacher gave:"+homeWork11.giveHomeWork());
        System.out.println("Due Date is:"+homeWork11.dueDate());
    }
}
