package com.parking;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<Vehicle> vehicles = new ArrayList<>();


    public void addManyVehicles(List <? extends Vehicle> vehicles){
        for (Vehicle v : vehicles)
            this.vehicles.add(v);
    }

    public void addOneVehicle(Vehicle v){
        vehicles.add(v);
        Logger.getInstance().addLog(v.toString());
    }


    public String toString() {
        String str;
        if (this.vehicles.size() == 0) {
            str = "------------------------- \n " + " no parked cars \n" + "---------------------------\n";
            return str;
        }

        return "";

    }
}
