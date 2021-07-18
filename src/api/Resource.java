package api;

import Move.Move;
import character.Character;
import location.Location;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Resource {


    private static Resource resource = null;
    private Resource() {}
    public static Resource getInstance() {
        if (null == resource) {
            resource = new Resource();
        }
        return resource;
    }



    //Characters
    Character character = new ArrayList<Character>();
public Character getCharacter() {
    return character;
}
public void addCharacter(List<Character> character) {
    this.character.add(character);
}

//Location
    Collection<Location> location = new ArrayList<Location>();
    public Collection<Location> getLocation(){return location;}
    public void addLocation(List<Location> location)
    {this.location.addAll(location);}



    //moves
    Collection<Move> move = new ArrayList<Move>();
    public Collection<Move> getMove(){return move;}
    public void addMove(List<Move> move)
    {this.move.addAll(move);}

}
