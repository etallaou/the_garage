package com.parking;

import javafx.scene.shape.Cylinder;

public class HybridMotor extends Motor {
    public HybridMotor(){
        super();
        this.motorType = MotorType.HYBRID;
    }

    public HybridMotor(String cylinder, Double price){
        super(cylinder, price);
        this.motorType = MotorType.HYBRID;
    }
}
