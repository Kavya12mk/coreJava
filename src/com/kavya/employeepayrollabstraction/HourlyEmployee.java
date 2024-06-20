package com.kavya.employeepayrollabstraction;

public class HourlyEmployee extends Employee
{
    @Override
    int calculatePay(int hour)
    {
        return 1000*hour;
    }

    @Override
    void displayDetails(int employeeID,String name, int totalSalary)
    {
        System.out.println(employeeID+" "+name+" "+totalSalary);
    }
}
