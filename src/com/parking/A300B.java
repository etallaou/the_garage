package com.parking;

import java.util.List;

public class A300B extends Vehicle {
    public A300B(){}

    public  A300B(Double price,
                  String name,
                  Marque marque,
                  List<Option> options){
        super(price, name, marque, options);
    }

}
