package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
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
    @Autowired
    FestivalRunRepository festivalRunRepository;

    /**
     * It takes an organiser parameter and deliver it organiserRepository to save it to the database.
     * @param organiser
     * @return
     */
    public Organiser saveOrganiser(Organiser organiser){

        Organiser organiser1 = organiserRepository.save(organiser);

        for (FestivalRun festivalRun :
                organiser.getFestivalRuns()) {
            FestivalRun festivalRun1 = festivalRunRepository.getById(festivalRun.getFestRunId());
            festivalRun1.getOrganisers().add(organiser);
            festivalRunRepository.save(festivalRun1);
        }
        return organiser1;
    }
}
