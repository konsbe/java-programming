package Helpers;

import Parking.Parking;
import Vehicle.Vehicle;

import java.util.Scanner;

public class Options {
    public static void add_Car(Parking parking) {
        Scanner in_vehicle = new Scanner(System.in);
        System.out.println("Choose a Vehicle Type 1:car 2:motocross ");
        int vehicle_type = in_vehicle.nextInt();

        Scanner in_plate = new Scanner(System.in);
        System.out.println("Enter plate number: ");
        int plate_number = in_plate.nextInt();

        Scanner in_driver = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String driver_name = in_driver.nextLine();

        Vehicle veh = new Vehicle(vehicle_type, plate_number, driver_name);
        parking.add_car(veh);
    }
    public static void pay_toGo(Parking parking) {
        Scanner in_plate = new Scanner(System.in);
        System.out.println("Enter plate number: ");
        int plate_number = in_plate.nextInt();

        parking.remove_car(plate_number);
    }
}

