package com.kavya.programs.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.rollNo = 1;
        student.name = "Kavya";
        student.address = "Bangalore";
        Student student1 = new Student();
        student1.rollNo = 2;
        student1.name = "Madan";
        student1.address = "Madras";
        System.out.println(student.toString());
        System.out.println(student1.toString());

    }
}
