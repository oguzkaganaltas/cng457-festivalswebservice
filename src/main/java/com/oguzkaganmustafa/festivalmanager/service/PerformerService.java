package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.repository.PerformerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerformerService {

    @Autowired
    PerformerRepository performerRepository;

    public Performer savePerformer(Performer p){
        return performerRepository.save(p);
    }
}
