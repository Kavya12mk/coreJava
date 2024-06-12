package com.kavya.programs.universitysystem;

public class Teacher extends Person
{
    String subjectTaught;

    public Teacher(String name, int age, String subjectTaught)
    {
        super(name, age);
        this.subjectTaught = subjectTaught;
    }

    public String getSubjectTaught()
    {
        return subjectTaught;
    }

}
