package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import com.oguzkaganmustafa.festivalmanager.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FestivalController {
    @Autowired
    FestivalService festivalService;

    @PostMapping("/addfestival")
    public Festival addFestival(@RequestBody Festival festival){
        return festivalService.saveFestival(festival);
    }

    @GetMapping("/getfestival/{festId}")
    public Festival getFestival(@PathVariable int festId) { return festivalService.getFestival(festId); }

    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestivals(){ return festivalService.getAllFestivals(); }

    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getAllFestivalsIn(@PathVariable String city){ return festivalService.getAllFestivalsIn(city); }
}
