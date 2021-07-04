package main;

import character.CharacterService;
import location.LocationLoader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Welcome to Dungeon Explorer!!");
        System.out.println("Welcome to Loria, adventurer. Our town is surrounded by many monsters. We need your help to save this town from the evil monsters \nChoose to except press enter");
        String start = enter.nextLine();
        if (start.equals("")) {
            //Start game
            System.out.println("Start game");
            CharacterService.createCharacter();
            LocationLoader.load();
        }
            else{
                System.out.println("Ending game");
            }
        }
    }
