package com.oguzkaganmustafa.festivalmanager.controller;


import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import com.oguzkaganmustafa.festivalmanager.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcertController {

    @Autowired
    ConcertService concertService;

    @PostMapping ("/addconcert")
    public Concert addConcert(@RequestBody Concert concert){
        return concertService.saveConcert(concert);
    }
}
