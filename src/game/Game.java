package game;

import api.Resource;
import character.Character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Collection;
import java.util.Scanner;

import location.Location;
import location.LocationLoader;


public class Game {
    public static void start() {
        //Character
        Collection<Character> character = Resource.getInstance().getCharacter();
        for (Character hero : character) {
            System.out.println("\n" + "Welcome " + hero.getName() + "  ");
        }
        //Reading File

        int n = 1;
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))) {
            for (int i = 0; i < n; i++)
                br.readLine();
            line = br.readLine();
            System.out.println("You are at " + line);
        } catch (IOException e) {
            System.out.println(e);
        }
        Scanner enter = new Scanner(System.in);
        System.out.println("Do you want to enter Loria");
        System.out.println("Press Enter if you want to enter Loria");
        String move = enter.nextLine();
        if (move.equals("")) {

            int a = 2;
            String enterLoria;
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))) {
                for (int i = 0; i < a; i++)
                    br.readLine();
                enterLoria = br.readLine();
                System.out.println("You are at " + enterLoria);
            } catch (IOException e) {
                System.out.println(e);
            }


        }

    }
}




