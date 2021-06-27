package character;

import api.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class New_Character {

    public static void start() {
        boolean keepRunning = true;
        List<Character> character = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);

        while (keepRunning) {
            try {
                System.out.println("Enter your Characters Name");
                String name = scanner.nextLine();
                System.out.println("Enter the race of your character \nThe options are \n1. Elf \n2. Human \n3. Dwarf \n4. Hobbit \n5. Wizard");
                int selection = Integer.parseInt(scanner.next());
                switch (selection) {
                    case 1 -> {
                        int health = 58;
                        int attack = 73;
                        String race = "Elf";
                        String weapon = "Wooden bow";
                        int level = 0;
                        int xp = 0;
                        Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
                        character.add(newcharacter);
                        Resources.getInstance().addCharacter(character);
                        System.out.println(newcharacter);
                    }
                    case 2 -> {
                        int health = 47;
                        int attack = 68;
                        String race = "Human";
                        String weapon = "Wooden Sword";
                        int level = 0;
                        int xp = 0;
                        Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
                        character.add(newcharacter);
                        Resources.getInstance().addCharacter(character);
                        System.out.println(newcharacter);
                    }
                    case 3 -> {
                        int health = 28;
                        int attack = 62;
                        String race = "Dwarf";
                        String weapon = "Wooden Axe";
                        int level = 0;
                        int xp = 0;
                        Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
                        character.add(newcharacter);
                        Resources.getInstance().addCharacter(character);
                        System.out.println(newcharacter);
                    }
                    case 4 -> {
                        int health = 15;
                        int attack = 24;
                        String race = "Hobbit";
                        String weapon = "Hands";
                        int level = 0;
                        int xp = 0;
                        Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
                        character.add(newcharacter);
                        Resources.getInstance().addCharacter(character);
                        System.out.println(newcharacter);
                    }
                    case 5 -> {
                        int health = 77;
                        int attack = 89;
                        String race = "Wizard";
                        String weapon = "Wooden stick";
                        int level = 0;
                        int xp = 0;
                        Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
                        character.add(newcharacter);
                        Resources.getInstance().addCharacter(character);
                        System.out.println(newcharacter);
                    }
                }
            } catch(Exception ex){
                System.out.println("You must have pressed something incorrect \n try again");
            }
        }
    }
}
