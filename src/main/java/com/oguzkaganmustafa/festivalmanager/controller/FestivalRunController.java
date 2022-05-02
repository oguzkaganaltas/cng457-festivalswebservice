package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.service.FestivalRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class FestivalRunController {

    @Autowired
    FestivalRunService festivalRunService;

    @PostMapping ("/addfestivalrun")
    public FestivalRun addFestivalRun(@RequestBody FestivalRun festivalRun){
        return festivalRunService.saveFestivalRun(festivalRun);
    }
}
