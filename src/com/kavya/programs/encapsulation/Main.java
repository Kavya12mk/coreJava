package com.kavya.programs.encapsulation;

public class Main
{
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(27);
        student.setName("Kavya");
        System.out.println(student.toString());
    }
}
