package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.service.PerformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerformerController {

    @Autowired
    private PerformerService performerService;

    @PostMapping("/addorganiser")
    public Performer saveCourse(@RequestBody Performer p){

        return performerService.savePerformer(p);
    }
}
