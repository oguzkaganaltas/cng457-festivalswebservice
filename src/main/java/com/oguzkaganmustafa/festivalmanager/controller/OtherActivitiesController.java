package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.OtherActivities;
import com.oguzkaganmustafa.festivalmanager.service.OtherActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * OtherActivitiesController to manage web service of it.
 */
@RestController
public class OtherActivitiesController {

    @Autowired
    OtherActivitiesService otherActivitiesService;

    /**
     * It takes a request body and deliver it to otherActivitiesService to save it to the database.
     * @param otherActivities
     * @return
     */
    @PostMapping("/addotheractivity")
    public OtherActivities addOtherActivities(@RequestBody OtherActivities otherActivities){
        return otherActivitiesService.saveOtherActivities(otherActivities);
    }
}
