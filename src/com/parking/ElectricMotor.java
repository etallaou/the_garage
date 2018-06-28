package com.parking;

public class ElectricMotor extends Motor {
    public ElectricMotor(){
        super();
        this.motorType = MotorType.ELECTRIC;
    }

    public ElectricMotor(String cylinder, Double price){
        super(cylinder, price);
        this.motorType = MotorType.ELECTRIC;
    }

}
