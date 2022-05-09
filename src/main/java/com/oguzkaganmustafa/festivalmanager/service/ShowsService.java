package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
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

    /**
     * It takes a shows parameter and deliver it to showsRepository to save content to the database.
     * @param shows
     * @return
     */
    public Shows saveShows(Shows shows){
        return showsRepository.save(shows);
    }
}
