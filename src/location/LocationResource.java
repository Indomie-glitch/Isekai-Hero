package location;

import java.util.List;

public class LocationResource {

    private List<Location> locations;
    private static LocationResource repository = null;

    public static LocationResource getInstance() {
        if (null == repository) {
            repository = new LocationResource();
        }
        return repository;
    }

    private LocationResource() {
        locations = LocationLoader.load();
    }

    public Location getLocationById(int Id) {
        for(Location location : locations) {
            if(location.getId() == Id)
                return location;
        }
        return null;
    }

    public List<Location> getAll() {
        return locations;
    }
}

