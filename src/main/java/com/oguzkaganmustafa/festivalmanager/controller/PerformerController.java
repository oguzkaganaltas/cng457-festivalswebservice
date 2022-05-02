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

    @PostMapping("/addperformer")
    public Performer addPerformer(@RequestBody Performer performer){

        return performerService.savePerformer(performer);
    }
}
