package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.repository.PerformerRepository;
import com.oguzkaganmustafa.festivalmanager.repository.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ShowsService to manage repository and database communication.
 */
@Service
public class ShowsService {

    @Autowired
    ShowsRepository showsRepository;
    @Autowired
    PerformerRepository performerRepository;
    /**
     * It takes a shows parameter and deliver it to showsRepository to save content to the database.
     * @param shows
     * @return
     */
    public Shows saveShows(Shows shows){

        Shows newShow = new Shows();
        newShow.setName(shows.getName());
        newShow.setDate(shows.getDate());
        newShow.setDescription(shows.getDescription());
        newShow.setDuration(shows.getDuration());
        newShow.setEventId(shows.getEventId());

        shows.getPerformers()
                .forEach(v->{
                    Performer performer = performerRepository.getById(v.getPerformerId());
                    performer.getShows().add(newShow);
                });
        return showsRepository.save(newShow);
    }
}
