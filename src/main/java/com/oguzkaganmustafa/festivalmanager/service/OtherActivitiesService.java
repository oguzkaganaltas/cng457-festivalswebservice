package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.OtherActivities;
import com.oguzkaganmustafa.festivalmanager.repository.OtherActivitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OtherActivitiesService {

    @Autowired
    OtherActivitiesRepository otherActivitiesRepository;

    public OtherActivities saveOtherActivities(OtherActivities otherActivities){
        return otherActivitiesRepository.save(otherActivities);
    }
}
