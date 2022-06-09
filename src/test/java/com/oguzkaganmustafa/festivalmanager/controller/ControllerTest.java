package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.FestivalManagerApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FestivalManagerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {
    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port;

    @Test
    void getByDescriptionContaining(){
        List<LinkedHashMap> linkedHashMapList = this.restTemplate.getForObject("http://localhost:"+port+"/concertsbydescription?key=Man", List.class);
        assertEquals(linkedHashMapList.size(),1);

    }

    @Test
    void getShowsByDuration(){
        List<LinkedHashMap> linkedHashMapList = this.restTemplate.getForObject("http://localhost:"+port+"/showsbyduration?duration1=45&duration2=75", List.class);
        assertEquals(linkedHashMapList.size(),2);
    }

    @Test
    void getLongestConcerts(){
        List<LinkedHashMap> linkedHashMapList = this.restTemplate.getForObject("http://localhost:"+port+"/longestconcerts", List.class);
        assertEquals(linkedHashMapList.size(),2);
    }

    @Test
    void getFestivalByName(){
        List<LinkedHashMap> linkedHashMapList = this.restTemplate.getForObject("http://localhost:"+port+"/festivalsbyname/girne", List.class);
        assertEquals(linkedHashMapList.size(),2);
    }

}
