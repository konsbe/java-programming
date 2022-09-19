package Vehicle;

import java.sql.Timestamp;

public class Vehicle implements IVehicle {
    public EnumVehicle vehicle_type;
    public int vehicle_plate;
    public String driver_name;
    public Timestamp time_in;
    // Setter
    public Vehicle( int type, int plate, String newName)  {
        this.driver_name = newName;
        this.vehicle_plate = plate;
        if (type == 1) {
            this.vehicle_type = EnumVehicle.CAR;
        } else if (type == 2) {
            this.vehicle_type = EnumVehicle.MOTOCROSS;
        } else {
            System.out.println("Wrong choice");
        }
        this.time_in =  new Timestamp(System.currentTimeMillis());
    }


}
