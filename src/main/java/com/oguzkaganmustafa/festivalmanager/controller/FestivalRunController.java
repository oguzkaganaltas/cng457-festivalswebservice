package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.service.FestivalRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * FestivalRunController to manage web service of it.
 */
@RestController
public class FestivalRunController {

    @Autowired
    FestivalRunService festivalRunService;

    /**
     * It takes a festivalRun body and deliver to festivalRunService to save content to the database.
     * @param festivalRun
     * @return
     */
    @PostMapping ("/addfestivalrun")
    public FestivalRun addFestivalRun(@RequestBody FestivalRun festivalRun){
        return festivalRunService.saveFestivalRun(festivalRun);
    }

    /**
     * It takes a festivalIRunId and deliver to festivalRunService to get that festivalRun from database.
     * @param festRunId
     * @return
     */
    @GetMapping("/getfestivalrun/{festRunId}")
    public FestivalRun getFestivalRunById(@PathVariable int festRunId){
        return festivalRunService.getFestRunById(festRunId);
    }

    /**
     * It takes a festivalId and returns all FestivalRuns belongs to that Festival in database with calling
     * FestivalRunService of it.
     * @param festId
     * @return
     */
    @GetMapping("/getallfestivalruns/{festId}")
    public List<FestivalRun> getAllFestivalRunOfFestival(@PathVariable int festId){
        return festivalRunService.getAllFestRunByFestId(festId);
    }

    /**
     * It takes a duration parameter and send it to FestivalRunService to get all festivalRuns less than that duration.
     * @param duration
     * @return
     */
    @GetMapping("getshortfestivalrun/{duration}")
    public List<FestivalRun> getAllFestivalRunLessThan(@PathVariable int duration){
        return festivalRunService.getAllFestRunByThreshold(duration);
    }
}
