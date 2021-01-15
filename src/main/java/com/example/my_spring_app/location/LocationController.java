package com.example.my_spring_app.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping(value = "/locations")
    public String getAllLocations(Model model){
        List<Location> locations = locationService.getAllLocations();

        model.addAttribute("locations",locations);

        return "locations";
    }

    @RequestMapping(value = "locations/{id}")
    public Optional<Location> getLocation(@PathVariable("id") String id){
        return locationService.getLocation(id);
    }

    @RequestMapping(value = "/locations", method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location){
        locationService.addLocation(location);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable String id){
        locationService.updateLocation(id,location);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id){
        locationService.deleteLocation(id);
    }
}
