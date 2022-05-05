package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.service.FestivalRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalRunController {

    @Autowired
    FestivalRunService festivalRunService;

    @PostMapping ("/addfestivalrun")
    public FestivalRun addFestivalRun(@RequestBody FestivalRun festivalRun){
        return festivalRunService.saveFestivalRun(festivalRun);
    }

    @GetMapping("/getfestivalrun/{festRunId}")
    public FestivalRun getFestivalRunById(@PathVariable int festRunId){
        return festivalRunService.getFestRunById(festRunId);
    }

    @GetMapping("/getallfestivalruns/{festId}")
    public List<FestivalRun> getAllFestivalRunOfFestival(@PathVariable int festId){
        return festivalRunService.getAllFestRunByFestId(festId);
    }

}
