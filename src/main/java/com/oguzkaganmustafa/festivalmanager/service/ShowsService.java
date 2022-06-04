package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.entity.Shows;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import com.oguzkaganmustafa.festivalmanager.repository.PerformerRepository;
import com.oguzkaganmustafa.festivalmanager.repository.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ShowsService to manage repository and database communication.
 */
@Service
public class ShowsService {

    @Autowired
    ShowsRepository showsRepository;
    @Autowired
    PerformerRepository performerRepository;
    @Autowired
    FestivalRunRepository festivalRunRepository;
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
        newShow.setFestivalRun(shows.getFestivalRun());
        newShow.setPerformers(shows.getPerformers());

        FestivalRun festivalRun = festivalRunRepository.getById(shows.getFestivalRun().getFestRunId());

        int check_fest = 0;
        for(int i = 0; i < festivalRun.getEventList().size(); i++){
            if(festivalRun.getEventList().get(i).getName().equals(shows.getName())){
                check_fest = 1;
            }
        }

        for(int i = 0; i < shows.getPerformers().size(); i++){
            Performer performer = performerRepository.getById(shows.getPerformers().get(i).getPerformerId());
            int check_perf = 0;
            for(int j = 0; j < performer.getShows().size(); j++){
                if(performer.getShows().get(j).getEventId() == shows.getEventId()){
                    check_perf = 1;
                }
            }
            if(check_perf == 0){
                performer.getShows().add(newShow);
            }
        }

        if(check_fest == 0){
            festivalRun.getEventList().add(newShow);
            return showsRepository.save(newShow);
        }
        return null;
    }

    public List<Shows> getShowsByDuration(int duration1, int duration2){
        return showsRepository.findByDurationBetween(duration1, duration2);
    }
}
