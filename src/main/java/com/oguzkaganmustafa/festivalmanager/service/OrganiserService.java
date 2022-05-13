package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import com.oguzkaganmustafa.festivalmanager.repository.OrganiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

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

        Organiser newOrganiser = new Organiser();
        newOrganiser.setEmail(organiser.getEmail());
        newOrganiser.setName(organiser.getName());
        newOrganiser.setSurname(organiser.getSurname());
        newOrganiser.setPhoneNumber(organiser.getPhoneNumber());

        organiser.getFestivalRuns()
                .forEach(v -> {
                            FestivalRun festivalRun = festivalRunRepository.getById(v.getFestRunId());
                            festivalRun.getOrganisers().add(newOrganiser);
                        });

        return organiserRepository.save(newOrganiser);
    }
}
