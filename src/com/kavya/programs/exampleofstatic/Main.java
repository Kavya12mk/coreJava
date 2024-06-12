package com.kavya.programs.exampleofstatic;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.name = "Kavya";
        person.age = 27;

        person.display(person.name, person.age);

        Person person1 = new Person();
        person1.name = "Vishwa";
        person1.age = 25;
        person1.display(person1.name, person1.age);
    }
}
