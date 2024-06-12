package com.kavya.programs.vehiclerentalsystem;

public class Car extends Vehicle
{
    int numberOfSeat;

    public Car(int registerNum, int rentRate, int numberOfSeat) {
        super(registerNum, rentRate);
        this.numberOfSeat = numberOfSeat;
        System.out.println(numberOfSeat);
    }
}
