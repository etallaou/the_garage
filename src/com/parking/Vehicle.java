package com.parking;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    protected Double price;
    protected String name;
    protected List<Option> options;
    protected Marque marque;
    protected Motor motor;

    public Vehicle(){
        this.price = 0.0;
        this.name = "not defined";
        this.marque= Marque.NOTDEFINED;
        this.options = new ArrayList<>();
    }

    public Vehicle(Double price, String name, Marque marque, List<Option> options) {
        super();
        this.price = price;
        this.name = name;
        this.marque =  marque;
        this.options = options;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marque getMarque(){
        return marque;
    }

    public void setMarque(Marque nameOfTheMarque) {
        this.marque = nameOfTheMarque;
    }

    public  void addOption(Option opt){
        options.add(opt);
    }

    public List<Option> getOptions() {
        return options;
    }

    public String toString() {
        String str = " Vehicle with the name: " + name + " , the price " + price + " and the marque " + marque;
        return str;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
