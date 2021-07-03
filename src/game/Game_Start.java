package game;

import api.Resources;
import character.Character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Collection;
import java.util.Scanner;


public class Game_Start {
    public static void start() {
        //Character
        Collection<Character> character = Resources.getInstance().getCharacter();
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
            String linee;
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))) {
                for (int i = 0; i < a; i++)
                    br.readLine();
                linee = br.readLine();
                System.out.println("You are at " + linee);
            } catch (IOException e) {
                System.out.println(e);
            }

        }
        Scanner monitor = new Scanner(System.in);
        System.out.println("If you want to level up you must exit Loria and fight some monsters");
        System.out.println("If you want to exit Loria Type Exit loria");
        String banana = monitor.nextLine();
        if (banana.equalsIgnoreCase("exit loria")) {

        }
        int c = 1;
        String lineee;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))) {
            for (int i = 0; i < c; i++)
                br.readLine();
            lineee = br.readLine();
            System.out.println("You are at " + lineee);
        } catch (IOException e) {
            System.out.println(e);
        }
        Scanner good = new Scanner(System.in);
        System.out.println("Type enter Plains ");
        String bad = good.nextLine();
        if (bad.equalsIgnoreCase("enter plains")) {

            int b = 17;
            String lineeee;
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location"))){
                for (int i =0; i< b; i++)
                    br.readLine();
                lineeee = br.readLine();
                System.out.println("You are at " + lineeee);
            }
            catch(IOException e){
                System.out.println(e);
            }
        }

    }
}




