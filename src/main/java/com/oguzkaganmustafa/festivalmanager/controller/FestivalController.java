package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import com.oguzkaganmustafa.festivalmanager.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FestivalController {
    @Autowired
    FestivalService festivalService;

    @PostMapping("/addfestival")
    public Festival addFestival(@RequestBody Festival festival){
        return festivalService.saveFestival(festival);
    }
}
