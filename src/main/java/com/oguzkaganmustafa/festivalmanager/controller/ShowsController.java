package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.service.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ShowsController to manage web service of it.
 */
@RestController
public class ShowsController {

    @Autowired
    ShowsService showsService;

    /**
     * It takes a request body and deliver it to showsService to save it to the database.
     * @param shows
     * @return
     */
    @PostMapping("/addshow")
    public Shows addShow(@RequestBody Shows shows){
        return showsService.saveShows(shows);
    }

    /**
     * Get a list of shows whose duration is between given two durations in hours
     * @param duration1 Int
     * @param duration2 Int
     * @return List
     */
    @GetMapping("/showsbyduration")
    public List<Shows> getShowsByDuration(@RequestParam int duration1, @RequestParam int duration2){
        return showsService.getShowsByDuration(duration1,duration2);
    }

    /**
     * Get a list of shows with the maximum number of performers.
     * @return List
     */
    @GetMapping("/crowdedshows")
    public List<Shows> getCrowdedShows(){
        return showsService.getCrowdedShows();
    }
}
