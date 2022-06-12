package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.service.PerformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * PerformerController to manage web service of it.
 */
@RestController
public class PerformerController {

    @Autowired
    private PerformerService performerService;

    /**
     * It takes a request body and deliver it to the performerService to save it to the database.
     * @param performer
     * @return
     */
    @PostMapping("/addperformer")
    public Performer addPerformer(@RequestBody Performer performer){

        return performerService.savePerformer(performer);
    }

    @GetMapping("/getallperformers")
    public List<Performer> getAllPerformers(){
        return performerService.getAllPerformers();
    }
}
