package com.parking;

public abstract class Motor {
    protected MotorType motorType;
    protected String cylinder;
    protected Double price;

    public Motor(){
        this.cylinder = "";
        this.price = 0d;
    }

    public Motor(String cylinder, Double price){
        this.cylinder = cylinder;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }


    public String toString() {
        return "Motor " + motorType + " with the cylinder of type : " + cylinder + " and the price: " + price + "";
    }
}
