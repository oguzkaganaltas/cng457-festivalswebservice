package com.oguzkaganmustafa.festivalmanager.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Organiser {
    @Id
    private String email;
    private String name;
    private String  surname;
    private String phoneNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "FestivalOrganisers", joinColumns = @JoinColumn(name = "email"),inverseJoinColumns = @JoinColumn(name = "festRunId"))
    private List<FestivalRun> festivalRuns;
}
