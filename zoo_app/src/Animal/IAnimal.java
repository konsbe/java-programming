package Animal;

import Zoo.IZoo;

public interface IAnimal extends IZoo {
    public int index = 0;
    public String animal_name = null;
    public String animal_spice = null;
    public EnumAnimalType animal_type = null;
    public EnumAnimalGenre animal_genre = null;
    public String animal_mainland = null;
    public int animal_weight = 0;
    public int animal_age = 0;

}
