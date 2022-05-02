package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FestivalService {
    @Autowired
    FestivalRepository festivalRepository;

    public Festival saveFestival(Festival festival){
        return festivalRepository.save(festival);
    }

}
