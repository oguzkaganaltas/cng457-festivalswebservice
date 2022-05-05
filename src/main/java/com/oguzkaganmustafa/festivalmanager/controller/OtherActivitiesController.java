package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.OtherActivities;
import com.oguzkaganmustafa.festivalmanager.service.OtherActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherActivitiesController {

    @Autowired
    OtherActivitiesService otherActivitiesService;

    @PostMapping("/addotheractivity")
    public OtherActivities addOtherActivities(OtherActivities otherActivities){
        return otherActivitiesService.saveOtherActivities(otherActivities);
    }
}
