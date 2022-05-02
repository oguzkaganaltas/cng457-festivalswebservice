package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.repository.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowsService {

    @Autowired
    ShowsRepository showsRepository;

    public Shows saveShows(Shows shows){
        return showsRepository.save(shows);
    }
}
