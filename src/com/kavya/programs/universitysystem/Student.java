package com.kavya.programs.universitysystem;

public class Student extends Person
{
    int ID;

    public Student(String name, int age, int ID)
    {
        super(name, age);
        this.ID = ID;
    }

    public int getID()
    {
        return ID;
    }
}
