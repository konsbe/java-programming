package Helpers;

import Animal.Animal;
import Animal.EnumAnimalType;
import Animal.EnumAnimalGenre;
import Zoo.Zoo;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Options {
    public static void add_animal(Zoo zoo) {
        Scanner in_index = new Scanner(System.in);
        System.out.println("Choose an index");
        int index = in_index.nextInt();

        Scanner in_type = new Scanner(System.in);
        System.out.println("Select Animal type: \n");
        AtomicInteger i = new AtomicInteger();
        Arrays.asList(EnumAnimalType.values()).forEach((d) -> System.out.println(i.getAndIncrement()+": "+d));
        int animal_type = in_type.nextInt();

        Scanner in_spice = new Scanner(System.in);
        System.out.println("Enter Animal's Spice: ");
        String animal_spice = in_spice.nextLine();

        Scanner in_name = new Scanner(System.in);
        System.out.println("Enter Animal's Name: ");
        String animal_name = in_name.nextLine();

        Scanner in_genre = new Scanner(System.in);
        System.out.println("Select Genre: \n");
        i.set(0);
        Arrays.asList(EnumAnimalGenre.values()).forEach((d) -> System.out.println(i.getAndIncrement()+": "+d));
        int animal_genre = in_genre.nextInt();

        Scanner in_mainland = new Scanner(System.in);
        System.out.println("Enter Animals Continent: ");
        String animal_mainland = in_mainland.nextLine();

        Scanner in_weight = new Scanner(System.in);
        System.out.println("Enter Animal's Weight: ");
        String animal_weight = in_weight.nextLine();

        Scanner in_age = new Scanner(System.in);
        System.out.println("Enter Animal's age: ");
        int animal_age = in_age.nextInt();

        Animal animal = new Animal(index, animal_name,animal_type,animal_spice, animal_genre, animal_mainland, animal_weight, animal_age);
        animal.feed_animals(EnumAnimalType.values()[animal_type]);
        zoo.add_animal(animal);
    }
    public static void remove_animal(Zoo zoo) {
        Scanner in_id = new Scanner(System.in);
        System.out.println("Enter Animal Index to Remove: ");
        int animal_id = in_id.nextInt();

        zoo.remove_animal(animal_id);
    }
    public static void display_animals(Zoo zoo) {
        zoo.display_animals();
    }
    public static void search_by(Zoo zoo) {
        Scanner in_scan = new Scanner(System.in);
        System.out.println("Would you like to Search By:\n 1: Name\n 2: Index");
        int index = in_scan.nextInt();
        if(index == 1){
        Scanner in_name = new Scanner(System.in);
        System.out.println("Enter Name");
        String search_name = in_name.nextLine();
        zoo.search_animals_by_name(search_name);

        }else {

        Scanner in_index = new Scanner(System.in);
        System.out.println("Enter Index:");
        int search_index = in_index.nextInt();
        zoo.search_animals_by_index(search_index);
        }
    }
    public static void select_feed(Zoo zoo) {
            Scanner in_type = new Scanner(System.in);
            System.out.println("Select Animal type to Feed: \n");
            AtomicInteger i = new AtomicInteger();
            Arrays.asList(EnumAnimalType.values()).forEach((d) -> System.out.println(i.getAndIncrement()+": "+d));
            int animal_type = in_type.nextInt();
            zoo.feed_animals(EnumAnimalType.values()[animal_type]);
    }
}
