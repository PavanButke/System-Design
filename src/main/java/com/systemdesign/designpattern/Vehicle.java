package com.systemdesign.designpattern;

public class Vehicle {
    DriveStrategy driveObj;

    Vehicle(DriveStrategy drivingVeh)
    {
        this.driveObj = drivingVeh;
    }

    public  void drive(){
        driveObj.drive();
    }
}
