package location;

public class Location {

    private  int id;
    private  String name;
    private  String description;

    public Location(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static void add(Location loader) {
    }


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return "ID" + id +"\n Name" + name + "\nDescription" + description;
    }

}
