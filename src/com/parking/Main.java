package com.parking;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        Vehicle lag1 = new Lagouna();
        lag1.setMotor(new EssenceMotor());
        lag1.addOption(new GPS());
        lag1.addOption(new HeatedSeat());
        lag1.addOption(new ElectricGlas());
        garage.addOneVehicle(lag1);

        System.out.println(garage);

    }
}
