package com.oguzkaganmustafa.festivalmanager.controller;

import com.oguzkaganmustafa.festivalmanager.FestivalManagerApplication;
import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import com.oguzkaganmustafa.festivalmanager.service.ConcertService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

@WebMvcTest
@SpringBootTest(classes = FestivalManagerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConcertControllerTest {
    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    ConcertService concertService;

    @LocalServerPort
    int port;

    @Test
    void getByDescriptionContaining() throws Exception{

        Mockito.when(concertService.getConcertDescContains("Man")).thenReturn(Collections.emptyList());
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("http://localhost:" + port + "/concertsbydescription%key=Man")
                        .accept(MediaType.APPLICATION_JSON)).andReturn();
        System.out.println(mvcResult.getResponse());


    }
}
