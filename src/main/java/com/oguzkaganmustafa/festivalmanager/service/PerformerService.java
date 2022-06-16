package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.Performer;
import com.oguzkaganmustafa.festivalmanager.repository.PerformerRepository;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PerformerService to manage repository and database communication.
 */
@Service
public class PerformerService {

    @Autowired
    PerformerRepository performerRepository;

    /**
     * It takes a performer parameter and deliver it to performerRepository to save content to the database.
     * @param performer
     * @return
     */
    public Performer savePerformer(Performer performer){
        return performerRepository.save(performer);
    }

    public List<Performer> getAllPerformers(){
        return performerRepository.findAll();
    }

    public Performer getPerformer(int performerId){
        return performerRepository.findById(performerId).orElse(null);
    }
}
