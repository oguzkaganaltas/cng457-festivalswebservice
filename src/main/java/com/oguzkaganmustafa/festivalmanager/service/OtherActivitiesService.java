package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.OtherActivities;
import com.oguzkaganmustafa.festivalmanager.repository.OtherActivitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * OtherActivitiesService to manage repository and database communication.
 */
@Service
public class OtherActivitiesService {

    @Autowired
    OtherActivitiesRepository otherActivitiesRepository;

    /**
     * It takes an otherActivities parameter and deliver it to otherActivitiesRepository to save it to the database.
     * @param otherActivities
     * @return
     */
    public OtherActivities saveOtherActivities(OtherActivities otherActivities){
        return otherActivitiesRepository.save(otherActivities);
    }
}
