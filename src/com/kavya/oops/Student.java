package com.kavya.oops;

public class Student
{
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }

    private String firstName;
    private String lastName;
    private int rollNumber;

}
