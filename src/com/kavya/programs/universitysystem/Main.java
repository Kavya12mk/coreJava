package com.kavya.programs.universitysystem;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student("Kavya",27,1);
        System.out.println(student.getID());
        Teacher teacher = new Teacher("Madan",30,"Java");
        System.out.println(teacher.getSubjectTaught());

    }
}
