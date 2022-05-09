package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.service.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
