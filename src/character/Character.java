package character;

import api.Resources;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Character {

        public static void start() {
            List<Character> character = new ArrayList<Character>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Characters Name");
            String name = scanner.nextLine();
            System.out.println("Enter the race of your character \nThe options are \nElf \nHuman \nDwarf \nHobbit \nWizard");
            String race = scanner.nextLine();
            Character characters = new Character(name, race);
            characters.add(character);
            Resources.getInstance().addCharacter(character);
            System.out.println(characters);
        }

        private void add(List<Characters> character) {
        }


        private final String name;
        private final String race;

        public Characters(String name, String race) {
            this.name = name;
            this.race = race;
        }

        public String getName() {
            return name;
        }

        public String getRace() {
            return race;
        }

        @Override
        public String toString() {
            return "Name:" + name + "\nRace:" + race;
        }
    }


}
