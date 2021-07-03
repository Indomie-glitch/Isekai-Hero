package game;

import api.Resources;
import character.Character;

import java.io.FileReader;
import java.io.IOException;

import java.util.Collection;


public class Game_Start {
    public static void start() {
        //Reading File
        try {
            FileReader reader = new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Character
        Collection<Character> character = Resources.getInstance().getCharacter();
        for (Character hero : character) {
            System.out.println("Welcome " + hero.getName() + "  ");
        }

    }
}




