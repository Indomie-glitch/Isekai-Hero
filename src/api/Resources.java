package api;

import character.Character;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Resources {
    private static Resources resources = null;
    private Resources() {}
    public static Resources getInstance() {
        if (null == resources) {
            resources = new Resources();
        }
        return resources;
    }



    //Characters
    Collection<Character> character = new ArrayList<Character>();
public Collection<Character> getCharacter() {
    return character;
}
public void addCharacter(List<Character> character) {
    this.character.addAll(character);
}

}
