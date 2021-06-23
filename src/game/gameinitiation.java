package game;

import characters.Characters;

import java.util.Scanner;

public class gameinitiation {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Welcome to Dungeon Explorer!!");
        System.out.println("Welcome to Lorien, adventurer. Our town is surrounded by many monsters. We need your help to save this town from the evil monsters \nChoose to except press enter");
        String start = enter.nextLine();
        if (start.equals("")) {
            //Start game
            System.out.println("Start game");
            Characters.start();
        }
            else{
                System.out.println("Ending game");
            }
        }
    }
