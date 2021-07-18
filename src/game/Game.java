package game;

import Move.Move;
import api.Resource;
import character.Character;
import java.util.Collection;
import java.util.Scanner;
import location.Location;
import location.LocationResource;
import Move.MoveResource;


public class Game {
    public static void start() {

        //Character
        Character character = Resource.getInstance().getCharacter();
        for (Character hero : character) {
            System.out.println("\n" + "Welcome " + hero.getName() + "  ");
        }
        //Reading File
        boolean quit = false;
        Location currentLocation = LocationResource.getInstance().getLocationById(1);
        while (!quit) {
            System.out.println("Location : " + currentLocation.getName());
            System.out.println("Description : " + currentLocation.getDescription());
            Move[] moves = MoveResource.getInstance().getMoveByLocationId(currentLocation.getId());
            for (Move move : moves) {
                Location[] locations = new Location[4];
                if (!move.getW().equals("noAction")) {
                    int locationId = Integer.parseInt(move.getW().split(":")[1]);
                    Location location = LocationResource.getInstance().getLocationById(locationId);
                    System.out.println("w: go to " + location.getName());
                    locations[0] = location;
                }
                if (!move.getA().equals("noAction")) {
                    int locationId = Integer.parseInt(move.getA().split(":")[1]);
                    Location location = LocationResource.getInstance().getLocationById(locationId);
                    System.out.println("a: go to " + location.getName());
                    locations[1] = location;
                }
                if (!move.getD().equals("noAction")) {
                    int locationId = Integer.parseInt(move.getD().split(":")[1]);
                    Location location = LocationResource.getInstance().getLocationById(locationId);
                    System.out.println("d: go to " + location.getName());
                    locations[2] = location;
                }
                if (!move.getS().equals("noAction")) {
                    int locationId = Integer.parseInt(move.getS().split(":")[1]);
                    Location location = LocationResource.getInstance().getLocationById(locationId);
                    System.out.println("s: go to " + location.getName());
                    locations[3] = location;
                }
                System.out.println("q: quit t e game");
                String input = new Scanner(System.in).nextLine();
                if (input.equals("w")) {
                    currentLocation = LocationResource.getInstance().getLocationById(locations[0].getId());
                } else if (input.equals("a")) {
                    currentLocation = LocationResource.getInstance().getLocationById(locations[1].getId());
                } else if (input.equals("d")) {
                    currentLocation = LocationResource.getInstance().getLocationById(locations[2].getId());
                } else if (input.equals("s")) {
                    currentLocation = LocationResource.getInstance().getLocationById(locations[3].getId());
                } else if (input.equals("q")) {
                    quit = true;
                }
            }
        }
    }
}





