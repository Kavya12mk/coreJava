package com.kavya.employeepayrollabstraction;

public class SalariedEmployee extends Employee
{

    @Override
    int calculatePay(int salary)
    {
        return salary;
    }

    @Override
    void displayDetails(int employeeID,String name, int salary)
    {
        System.out.println(employeeID+" "+name+" "+salary);

    }
}
