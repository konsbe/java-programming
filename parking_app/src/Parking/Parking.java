package Parking;

import Helpers.Exchange;
import Vehicle.Vehicle;
import Vehicle.EnumVehicle;

import java.util.ArrayList; // import the ArrayList class
import java.util.HashMap; // import the HashMap class
import java.util.concurrent.atomic.AtomicReference;

import static java.lang.Integer.parseInt;

public class Parking implements IParking {
    public static float earn_money;
    static int total_left;
    static int total_motocross;
    static int total_cars;

    public static void add_car(Vehicle args) {
        capitalPark.forEach((k, v) -> {
        if ((v.vehicle_plate == args.vehicle_plate)) System.out.println("This Car Exists Try again");return;
        });
        parking_seats.add(args);
        capitalPark.put(String.valueOf(args.vehicle_plate), args);
        capitalPark.forEach((k, v) -> System.out.println("\nKey : " + k + " Value : " + v.vehicle_plate));
    }

    public static void remove_car(int args) {
        total_left +=1;
        AtomicReference<Float> price = new AtomicReference<>((float) 0);
        capitalPark.forEach((k, v) -> {
            if ((v.vehicle_plate == args ) && (v.vehicle_type == EnumVehicle.CAR)) {
                total_cars +=1;
                price.set(Exchange.exchange_calculation(capitalPark, v));
                earn_money += price.get();
            }
                else if (v.vehicle_plate == args && (v.vehicle_type == EnumVehicle.MOTOCROSS)) {
                price.set(Exchange.exchange_calculation(capitalPark, v));
                total_motocross +=1;
                earn_money += price.get();
            }
        });
        System.out.println("\nYou will pay " + price);
        parking_seats.removeIf(x -> x.vehicle_plate == args);
        capitalPark.remove(String.valueOf(args));
        capitalPark.forEach((k, v) -> System.out.println("\nKey : " + k + " Value : " + v.vehicle_plate));
    }

    public static void display_cars() {
        capitalPark.forEach((k, v) -> System.out.println("\nVehicle plate : "
                + k + " Driver name : " + v.driver_name));
    }

    public static void daily_earn() {
        System.out.println("\nYou have earn : " + earn_money
                + " From total Vehicles: " + total_left+ ", Cars: "+total_cars
                + " + Motocross: "+total_motocross);
    }
}