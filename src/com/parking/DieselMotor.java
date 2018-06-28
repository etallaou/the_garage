package com.parking;

public class DieselMotor extends Motor{
    public DieselMotor(){
        super();
        this.motorType = MotorType.DIESEL;
    }

    public DieselMotor(String cylinder, Double price){
        super(cylinder, price);
        this.motorType = MotorType.DIESEL;
    }
}
