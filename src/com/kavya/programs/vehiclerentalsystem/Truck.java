package com.kavya.programs.vehiclerentalsystem;

public class Truck extends Vehicle
{
    int capacityOfTons;

    public Truck(int registerNum, int rentRate, int capacityOfTons) {
        super(registerNum, rentRate);
        this.capacityOfTons = capacityOfTons;
        System.out.println(capacityOfTons);
    }
}
