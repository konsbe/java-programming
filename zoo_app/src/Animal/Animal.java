package Animal;

import java.sql.Timestamp;

public class Animal implements IAnimal {
    public int index;
    public String animal_weight;
    public int animal_age;
    public String animal_name;
    public String animal_spice;
    public EnumAnimalType animal_type;
    public EnumAnimalGenre animal_genre;
    public String animal_mainland;

    public Animal(int index, String animal_name, int animal_type, String animal_spice, int animal_genre, String animal_mainland, String animal_weight,int animal_age) {
        this.index = index;
        this.animal_name = animal_name;
        this.animal_type = EnumAnimalType.values()[animal_type];
        this.animal_genre = EnumAnimalGenre.values()[animal_genre];
        this.animal_mainland = animal_mainland;
        this.animal_spice = animal_spice;
        this.animal_weight = animal_weight;
        this.animal_age = animal_age;
        this.animal_spice = animal_spice;
    }
}
