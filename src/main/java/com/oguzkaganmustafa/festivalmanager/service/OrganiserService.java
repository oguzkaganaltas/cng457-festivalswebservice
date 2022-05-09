package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.repository.OrganiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * OrganiserService to manage repository and database communication.
 */
@Service
public class OrganiserService {

    @Autowired
    OrganiserRepository organiserRepository;


    /**
     * It takes an organiser parameter and deliver it organiserRepository to save it to the database.
     * @param organiser
     * @return
     */
    public Organiser saveOrganiser(Organiser organiser){
        return organiserRepository.save(organiser);
    }
}
