package location;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LocationLoader {

    private static String FILE_LOCATION = "C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location";

    public static List <Location> load() {
        List<Location> locations = new ArrayList<Location>();
        try {
            FileReader reader = new FileReader(FILE_LOCATION);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] lineSegment = line.split("\\|");
                Location location = new Location();
                location.setId(Integer.parseInt(lineSegment[0]));
                location.setName(lineSegment[1]);
                location.setDescription(lineSegment[2]);
                locations.add(location);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return locations;
    }

}










       // List<Location> location = new ArrayList<Location>();
       // String id = " ";
       // String name = " ";
       // String description = " ";
     //   try {
      //      FileReader reader = new FileReader("C:\\Users\\Aarnav.Vishal\\IdeaProjects\\Isekai Hero\\src\\location\\Location");
    //        BufferedReader bufferedReader = new BufferedReader(reader);
//
    //        String line;
//
//
     //       while ((line = bufferedReader.readLine()) != null) {
     //           String split[] = line.split("\\|",0);
         //       for(String s: split)
       //         System.out.println(s);
           //     Scanner scanner = new Scanner(System.in);
             //   id = scanner.nextLine();
    //            name = scanner.nextLine();
      //          description = scanner.nextLine();
        //    }
          //  reader.close();
            //Location loader = new Location(id,name,description);
           // Location.add(loader);
           // Resource.getInstance().addLocation(location);

       // } catch (IOException e) {
         //   e.printStackTrace();
        //}




