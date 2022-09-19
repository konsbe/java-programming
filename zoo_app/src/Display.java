import Helpers.Options;
import Zoo.Zoo;

import java.util.Scanner;

class Display {
    public static void display() {
        Zoo zoo = new Zoo();
        while (true) {
            System.out.println("What you would like to do\n 1: add an Animal\n" +
                    " 2: remove an animal\n 3: display all animals\n 4: Search By\n 5: who to feed\n 6: Exit");
            Scanner in_choice = new Scanner(System.in);
            String choice = in_choice.nextLine();
            switch (choice) {
                case "1":
                    Options.add_animal(zoo);
                    break;
                case "2":
                    Options.remove_animal(zoo);
                    break;
                case "3":
                    Options.display_animals(zoo);
                    break;
                case "4":
                    Options.search_by(zoo);
                    break;
                case "5":
                    Options.select_feed(zoo);
                    break;
                case "6":
                    return;
                default:
                    break;
            }
        }
    }
}