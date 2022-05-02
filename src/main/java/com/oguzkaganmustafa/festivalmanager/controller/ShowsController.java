package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.service.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ShowsController {

    @Autowired
    ShowsService showsService;

    @PostMapping("/addshow")
    public Shows addShow(Shows shows){
        return showsService.saveShows(shows);
    }
}
