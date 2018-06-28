package com.parking;

import java.util.List;

public class Lagouna extends Vehicle{
    public Lagouna(){

    }

    public Lagouna(Double price,
                   String name,
                   Marque marque,
                   List<Option> options) {
        super(price, name, marque, options);

    }
}
