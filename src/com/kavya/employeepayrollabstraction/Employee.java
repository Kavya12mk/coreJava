package com.kavya.employeepayrollabstraction;

public abstract class Employee
{
     private int employeeID;
     private String name;
     private int salary=0;

     public int getEmployeeID() {
          return employeeID;
     }

     public void setEmployeeID(int employeeID) {
          this.employeeID = employeeID;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getSalary() {
          return salary;
     }

     public void setSalary(int salary) {
          this.salary = salary;
     }

     abstract int calculatePay(int hour);
     abstract void displayDetails(int employeeID,String name,int Salary);


}
