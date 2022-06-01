package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Festival;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * FestivalService to manage repository and database communication.
 */
@Service
public class FestivalService {
    @Autowired
    FestivalRepository festivalRepository;

    /**
     * It takes a festival parameter and deliver it to festivalRepository to save content to the database.
     * @param festival
     * @return
     */
    public Festival saveFestival(Festival festival){
        return festivalRepository.save(festival);
    }

    /**
     * It takes an integer id and deliver it to festivalRepository to get that festival from database.
     * @param id
     * @return
     */
    public Festival getFestival(int id){
        return festivalRepository.findById(id).orElse(null);
    }

    /**
     * It directly calls festivalRepository to get all Festivals from database.
     * @return
     */
    public List<Festival> getAllFestivals() {
        return festivalRepository.findAll();
    }

    /**
     * It takes a string parameter for city and deliver it to festivalRepository to search that city on database and
     * get all festival happening in that city.
     * @param city
     * @return
     */
    public List<Festival> getAllFestivalsIn(String city) {
        return festivalRepository.findByPlace(city);
    }

    /**
     * It takes a string parameter for name and deliver it to festivalRepository to search that name on database and
     * get all festival happening in that name.
     * @param name
     * @return
     */
    public List<Festival> getFestivalByName(String name) {
        return festivalRepository.findFestivalsByName(name);
    }

}
