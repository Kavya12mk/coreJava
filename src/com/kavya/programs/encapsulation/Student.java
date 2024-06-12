package com.kavya.programs.encapsulation;

import java.util.Random;

public class Student
{
    int age;
    String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
        this.age = age;
        else throw new RuntimeException("Invalid Age");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student()
    {

    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
