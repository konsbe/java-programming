package Parking;

import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;

public interface IParking {
    static ArrayList<Vehicle> parking_seats = new ArrayList<Vehicle>(); // Create an ArrayList object
    static HashMap<String, Vehicle> capitalPark = new HashMap<String, Vehicle>();

    float earn_money = 0;

}
