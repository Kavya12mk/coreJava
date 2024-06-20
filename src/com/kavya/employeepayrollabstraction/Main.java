package com.kavya.employeepayrollabstraction;

public class Main
{
    public static void main(String[] args)
    {
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setEmployeeID(1);
        hourlyEmployee.setName("Kavya");

        int totalPayment = hourlyEmployee.calculatePay(5);

        hourlyEmployee.displayDetails(hourlyEmployee.getEmployeeID(),hourlyEmployee.getName(),totalPayment);

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.setEmployeeID(2);
        salariedEmployee.setName("Vishwa");

        int totalSalary = salariedEmployee.calculatePay(20000);

        salariedEmployee.displayDetails(salariedEmployee.getEmployeeID(),salariedEmployee.getName(),totalSalary);

    }
}
