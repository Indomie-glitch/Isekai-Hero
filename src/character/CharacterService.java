package character;

import api.Resource;
import game.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterService {

    public static void createCharacter() {
        boolean keepRunning = true;
        List<Character> character = new ArrayList<Character>();
        Scanner scanner = new Scanner(System.in);
        while (keepRunning) {
            try {

                System.out.println("Enter your Characters Name");
                String name = scanner.nextLine();
                System.out.println("Enter the race of your character \nThe options are \n1. Elf \n2. Human \n3. Dwarf \n4. Hobbit \n5. Wizard \n use the number given to choose the race.");
                int selection = Integer.parseInt(scanner.next());
                int health = 0;
                int attack = 0;
                String weapon = " ";
                int level = 0;
                int xp = 0;
                String race = " ";
                if (selection == 1) {
                    health = 58;
                    attack = 73;
                    weapon = "Wooden Bow";
                    race = "Elf";
                }
                else if(selection == 2) {
                    health = 47;
                    attack = 68;
                    weapon = "Wooden Sword";
                    race = "Human";
                }
                else if(selection == 3) {
                    health = 37;
                    attack = 62;
                    weapon = "Wooden Axe";
                    race = "Dwarf";
                }
                else if(selection == 4) {
                    health = 20;
                    attack = 24;
                    weapon = "Hands";
                    race = "Hobbit";
                }
                else if(selection == 5) {
                    health = 77;
                    attack = 89;
                    weapon = "Wooden Stick";
                    race = "Wizard";
                }
                Character newcharacter = new Character(name, race, level, xp, weapon, health, attack);
                character.add(newcharacter);
                Resource.getInstance().addCharacter(character);
                System.out.println("____________________________________________________");
                System.out.println(newcharacter);
                System.out.println("____________________________________________________");
                Game.start();
                keepRunning = false;
            }catch (Exception ex){
                System.out.println("Must have pressed something wrong, Try again");
                keepRunning = true;
            }
        }

    }
}



