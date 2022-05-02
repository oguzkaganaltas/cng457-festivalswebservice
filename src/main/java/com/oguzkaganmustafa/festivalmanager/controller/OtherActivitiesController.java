package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.service.OtherActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OtherActivitiesController {

    @Autowired
    OtherActivitiesService otherActivitiesService;
}
