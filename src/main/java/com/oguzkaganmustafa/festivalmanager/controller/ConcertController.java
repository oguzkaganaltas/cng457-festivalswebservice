package com.oguzkaganmustafa.festivalmanager.controller;


import com.oguzkaganmustafa.festivalmanager.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConcertController {

    @Autowired
    ConcertService concertService;
}
