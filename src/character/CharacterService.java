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
            //try {

                System.out.println("Enter your Characters Name");
                String name = scanner.nextLine();
                System.out.println("You have 50 attribute points, decide how you want to spread it amongst Strength, defence, dexterity, and magic ");
                int maxhp = 50;
                int maxmp = 20;
                System.out.println("Strength");
                int strength = Integer.parseInt(scanner.next());
                System.out.println("Defense");
                int defense = Integer.parseInt(scanner.next());
                System.out.println("Agility");
                int agility = Integer.parseInt(scanner.next());
                System.out.println("Magic");
                int magic = Integer.parseInt((scanner.next()));
                Character newcharacter = new Character(strength, defense, agility, magic, maxhp, maxmp, name);
                character.add(newcharacter);
                Resource.getInstance().addCharacter(character);
                System.out.println("____________________________________________________");
                System.out.println(newcharacter);
                System.out.println("____________________________________________________");
                Game.start();
                keepRunning = false;
           // }catch (Exception ex){
            //    System.out.println("Must have pressed something wrong, Try again");
             //   keepRunning = true;
            }
        }

    }
//}





