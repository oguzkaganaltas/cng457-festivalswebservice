package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalRunService {

    @Autowired
    FestivalRunRepository festivalRunRepository;

    public FestivalRun saveFestivalRun(FestivalRun festivalRun){
        return festivalRunRepository.save(festivalRun);
    }

    public FestivalRun getFestRunById(int festRunId) {
        return festivalRunRepository.findById(festRunId).orElse(null);
    }

    public List<FestivalRun> getAllFestRunByFestId(int festId){
        return festivalRunRepository.findByFestival_FestivalId(festId);
    }

    public List<FestivalRun> getAllFestRunByThreshold(int threshold){
        return festivalRunRepository.findByDurationLessThan(threshold);
    }
}
