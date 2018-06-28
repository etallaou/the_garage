package com.parking;

public enum Marque {
    RENO("The Reno marque"),
    PEUGEOT("The PEUGEOT marque"),
    TROEN("The TROEN marque"),
    NOTDEFINED("undefined Marque");

    private String name = "";

    Marque(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
