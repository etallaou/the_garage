package com.parking;

public enum MotorType {
    DIESEL("Diesel motor"),
    ESSENCE("Essence motor"),
    HYBRID("Hybrid motor"),
    ELECTRIC("Electric motor");

    private String name = "";

    MotorType(String name){
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
