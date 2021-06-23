package characters;

import api.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Characters {

    public static void start() {
        List<Characters> character = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Characters Name");
        String name = scanner.nextLine();
        System.out.println("Enter the race of your character \nThe options are \n(1).Elf \n(2).Human \n(3).Dwarf \n(4).Hobbit \n(5).Wizard");
        String race = scanner.nextLine();

        Characters characters = new Characters(name, race);
        characters.add(character);
        Resources.getInstance().addCharacter(character);
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

