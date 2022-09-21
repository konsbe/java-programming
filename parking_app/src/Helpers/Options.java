package Helpers;

import Parking.Parking;
import Vehicle.Vehicle;

import java.util.Scanner;

public class Options {
    public static void add_Car(Parking parking) {
        Scanner in_vehicle = new Scanner(System.in);
        int vehicle_type;
        do {
            System.out.println("Choose a Vehicle Type 1:Car 2:Motocross ");
            while (!in_vehicle.hasNextInt()) {
                System.out.println("Thats not an option!");
                in_vehicle.next();
            }
            vehicle_type = in_vehicle.nextInt();
        } while (vehicle_type < 1 || vehicle_type > 2);

        Scanner in_plate = new Scanner(System.in);
        int plate_number;
        do {
            System.out.println("Enter plate number: ");
            while (!in_plate.hasNextInt()) {
                System.out.println("That's not a plate number!");
                in_plate.next();
            }
            plate_number = in_plate.nextInt();
        } while (plate_number <= 0);

        Scanner in_driver = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String driver_name = in_driver.nextLine();
        driver_name = driver_name.replaceAll("[^a-zA-Z]+", "");

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

