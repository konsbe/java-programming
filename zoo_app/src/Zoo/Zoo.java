package Zoo;

import Animal.Animal;
import Animal.EnumAnimalType;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class Zoo implements IZoo {

    public static void add_animal(Animal animal) {
        capitalZoo.forEach((k, arg) -> {
            if ((arg.index == animal.index)) System.out.println("Error on index");return;
        });
        capitalZoo.put(String.valueOf(animal.index), animal);
        capitalZoo.forEach((k, v) -> System.out.println("\nKey : " + k + " Value : " + animal.animal_spice));
        try {
            FileOutputStream myFileOutStream
                    = new FileOutputStream(
                    "newMap");

            ObjectOutputStream myObjectOutStream
                    = new ObjectOutputStream(myFileOutStream);

            myObjectOutStream.writeObject(animal_zoo);

            // closing FileOutputStream and
            // ObjectOutputStream
            myObjectOutStream.close();
            myFileOutStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void remove_animal(int args) {
        capitalZoo.remove(String.valueOf(args));
        System.out.println("\nSuccess Remove " );
    }
    public static void display_animals() {
        capitalZoo.forEach((k, a) -> System.out.println("\nIndex : " + k + " Animal Spice : " + a.animal_spice));

    }
    public static void search_animals_by_index(int index) {
        capitalZoo.forEach((k, a) -> {
            if(a.index == index) System.out.println("\nFound : " + k + " Animal Spice : " + a.animal_spice);
            else  System.out.println("Not such animal ");
        });
    }
    public static void search_animals_by_name(String name) {
        capitalZoo.forEach((k, a) -> {
            if (a.animal_name.equals(name)) System.out.println("\nFound : " + k + " Animal Spice : " + a.animal_spice);
            else  System.out.println("Not such animal ");
        });
    }


}
