package com.parking;

public class EssenceMotor extends Motor {

    public EssenceMotor(){
        super();
        this.motorType = MotorType.ESSENCE;
    }

    public EssenceMotor(String cylinder, Double price){
        super(cylinder, price);
        this.motorType = MotorType.ESSENCE;
    }
}
