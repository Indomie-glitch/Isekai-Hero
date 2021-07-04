package location;

import api.Resource;
import location.Location;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LocationLoader {



    public static void load(){
        String id = " ";
        String name = " ";
        String description = " ";
        try {
            FileReader reader = new FileReader("Location.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;


            while ((line = bufferedReader.readLine()) != null) {
                String split[] = line.split("|",0);
                for(String s: split)
                System.out.println(s);
                Scanner scanner = new Scanner(System.in);
                id = scanner.nextLine();
                name = scanner.nextLine();
                description = scanner.nextLine();
            }
            reader.close();
            Location loader = new Location(id,name,description);
            Location.add(loader);
            Resource.getInstance().addLocation(Location);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
