package api;

import characters.Characters;

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
    Collection<Characters> characters = new ArrayList<>();

    public Collection<Characters> getCharacters(){
        return characters;
    }
    public void addCharacter(List<Characters> characters)
    {
        this.characters.addAll(characters);
    }
}
