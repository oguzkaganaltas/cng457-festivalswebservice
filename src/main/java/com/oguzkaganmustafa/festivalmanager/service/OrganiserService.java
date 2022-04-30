package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.repository.OrganiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganiserService {

    @Autowired
    OrganiserRepository organiserRepository;

    public Organiser saveOrganiser(Organiser o){
        return organiserRepository.save(o);
    }
}
