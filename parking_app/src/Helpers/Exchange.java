package Helpers;

import Vehicle.Vehicle;
import Vehicle.EnumVehicle;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Exchange {
    public static long time_calc;
    public static float total;
    public static int i = 0;
    public static float exchange_calculation(HashMap<String, Vehicle> capitalPark, Vehicle veh) {
        Timestamp time_current = new Timestamp(System.currentTimeMillis());

        System.out.println("time you leave the car in minutes : " + TimeUnit.MILLISECONDS.toMinutes(time_calc));
        time_calc = TimeUnit.MILLISECONDS.toMinutes((time_current.getTime() - veh.time_in.getTime()));
        float total_price = ((time_calc < 60) && (veh.vehicle_type == EnumVehicle.CAR)) ? 10
                : ((time_calc > 60 && time_calc < 120) && (veh.vehicle_type == EnumVehicle.CAR)) ? 18
                : ((time_calc > 120 && time_calc < 240) && (veh.vehicle_type == EnumVehicle.CAR)) ? 25
                : ((time_calc > 240) && (veh.vehicle_type == EnumVehicle.CAR)) ? 30
                : ((time_calc < 60) && (veh.vehicle_type == EnumVehicle.MOTOCROSS)) ? 5
                : ((time_calc > 60 && time_calc < 120) && (veh.vehicle_type == EnumVehicle.MOTOCROSS)) ? 9
                : ((time_calc > 120 && time_calc < 240) && (veh.vehicle_type == EnumVehicle.MOTOCROSS)) ? 13
                : ((time_calc > 240) && (veh.vehicle_type == EnumVehicle.MOTOCROSS)) ? 30
                : 0;
        capitalPark.forEach((k, v) -> {
            if (v.driver_name.equals(veh.driver_name)) {
                i++;
            }
            ;
            total = ((i == 2)) ? total_price * 70 / 100 : total_price;
        });
        return total;


    }
}
