package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FestivalRunService {

    @Autowired
    FestivalRunRepository festivalRunRepository;

    public FestivalRun saveFestivalRun(FestivalRun festivalRun){
        return festivalRunRepository.save(festivalRun);
    }

}
