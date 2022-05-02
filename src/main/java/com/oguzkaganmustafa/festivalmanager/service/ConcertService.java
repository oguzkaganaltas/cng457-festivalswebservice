package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcertService {

    @Autowired
    ConcertRepository concertRepository;

}
