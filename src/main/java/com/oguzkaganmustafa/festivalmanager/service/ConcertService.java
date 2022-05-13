package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Concert;
import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.repository.ConcertRepository;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import com.oguzkaganmustafa.festivalmanager.repository.PerformerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ConcertService to manage repository and database communication.
 */
@Service
public class ConcertService {

    @Autowired
    ConcertRepository concertRepository;
    @Autowired
    FestivalRunRepository festivalRunRepository;
    @Autowired
    PerformerRepository performerRepository;

    /**
     * It takes a concert parameter and deliver it to the concertRepository to save content to the database.
     * @param concert
     * @return
     */
    public Concert saveConcert(Concert concert){

        Concert newConcert = new Concert();
        newConcert.setDate(concert.getDate());
        newConcert.setDescription(concert.getDescription());
        newConcert.setDuration(concert.getDuration());
        newConcert.setName(concert.getName());
        newConcert.setEventId(concert.getEventId());
        newConcert.setFestivalRun(concert.getFestivalRun());
        newConcert.setPerformer(concert.getPerformer());

        FestivalRun festivalRun = festivalRunRepository.findById(concert.getFestivalRun().getFestRunId()).orElse(null);

        int check_fest = 0;
        for(int i = 0; i < festivalRun.getEventList().size(); i++){
            System.out.println(festivalRun.getEventList().get(i).getName() + concert.getName());
            if(festivalRun.getEventList().get(i).getName().equals(concert.getName())){
                System.out.println("I am here");
                check_fest = 1;
            }
        }

        Performer performer = performerRepository.findById(concert.getPerformer().getPerformerId()).orElse(null);;


        int check_perf = 0;
        for(int i = 0; i < performer.getConcertList().size(); i++){
            if(performer.getConcertList().get(i).getEventId() == concert.getEventId()){
                check_perf = 1;
            }
        }

        if(check_perf == 0){
            performer.getConcertList().add(newConcert);
        }

        if(check_fest == 0){
            festivalRun.getEventList().add(newConcert);
            return concertRepository.save(newConcert);
        }

        return null;

    }

}
