package Zoo;

import Animal.Animal;
import Animal.EnumAnimalType;

import java.util.ArrayList;
import java.util.HashMap;

public interface IZoo {
    static HashMap<String, Animal> capitalZoo = new HashMap<String, Animal>();
    static ArrayList<Animal> animal_zoo = new ArrayList<Animal>();
    public static void display_animals() {
    }

    default void feed_animals(EnumAnimalType args) {
        switch (args) {
            case Birds:
                System.out.println("Tsiou-Tsiou");
                break;
            case Amphibians:
                System.out.println("Prext-prect");
                break;
            case Mammals:
                System.out.println("Moumal-Moumal");
                break;
            case Reptiles:
                System.out.println("Fthhh-Fthhh");
                break;
            case Fishes:
                System.out.println("Fsssss-Splats");
                break;
            case Insects:
                System.out.println("Drrr-Grrriii");
                break;
            case Crustaceans:
                System.out.println("Kroukk-Group");
                break;
            case Arachnids:
                System.out.println("Trrr-rrt");
                break;
            case Echiniderms:
                System.out.println("Chhh-ch-kroup");
                break;
            case Worms:
                System.out.println("Worm-orf-fss-fs");
                break;
            default:
                System.out.println("There is no sound");
                break;
        }
    }
}