package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FestivalRunService to manage repository and database communication.
 */
@Service
public class FestivalRunService {

    @Autowired
    FestivalRunRepository festivalRunRepository;

    /**
     * It takes a festivalRun parameter and deliver it to festivalRunRepository to save content to the database.
     * @param festivalRun
     * @return
     */
    public FestivalRun saveFestivalRun(FestivalRun festivalRun){
        return festivalRunRepository.save(festivalRun);
    }

    /**
     * It takes an integer festivalRunId and deliver it to the festivalRunRepository to get that festivalRun from database.
     * @param festRunId
     * @return
     */
    public FestivalRun getFestRunById(int festRunId) {
        return festivalRunRepository.findById(festRunId).orElse(null);
    }

    /**
     * It takes an integer festivalId and deliver it to the festivalRunRepository to get all festivalRuns belongs to that festival.
     * @param festId
     * @return
     */
    public List<FestivalRun> getAllFestRunByFestId(int festId){
        return festivalRunRepository.findByFestival_FestivalId(festId);
    }

    /**
     * It takes an integer threshold value and deliver it to the festivalRunRepository to get all festivalRuns which have less
     * duration than that threshold value.
     * @param threshold
     * @return
     */
    public List<FestivalRun> getAllFestRunByThreshold(int threshold){
        return festivalRunRepository.findByDurationLessThan(threshold);
    }
}
