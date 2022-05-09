package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import com.oguzkaganmustafa.festivalmanager.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * FestivalController to manage web service.
 */
@RestController
public class FestivalController {
    @Autowired
    FestivalService festivalService;

    /**
     * It takes a festival body and deliver to festivalService to save content to the database.
     * @param festival
     * @return
     */
    @PostMapping("/addfestival")
    public Festival addFestival(@RequestBody Festival festival){
        return festivalService.saveFestival(festival);
    }

    /**
     * It takes a festivalId and deliver to festivalService to get that festival from database.
     * @param festId
     * @return
     */
    @GetMapping("/getfestival/{festId}")
    public Festival getFestival(@PathVariable int festId) { return festivalService.getFestival(festId); }

    /**
     * It returns all Festivals in the database with calling FestivalService of it.
     * @return
     */
    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestivals(){ return festivalService.getAllFestivals(); }

    /**
     * It takes a city parameter and deliver it to festivalService in order to get all Festivals happening on that city.
     * @param city
     * @return
     */
    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getAllFestivalsIn(@PathVariable String city){ return festivalService.getAllFestivalsIn(city); }
}
