package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import com.oguzkaganmustafa.festivalmanager.repository.ConcertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ConcertService to manage repository and database communication.
 */
@Service
public class ConcertService {

    @Autowired
    ConcertRepository concertRepository;

    /**
     * It takes a concert parameter and deliver it to the concertRepository to save content to the database.
     * @param concert
     * @return
     */
    public Concert saveConcert(Concert concert){
        return concertRepository.save(concert);
    }

}
