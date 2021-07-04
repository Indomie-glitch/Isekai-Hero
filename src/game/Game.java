package game;

import api.Resource;
import character.Character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Collection;
import java.util.Scanner;


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
        Scanner enterLoria = new Scanner(System.in);
        System.out.println("If you want to level up you must exit Loria and fight some monsters");
        System.out.println("If you want to exit Loria Type Exit loria");
        String banana = enterLoria.nextLine();
        if (banana.equalsIgnoreCase("exit loria")) {

        }
        int c = 1;
        String exitLoria;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))) {
            for (int i = 0; i < c; i++)
                br.readLine();
            exitLoria = br.readLine();
            System.out.println("You are at " + exitLoria);
        } catch (IOException e) {
            System.out.println(e);
        }
        Scanner exit = new Scanner(System.in);
        System.out.println("Type enter Plains ");
        String bad = exit.nextLine();
        if (bad.equalsIgnoreCase("enter plains")) {

            int b = 17;
            String enterPlains;
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))){
                for (int i =0; i< b; i++)
                    br.readLine();
                enterPlains = br.readLine();
                System.out.println("You are at " + enterPlains);
            }
            catch(IOException e){
                System.out.println(e);
            }
        }

    }
}




