package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.FestivalManagerApplication;
import com.oguzkaganmustafa.festivalmanager.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FestivalManagerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConcertControllerTest {
    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port;

    @Test
    void getByDescriptionContaining(){
        assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/organiserswithmultipleruns", Organiser[].class).length,1);
    }

    @Test
    void getShowsByDuration(){
        assertEquals(this.restTemplate.getForObject("http://localhost:"+port+"/showsbyduration?duration1=2&duration2=16", Shows[].class).length,1);
    }
}
