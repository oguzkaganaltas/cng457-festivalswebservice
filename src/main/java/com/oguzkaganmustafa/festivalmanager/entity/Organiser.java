package com.oguzkaganmustafa.festivalmanager.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Organiser Entity. It has ManyToMany FestivalRun connection to keep which organisers responsible from which FestivalRun.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "email")
public class Organiser {
    @Id
    private String email;
    private String name;
    private String  surname;
    private String phoneNumber;

    @ManyToMany()
    @JoinTable(name = "FestivalOrganisers", joinColumns = @JoinColumn(name = "email"),inverseJoinColumns = @JoinColumn(name = "festRunId"))
    private List<FestivalRun> festivalRuns;
}
