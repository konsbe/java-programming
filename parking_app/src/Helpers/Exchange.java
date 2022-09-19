package Helpers;

import Vehicle.Vehicle;
import Vehicle.EnumVehicle;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Exchange {
    public static long time_calc;
    public static float total_price;

    public static float exchange_calculation(HashMap<String, Vehicle> capitalPark, Vehicle veh, int args) {
        Timestamp time_current = new Timestamp(System.currentTimeMillis());
        System.out.println("time you leave the car in minutes : "+ TimeUnit.MILLISECONDS.toMinutes(time_calc));
        time_calc =  TimeUnit.MILLISECONDS.toMinutes(( time_current.getTime() - veh.time_in.getTime()));
        if ((time_calc <60) && (veh.vehicle_type == EnumVehicle.CAR)) total_price = 10;
        else if ((time_calc > 60 && time_calc<120) && (veh.vehicle_type == EnumVehicle.CAR)) total_price = 18;
        else if ((time_calc > 120 && time_calc<240) && (veh.vehicle_type == EnumVehicle.CAR)) total_price = 25;
        else if ((time_calc >240) && (veh.vehicle_type == EnumVehicle.CAR)) total_price = 30;
        else if ((time_calc >240) && (veh.vehicle_type == EnumVehicle.MOTOCROSS)) total_price = 5;
        else if ((time_calc > 60 && time_calc<120) && (veh.vehicle_type == EnumVehicle.MOTOCROSS)) total_price = 9;
        else if ((time_calc > 120 && time_calc<240) && (veh.vehicle_type == EnumVehicle.CAR)) total_price = 13;
        else if ((time_calc >240) && (veh.vehicle_type == EnumVehicle.CAR)) total_price = 30;
        else total_price = 0;
        capitalPark.forEach((k,v) -> {
            if (v.driver_name == veh.driver_name) total_price = total_price * 30 / 100;
        } );
        return total_price;

    }
}
