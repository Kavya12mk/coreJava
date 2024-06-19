package com.kavya.oops;

public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setFirstName("Krishna");
        student.setLastName("Singh");
        student.setRollNumber(1);

        Student student1 = new Student();
        student1.setFirstName("Vishwa");
        student1.setLastName("Reddy");
        student1.setRollNumber(2);

        Student student2 = new Student();
        student2.setFirstName("Chetan");
        student2.setLastName("Mali");
        student2.setRollNumber(3);

        System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getRollNumber());
        System.out.println(student1.getFirstName()+" "+student1.getLastName()+" "+student1.getRollNumber());
        System.out.println(student2.getFirstName()+" "+student2.getLastName()+" "+student2.getRollNumber());

    }
}
