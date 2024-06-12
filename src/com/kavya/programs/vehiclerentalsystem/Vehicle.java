package com.kavya.programs.vehiclerentalsystem;

public class Vehicle
{
    public int registerNum;
    public int rentRate;


    public Vehicle(int registerNum, int rentRate)
    {
        this.registerNum = registerNum;
        this.rentRate = rentRate;
        System.out.println(registerNum+" "+rentRate);
    }
}
