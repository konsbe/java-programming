// Java program to demonstrate working of Scanner in Java

import Parking.Parking;

import java.util.Scanner;

import Helpers.Options;
public class Main {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Display b = new Display();
        b.display();
    }
}

class Display {
    public static void display() {
        Parking park = new Parking();
        while (true) {
            System.out.println("What you would like to do\n 1:add a Vehicle\n" +
                    " 2:pay and leave\n 3:check who's in\n 4: today's earn\n 5: exit");
            Scanner in_choice = new Scanner(System.in);
            String choice = in_choice.nextLine();
            switch (choice) {
                case "1":
                    Options.add_Car(park);
                    break;
                case "2":
                    Options.pay_toGo(park);
                    break;
                case "3":
                    Parking.display_cars();
                    break;
                case "4":
                    Parking.daily_earn();
                    break;
                case "5":
                    break;
                default:
            }


//            System.out.println(veh);
        }
    }
}