package character;

import api.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class New_Character {

    public static void start() {

        List<Character> character = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Characters Name");
        String name = scanner.nextLine();
        System.out.println("Enter the race of your character \nThe options are \nElf \nHuman \nDwarf \nHobbit \nWizard");
        String race = scanner.nextLine();
        int level = 0;
        int xp = 0;
        String weapon = null;
        int health = 10;
        int attack = 10;

        Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
        character.add(newcharacter);
        Resources.getInstance().addCharacter(character);
        System.out.println(newcharacter);
        //level
        //XP
        //Weapon
        //Defence
        //Health
        //Attack
    }
}
