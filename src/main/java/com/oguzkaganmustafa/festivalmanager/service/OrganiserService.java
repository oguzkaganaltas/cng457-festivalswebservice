package com.oguzkaganmustafa.festivalmanager.service;

import com.oguzkaganmustafa.festivalmanager.entity.FestivalRun;
import com.oguzkaganmustafa.festivalmanager.entity.Organiser;
import com.oguzkaganmustafa.festivalmanager.repository.FestivalRunRepository;
import com.oguzkaganmustafa.festivalmanager.repository.OrganiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        Optional<Organiser> dbOrganiser = organiserRepository.findById(organiser.getEmail());

        if(dbOrganiser.isEmpty()){
            System.out.println("null");
            organiser.getFestivalRuns()
                    .forEach(v -> {
                        FestivalRun festivalRun = festivalRunRepository.getById(v.getFestRunId());
                        festivalRun.getOrganisers().add(newOrganiser);
                    });
        }
        else{
            System.out.println("not null");

            for(int i = 0; i < organiser.getFestivalRuns().size(); i++){
                int search = 0;
                FestivalRun festivalRun = festivalRunRepository.findById(organiser.getFestivalRuns().get(i).getFestRunId()).orElse(null);
                for(int j = 0; j < festivalRun.getOrganisers().size(); j++){
                    if(festivalRun.getOrganisers().get(j).getEmail() == organiser.getEmail()){
                        search = 1;
                    }
                }
                if(search == 1){
                    System.out.println("We have it");
                }
                else{
                    System.out.println("We don't have it");

                    festivalRun.getOrganisers().add(newOrganiser);
                }
            }
        }



        return organiserRepository.save(newOrganiser);
    }

    /**
     * It returns list of organisers by the query Name Containing Or Phone Number Equals Or Email Starting With Or Surname Containing.
     * @param name String
     * @param phone String
     * @param email String
     * @return List
     */
    public List<Organiser> organiserSearch(String name, String phone, String email) {
        return organiserRepository.findByNameContainingOrPhoneNumberEqualsOrEmailStartingWithOrSurnameContaining(name, phone, email, name);
    }

    /**
     * It returns the organisers with multiple festival runs.
     * @return List
     */
    public List<Organiser> getOrganiserWithMultipleRuns(){
        return organiserRepository.getOrganiserWithMultipleRunsNative();
    }

    public Organiser getOrganiser(String email){
        return organiserRepository.findById(email).orElse(null);
    }

    public List<Organiser> getAllOrganisers(){
        return organiserRepository.findAll();
    }
}
